package com.example.nirel.hackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class VolunteerLoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_volunteer_login);
    }

    public void register(View view){
        Intent myIntent = new Intent(this, RegisterActivity.class);
        this.startActivity(myIntent);
    }

    public void connect(View view){
        Intent myIntent = new Intent(this, HelperMainActivity.class);
        this.startActivity(myIntent);
    }
}
