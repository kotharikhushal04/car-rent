package com.example.mycar;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
    }
    public void logoclick(View view){
        Intent intent = new Intent(getApplicationContext(),myaccount.class);
        startActivity(intent);
    }

    public void mercrdesclick(View view){
        Intent intent = new Intent(getApplicationContext(),mercedescol.class);
        startActivity(intent);
    }

    public void bmwclick(View view){
        Intent intent = new Intent(getApplicationContext(),bmwcol.class);
        startActivity(intent);
    }

    public void hundaiclick(View view){
        Intent intent = new Intent(getApplicationContext(),hundaicol.class);
        startActivity(intent);

    }

    public void volvoclick(View view){
        Intent intent = new Intent(getApplicationContext(),volvocol.class);
        startActivity(intent);

    }


}