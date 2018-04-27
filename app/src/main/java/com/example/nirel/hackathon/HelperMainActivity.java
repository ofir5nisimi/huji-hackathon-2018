package com.example.nirel.hackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.ImageView;

public class HelperMainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_helper_main);

        ImageView img = (ImageView) findViewById(R.id.spot);
        img.setOnClickListener(new View.OnClickListener() {
            public void onClick(View v) {
                pay(v);
            }
        });
    }

    public void pay(View view){
        Intent myIntent = new Intent(this, PayActivity.class);
        this.startActivity(myIntent);
    }
}
