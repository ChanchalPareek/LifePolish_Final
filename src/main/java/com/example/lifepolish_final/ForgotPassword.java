package com.example.lifepolish_final;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.os.Handler;
import android.content.Intent;

public class ForgotPassword extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_forgot_password);
    }
    public void fun4(View view) {

        Intent I = new Intent(ForgotPassword.this, Otp.class);
        startActivity(I);

    }
}
