package com.example.lifepolish_final;

import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.os.Handler;
import android.content.Intent;
import android.widget.EditText;
import android.widget.Toast;

import com.google.android.gms.tasks.OnCompleteListener;
import com.google.android.gms.tasks.Task;
import com.google.firebase.auth.AuthResult;
import com.google.firebase.auth.FirebaseAuth;

public class Login extends AppCompatActivity {

    private FirebaseAuth auth;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_login);
        auth = FirebaseAuth.getInstance();
    }

    public void fun1(View view) {

        EditText email = (EditText) findViewById(R.id.editText);
        final String email1 = email.getText().toString();

        EditText pass = (EditText) findViewById(R.id.editText2);
        String password = pass.getText().toString();
        if (email1.matches("") || password.matches("")) {
            Toast.makeText(this, "You did not enter full Information", Toast.LENGTH_SHORT).show();
            return;}
        else {
            auth.signInWithEmailAndPassword(email1, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        Toast.makeText(Login.this, "welcome " + email1, Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(Login.this, Service.class);
                        intent.putExtra("email", email1);
                        startActivity(intent);

                    } else {
                        Toast.makeText(Login.this, "User Not Recognised Ask Manager to approve", Toast.LENGTH_LONG).show();
                    }

                }
            });
        }
    }
    public void fun2(View view) {

        Intent I = new Intent(Login.this, New_user.class);
        startActivity(I);

    }
    public void fun3(View view) {

        Intent I = new Intent(Login.this, ForgotPassword.class);
        startActivity(I);

    }
    }
