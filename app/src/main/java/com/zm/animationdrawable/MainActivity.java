package com.zm.animationdrawable;

import android.graphics.drawable.AnimationDrawable;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {
    private AnimationDrawable animationDrawable;
    private ImageView iv_loading;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        iv_loading = findViewById(R.id.iv_loading);
        iv_loading.setImageResource(R.drawable.anim_loading);
        animationDrawable = ((AnimationDrawable) iv_loading.getDrawable());
        animationDrawable.start();
    }
}
