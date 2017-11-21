package com.example.user.firebaseauthdemo;

import android.content.Intent;
import android.os.Bundle;
import android.os.Handler;
import android.support.v7.app.AppCompatActivity;
import android.view.Window;
import android.view.WindowManager;

public class WelcomActivity extends AppCompatActivity
{
    private static int SPLASH_TIME_OUT = 2000;

    @Override
    protected void onCreate(Bundle savedInstanceState)
    {
        super.onCreate(savedInstanceState);
        requestWindowFeature(Window.FEATURE_NO_TITLE);
        getWindow().setFlags(WindowManager.LayoutParams.FLAG_FULLSCREEN,
                WindowManager.LayoutParams.FLAG_FULLSCREEN);
        setContentView(R.layout.activity_welcom);

        new Handler().postDelayed(new Runnable()
        {
            @Override
            public void run()
            {
                Intent myintent = new Intent(WelcomActivity.this, MainActivity.class);
                startActivity(myintent);
                finish();
            }
        }
        , SPLASH_TIME_OUT);

    }
}
