package com.example.nirel.hackathon;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;

public class DiaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary);
    }

    public void add_milk_tnuva(double quantity){
        Basket.add("milk_tnuva " + quantity + "x 5.9", 5.9 * quantity);
    }

    public void add_milk_tara(double quantity){
        Basket.add("milk_tara " + quantity + "x 5.9", 5.9 * quantity);
    }

    public void add_g_tzehuba_emek(double quantity){
        Basket.add("g_tzehuba_emek " + quantity + "x 15.9", 15.9 * quantity);
    }

    public void add_g_tzehuba_gush_halav(double quantity){
        Basket.add("g_tzehuba_gush_halav " + quantity + "x 16.9", 16.9 * quantity);
    }

    public void add_g_tzehuba_noam(double quantity){
        Basket.add("g_tzehuba_noam " + quantity + "x 17.9", 17.9 * quantity);
    }

}
