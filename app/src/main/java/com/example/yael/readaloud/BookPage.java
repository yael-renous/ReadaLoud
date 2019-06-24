package com.example.yael.readaloud;

public interface BookPage {

    /**
     * adds the input speech to a long string
     * @param text the string to add
     */
    void addInputSpeech(String text);

    /**
     * increases the time of speech
     * @param time the time of speech elapsed
     */
    void increaseElapsedTime(double time);

    /**
     * checks if the reader is done reading
     * @return true if they are false if the system stopped the listening
     */
    boolean isDoneSpeaking();

    /***
     * restart the speech recognition
     */
    void restartSpeech();

    /**
     * process page reading -  is called when done reading a page
     */
    void processReading();

}
