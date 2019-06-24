package com.example.yael.readaloud;

import android.widget.TextView;

import java.util.regex.Pattern;

public class FoxandHorse_Grade4 extends TheFoxAndTheHorse {


    private static String paragraph1="Once upon a time..." +
            "A peasant had a faithful horse which had grown old " +
            "and could do no more work, so his master no longer" +
            " wanted to give him anything to eat and said," +
            " 'I want you no longer, so go out of my stable; I shall not take you " +
            "back again until you are stronger than a lion.' The horse was sad," +
            " and went to the forest for a little protection from the weather.";

    private static String paragraph2="There the fox met him and said," +
            " \"Why do you hang your head so, and go about all alone? " +
            "\"Ah,\" replied the horse, \"My master has forgotten" +
            " what services I have performed for him for so many years, " +
            "and because I can no longer plow well, he will give me " +
            "no more food, and has driven me out.\" \"Without giving you a chance?\"" +
            " asked the fox. \"The chance was a bad one. He said, " +
            "if I were still strong enough to bring him a lion," +
            " he would keep me, but he well knows that I cannot do that.\"" +
            "The fox said, \"I will help you. Just lie down, stretch out as if you were dead.\"";

    private static String paragraph3= "The horse did what the fox asked," +
            " and then the fox went to a lion and said, \"A dead horse is lying out there. " +
            "Just come with me, and you can have a rich meal.\" The lion went" +
            " with him, and when they were both standing by the horse the fox said," +
            " \"It is not very comfortable for you here , I will fasten it" +
            " to you by the tail, and then you can drag it into your cave" +
            " and eat it in peace.\" This advice pleased the lion. He positioned " +
            "himself and kept completely quiet. But the fox tied the lion's legs" +
            " together with the horse's tail, and twisted and fastened everything " +
            "so well and so strongly that no amount of strength could pull it loose.";

    private static String paragraph4=" When he had finished his work," +
            " he tapped the horse on the shoulder and said," +
            " \"Pull, grey horse, pull!\"Then up sprang the horse at" +
            " once, and pulled the lion away with him. The lion began to roar so" +
            " that all the birds in the forest flew up in terror, but the horse let" +
            " him roar, and drew him and dragged him across the field to his master's door. " +
            "When the master saw the lion, he was of a better mind, and said to" +
            " the horse, \"You shall stay with me and fare well.\" " +
            "And he gave him plenty to eat until he died. ";

    public FoxandHorse_Grade4(TextView p1Tv, TextView p2Tv, TextView p3Tv, TextView p4Tv ) {

        super(paragraph1, paragraph2, paragraph3, paragraph4,
                Pattern.compile("weather|whether|protection|little"),
                Pattern.compile("dead|died|diet|stretch"),
                Pattern.compile("loose|lose|pull|pool"),
                Pattern.compile("died|eat|diet|dead"),
                p1Tv,p2Tv,p3Tv,p4Tv);
    }


//    @Override
//    public String getEndRecognition(int paraIndex) {
//        switch (paraIndex){
//            case 1:
//                return "weather";
//            case 2:
//                return "dead";
//            case 3:
//                return "loose";
//            case 4:
//                return "died";
//        }
//        return "";
//    }

}
