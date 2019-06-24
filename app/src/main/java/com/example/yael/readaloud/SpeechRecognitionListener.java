package com.example.yael.readaloud;

import android.os.Bundle;
import android.speech.RecognitionListener;
import android.speech.SpeechRecognizer;

import java.util.ArrayList;

public class SpeechRecognitionListener implements RecognitionListener {
    private long timerStart;

    private BookPage bookPage;

    public SpeechRecognitionListener(BookPage bp){
        this.bookPage=bp;
    }

    @Override
    public void onReadyForSpeech(Bundle bundle) {

    }

    @Override
    public void onBeginningOfSpeech() {
        //start measuring time of reading
        timerStart= System.currentTimeMillis();
    }

    @Override
    public void onRmsChanged(float v) {

    }

    @Override
    public void onBufferReceived(byte[] bytes) {
    }

    @Override
    public void onEndOfSpeech() {

    }

    @Override
    public void onError(int i) {

    }

    @Override
    public void onResults(Bundle bundle) {

        //stop timer and calculate time elapsed
        long timerEnd = System.currentTimeMillis();
        long timerDelta = timerEnd - timerStart;
        double elapsedSeconds= timerDelta / 1000.0;

        //getting all the matches
        ArrayList<String> matches = bundle
                .getStringArrayList(SpeechRecognizer.RESULTS_RECOGNITION);


        bookPage.addInputSpeech(matches.get(0));
        bookPage.increaseElapsedTime(elapsedSeconds);

        //if not clicked on next button
        if(!bookPage.isDoneSpeaking())
            bookPage.restartSpeech();
        else
            bookPage.processReading();
    }

    @Override
    public void onPartialResults(Bundle bundle) {
    }

    @Override
    public void onEvent(int i, Bundle bundle) {

    }
}
