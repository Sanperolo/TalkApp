package com.housecloud.splashhousecloud;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class Splash extends AppCompatActivity {

    private TextView myTitle;
    private TextView mySubtitle;
    private ImageView myImage;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_splash);

        myTitle = (TextView) findViewById(R.id.Title);
        mySubtitle = (TextView) findViewById(R.id.Subtitle);
        myImage = (ImageView) findViewById(R.id.imageView);


        Animation myanim = AnimationUtils.loadAnimation(this, R.anim.fadein);
        Animation myanim1 = AnimationUtils.loadAnimation(this, R.anim.myanim);
        Animation myanim2 = AnimationUtils.loadAnimation(this, R.anim.leftin);

        myImage.startAnimation(myanim);
        mySubtitle.startAnimation(myanim1);
        myTitle.startAnimation(myanim2);

        openApp(true);
    }
    private void openApp(boolean locationPermission) {
        Handler handler = new Handler();
        handler.postDelayed(new Runnable() {
            @Override
            public void run() {
                Intent intent = new Intent(Splash.this, Login.class);
                startActivity(intent);
                finish();
            }
        }, 3000);
    }
}
