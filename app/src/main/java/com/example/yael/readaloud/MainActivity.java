package com.example.yael.readaloud;

import android.Manifest;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.content.pm.PackageManager;
import android.graphics.Typeface;
import android.net.Uri;
import android.os.Build;
import android.os.CountDownTimer;
import android.provider.Settings;
import android.speech.RecognizerIntent;
import android.speech.SpeechRecognizer;
import android.support.annotation.RequiresApi;
import android.support.v4.content.ContextCompat;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.Gravity;
import android.view.View;
import android.view.WindowManager;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.Locale;

import kNearestNeighbour.Record;
import kNearestNeighbour.diff_match_patch;
import kNearestNeighbour.kNearestNeighbour;
import kNearestNeighbour.TrainSetFactory;

public class MainActivity extends AppCompatActivity implements BookPage {

    /**time to normalize reading speed by*/
    private static final int TIME_PER_PARA = 120;
    public static final int DURATION=1000;

    private boolean firstRun;

    private SpeechRecognizer mSpeechRecognizer;
    private diff_match_patch diff;

    private FoxandHorse_Grade6 grade6;
    private FoxandHorse_Grade2 grade2;
    private FoxandHorse_Grade4 grade4;

    /**the pre trained record set*/
    private ArrayList<Record> trainedSet;

    /**flag indicating whether the reader finished the story*/
    private boolean doneSpeaking = false;

    /**running counter of reading time*/
    private double speechTime;
    /**reader input*/
    private StringBuilder speechInput;


    private TextView currTextView;
    private int currParagraphIndex;
    private String currParagraph;
    private TheFoxAndTheHorse story;
    private Grade currGrade;

    private Grade[] passedGrades;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        getWindow().addFlags(WindowManager.LayoutParams.FLAG_KEEP_SCREEN_ON);

        passedGrades=new Grade[4];
        initStories();
        initVars();
        initStartingStory();

        diff = new diff_match_patch();
        trainedSet = TrainSetFactory.getTrainSet();
        checkPermission();
        Toast toast= Toast.makeText(getApplicationContext(), "Start Reading Aloud!", Toast.LENGTH_LONG);
        toast.setGravity(Gravity.TOP,Gravity.CENTER,Gravity.CENTER);
        toast.show();
        initSpeech();
        currTextView.setTypeface(currTextView.getTypeface(),Typeface.BOLD);
        currTextView.setTextSize(currTextView.getTextSize()+1);
    }


    //======================== Book Page implementation ========================================

    @Override
    public void addInputSpeech(String text) {
        speechInput.append(text);
        speechInput.append(" ");
    }

    @Override
    public void increaseElapsedTime(double time) {
        speechTime += time;
    }

    @Override
    public boolean isDoneSpeaking() {
        return doneSpeaking;
    }

    @Override
    public void restartSpeech() {
        initSpeech();
    }

    @RequiresApi(api = Build.VERSION_CODES.N)
    @Override
    public void processReading() {
        TextView editText = findViewById(R.id.text);
        String inputWords = speechInput.toString().toLowerCase();

        editText.setText(inputWords + "\n Time Elapsed: " + speechTime);

        if (story.endOfParagraph(currParagraphIndex, inputWords))
            nextParagraph();

    }

    //================================ main functions =======================================

    @RequiresApi(api = Build.VERSION_CODES.N)
    private void nextParagraph() {
        //if ==4 end
        if (currParagraphIndex == 4) {
            endListener();
            showEnd();
            return;
        }

        currTextView.setTypeface(currTextView.getTypeface(),Typeface.NORMAL);
        currTextView.setTextSize(currTextView.getTextSize()-1);

        //calculate grade level
        Record toClassify = createRecord();
        Grade classifiedGrade = kNearestNeighbour.classify(trainedSet, toClassify);
        Grade prevGrade=currGrade;
        passedGrades[currParagraphIndex]=classifiedGrade;

        if (!classifiedGrade.equals(prevGrade)) {
            currGrade = classifiedGrade;
            updateStory();
            updateTextViews(prevGrade);
            resizeImages();
        }

        //increment update paragraph
        currParagraphIndex++;
        currParagraph = story.getParagraph(currParagraphIndex);
        currTextView =story.getTextView(currParagraphIndex);

        currTextView.setTypeface(currTextView.getTypeface(),Typeface.BOLD);
        currTextView.setTextSize(currTextView.getTextSize()+1);


        TextView editText = findViewById(R.id.text);
        editText.setText("CHANGED TO PARAGRAPH " + currParagraphIndex);

        //init vars
        initVars();
        initSpeech();
    }

    private void showEnd() {
        findViewById(R.id.black).animate().alpha(0.5f).setDuration(1000);
        findViewById(R.id.theEnd).animate().alpha(1.0f).setDuration(1000);

        ImageView p1Grade=findViewById(R.id.p1Grade);
        ImageView p2Grade=findViewById(R.id.p2Grade);
        ImageView p3Grade=findViewById(R.id.p3Grade);
        ImageView p4Grade=findViewById(R.id.p4Grade);

        setEndPic(p1Grade,passedGrades[0]);
        setEndPic(p2Grade,passedGrades[1]);
        setEndPic(p3Grade,passedGrades[2]);
        setEndPic(p4Grade,passedGrades[3]);

        findViewById(R.id.p1Grade).animate().alpha(0.6f).setDuration(1000);
        findViewById(R.id.p2Grade).animate().alpha(0.6f).setDuration(1000);
        findViewById(R.id.p3Grade).animate().alpha(0.6f).setDuration(1000);
        findViewById(R.id.p4Grade).animate().alpha(0.6f).setDuration(1000);
    }



    /**
     * creates new record based on this paragraph's input
     * @return
     */
    private Record createRecord() {
        LinkedHashMap<Integer, Double> featureVec = createFeatureVec();
        return new Record(currGrade, null, featureVec);
    }

    private LinkedHashMap<Integer, Double> createFeatureVec() {
        LinkedHashMap<Integer, Double> features = new LinkedHashMap<Integer, Double>();
        double insertedWords = 0;
        double deletedWords = 0;
        double correctWords = 0;

        String inputWords = speechInput.toString().toLowerCase();

        //remove extra space in end
        inputWords = inputWords.trim();

        //get text diff
        LinkedList<diff_match_patch.Diff> result = diff.diff_main(currParagraph, inputWords);
        diff.diff_cleanupSemantic(result);


        for (int i = 0; i < result.size(); i++) {
            diff_match_patch.Diff currDiff = result.get(i);

            if (currDiff.operation.equals(diff_match_patch.Operation.INSERT))
                insertedWords += numOfWords(currDiff.text);
            if (currDiff.operation.equals(diff_match_patch.Operation.EQUAL))
                correctWords += numOfWords(currDiff.text);
            if (currDiff.operation.equals(diff_match_patch.Operation.DELETE))
                deletedWords += numOfWords(currDiff.text);
        }

        features.put(Record.CORRECT_WORDS, normalize(correctWords));
        features.put(Record.DELETED_WORDS, normalize(deletedWords));
        features.put(Record.INSERTED_WORDS, normalize(insertedWords));
        features.put(Record.TIME_ELAPSED, speechTime / TIME_PER_PARA);
        return features;
    }

    //================================ helper functions =======================================
    
    private void resizeImages(){
        float value=0;

        switch (currGrade){
            case SECOND:
                value=1f;
                break;
            case FOURTH:
                value=0.8f;
                break;
            case SIXTH:
                value=0.85f;
                break;
        }

        ImageView view1 = findViewById(R.id.im1);
        ImageView view2= findViewById(R.id.im2);
        ImageView view3 = findViewById(R.id.im3);
        ImageView view4 = findViewById(R.id.im4);
        resizeAnimate(value, view1);
        resizeAnimate(value, view2);
        resizeAnimate(value, view3);
        resizeAnimate(value, view4);

    }

    private void resizeAnimate(float value, ImageView view) {
        long duration =DURATION;
        if(firstRun)
            duration=0;
        ObjectAnimator scaleX = ObjectAnimator.ofFloat(view, "scaleX", value);
        ObjectAnimator scaleY = ObjectAnimator.ofFloat(view, "scaleY", value);
        scaleX.setDuration(duration);
        scaleY.setDuration(duration);

        AnimatorSet scale = new AnimatorSet();
        scale.play(scaleX).with(scaleY);

        scale.start();
    }

    private void updateStory() {
        switch (currGrade) {
            case SIXTH:
                this.story = grade6;
                break;
            case FOURTH:
                this.story = grade4;
                break;
            case SECOND:
                this.story = grade2;
                break;
        }
    }

    private double normalize(double words) {
        int numOfWords = numOfWords(currParagraph);
        return words / (numOfWords);
    }

    private int numOfWords(String text) {
        String trim = text.trim();
        if (trim.isEmpty())
            return 0;
        return trim.split("\\s+").length;
    }

    private void updateTextViews(Grade prevGrade) {
        if(!firstRun) {
            switch (prevGrade) {
                case SECOND:
                    grade2.setTextView(0f,currParagraphIndex,firstRun);
                    break;
                case FOURTH:
                    grade4.setTextView(0f,currParagraphIndex,firstRun);
                    break;
                case SIXTH:
                    grade6.setTextView(0f,currParagraphIndex,firstRun);
                    break;
            }
        }
        switch (currGrade) {
            case SECOND:
                grade2.setTextView(1.0f,currParagraphIndex,firstRun);
                break;
            case FOURTH:
                grade4.setTextView(1.0f,currParagraphIndex,firstRun);
                break;
            case SIXTH:
                grade6.setTextView(1.0f,currParagraphIndex,firstRun);
                break;
        }

    }

    private void setEndPic(ImageView imageView, Grade grade) {
        switch (grade){
            case SECOND:
                imageView.setImageResource(R.drawable.low);
                break;
            case FOURTH:
                imageView.setImageResource(R.drawable.med);
                break;
            case SIXTH:
                imageView.setImageResource(R.drawable.high);
                break;
        }
    }

    //================================== init functions ========================================

    private void initStartingStory() {
        firstRun=true;
        currParagraphIndex = 1;
        currGrade = (Grade) getIntent().getSerializableExtra("STORY_LEVEL");
        updateStory();

        passedGrades[0]=currGrade;
        currParagraph = story.getParagraph(currParagraphIndex);
        currTextView=story.getTextView(1);
        updateTextViews(null);
        resizeImages();
        firstRun=false;
    }

    private void initStories() {
        grade6 = new FoxandHorse_Grade6((TextView)findViewById(R.id.paragraph1_grade6),
                (TextView)findViewById(R.id.paragraph2_grade6),
                (TextView)findViewById(R.id.paragraph3_grade6),
                (TextView)findViewById(R.id.paragraph4_grade6));

        grade4 = new FoxandHorse_Grade4((TextView)findViewById(R.id.paragraph1_grade4),
                (TextView)findViewById(R.id.paragraph2_grade4),
                (TextView)findViewById(R.id.paragraph3_grade4),
                (TextView)findViewById(R.id.paragraph4_grade4));

        grade2 = new FoxandHorse_Grade2((TextView)findViewById(R.id.paragraph1_grade2),
                (TextView)findViewById(R.id.paragraph2_grade2),
                (TextView)findViewById(R.id.paragraph3_grade2),
                (TextView)findViewById(R.id.paragraph4_grade2));
    }

    private void initSpeech() {
        // final TextView editText = findViewById(R.id.text);
        mSpeechRecognizer = SpeechRecognizer.createSpeechRecognizer(this);
        final Intent mSpeechRecognizerIntent = new Intent(RecognizerIntent.ACTION_RECOGNIZE_SPEECH);
        mSpeechRecognizerIntent.putExtra(RecognizerIntent.EXTRA_LANGUAGE_MODEL, RecognizerIntent.LANGUAGE_MODEL_FREE_FORM);
        mSpeechRecognizerIntent.putExtra(RecognizerIntent.EXTRA_LANGUAGE, Locale.getDefault());
        mSpeechRecognizerIntent.putExtra(RecognizerIntent.EXTRA_SPEECH_INPUT_COMPLETE_SILENCE_LENGTH_MILLIS, Integer.MAX_VALUE);
        mSpeechRecognizerIntent.putExtra(RecognizerIntent.EXTRA_SPEECH_INPUT_POSSIBLY_COMPLETE_SILENCE_LENGTH_MILLIS, Integer.MAX_VALUE);
        mSpeechRecognizer.setRecognitionListener(new SpeechRecognitionListener(this));
        mSpeechRecognizer.startListening(mSpeechRecognizerIntent);

        CountDownTimer timer = new CountDownTimer(4000, 4000) {
            @Override
            public void onTick(long millisUntilFinished) {
                System.out.print("ticking");
            }

            @RequiresApi(api = Build.VERSION_CODES.N)
            @Override
            public void onFinish() {
                System.out.print("finished");
                processReading();
                if (!doneSpeaking) {
                    initSpeech();
                }
            }
        }.start();
    }

    private void initVars() {
        speechInput = new StringBuilder();
        speechTime = 0;
    }

    private void checkPermission() {
        if (Build.VERSION.SDK_INT >= Build.VERSION_CODES.M) {
            if (!(ContextCompat.checkSelfPermission(this, Manifest.permission.RECORD_AUDIO) == PackageManager.PERMISSION_GRANTED)) {
                Intent intent = new Intent(Settings.ACTION_APPLICATION_DETAILS_SETTINGS,
                        Uri.parse("package:" + getPackageName()));
                startActivity(intent);
                finish();
            }
        }
    }

    private void endListener() {
        doneSpeaking = true;
        mSpeechRecognizer.destroy();
    }


}