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
import android.widget.ImageView;
import android.widget.TextView;

public class hizmet_tasarim extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hizmet_tasarim);

        Button tasarim = (Button) findViewById(R.id.tasarimBilgi);
        tasarim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.turkpatent.gov.tr/tasarim-bilgilendirme";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });

        Button Lahey = (Button) findViewById(R.id.Lahey);
        Lahey.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.turkpatent.gov.tr/uluslararasi-tasarim-tescili-lahey-sistemi";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });

        Button locarno = (Button) findViewById(R.id.Locarno);
        locarno.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.turkpatent.gov.tr/tasarim-locarno-siniflandirmasi";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });


        TextView txt = (TextView) findViewById(R.id.tasarımBelgeler);

        // this is the text we'll be operating on
        SpannableString text = new SpannableString("Belgelere ulaşmak için tıklayınız");

        //stops it from flickering to another colour when string is pressed.
        text.setSpan(new ForegroundColorSpan(Color.BLACK), 0, 34, 0);

        // make "Software" (characters 37 to 45)
        //runs when clickableSpan is pressed
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View view) {
                String url = "https://www.turkpatent.gov.tr/tasarim";
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

        //////////////////////////////////////////////////

        TextView txt1 = (TextView) findViewById(R.id.tasarımBelgeler);

        // this is the text we'll be operating on
        SpannableString text1 = new SpannableString("Tasarım Başvuru Ücreti Hesaplama belgesi için tıklayınız");

        //stops it from flickering to another colour when string is pressed.
        text.setSpan(new ForegroundColorSpan(Color.BLACK), 0, 55, 0);

        // make "Software" (characters 37 to 45)
        //runs when clickableSpan is pressed
        ClickableSpan clickableSpan1 = new ClickableSpan() {
            @Override
            public void onClick(View view) {
                String url = "https://www.turkpatent.gov.tr/tasarim-islem-ucretleri";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        };
        //this is what calls the method
        text.setSpan(clickableSpan, 45, 55, 0);
        // //underlines it
        //  text.setSpan(new URLSpan(""), 33, 44, 0);
        //turns it blue
        //int c = Color.parseColor("#32587B");
        text.setSpan(new ForegroundColorSpan(Color.parseColor("#32587B")), 45, 55, 0);


        txt.setMovementMethod(LinkMovementMethod.getInstance());

        // shove our styled text into the TextView
        txt.setText(text, TextView.BufferType.SPANNABLE);
    }
}