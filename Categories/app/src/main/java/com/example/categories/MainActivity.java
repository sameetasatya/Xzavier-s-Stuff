package com.example.categories;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openBestShoeBrands(View view) {

        Intent myIntent = new Intent(this,BestShoeBrands.class);
        myIntent.putExtra("title","BestShoeBrands Here");
        startActivity(myIntent);

    }

    public void openBestShoes(View view) {

        Intent myIntent = new Intent(this,BestShoes.class);
        startActivity(myIntent);

    }

    public void openUgliestShoes(View view) {

        Intent myIntent = new Intent(this,UglyistShoes.class);
        startActivity(myIntent);

    }
}
