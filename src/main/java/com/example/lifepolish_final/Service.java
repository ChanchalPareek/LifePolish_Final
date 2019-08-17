package com.example.lifepolish_final;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;

public class Service extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_service);
    }
    public void fun6(View view) {

        Intent I = new Intent(Service.this, Services_full.class);
        startActivity(I);

    }
}
