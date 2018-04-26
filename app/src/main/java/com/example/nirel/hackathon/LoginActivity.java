package com.example.nirel.hackathon;
import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;


public class LoginActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
    }


    public void go_to_helper(View view){
        Intent myIntent = new Intent(this, HelperMainActivity.class);
        this.startActivity(myIntent);
    }


    public void go_to_order_categories(View view){
        Intent order_categories = new Intent(this, OrderCategoriesActivity.class);
        this.startActivity(order_categories);
    }

}
