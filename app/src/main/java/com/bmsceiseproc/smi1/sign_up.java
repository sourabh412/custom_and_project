package com.bmsceiseproc.smi1;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class sign_up extends AppCompatActivity {

    TextView signup_toggle;
    Button signup_button;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.sign_up);

        signup_button = findViewById(R.id.signup_button);
        signup_toggle = findViewById(R.id.signup_toggle);

        signup_button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(sign_up.this, dashboard.class);
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