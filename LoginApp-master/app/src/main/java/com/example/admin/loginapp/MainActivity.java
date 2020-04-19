package com.example.admin.loginapp;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class MainActivity extends AppCompatActivity {


    public void login(View view) {
        EditText username = (EditText) findViewById(R.id.username);
        EditText password = (EditText) findViewById(R.id.password);
        String uname = username.getText().toString();
        String pname = password.getText().toString();
        //Toast.makeText(MainActivity.this, "succesfully logged", Toast.LENGTH_SHORT).show();
        if (uname.equals("Jeslin") && pname.equals("5678")) {
            Toast.makeText(MainActivity.this, "welcome" + uname, Toast.LENGTH_SHORT).show();
            Intent myIntent = new Intent(this, Main2Activity.class);
            startActivity(myIntent);
            finish();
        } else
            Toast.makeText(MainActivity.this, "Wrong password", Toast.LENGTH_SHORT).show();
    }

        @Override
        protected void onCreate (Bundle savedInstanceState){
            super.onCreate(savedInstanceState);
            setContentView(R.layout.activity_main);
        }
    }

