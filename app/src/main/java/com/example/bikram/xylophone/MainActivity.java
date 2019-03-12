package com.example.bikram.xylophone;

import android.media.AudioManager;
import android.media.SoundPool;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    private final int NH_OF_SIMULTANEOUS_SOUNDS = 7;
    private final float LEFT_VOLUME = 1.0f;
    private final float RIGHT_VOLUME = 1.0f;
    private final int NO_LOOP = 0;
    private final int PRIORITY = 0;
    private final float NORMAL_PLAY_RATE = 1.0f;

    private SoundPool mSoundPool;
    private int mCSoundID;
    private int mDSoundID;
    private int mESoundID;
    private int mFSoundID;
    private int mGSoundID;
    private int mASoundID;
    private int mBSoundID;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mSoundPool = new SoundPool(NH_OF_SIMULTANEOUS_SOUNDS, AudioManager.STREAM_MUSIC, 0);

        mCSoundID = mSoundPool.load(getApplicationContext(),R.raw.note1_c, 1);
        mDSoundID = mSoundPool.load(getApplicationContext(),R.raw.note2_d, 2);
        mESoundID = mSoundPool.load(getApplicationContext(),R.raw.note3_e, 3);
        mFSoundID = mSoundPool.load(getApplicationContext(),R.raw.note4_f, 4);
        mGSoundID = mSoundPool.load(getApplicationContext(),R.raw.note5_g, 5);
        mASoundID = mSoundPool.load(getApplicationContext(),R.raw.note6_a, 6);
        mBSoundID = mSoundPool.load(getApplicationContext(),R.raw.note7_b, 7);




    }
       public void playC(View v){
        mSoundPool.play(mCSoundID,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);


    }
    public void playD(View v){
        mSoundPool.play(mDSoundID,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);


    }
    public void playE(View v){
        mSoundPool.play(mESoundID,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);


    }
    public void playF(View v){
        mSoundPool.play(mFSoundID,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);


    }
    public void playG(View v){
        mSoundPool.play(mGSoundID,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);


    }
    public void playA(View v){
        mSoundPool.play(mASoundID,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);


    }
    public void playB(View v){
        mSoundPool.play(mBSoundID,LEFT_VOLUME,RIGHT_VOLUME,PRIORITY,NO_LOOP,NORMAL_PLAY_RATE);


    }


}
