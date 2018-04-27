package com.example.nirel.hackathon;

import android.os.Bundle;
import android.app.Activity;

public class HouseBasicsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_basics);
    }

    public void add_colon(double quantity){
        Basket.add("colon " + quantity + "x 12.9", 12.9 * quantity);
    }

    public void add_toilett_papper(double quantity){
        Basket.add("toilett_papper " + quantity + "x 12.9", 12.9 * quantity);
    }
}
