package com.example.mytoolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.MenuItem;
import android.widget.Toast;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class HomeActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_home);
        BottomNavigationView mbottom_navbar=findViewById(R.id.bottom_nav_bar);

        mbottom_navbar.setOnNavigationItemSelectedListener(new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                switch (item.getItemId()){
                    case(R.id.home_menu_item):
                        Toast.makeText(HomeActivity.this,"Home Icon Clicked",Toast.LENGTH_SHORT).show();
                        break;
                    case(R.id.edit_menu_item):
                        Toast.makeText(HomeActivity.this,"Edit Icon Clicked",Toast.LENGTH_SHORT).show();
                        break;
                    case(R.id.logout_menu_item):
                        Toast.makeText(HomeActivity.this,"Logout Icon Clicked",Toast.LENGTH_SHORT).show();
                        break;
                }
                return true;
            }
        });

    }


}