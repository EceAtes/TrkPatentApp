package com.example.trkpatentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class hizmet_marka_gelenekselOlmayan extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hizmet_marka_geleneksel_olmayan);


        Button geleneksel = (Button) findViewById(R.id.gelenekselOlmayan);
        geleneksel.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.turkpatent.gov.tr/uluslararasi-marka-tescil-sistemi-bilgisi";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}