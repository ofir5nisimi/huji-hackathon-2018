package com.example.nirel.hackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class OrderCategoriesActivity extends  AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_ordercategories);
    }

    public void bread(View view)
    {
        Intent bread = new Intent(this, BreadActivity.class);
        startActivity(bread);
    }

    public void diary(View view)
    {
        Intent diary = new Intent(this, DiaryActivity.class);
        startActivity(diary);
    }

    public void vegetables(View view)
    {
        Intent bread = new Intent(this, VegetablesActivity.class);
        startActivity(bread);
    }

    public void fruit(View view)
    {
        Intent bread = new Intent(this, FruitActivity.class);
        startActivity(bread);
    }

    public void house_basics(View view)
    {
        Intent house_basics = new Intent(this, HouseBasicsActivity.class);
        startActivity(house_basics);
    }

    public void extras(View view)
    {
        Intent extras = new Intent(this, ExtrasActivity.class);
        OrderCategoriesActivity.this.startActivity(extras);
    }


}
