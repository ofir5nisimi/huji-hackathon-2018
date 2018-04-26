package com.example.nirel.hackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class ConsumerLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consumer_login);
    }

    public void go_to_order(View view){
        Intent order = new Intent(this, OrderCategoriesActivity.class);
        this.startActivity(order);
    }

    public void register(View view){
        Intent myIntent = new Intent(this, RegisterActivity.class);
        this.startActivity(myIntent);
    }
}
