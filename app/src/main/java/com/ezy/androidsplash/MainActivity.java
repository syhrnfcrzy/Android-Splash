package com.ezy.androidsplash;

import android.app.ActivityOptions;
import android.content.Intent;
import android.os.Bundle;
import android.util.Pair;
import android.view.View;
import android.view.WindowManager;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.TextView;


public class MainActivity extends Login {
    Animation topAnim, bottomanim;
    TextView text;
    private Pair<View, String> pairs;

    public MainActivity(Pair<View, String> pairs) {
        this.pairs = pairs;
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        getWindow() .setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_main);
        topAnim = AnimationUtils.loadAnimation(this,R.anim.top_animation);
        bottomanim = AnimationUtils.loadAnimation(this,R.anim.bottom_animation);

        text = findViewById(R.id.Text);
        text.setAnimation(bottomanim);
    }
        Intent intent = new Intent(MainActivity.this, Login.class);
        {
            ActivityOptions options;
            options = ActivityOptions.makeSceneTransitionAnimation(MainActivity.this, pairs);
            startActivity(intent, options.toBundle());
        }
    }