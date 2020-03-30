package com.example.attendanceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void logIn(View v){
        Intent i= new Intent(this, registrationPage.class);

        startActivity(i);
    }

    public void newRegister(View v){
        Intent i= new Intent(this, loginPage.class);

        startActivity(i);
    }
}
