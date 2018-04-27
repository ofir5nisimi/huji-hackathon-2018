package com.example.nirel.hackathon;

import android.os.Bundle;
import android.support.design.widget.FloatingActionButton;
import android.support.design.widget.Snackbar;
import android.support.v7.app.AppCompatActivity;
import android.support.v7.widget.Toolbar;
import android.view.View;
import android.widget.Toast;

public class DiaryActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_diary);
    }

    public void add_milk_tnuva(View view){
        Toast.makeText(this.getApplicationContext(), "פריט נוסף לסל", Toast.LENGTH_LONG).show();
        Basket.add("milk_tnuva         5.9");
    }

    public void add_milk_tara(View view){
        Toast.makeText(this.getApplicationContext(), "פריט נוסף לסל", Toast.LENGTH_LONG).show();
        Basket.add("milk_tara           5.9");
    }

    public void add_g_tzehuba_emek(View view){
        Toast.makeText(this.getApplicationContext(), "פריט נוסף לסל", Toast.LENGTH_LONG).show();
        Basket.add("g_tzehuba_emek          15.9");
    }

    public void add_g_tzehuba_gush_halav(View view){
        Toast.makeText(this.getApplicationContext(), "פריט נוסף לסל", Toast.LENGTH_LONG).show();
        Basket.add("g_tzehuba_gush_halav         16.9");
    }

    public void add_g_tzehuba_noam(View view){
        Toast.makeText(this.getApplicationContext(), "פריט נוסף לסל", Toast.LENGTH_LONG).show();
        Basket.add("g_tzehuba_noam           17.9");
    }

}
