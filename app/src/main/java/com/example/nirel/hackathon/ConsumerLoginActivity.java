package com.example.nirel.hackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class ConsumerLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_consumer_login);
    }

    public void go_to_order(){
        Intent order = new Intent(this, OrderCategoriesActivity.class);
        ConsumerLoginActivity.this.startActivity(order);
    }
}
