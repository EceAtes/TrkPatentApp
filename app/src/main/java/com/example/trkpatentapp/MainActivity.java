package com.example.trkpatentapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.Window;
import android.view.WindowManager;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        BottomNavigationView nav = findViewById(R.id.nav_view);
        nav.setSelectedItemId(R.id.navigation_home);
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.dark_blue));
        }

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
                    selected = new fragment_iletisim();
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