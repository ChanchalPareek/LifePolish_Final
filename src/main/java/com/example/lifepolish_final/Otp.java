package com.example.lifepolish_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Otp extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_otp);
    }
    public void fun5(View view) {

        Intent I = new Intent(Otp.this, Login.class);
        startActivity(I);

    }
}
