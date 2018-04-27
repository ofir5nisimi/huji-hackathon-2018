package com.example.nirel.hackathon;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Toast;

public class ExtrasActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_extras);
    }

    public void add_balls(View view){
        Toast.makeText(this.getApplicationContext(), "פריט נוסף לסל", Toast.LENGTH_LONG).show();
        Basket.add("balls              12.9");
    }

    public void add_basmatic_rice(View view){
        Toast.makeText(this.getApplicationContext(), "פריט נוסף לסל", Toast.LENGTH_LONG).show();
        Basket.add("basmatic_rice            10.5");
    }

    public void add_persian_rice(View view){
        Toast.makeText(this.getApplicationContext(), "פריט נוסף לסל", Toast.LENGTH_LONG).show();
        Basket.add("persian_rice             8.5");
    }

    public void add_white_sugar(View view){
        Toast.makeText(this.getApplicationContext(), "פריט נוסף לסל", Toast.LENGTH_LONG).show();
        Basket.add("white_sugar              2.5");
    }

}
