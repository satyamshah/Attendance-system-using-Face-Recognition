package com.example.attendanceapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.EditText;
import android.widget.Toast;

public class registrationPage extends AppCompatActivity {
    String s1,s2, s3;
    EditText ed1,ed2,ed3;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_registration_page);
        ed1=findViewById(R.id.id);
        ed2=findViewById(R.id.pass);
        ed3=findViewById(R.id.c_pass);

    }

    public void checkPassword(View v){
        s1=ed1.getText().toString();
        s2=ed2.getText().toString();
        s3=ed3.getText().toString();
        if(s2.equals(s3) && !s2.isEmpty()){
            s1=s1+s2;
            Toast.makeText(this, s1, Toast.LENGTH_SHORT).show();
            Intent i= new Intent(this, loginPage.class);
            i.putExtra("detail", s1);
            startActivity(i);

        }
        else if(s1.isEmpty() || s2.isEmpty() || s3.isEmpty()){
            Toast.makeText(this, "Fill all the fields", Toast.LENGTH_SHORT).show();
        }
        else{
            Toast.makeText(this, "Check password again", Toast.LENGTH_SHORT).show();
        }
    }
}
