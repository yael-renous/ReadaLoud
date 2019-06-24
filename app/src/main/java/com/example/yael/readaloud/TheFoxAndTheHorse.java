package com.example.yael.readaloud;

import android.graphics.Typeface;
import android.widget.TextView;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

public abstract class TheFoxAndTheHorse {

    /**Strings holding the different story paragraphs*/
    private String paragraph1String;
    private String paragraph2String;
    private String paragraph3String;
    private String paragraph4String;

    /**patterns representing the end of the paragraph*/
    private Pattern p1EndPattern;
    private Pattern p2EndPattern;
    private Pattern p3EndPattern;
    private Pattern p4EndPattern;

    /**text views of each paragraph*/
    private TextView p1TextView;
    private TextView p2TextView;
    private TextView p3TextView;
    private TextView p4TextView;

    private static String punctuationRegex="(?:\\s|\\.|,|'|\"|:|;)+";

    /**
     * constructor
     * @param p1 paragraph 1 of the story
     * @param p2 paragraph 2 of the story
     * @param p3 paragraph 3 of the story
     * @param p4 paragraph 4 of the story
     */
    public TheFoxAndTheHorse(String p1, String p2, String p3, String p4, Pattern p1End,
                             Pattern p2End, Pattern p3End, Pattern p4End,
                             TextView tv1, TextView tv2, TextView tv3, TextView tv4){
        paragraph1String =p1.toLowerCase();
        paragraph2String =p2.toLowerCase();
        paragraph3String =p3.toLowerCase();
        paragraph4String =p4.toLowerCase();

        this.p1EndPattern =p1End;
        this.p2EndPattern =p2End;
        this.p3EndPattern =p3End;
        this.p4EndPattern =p4End;

        p1TextView=tv1;
        p2TextView=tv2;
        p3TextView=tv3;
        p4TextView=tv4;

    }

    /**
     * returns the paragraph in the desired index
     * @param index index of desired paragraph
     * @return String array of all the words in the desired paragraph, null if the inex is invalid
     */
    public String getParagraph(int index){
        switch (index){
            case 1:
                return paragraph1String.replaceAll(punctuationRegex," ");
            case 2:
                return paragraph2String.replaceAll(punctuationRegex," ");

            case 3:
                return paragraph3String.replaceAll(punctuationRegex," ");

            case 4:
                return paragraph4String.replaceAll(punctuationRegex," ");

        }
        return null;
    }


    public boolean endOfParagraph(int paraIndex, String inputString) {
        Matcher m=null;
        switch (paraIndex){
            case 1:
                m= p1EndPattern.matcher(inputString);
                break;
            case 2:
                m= p2EndPattern.matcher(inputString);
                break;
            case 3:
                m= p3EndPattern.matcher(inputString);
                break;
            case 4:
                m= p4EndPattern.matcher(inputString);
                break;
        }
        if(m==null)
            return false;
        return m.find();
    }

    public void setTextView(float alpha, int currParagraphIndex, boolean firstRun){
        long duration =MainActivity.DURATION;
        if(firstRun) {
            duration = 0;
            p1TextView.setAlpha(1);
        }

        if(currParagraphIndex<2) p2TextView.animate().alpha(alpha).setDuration(duration);
        if(currParagraphIndex<3) p3TextView.animate().alpha(alpha).setDuration(duration);
        if(currParagraphIndex<4) p4TextView.animate().alpha(alpha).setDuration(duration);

    }


    public TextView getTextView(int paraIndex){
        switch (paraIndex){
            case 1:
               return p1TextView;
            case 2:
                return p2TextView;
            case 3:
                return p3TextView;
            case 4:
                return p4TextView;

        }
        return null;
    }
}
