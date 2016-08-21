package com.imooc.vectortest;

import android.app.Activity;
import android.graphics.drawable.Animatable;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;


public class MainActivity extends Activity {

    ImageView imageView;
    ImageView imageView2;
    ImageView imageView3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        imageView = (ImageView) findViewById(R.id.image);
        imageView2 = (ImageView) findViewById(R.id.image2);
        imageView3 = (ImageView) findViewById(R.id.image3);
        imageView.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animate();
            }
        });
        imageView2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animate2();
            }
        });
        imageView3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                animate3();
            }
        });
    }

    private void animate() {
        Drawable drawable = imageView.getDrawable();
        System.out.println("animate");
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }
    private void animate2() {
        Drawable drawable = imageView2.getDrawable();
        System.out.println("animate2");
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }
    private void animate3() {
        Drawable drawable = imageView3.getDrawable();
        System.out.println("animate3");
        if (drawable instanceof Animatable) {
            ((Animatable) drawable).start();
        }
    }
}
