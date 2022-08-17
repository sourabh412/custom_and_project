package com.bmsceiseproc.smi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class sign_in extends AppCompatActivity {

    TextView signin_toggle;
    Button signin_button;
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_in);

        signin_button = findViewById(R.id.signin_button);
        signin_toggle = findViewById(R.id.signin_toggle);

        signin_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sign_in.this, dashboard.class);
                startActivity(intent);
                finish();
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