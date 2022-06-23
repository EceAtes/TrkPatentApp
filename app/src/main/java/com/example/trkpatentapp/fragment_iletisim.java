package com.example.trkpatentapp;

import android.content.Intent;
import android.graphics.Color;
import android.net.Uri;
import android.os.Bundle;
import android.text.Html;
import android.text.SpannableString;
import android.text.method.LinkMovementMethod;
import android.text.style.ClickableSpan;
import android.text.style.ForegroundColorSpan;
import android.text.style.URLSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class fragment_iletisim extends Fragment{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_iletisim, container, false);

        TextView bilgilendirme = view.findViewById(R.id.bilgilendirme);
        String sourceString = "<b>" + "İnteraktif Bilgilendirme Servisi: " + "</b> " + "(0 312) 303 1 303" ;
        bilgilendirme.setText(Html.fromHtml(sourceString));

        TextView mail = view.findViewById(R.id.mail);
        sourceString = "<b>" + "Eposta: " + "</b> " + "destek@turkpatent.gov.tr" ;
        mail.setText(Html.fromHtml(sourceString));

        TextView adres = view.findViewById(R.id.adres);
        sourceString = "<b>" + "Adres: " + "</b> " + "Gazi Mahallesi Hipodrom Caddesi No:13 (06560) \n Yenimahalle / ANKARA" ;
        adres.setText(Html.fromHtml(sourceString));

        TextView santral = view.findViewById(R.id.santral);
        sourceString = "<b>" + "Santral:  " + "</b> " + "(0 312) 303 10 00" ;
        santral.setText(Html.fromHtml(sourceString));

        TextView fax = view.findViewById(R.id.fax);
        sourceString = "<b>" + "Faks: " + "</b> " + "(0 312) 303 11 73" ;
        fax.setText(Html.fromHtml(sourceString));

        TextView website = view.findViewById(R.id.website);
        sourceString = "<b>" + "Website: " + "</b> " + "https://www.turkpatent.gov.tr" ;
        website.setText(Html.fromHtml(sourceString));

        TextView Telefon = view.findViewById(R.id.intrPhone);
        sourceString = "<b>" + "Telefon: " + "</b> " + "(0 312) 303 10 00" ;
        Telefon.setText(Html.fromHtml(sourceString));

        TextView Eposta = view.findViewById(R.id.intrMail);
        sourceString = "<b>" + "E-posta: " + "</b> " + "medya@turkpatent.gov.tr" ;
        Eposta.setText(Html.fromHtml(sourceString));
/*
        TextView Cimer = view.findViewById(R.id.ile);
        sourceString = "CİMER bilgi edinme başvurusu için" + "<b>" + "@string/CIMER"+ "</b> ";
        Cimer.setText(Html.fromHtml(sourceString));*/


        TextView txt = (TextView) view.findViewById(R.id.ile);

        // this is the text we'll be operating on
        SpannableString text = new SpannableString("CİMER bilgi edinme başvurusu için tıklayınız");

        //stops it from flickering to another colour when string is pressed.
        text.setSpan(new ForegroundColorSpan(Color.BLACK), 0, 44, 0);

        // make "Software" (characters 37 to 45)
        //runs when clickableSpan is pressed
        ClickableSpan clickableSpan = new ClickableSpan() {
            @Override
            public void onClick(View view) {
                String url = "https://www.cimer.gov.tr/";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        };
        //this is what calls the method
        text.setSpan(clickableSpan, 34, 44, 0);
       // //underlines it
      //  text.setSpan(new URLSpan(""), 33, 44, 0);
        //turns it blue
        //int c = Color.parseColor("#32587B");
        text.setSpan(new ForegroundColorSpan(Color.parseColor("#32587B")), 34, 44, 0);


        txt.setMovementMethod(LinkMovementMethod.getInstance());

        // shove our styled text into the TextView
        txt.setText(text, TextView.BufferType.SPANNABLE);


        ImageView youtube = (ImageView) view.findViewById(R.id.youtube);
        youtube.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.youtube.com/user/tpekurumsal";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });

        ImageView twitter = (ImageView) view.findViewById(R.id.twitter);
        twitter.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://twitter.com/TURKPATENT";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });

        ImageView facebook = (ImageView) view.findViewById(R.id.facebook);
        facebook.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.facebook.com/TURKPATENT/";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });

        ImageView linkedin = (ImageView) view.findViewById(R.id.linkedin);
        linkedin.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.linkedin.com/company/turkpatent/";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });

        ImageView instagram = (ImageView) view.findViewById(R.id.instagram);
        instagram.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.instagram.com/turkpatentt/";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });

        return view;
        //TextView santral = view.findViewById(R.id.santral);
    }



}
