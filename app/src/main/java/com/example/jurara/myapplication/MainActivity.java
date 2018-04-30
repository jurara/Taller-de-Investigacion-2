package com.example.jurara.myapplication;

import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    ImageView ram,pro,hdd;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        ram=(ImageView)findViewById(R.id.ram);
        pro=(ImageView)findViewById(R.id.pro);
        hdd=(ImageView)findViewById(R.id.hdd);
        ObjectAnimator rotateAnimator = ObjectAnimator.ofFloat(ram, "rotation", 0f, 360f*4);
        ObjectAnimator rotateAnimator2 = ObjectAnimator.ofFloat(hdd, "rotation", 0f, 360f*4);
        ObjectAnimator rotateAnimator3 = ObjectAnimator.ofFloat(pro, "rotation", 0f, 360f*4);

        ObjectAnimator fadeIn = ObjectAnimator.ofFloat(ram, "alpha", .0f, 1f);
        ObjectAnimator fadeIn2 = ObjectAnimator.ofFloat(hdd, "alpha", .0f, 1f);
        ObjectAnimator fadeIn3 = ObjectAnimator.ofFloat(pro, "alpha", .0f, 1f);
        fadeIn.setDuration(2000);
        fadeIn2.setDuration(2000);
        fadeIn3.setDuration(2000);

        final AnimatorSet animatorSet = new AnimatorSet();
        animatorSet.setDuration(4000);
        animatorSet.playTogether(rotateAnimator, rotateAnimator2,rotateAnimator3,fadeIn,fadeIn2,fadeIn3);
        animatorSet.start();

        new Handler().postDelayed(new Runnable(){
            public void run(){

                Intent intent = new Intent(getApplicationContext(), Main2Activity.class);
                startActivity(intent);
                finish();
            };
        }, 5000);

    }
}
