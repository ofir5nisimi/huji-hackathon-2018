package com.example.nirel.hackathon;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;

public class VegetablesActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_vegetables);
    }

    public void add_carrot(View view){
        Basket.add("carrot           4.9");
    }

    public void add_tomato(View view){
        Basket.add("tomato           3.2");
    }

    public void add_red_pilpel(View view){
        Basket.add("red_pilpel            6.9");
    }

    public void add_cucumber(View view){
        Basket.add("cucumber           4.5");
    }

}
