package com.example.petapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.os.CountDownTimer;
import android.util.Log;
import android.view.View;
import android.widget.ProgressBar;
import android.widget.TextView;

public class MainActivity extends AppCompatActivity {

    TextView greeting;
    TextView lifeValue;
    TextView foodValue;
    TextView milkValue;


    private ProgressBar progBar;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        greeting = findViewById(R.id.greeting);
        lifeValue = findViewById(R.id.overallLifeValue);
        foodValue = findViewById(R.id.foodValue);
        milkValue = findViewById(R.id.milkValue);




        progBar = findViewById(R.id.progressBar);


        progBar.setMax(30000);


        new CountDownTimer( 120000,  1000){

            public void onTick(long msf){
                greeting.setText("secs left:" + msf/1000);
                progBar.setProgress((int)msf);
            }

            public void onFinish(){
                greeting.setText("mm bye");
            }
        }.start();
    }

    public void addFoodValue(View view) {

        Log.d("addfood","called");


    }
    public void addMilkValue(View view) {
    }
}
