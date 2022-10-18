package com.bmsceiseproc.smi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.EditText;
import android.widget.TextView;
import android.widget.Toast;

import java.util.HashMap;

public class sign_in extends AppCompatActivity {

    TextView signin_toggle;
    Button signin_button;
    EditText signin_email, signin_password;
    public static HashMap<String, String> creds = new HashMap<>();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);

        signin_button = findViewById(R.id.signin_button);
        signin_toggle = findViewById(R.id.signin_toggle);
        signin_email = findViewById(R.id.signin_email);
        signin_password = findViewById(R.id.signin_password);

        signin_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                String email = signin_email.getText().toString();
                String pass = signin_password.getText().toString();
                if (creds.containsKey(email) &&
                        creds.get(email).equals(pass)){
                    Intent intent = new Intent(sign_in.this, home.class);
                    startActivity(intent);
                    finish();
                }else {
                    Toast.makeText(sign_in.this, "Incorrect Credentials", Toast.LENGTH_SHORT).show();
                }
            }
        });

        signin_toggle.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sign_in.this, sign_up.class);
                startActivity(intent);
                finish();
            }
        });
    }
}