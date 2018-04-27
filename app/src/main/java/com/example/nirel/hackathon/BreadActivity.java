package com.example.nirel.hackathon;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Toast;

public class BreadActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_bread);
    }

    public void add_bunnies(View view){
        Toast.makeText(this.getApplicationContext(), "פריט נוסף לסל", Toast.LENGTH_LONG).show();
        Basket.add("bunnies        7.9");
    }

    public void add_black_bread(View view){
        Toast.makeText(this.getApplicationContext(), "פריט נוסף לסל", Toast.LENGTH_LONG).show();
        Basket.add("black_bread       4.9");
    }


}
