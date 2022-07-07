package com.example.trkpatentapp;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.Button;
import android.widget.LinearLayout;
import android.widget.ScrollView;

import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import androidx.fragment.app.Fragment;

public class kurumsal extends Fragment{
    @Nullable
    @Override
    public View onCreateView(@NonNull LayoutInflater inflater, @Nullable ViewGroup container, @Nullable Bundle savedInstanceState) {
        View view = inflater.inflate(R.layout.fragment_kurumsal, container, false);

        Button mevzuat = (Button) view.findViewById(R.id.mevzuat);
        mevzuat.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                String url = "https://www.turkpatent.gov.tr/mevzuat";
                Uri uriUrl = Uri.parse(url);
                Intent launchBrowser = new Intent(Intent.ACTION_VIEW, uriUrl);
                startActivity(launchBrowser);
            }
        });
        
        Button tarihçe = view.findViewById(R.id.tarihce);
        tarihçe.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), kurumsal_tarihce.class);
                startActivity(intent);
            }
        });

        Button hakkımızda = view.findViewById(R.id.hakkimizda);
        hakkımızda.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), kurumsal_hakkimizda.class);
                startActivity(intent);
            }
        });

        Button danisma = view.findViewById(R.id.danisma);
        danisma.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), kurumsal_danisma.class);
                startActivity(intent);
            }
        });

        Button yonetim = view.findViewById(R.id.yonetim);
        yonetim.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), kurumsal_yonetim.class);
                startActivity(intent);
            }
        });

        Button kurumsal_politikalar = view.findViewById(R.id.kurumsal_politikalar);
        kurumsal_politikalar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), kurumsal_yonetim.class);
                startActivity(intent);
            }
        });

        Button planlar = view.findViewById(R.id.planlar);
        planlar.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), kurumsal_planlar.class);
                startActivity(intent);
            }
        });

        Button etik = view.findViewById(R.id.etik);
        etik.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View v) {
                Intent intent = new Intent(getContext(), kurumsal_etik.class);
                startActivity(intent);
            }
        });
        
        return view;
    }
    
}
