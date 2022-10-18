package com.bmsceiseproc.smi1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.Toast;

public class home extends AppCompatActivity {

    ImageView home_menu_icon;
    LinearLayout home_view_profile1, home_view_profile2, home_view_profile3, home_view_profile4;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        home_menu_icon = findViewById(R.id.home_menu_icon);
        home_view_profile1 = findViewById(R.id.home_view_profile1);
        home_view_profile2 = findViewById(R.id.home_view_profile2);
        home_view_profile3 = findViewById(R.id.home_view_profile3);
        home_view_profile4 = findViewById(R.id.home_view_profile4);

        home_menu_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(home.this, view);
                popupMenu.inflate(R.menu.pop_menu1);
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            case R.id.popup_dashboard:
                                Intent intent = new Intent(home.this, dashboard.class);
                                startActivity(intent);
                                return true;

                            case R.id.popup_logout:
                                Toast.makeText(home.this, "Logged out...", Toast.LENGTH_SHORT).show();
                                finishAffinity();
                                return true;

                            default:
                                return false;
                        }
                    }
                });
                popupMenu.show();
            }
        });

        home_view_profile1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, profile.class);
                startActivity(intent);
            }
        });
        home_view_profile2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, profile.class);
                startActivity(intent);
            }
        });
        home_view_profile3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, profile.class);
                startActivity(intent);
            }
        });
        home_view_profile4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(home.this, profile.class);
                startActivity(intent);
            }
        });
    }
}