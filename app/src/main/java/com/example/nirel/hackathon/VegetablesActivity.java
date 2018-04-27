package com.example.nirel.hackathon;

import android.os.Bundle;
import android.app.Activity;

public class VegetablesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetables);
    }

    public void add_carrot(double weight){
        Basket.add("carrot " + weight + "x 4.9", 4.9 * weight);
    }

    public void add_tomato(double weight){
        Basket.add("tomato " + weight + "x 3.2", 3.2 * weight);
    }

    public void add_red_pilpel(double weight){
        Basket.add("red_pilpel " + weight + "x 6.9", 6.9 * weight);
    }

    public void add_cucumber(double weight){
        Basket.add("cucumber " + weight + "x 4.5", 4.5 * weight);
    }

}
