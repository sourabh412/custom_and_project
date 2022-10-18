package com.bmsceiseproc.smi1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class dashboard extends AppCompatActivity {

    ImageView dashboard_menu_icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.dashboard);


        dashboard_menu_icon = findViewById(R.id.dashboard_menu_icon);
        dashboard_menu_icon.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                PopupMenu popupMenu = new PopupMenu(dashboard.this, view);
                popupMenu.inflate(R.menu.pop_menu1);
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() {
                    @Override
                    public boolean onMenuItemClick(MenuItem item) {
                        switch (item.getItemId()){
                            case R.id.popup_home:
                                Intent intent = new Intent(dashboard.this, home.class);
                                startActivity(intent);
                                return true;

                            case R.id.popup_logout:
                                Toast.makeText(dashboard.this, "Logged out...", Toast.LENGTH_SHORT).show();
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
    }
}