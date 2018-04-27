package com.example.nirel.hackathon;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class BasketActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_basket);
    }

    public void ask_buy(View view){
        Toast.makeText(this.getApplicationContext(), "הזמנתך נרשמה", Toast.LENGTH_LONG).show();
        Intent myIntent = new Intent(this, ConsumerMainActivity.class);
        this.startActivity(myIntent);
    }
}
