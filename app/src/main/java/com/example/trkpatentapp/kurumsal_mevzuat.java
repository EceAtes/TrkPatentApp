package com.example.trkpatentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class kurumsal_mevzuat extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_kurumsal_mevzuat);

        Button mülkiyet = (Button) findViewById(R.id.mülkiyet);
        mülkiyet.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.mevzuat.gov.tr/mevzuat?MevzuatNo=6769&MevzuatTur=1&MevzuatTertip=5";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });

        Button Num4 = (Button) findViewById(R.id.Num4);
        Num4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "mevzuat.gov.tr/mevzuat?MevzuatNo=4&MevzuatTur=19&MevzuatTertip=5";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });

        Button Sınai = (Button) findViewById(R.id.Sınai);
        Sınai.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.mevzuat.gov.tr/mevzuat?MevzuatNo=23528&MevzuatTur=7&MevzuatTertip=5";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });

        Button markaVekil = (Button) findViewById(R.id.markaVekil);
        markaVekil.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.mevzuat.gov.tr/mevzuat?MevzuatNo=5000&MevzuatTur=1&MevzuatTertip=5";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });

        Button entegreDevre = (Button) findViewById(R.id.entegreDevre);
        entegreDevre.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.mevzuat.gov.tr/mevzuat?MevzuatNo=5147&MevzuatTur=1&MevzuatTertip=5";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });

        Button kurulYönetmelik = (Button) findViewById(R.id.kurulYönetmelik);
        kurulYönetmelik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.mevzuat.gov.tr/mevzuat?MevzuatNo=23580&MevzuatTur=7&MevzuatTertip=5";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });

        Button amblem = (Button) findViewById(R.id.amblem);
        amblem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.mevzuat.gov.tr/mevzuat?MevzuatNo=24227&MevzuatTur=7&MevzuatTertip=5";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });

        Button sicilVeDisiplin = (Button) findViewById(R.id.sicilVeDisiplin);
        sicilVeDisiplin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.mevzuat.gov.tr/mevzuat?MevzuatNo=38501&MevzuatTur=7&MevzuatTertip=5";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });

        Button şekilGösterir = (Button) findViewById(R.id.şekilGösterir);
        şekilGösterir.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.mevzuat.gov.tr/mevzuat?MevzuatNo=7220&MevzuatTur=7&MevzuatTertip=5";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });

        Button hizmetTebliğ = (Button) findViewById(R.id.hizmetTebliğ);
        hizmetTebliğ.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.mevzuat.gov.tr/mevzuat?MevzuatNo=23164&MevzuatTur=9&MevzuatTertip=5";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });

        Button çalışanBuluş = (Button) findViewById(R.id.çalışanBuluş);
        çalışanBuluş.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.mevzuat.gov.tr/mevzuat?MevzuatNo=23927&MevzuatTur=7&MevzuatTertip=5";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });

        Button AvrupaPatent = (Button) findViewById(R.id.AvrupaPatent);
        AvrupaPatent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.mevzuat.gov.tr/mevzuat?MevzuatNo=12152&MevzuatTur=7&MevzuatTertip=5";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });

        Button ücret = (Button) findViewById(R.id.ücret);
        ücret.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.mevzuat.gov.tr/mevzuat?MevzuatNo=39254&MevzuatTur=9&MevzuatTertip=5";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });

        Button tasarımSınıflandırma = (Button) findViewById(R.id.tasarımSınıflandırma);
        tasarımSınıflandırma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://webim.turkpatent.gov.tr/file/0616e440-b088-476d-8df0-c1ad003176f3";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });

        Button patentSınıflandırma = (Button) findViewById(R.id.patentSınıflandırma);
        patentSınıflandırma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://ipcpub.wipo.int/?notion=scheme&version=20220101&symbol=none&menulang=en&lang=en&viewmode=f&fipcpc=no&showdeleted=yes&indexes=no&headings=yes&notes=yes&direction=o2n&initial=A&cwid=none&tree=no&searchmode=smart";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });

        Button ortakPatent = (Button) findViewById(R.id.ortakPatent);
        ortakPatent.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://worldwide.espacenet.com/classification";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
    }
}