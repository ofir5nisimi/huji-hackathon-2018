package com.example.nirel.hackathon;

import android.os.Bundle;
import android.app.Activity;

public class FruitActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);
    }

    public void add_pear(double weight){
        Basket.add("pear " + weight + "x 7.0", 7.0 * weight);
    }

    public void add_pink_lady(double weight){
        Basket.add("pink_lady " + weight + "x 7.9", 7.9 * weight);
    }

    public void add_hermon(double weight){
        Basket.add("hermon " + weight + "x 5.9", 5.9 * weight);
    }

    public void add_peach(double weight){
        Basket.add("peach " + weight + "x 5.9", 5.9 * weight);
    }
}
