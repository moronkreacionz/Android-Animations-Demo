package com.moronkreacionz.animations20170302;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;

public class MainActivity extends AppCompatActivity {

    // TODO : only one image is working with all animation sequences
    // TODO : need to review this one single image animation and make it work for both images

    public void resetImages(){
        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);
        ImageView homerImageView = (ImageView) findViewById(R.id.homerImageView);

        bartImageView.setVisibility(View.VISIBLE);
        bartImageView.setTranslationX(0f);
        bartImageView.setTranslationY(0f);
        bartImageView.setScaleX(1);
        bartImageView.setScaleY(1);

        homerImageView.setVisibility(View.INVISIBLE);
        homerImageView.setTranslationX(0f);
        homerImageView.setTranslationY(0f);
        homerImageView.setScaleX(1);
        homerImageView.setScaleY(1);
    }

    public void animateOnClickButton1(View view){
        resetImages();
        Log.i("info","image bart is fading and homer is coming in and reverse");
        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);
        ImageView homerImageView = (ImageView) findViewById(R.id.homerImageView);
        homerImageView.setVisibility(View.VISIBLE);

        bartImageView.animate().alpha(0f).setDuration(2000);

        homerImageView.animate().alpha(1f).setDuration(2000);
        homerImageView.animate().alpha(0f).setDuration(2000);
        bartImageView.animate().alpha(1f).setDuration(2000);

    }

    public void animateOnClickButton2(View view) {
        resetImages();
        Log.i("info","image bart scale ");
        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);
        ImageView homerImageView = (ImageView) findViewById(R.id.homerImageView);

        bartImageView.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);
        bartImageView.setVisibility(View.INVISIBLE);
        homerImageView.setVisibility(View.VISIBLE);
        bartImageView.animate().scaleX(0.5f).scaleY(0.5f).setDuration(2000);
        resetImages();
    }
    public void animateOnClickButton3(View view) {
        resetImages();
        Log.i("info","image sliding both down");
        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);
        ImageView homerImageView = (ImageView) findViewById(R.id.homerImageView);
        bartImageView.animate().translationYBy(1000f).setDuration(2000);
        homerImageView.setVisibility(View.VISIBLE);
        homerImageView.animate().translationYBy(1000f).setDuration(2000);
        resetImages();
    }
    public void animateOnClickButton4(View view) {
        resetImages();
        Log.i("info","image sliding both to right");
        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);
        ImageView homerImageView = (ImageView) findViewById(R.id.homerImageView);
        bartImageView.animate().translationXBy(-1000f).setDuration(2000);
        homerImageView.setVisibility(View.VISIBLE);
        homerImageView.animate().translationXBy(-1000f).setDuration(2000);
        resetImages();
    }
    public void animateOnClickButton5(View view) {
        resetImages();
        Log.i("info","image bart sliding them from right into the center");
        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);
        ImageView homerImageView = (ImageView) findViewById(R.id.homerImageView);

        bartImageView.setTranslationX(-1000f);
        bartImageView.animate().translationXBy(1000f).setDuration(2000);
        bartImageView.setVisibility(View.INVISIBLE);
        homerImageView.setTranslationX(-1000f);
        homerImageView.setVisibility(View.VISIBLE);
        homerImageView.animate().translationXBy(1000f).setDuration(2000);
        resetImages();
    }

    public void animateOnClickButton6(View view) {
        resetImages();
        Log.i("info","image rotation");
        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);
        ImageView homerImageView = (ImageView) findViewById(R.id.homerImageView);
        bartImageView.animate().rotation(3600f).setDuration(2000);
        bartImageView.setVisibility(View.INVISIBLE);
        homerImageView.setVisibility(View.VISIBLE);
        homerImageView.animate().rotation(3600f).setDuration(2000);
        resetImages();

    }
    public void animateOnClickButton7(View view) {
        resetImages();
        Log.i("info","sliding in and spinning into the center - two animations");
        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);
        ImageView homerImageView = (ImageView) findViewById(R.id.homerImageView);

        bartImageView.setTranslationX(-1000f);
        bartImageView.setTranslationY(-1000f);
        homerImageView.setTranslationX(-1000f);
        homerImageView.setTranslationY(-1000f);

        bartImageView.animate()
                .translationXBy(1000f)
                .translationYBy(1000f)
                .rotation(3600f)
                .setDuration(2000);

        bartImageView.setVisibility(View.INVISIBLE);

        homerImageView.setVisibility(View.VISIBLE);
        homerImageView.animate().translationXBy(1000f).translationYBy(1000f).rotation(3600f).setDuration(2000);

        resetImages();

    }
    /*public void fadeEffectOnClickBart(View view){
        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);
        ImageView homerImageView = (ImageView) findViewById(R.id.homerImageView);
        homerImageView.setVisibility(View.VISIBLE);
        bartImageView.animate().alpha(0f).setDuration(2000);
        homerImageView.animate().alpha(1f).setDuration(2000);
        Log.i("info","image bart is fading and homer is coming in");
        bartImageView.setVisibility(View.INVISIBLE);
    }

    public void fadeEffectOnClickHomer(View view){
        ImageView bartImageView = (ImageView) findViewById(R.id.bartImageView);
        ImageView homerImageView = (ImageView) findViewById(R.id.homerImageView);
        bartImageView.setVisibility(View.VISIBLE);
        homerImageView.animate().alpha(0f).setDuration(2000);
        bartImageView.animate().alpha(1f).setDuration(2000);
        homerImageView.setVisibility(View.INVISIBLE);
        Log.i("info","image homer is fading and bart is coming in");
    }*/

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        resetImages();
    }
}
