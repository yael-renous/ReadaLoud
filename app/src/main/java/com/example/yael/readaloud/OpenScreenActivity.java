package com.example.yael.readaloud;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.ValueAnimator;
import android.content.Intent;
import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class OpenScreenActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_open_screen);
    }



    public void easyButtonClick(View view) {
        Intent intent = new Intent(getBaseContext(), MainActivity.class);
        intent.putExtra("STORY_LEVEL", Grade.SECOND);
        startActivity(intent);
    }

    public void mediumButtonClick(View view) {
        Intent intent = new Intent(getBaseContext(), MainActivity.class);
        intent.putExtra("STORY_LEVEL", Grade.FOURTH);
        startActivity(intent);
    }

    public void hardButtonClick(View view) {
        Intent intent = new Intent(getBaseContext(), MainActivity.class);
        intent.putExtra("STORY_LEVEL", Grade.SIXTH);
        startActivity(intent);
    }
}
