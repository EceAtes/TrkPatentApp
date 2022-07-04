package com.example.trkpatentapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.ImageView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class giris extends Fragment{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_iletisim, container, false);

/*
        Button başvuruPatent = (Button) view.findViewById(R.id.başvuruPatent1);
        başvuruPatent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://epats.turkpatent.gov.tr/run/TP/EDEVLET/giris";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });

        Button patentArastirma = (Button) view.findViewById(R.id.araştırmaPatent1);
        patentArastirma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.turkpatent.gov.tr/arastirma-yap?form=patent";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });

        Button basvuruMarka = (Button) view.findViewById(R.id.başvuruMarka1);
        basvuruMarka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://epats.turkpatent.gov.tr/run/TP/EDEVLET/giris";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });


        Button arastirmaMarka = (Button) view.findViewById(R.id.araştırmaMarka1);
        arastirmaMarka.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.turkpatent.gov.tr/arastirma-yap?form=trademark";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });


        Button araştırmaTasarım = (Button) view.findViewById(R.id.araştırmaTasarım1);
        araştırmaTasarım.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.turkpatent.gov.tr/arastirma-yap?form=design";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });


        Button başvuruTasarım = (Button) view.findViewById(R.id.başvuruTasarım1);
        başvuruTasarım.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://epats.turkpatent.gov.tr/run/TP/EDEVLET/giris";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });

        Button başvuruİşaret = (Button) view.findViewById(R.id.başvuruİşaret1);
        başvuruİşaret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://epats.turkpatent.gov.tr/run/TP/EDEVLET/giris";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });*/
        return inflater.inflate(R.layout.fragment_giris, container, false);
    }
}
