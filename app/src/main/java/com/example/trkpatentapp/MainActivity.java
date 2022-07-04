package com.example.trkpatentapp;

import androidx.annotation.NonNull;
import androidx.appcompat.app.AppCompatActivity;
import androidx.fragment.app.Fragment;

import android.content.Intent;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.view.MenuItem;
import android.view.View;
import android.view.Window;
import android.view.WindowManager;
import android.widget.Button;

import com.google.android.material.bottomnavigation.BottomNavigationView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
/*
        BottomNavigationView nav = findViewById(R.id.nav_view);
        nav.setSelectedItemId(R.id.navigation_home);
        if (Build.VERSION.SDK_INT >= 21) {
            Window window = this.getWindow();
            window.addFlags(WindowManager.LayoutParams.FLAG_DRAWS_SYSTEM_BAR_BACKGROUNDS);
            window.clearFlags(WindowManager.LayoutParams.FLAG_TRANSLUCENT_STATUS);
            window.setStatusBarColor(this.getResources().getColor(R.color.dark_blue));
        }

        nav.setOnNavigationItemSelectedListener(navListener);


        Button patentBasvuru = (Button) findViewById(R.id.başvuruPatent);
        patentBasvuru.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://epats.turkpatent.gov.tr/run/TP/EDEVLET/giris";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });

        Button patentArastirma = (Button) findViewById(R.id.araştırmaPatent);
        patentArastirma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.turkpatent.gov.tr/arastirma-yap?form=patent";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });

        Button basvuruMarka = (Button) findViewById(R.id.başvuruMarka);
        basvuruMarka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://epats.turkpatent.gov.tr/run/TP/EDEVLET/giris";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });


        Button arastirmaMarka = (Button) findViewById(R.id.araştırmaMarka);
        arastirmaMarka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.turkpatent.gov.tr/arastirma-yap?form=trademark";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });


        Button araştırmaTasarım = (Button) findViewById(R.id.araştırmaTasarım);
        araştırmaTasarım.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.turkpatent.gov.tr/arastirma-yap?form=design";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });


        Button başvuruTasarım = (Button) findViewById(R.id.başvuruTasarım);
        başvuruTasarım.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://epats.turkpatent.gov.tr/run/TP/EDEVLET/giris";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });

        Button başvuruİşaret = (Button) findViewById(R.id.başvuruİşaret);
        başvuruİşaret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://epats.turkpatent.gov.tr/run/TP/EDEVLET/giris";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }

        private BottomNavigationView.OnNavigationItemSelectedListener navListener =
                new BottomNavigationView.OnNavigationItemSelectedListener() {
                    @Override
                    public boolean onNavigationItemSelected(@NonNull MenuItem item) {
                        Fragment selected = null;

                        switch (item.getItemId()) {
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

                        if (selected != null) {
                            getSupportFragmentManager().beginTransaction().replace(
                                    R.id.container, selected).commit();
                        }

                        return true;
                    }
                };
*/
    }
}