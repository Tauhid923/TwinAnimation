package com.example.tauhid.twinanimation;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.view.animation.Animation;
import android.view.animation.AnimationUtils;
import android.widget.ImageView;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {
    TextView txtAndroid;
    ImageView imgAndroid;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        txtAndroid=findViewById(R.id.txt_android);
        imgAndroid=findViewById(R.id.img_android);

        txtAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {

                Animation rotate= AnimationUtils.loadAnimation(MainActivity.this,R.anim.roted);
                txtAndroid.startAnimation(rotate);
            }
        });

        imgAndroid.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Animation rotate= AnimationUtils.loadAnimation(MainActivity.this,R.anim.roted);
                imgAndroid.startAnimation(rotate);

            }
        });
        txtAndroid.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                txtAndroid.clearAnimation();
                return true;
            }
        });

        imgAndroid.setOnLongClickListener(new View.OnLongClickListener() {
            @Override
            public boolean onLongClick(View v) {
                imgAndroid.clearAnimation();
                return true;
            }
        });
    }

    @Override
    protected void onPause() {
        imgAndroid.clearAnimation();
        super.onPause();
    }
}
