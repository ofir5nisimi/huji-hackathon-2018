package com.example.nirel.hackathon;

import android.os.Bundle;
import android.app.Activity;
import android.view.View;
import android.widget.Toast;

public class HouseBasicsActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_house_basics);
    }

    public void add_colon(View view){
        Toast.makeText(this.getApplicationContext(), "פריט נוסף לסל", Toast.LENGTH_LONG).show();
        Basket.add("colon          12.9");
    }

    public void add_toilett_papper(View view){
        Toast.makeText(this.getApplicationContext(), "פריט נוסף לסל", Toast.LENGTH_LONG).show();
        Basket.add("toilett_papper         12.9");
    }
}
