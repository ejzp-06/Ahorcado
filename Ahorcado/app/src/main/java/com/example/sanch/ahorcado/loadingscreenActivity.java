package com.example.sanch.ahorcado;

import android.content.Intent;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;

public class loadingscreenActivity extends AppCompatActivity {
    int SPLASH_TIME_OUT=5000;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_loadingscreen);
        new Handler().postDelayed(new Runnable(){
            @Override
            public  void run(){
                Intent homeIntent=new Intent(loadingscreenActivity.this,MainActivity.class);
                startActivity(homeIntent);
                finish();
            }
        },SPLASH_TIME_OUT);}

}