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

        return view;
    }

    public void onClick(View v) {
        Intent intent = null;
        switch(v.getId()){
            case(R.id.tarihce):
                intent = new Intent(getActivity(), kurumsal_tarihce.class);
                break;
            case(R.id.hakkimizda) :
                intent = new Intent(getActivity(), kurumsal_hakkimizda.class);
                break;
            case(R.id.yonetim) :
                intent = new Intent(getActivity(), kurumsal_yonetim.class);
                break;
            case(R.id.danisma) :
                intent = new Intent(getActivity(), kurumsal_danisma.class);
                break;
            case(R.id.mevzuat) :
                intent = new Intent(getActivity(), kurumsal_mevzuat.class);
                break;
            case(R.id.planlar) :
                intent = new Intent(getActivity(), kurumsal_planlar.class);
                break;
            case(R.id.etik) :
                intent = new Intent(getActivity(), kurumsal_etik.class);
                break;
            case(R.id.kurumsal_politikalar) :
                intent = new Intent(getActivity(), kurumsal_politikalar.class);
                break;

        }
        if(intent != null)
        startActivity(intent);
    }

}
