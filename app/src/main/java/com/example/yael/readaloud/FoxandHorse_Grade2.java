package com.example.yael.readaloud;

import java.util.regex.Pattern;
import android.widget.TextView;


public class FoxandHorse_Grade2 extends TheFoxAndTheHorse{

    private static String paragraph1="Once upon a time." +
            "A farmer once had a loyal horse, but it had grown" +
            " old and could no longer do its work. So the farmer said: I can’t use you anymore. " +
            "So away now. Out of my stable, and only come back if you can show me that you" +
            " are still stronger than a lion. The poor horse was very sad, and went" +
            " into the forest to get a shelter from the rain.";

    private static String paragraph2="In the forest he met a fox, who said:" +
            " Why are you so sad?. The horse said, My master has kicked me out. He told me that " +
            "if I was strong enough to bring him a lion he would keep me, but" +
            " he knows that is way too hard for me. The fox said: I will help you. " +
            "Just you lie down here, and stretch your legs out as if you were dead.";

    private static String paragraph3= "The fox went to the lion’s home and said: " +
            "There is a dead horse out there. Come and you will have a great meal. The lion went " +
            "with him, and when they got to the horse, the fox said: You can’t eat it here." +
            " I will tie the horse to you, and you can drag it to your home, and enjoy it " +
            "there. The plan made the lion happy, so he stood close to the horse, and " +
            "the fox tied them together. But the fox tied the lion’s legs to the horse’s" +
            " tail so that it would be very hard to open it.";

    private static String paragraph4="When he had finished his work " +
            " he said: Pull, old horse! Pull! Then the horse jumped up, and " +
            "dragged with lion behind him. The lion roared. But the horse " +
            "let him roar, and never stopped till he stood before his master’s door." +
            " When the master saw him he was very happy, and said to him:" +
            " You will stay with me, and have a good time as long as you live. ";

    public FoxandHorse_Grade2(TextView p1Tv,TextView p2Tv, TextView p3Tv, TextView p4Tv ) {
        super(paragraph1, paragraph2, paragraph3, paragraph4,
                Pattern.compile("rain|shelter|forest"),
                Pattern.compile("dead|leg|legs|diet|dad"),
                Pattern.compile("open|hard|very"),
                Pattern.compile("live|long"),
                p1Tv,p2Tv,p3Tv,p4Tv);
    }

}
