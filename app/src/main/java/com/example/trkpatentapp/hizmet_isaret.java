package com.example.trkpatentapp;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

public class hizmet_isaret extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hizmet_isaret);


        Button istatistik = (Button) findViewById(R.id.istatistik);
        istatistik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://ci.turkpatent.gov.tr/Statistics/RegistrationAndApplication";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });

        Button resmiAmblem = (Button) findViewById(R.id.resmiAmblem);
        resmiAmblem.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.turkpatent.gov.tr/cografi-isaret-ve-geleneksel-urun-adi-amblem";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });

        Button AB = (Button) findViewById(R.id.AB);
        AB.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://ci.turkpatent.gov.tr/sayfa/avrupa-birli%C4%9Finde-co%C4%9Frafi-i%C5%9Faret";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });

        TextView txt = (TextView) findViewById(R.id.işaretBelgeler);

        // this is the text we'll be operating on
        SpannableString text = new SpannableString("Belgelere ulaşmak için tıklayınız");

        //stops it from flickering to another colour when string is pressed.
        text.setSpan(new ForegroundColorSpan(Color.BLACK), 0, 34, 0);

        // make "Software" (characters 37 to 45)
        //runs when clickableSpan is pressed
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View view) {
                String url = "https://www.turkpatent.gov.tr/cografi-isaret";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        };
        //this is what calls the method
        text.setSpan(clickableSpan, 25, 34, 0);
        // //underlines it
        //  text.setSpan(new URLSpan(""), 33, 44, 0);
        //turns it blue
        //int c = Color.parseColor("#32587B");
        text.setSpan(new ForegroundColorSpan(Color.parseColor("#32587B")), 25, 34, 0);


        txt.setMovementMethod(LinkMovementMethod.getInstance());

        // shove our styled text into the TextView
        txt.setText(text, TextView.BufferType.SPANNABLE);


    }
}