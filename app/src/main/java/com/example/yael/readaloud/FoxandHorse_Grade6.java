package com.example.yael.readaloud;

import android.widget.TextView;

import java.util.regex.Pattern;

public class FoxandHorse_Grade6 extends TheFoxAndTheHorse {

    private static String paragraph1="Once upon a time..." +
            "A farmer had a horse that had been" +
            " an excellent faithful servant to him:" +
            " but he was now grown too old to work;" +
            " so the farmer would give him nothing more" +
            " to eat, and said, 'I want you no longer, so" +
            " take yourself off out of my stable; I shall" +
            " not take you back again until you are stronger than a lion." +
            "' Then he opened the door and turned him adrift. " +
            "The poor horse was very melancholy, and wandered up and down in the" +
            " wood, seeking some little shelter from the cold wind and rain.";

    private static String paragraph2="Presently a fox met him: 'What's the matter," +
            " my friend?' said he, 'why do you hang down your head and look so lonely " +
            "and woe-begone?' 'Alas!' replied the horse, 'justice and avarice never dwell" +
            " in one house; my master has forgotten all that I have done for him so many years," +
            " and because I can no longer work he has turned me adrift, and says unless" +
            " I become stronger than a lion he will not take me back again; what chance" +
            " can I have of that? he knows I have none, or he would not talk so.' However," +
            " the fox bid him be of good cheer, and said, 'I will help you; lie down there," +
            " stretch yourself out quite stiff,  pretend to be dead and do not stir.'";

    private static String paragraph3="The horse did as he was told, and the fox went straight" +
            " to the lion who lived in a cave close by, and said to him, 'A little way off lies a" +
            " dead horse; come with me and you may make an excellent meal of his carcase.' " +
            "The lion was greatly pleased, and set off immediately; and when they came to" +
            " the horse, the fox said, 'You will not be able to eat him comfortably here; " +
            "I'll tell you what, I will tie you fast to his tail, and then you can draw" +
            " him to your den, and eat him at your leisure.'This advice pleased the lion, " +
            "so he laid himself down quietly for the fox to make him fast to the horse." +
            " But the fox managed to tie his legs together and bound all so hard and " +
            "fast that with all his strength he could not set himself free. ";

    private static String paragraph4="When the work was done, the fox clapped the horse on the" +
            " shoulder, and said, 'Jip! Dobbin! Jip! Pull grey horse, pull!' Then up he" +
            " sprang, and moved off, dragging the lion behind him. The beast began to " +
            "roar and bellow, till all the birds of the wood flew away for fright; but " +
            "the horse let him sing on, and made his way quietly over the fields to his " +
            "master's house.'Here he is, master,' said he, 'I have got the better of him':" +
            " and when the farmer saw his old servant, his heart relented, and he said. " +
            "'Thou shalt stay in thy stable and be well taken care of.' And so the poor old " +
            "horse had plenty to eat, and lived, till he died.";

    public FoxandHorse_Grade6(TextView p1Tv, TextView p2Tv, TextView p3Tv, TextView p4Tv ) {

        super(paragraph1, paragraph2, paragraph3, paragraph4,
                Pattern.compile("rain|wind|shelter"),
                Pattern.compile("stir|steer|dead|steal|stare"),
                Pattern.compile("free|could|strength|fee"),
                Pattern.compile("died|eat|diet|dead"),
                p1Tv,p2Tv,p3Tv,p4Tv);
    }




}
