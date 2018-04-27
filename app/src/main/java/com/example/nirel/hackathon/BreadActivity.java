package com.example.nirel.hackathon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class BreadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bread);
    }

    public void add_bunnies(int quantity){
        Basket.add("bunnies " + quantity + " x 8.9", 8.9 * quantity);
    }

    public void black_bread(int quantity){
        Basket.add("black_bread " + quantity + " x 4.9", 4.9 * quantity);
    }


}
