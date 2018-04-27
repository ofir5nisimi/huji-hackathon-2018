package com.example.nirel.hackathon;
import android.content.Intent;
import android.view.View;
import android.widget.Button;
import android.app.Activity;
import android.os.Bundle;

public class PayActivity extends Activity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_pay);
    }

    public class MyActivity extends Activity {
        protected void onCreate(Bundle savedInstanceState) {
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_pay);
        }
    }

    public void help_buying(View view){
        Intent myIntent = new Intent(this, QrActivity.class);
        this.startActivity(myIntent);
    }

}
