package com.example.attendanceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

import java.util.ArrayList;

public class loginPage extends AppCompatActivity {
    EditText ed1, ed2;
    String s1,s2;
    static ArrayList<String> detail= new ArrayList<>(5);
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login_page);

        ed1=findViewById(R.id.getEmail);
        ed2=findViewById(R.id.getPassword);

        Intent i = getIntent();
        String str=i.getStringExtra("detail");
        detail.add(str);
    }

    public void checkDetail(View v){
        s1=ed1.getText().toString();
        s2=ed2.getText().toString();
        s1=s1+s2;
        if(detail.contains(s1)){
            Toast.makeText(this, "Login Successful", Toast.LENGTH_SHORT).show();
        }
        else if(s1.isEmpty() || s2.isEmpty()){
            Toast.makeText(this, "Enter both ID and Password.", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Login Unsuccessful. Invalid User", Toast.LENGTH_SHORT).show();
        }
    }

    public void registerPage(View v){
        Intent i=new Intent(this, registrationPage.class);
        startActivity(i);
    }
}
