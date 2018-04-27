package com.example.nirel.hackathon;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Toast;

public class FruitActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fruit);
    }

    public void add_pear(View view){
        Toast.makeText(this.getApplicationContext(), "פריט נוסף לסל", Toast.LENGTH_LONG).show();
        Basket.add("pear            7.0");
    }

    public void add_pink_lady(View view){
        Toast.makeText(this.getApplicationContext(), "פריט נוסף לסל", Toast.LENGTH_LONG).show();
        Basket.add("pink_lady             7.9");
    }

    public void add_hermon(View view){
        Toast.makeText(this.getApplicationContext(), "פריט נוסף לסל", Toast.LENGTH_LONG).show();
        Basket.add("hermon              5.9");
    }

    public void add_peach(View view){
        Toast.makeText(this.getApplicationContext(), "פריט נוסף לסל", Toast.LENGTH_LONG).show();
        Basket.add("peach          5.9");
    }
}
