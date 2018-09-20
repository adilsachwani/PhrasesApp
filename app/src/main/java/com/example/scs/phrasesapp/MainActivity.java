package com.example.scs.phrasesapp;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    public void playMusic(View view){

        int intId = view.getId();
        String strId = view.getResources().getResourceEntryName(intId);
        int resourceId = getResources().getIdentifier(strId,"raw","com.example.scs.phrasesapp");

        MediaPlayer mediaPlayer = MediaPlayer.create(this,resourceId);
        mediaPlayer.start();
    }

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }
}