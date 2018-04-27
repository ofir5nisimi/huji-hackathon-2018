package com.example.nirel.hackathon;

import android.app.Activity;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ConsumerMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consumer_main);
    }

    public void bread(View view){
        Intent myIntent = new Intent(this, BreadActivity.class);
        this.startActivity(myIntent);
    }

    public void milk(View view){
        Intent myIntent = new Intent(this, DiaryActivity.class);
        this.startActivity(myIntent);
    }

    public void fruits(View view){
        Intent myIntent = new Intent(this, FruitActivity.class);
        this.startActivity(myIntent);
    }

    public void vegetables(View view){
        Intent myIntent = new Intent(this, VegetablesActivity.class);
        this.startActivity(myIntent);
    }

    public void others(View view){
        Intent myIntent = new Intent(this, HouseBasicsActivity.class);
        this.startActivity(myIntent);
    }
}
