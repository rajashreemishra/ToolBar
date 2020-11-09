package com.example.mytoolbar;

import androidx.annotation.NonNull;
import androidx.appcompat.app.ActionBar;
import androidx.appcompat.app.ActionBarDrawerToggle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.appcompat.widget.Toolbar;
import androidx.core.view.GravityCompat;
import androidx.drawerlayout.widget.DrawerLayout;

import android.content.Intent;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.widget.AdapterView;
import android.widget.TextView;
import android.widget.Toast;

import com.google.android.material.navigation.NavigationView;

public class MainActivity extends AppCompatActivity implements NavigationView.OnNavigationItemSelectedListener {
    private DrawerLayout mdrawerlayout;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        mdrawerlayout=findViewById(R.id.drawer_layout);
        Toolbar mtoolbar=findViewById(R.id.tool_bar);
        NavigationView mnavigationview=findViewById(R.id.side_nav_bar);
        setSupportActionBar(mtoolbar);
        if (getSupportActionBar()!=null)
            getSupportActionBar().setTitle("My Application");

        ActionBarDrawerToggle mtoggle=new ActionBarDrawerToggle(MainActivity.this,mdrawerlayout,mtoolbar,R.string.open,R.string.close);
        mtoggle.syncState();
        mnavigationview.setNavigationItemSelectedListener(MainActivity.this);

        View headerview=mnavigationview.getHeaderView(0);
        TextView mtvheader=headerview.findViewById(R.id.header_textview);
        mtvheader.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Toast.makeText(MainActivity.this,"Welcome Home",Toast.LENGTH_LONG).show();
            }
        });

    }


    @Override
    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
        mdrawerlayout.closeDrawer(GravityCompat.START);
        if(item.getItemId()==R.id.edit_item_icon){
            startActivity(new Intent(MainActivity.this,HomeActivity.class));
            Toast.makeText(MainActivity.this,"Successfully Clicked",Toast.LENGTH_LONG).show();
        }
        return true;
    }
}