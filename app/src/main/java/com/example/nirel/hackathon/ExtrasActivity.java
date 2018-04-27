package com.example.nirel.hackathon;

import android.os.Bundle;
import android.app.Activity;

public class ExtrasActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extras);
    }

    public void add_balls(double quantity){
        Basket.add("balls " + quantity + "x 12.9", 12.9 * quantity);
    }

    public void add_basmatic_rice(double quantity){
        Basket.add("basmatic_rice " + quantity + "x 10.5", 10.9 * quantity);
    }

    public void add_persian_rice(double quantity){
        Basket.add("persian_rice " + quantity + "x 8.5", 8.9 * quantity);
    }

    public void add_white_sugar(double quantity){
        Basket.add("white_sugar " + quantity + "x 2.5", 2.5 * quantity);
    }

}
