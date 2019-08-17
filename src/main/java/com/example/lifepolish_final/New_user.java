package com.example.lifepolish_final;

import android.content.Intent;
import android.os.Handler;
import android.support.annotation.NonNull;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.os.Handler;
import android.content.Intent;import android.support.v7.app.AppCompatActivity;
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

public class New_user extends AppCompatActivity {
    private FirebaseAuth auth;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_new_user);
        auth = FirebaseAuth.getInstance();


    }
    public void fun1 (View view){
        Handler handler = new Handler();
        EditText email = (EditText) findViewById(R.id.editText3);
        final String email1 = email.getText().toString();

        EditText pass = (EditText) findViewById(R.id.editText5);
        String password = pass.getText().toString();

        EditText conf = (EditText) findViewById(R.id.editText6);
        String conf1 = pass.getText().toString();
        if (email1.matches("") || password.matches("") && !password.matches(conf1)) {
            Toast.makeText(this, "You did not enter full Information", Toast.LENGTH_SHORT).show();
            return;}
        else {
            auth.createUserWithEmailAndPassword(email1, password).addOnCompleteListener(this, new OnCompleteListener<AuthResult>() {
                @Override
                public void onComplete(@NonNull Task<AuthResult> task) {
                    if (task.isSuccessful()) {
                        Toast.makeText(New_user.this, "welcome " + email1, Toast.LENGTH_LONG).show();
                        Intent intent = new Intent(New_user.this, Login.class);
                        intent.putExtra("email", email1);
                        startActivity(intent);

                    } else {
                        Toast.makeText(New_user.this, "Check Connection or ask for help", Toast.LENGTH_LONG).show();
                    }

                }
            });
        }



    }
}
