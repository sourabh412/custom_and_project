package com.bmsceiseproc.smi1;

import static com.bmsceiseproc.smi1.sign_in.creds;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.StreamCorruptedException;
import java.util.Map;

public class sign_up extends AppCompatActivity {

    TextView signup_toggle;
    Button signup_button;
    EditText signup_email, signup_password1, signup_password2;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        signup_button = findViewById(R.id.signup_button);
        signup_toggle = findViewById(R.id.signup_toggle);
        signup_email = findViewById(R.id.signup_email);
        signup_password1 = findViewById(R.id.signup_password1);
        signup_password2 = findViewById(R.id.signup_password2);

        signup_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = signup_email.getText().toString();
                String pass1 = signup_password1.getText().toString();
                String pass2 = signup_password2.getText().toString();
                if (email.isEmpty() || pass1.isEmpty() || pass2.isEmpty()){
                    Toast.makeText(sign_up.this, "Please fill in all details", Toast.LENGTH_SHORT).show();
                    return;
                }
                if (!pass1.equals(pass2)){
                    Toast.makeText(sign_up.this, "Passwords must be equal", Toast.LENGTH_SHORT).show();
                    return;
                }
                creds.put(email,pass1);
                Intent intent = new Intent(sign_up.this, home.class);
                startActivity(intent);
                finish();
            }
        });

        signup_toggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sign_up.this, sign_in.class);
                startActivity(intent);
                finish();
            }
        });
    }
}