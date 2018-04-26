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

    public void consumer(View view) {
        // Create an Intent to start the register activity
        Intent myIntent = new Intent(this, ConsumerLoginActivity.class);
        MainActivity.this.startActivity(myIntent);
    }

    public void volunteer(View view) {
        // Create an Intent to start the login activity
        Intent myIntent = new Intent(this, VolunteerLoginActivity.class);
        MainActivity.this.startActivity(myIntent);
    }
}
