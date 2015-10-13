package com.example.www.hardwork;


import android.app.Activity;
import android.content.Intent;
import android.media.MediaPlayer;
import android.os.Bundle;

public class Splash extends Activity {
    MediaPlayer song;  ///for access to all activity and destroy on switching other Activity ,use onPause method below.


    @Override
    protected void onCreate(Bundle ashuloveit) {
        super.onCreate(ashuloveit);
        setContentView(R.layout.splash);
     ///set Music.//////
        song = MediaPlayer.create(Splash.this, R.raw.glory);
        song.start();




        Thread timer = new Thread(){
            public void run (){
                try {
                    sleep(5000);

                } catch (InterruptedException e){

                     e.printStackTrace();

                }finally {
                    Intent intent = new Intent("com.example.www.hardwork.MENU");
                    startActivity(intent);

                }

            }

        };
        timer.start();
    }

    @Override
    protected void onPause() {
        super.onPause();
        song.release();////song release on change another activity.////
        finish();
    }
}


