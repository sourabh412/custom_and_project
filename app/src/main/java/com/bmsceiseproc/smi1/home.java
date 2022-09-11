package com.bmsceiseproc.smi1;

import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.PopupMenu;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.ImageView;
import android.widget.Toast;

public class home extends AppCompatActivity {

    ImageView home_menu_icon;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.home);

        home_menu_icon = findViewById(R.id.home_menu_icon);
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
                                finish();
                                System.exit(0);
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