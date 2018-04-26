package com.example.nirel.hackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void register(View view) {
        // Create an Intent to start the register activity
        Intent myIntent = new Intent(this, RegisterActivity.class);
        MainActivity.this.startActivity(myIntent);
    }

    public void login(View view) {
        // Create an Intent to start the login activity
        Intent myIntent = new Intent(this, LoginActivity.class);
        MainActivity.this.startActivity(myIntent);
    }
}
