package com.example.android.mediaplayer;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

    private MediaPlayer mediaPlayer = MediaPlayer.create(this, R.raw.music);

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button play = (Button) findViewById(R.id.button_play);
        Button pause = (Button) findViewById(R.id.button_pause);
        Button stop = (Button) findViewById(R.id.button_stop);
        Button plus5S = (Button) findViewById(R.id.button_plus_5s);
        Button minus5S = (Button) findViewById(R.id.button_minus_5s);

        play.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.start();
            }
        });


        pause.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.pause();
            }
        });


        stop.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.reset();
            }
        });
        int time = mediaPlayer.getCurrentPosition();
        final int timePlusFive = time + 5000;
        final int timeMinusFive = time - 5000;

        plus5S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.seekto(timePlusFive);
            }
        });

        minus5S.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                mediaPlayer.seekto(timeMinusFive);
            }
        });

    }
}
