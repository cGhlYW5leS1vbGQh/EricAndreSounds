package com.patheaney.ericandrebutton;

import android.media.MediaPlayer;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class BirdUp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bird_up);

        Button btnBirdUp = (Button) findViewById(R.id.btn_birdup);
        Button btnYahBoobay = (Button) findViewById(R.id.btn_ya_boobay);
        Button btnPizzaBall = (Button) findViewById(R.id.btn_pizza_ball);

        btnBirdUp.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(BirdUp.this, R.raw.birdup);
                mp.start();
            }
        });

        btnYahBoobay.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(BirdUp.this, R.raw.yahboobay);
                mp.start();
            }
        });

        btnPizzaBall.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                MediaPlayer mp = MediaPlayer.create(BirdUp.this, R.raw.pizzaball);
                mp.start();
            }
        });



    }
}
