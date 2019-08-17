package com.example.lifepolish_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Services_full extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_services_full);
    }
    public void fun8(View view) {

        Intent I = new Intent(Services_full.this, Payment.class);
        startActivity(I);

    }
}
