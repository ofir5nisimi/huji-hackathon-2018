package com.example.nirel.hackathon;

import android.content.Intent;
import android.support.design.widget.TextInputLayout;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.support.v7.widget.AppCompatEditText;
import android.view.View;
import android.widget.EditText;

import org.json.JSONException;
import org.json.JSONObject;
import android.app.AlertDialog;
import android.content.Intent;
import android.os.Bundle;
import android.support.v7.app.AppCompatActivity;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;

import com.android.volley.RequestQueue;
import com.android.volley.Response;
import com.android.volley.toolbox.Volley;

import org.json.JSONException;
import org.json.JSONObject;

public class RegisterActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_register);
    }


    public String[] read_user_input(View view){

        final EditText usernameWrapper = findViewById(R.id.input_name);
        final EditText emailWrapper = findViewById(R.id.input_email);
        final EditText passwordWrapper = findViewById(R.id.input_password);
        final EditText addressWrapper = findViewById(R.id.input_address);
        final EditText paymentWrapper = findViewById(R.id.input_payment);
        final EditText sayingWrapper = findViewById(R.id.input_saying);

        String username = usernameWrapper.getText().toString();
        String email = emailWrapper.getText().toString();
        String password = passwordWrapper.getText().toString();
        String address = addressWrapper.getText().toString();
        String payment = paymentWrapper.getText().toString();
        String saying = sayingWrapper.getText().toString();

        return new String[] {username, email, password, address, payment, saying};
    }

    public void register(View view){

        final String[] user_input = read_user_input(view);

    }
}
