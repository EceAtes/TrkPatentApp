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

public class hizmet_marka_NICE extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_hizmet_marka_nice);


        TextView txt = (TextView) findViewById(R.id.NICEListe);

        // this is the text we'll be operating on
        SpannableString text = new SpannableString("https://www.wipo.int/classifications/nice/nclpub/en/fr/");

        //stops it from flickering to another colour when string is pressed.
        text.setSpan(new ForegroundColorSpan(Color.BLACK), 0, 56, 0);

        // make "Software" (characters 37 to 45)
        //runs when clickableSpan is pressed
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View view) {
                String url = "https://www.wipo.int/classifications/nice/nclpub/en/fr/";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        };
        //this is what calls the method
        text.setSpan(clickableSpan, 0, 56, 0);
        // //underlines it
        //  text.setSpan(new URLSpan(""), 33, 44, 0);
        //turns it blue
        //int c = Color.parseColor("#32587B");
        text.setSpan(new ForegroundColorSpan(Color.parseColor("#32587B")), 0, 56, 0);


        txt.setMovementMethod(LinkMovementMethod.getInstance());

        // shove our styled text into the TextView
        txt.setText(text, TextView.BufferType.SPANNABLE);

        ////////////////////////
        TextView txt4 = (TextView) findViewById(R.id.NICEBelge);

        // this is the text we'll be operating on
        SpannableString text4 = new SpannableString("İlgili belgeler için tıklayınız");

        //stops it from flickering to another colour when string is pressed.
        text.setSpan(new ForegroundColorSpan(Color.BLACK), 0, 32, 0);

        // make "Software" (characters 37 to 45)
        //runs when clickableSpan is pressed
        ClickableSpan clickableSpan4 = new ClickableSpan() {
            @Override
            public void onClick(View view) {
                String url = "https://www.turkpatent.gov.tr/marka-nice-siniflandirma";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        };
        //this is what calls the method
        text.setSpan(clickableSpan, 23, 56, 0);
        // //underlines it
        //  text.setSpan(new URLSpan(""), 33, 44, 0);
        //turns it blue
        //int c = Color.parseColor("#32587B");
        text.setSpan(new ForegroundColorSpan(Color.parseColor("#32587B")), 23, 56, 0);


        txt.setMovementMethod(LinkMovementMethod.getInstance());

        // shove our styled text into the TextView
        txt.setText(text, TextView.BufferType.SPANNABLE);


        /////////////////////////////
        TextView txt2 = (TextView) findViewById(R.id.madrid);

        // this is the text we'll be operating on
        SpannableString text2 = new SpannableString("http://www.wipo.int/mgs/index.jsp?lang=en");

        //stops it from flickering to another colour when string is pressed.
        text.setSpan(new ForegroundColorSpan(Color.BLACK), 0, 42, 0);

        // make "Software" (characters 37 to 45)
        //runs when clickableSpan is pressed
        ClickableSpan clickableSpan2 = new ClickableSpan() {
            @Override
            public void onClick(View view) {
                String url = "http://www.wipo.int/mgs/index.jsp?lang=en";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        };
        //this is what calls the method
        text.setSpan(clickableSpan, 0, 42, 0);
        // //underlines it
        //  text.setSpan(new URLSpan(""), 33, 44, 0);
        //turns it blue
        //int c = Color.parseColor("#32587B");
        text.setSpan(new ForegroundColorSpan(Color.parseColor("#32587B")), 0, 42, 0);


        txt.setMovementMethod(LinkMovementMethod.getInstance());

        // shove our styled text into the TextView
        txt.setText(text, TextView.BufferType.SPANNABLE);
        //////////////////////////////////////////////


        TextView txt3 = (TextView) findViewById(R.id.tmclass);

        // this is the text we'll be operating on
        SpannableString text3 = new SpannableString("http://tmclass.tmdn.org/ec2/?lang=en");

        //stops it from flickering to another colour when string is pressed.
        text.setSpan(new ForegroundColorSpan(Color.BLACK), 0, 37, 0);

        // make "Software" (characters 37 to 45)
        //runs when clickableSpan is pressed
        ClickableSpan clickableSpan3 = new ClickableSpan() {
            @Override
            public void onClick(View view) {
                String url = "http://tmclass.tmdn.org/ec2/?lang=en";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        };
        //this is what calls the method
        text.setSpan(clickableSpan, 0, 37, 0);
        // //underlines it
        //  text.setSpan(new URLSpan(""), 33, 44, 0);
        //turns it blue
        //int c = Color.parseColor("#32587B");
        text.setSpan(new ForegroundColorSpan(Color.parseColor("#32587B")), 0, 37, 0);


        txt.setMovementMethod(LinkMovementMethod.getInstance());

        // shove our styled text into the TextView
        txt.setText(text, TextView.BufferType.SPANNABLE);
    }
}