package com.example.trkpatentapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;

import com.google.android.material.bottomnavigation.BottomNavigationItemView;
import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView nav = findViewById(R.id.nav_view);
        nav.setSelectedItemId(R.id.navigation_home);


        nav.setOnNavigationItemSelectedListener(navListener);
    }
    private BottomNavigationView.OnNavigationItemSelectedListener navListener =
        new BottomNavigationView.OnNavigationItemSelectedListener() {
            @Override
            public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                Fragment selected = null;

                switch(item.getItemId()){
                    case R.id.navigation_home:
                        selected = new giris();
                        break;
                    case R.id.navigation_kurumsal:
                        selected = new kurumsal();
                        break;
                    case R.id.navigation_bilgi_merkezi:
                    selected = new bilgi_merkezi();
                    break;
                    case R.id.navigation_hizmetler:
                    selected = new hizmetler();
                    break;
                    case R.id.navigation_iletişim:
                    selected = new iletisim();
                    break;
                }

                if(selected != null) {
                    getSupportFragmentManager().beginTransaction().replace(
                            R.id.container, selected).commit();
                }

                return true;
            }
        };
}