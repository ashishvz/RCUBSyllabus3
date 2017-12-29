package com.example.ashishvz.rcubsyllabus;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;

public class Secondsem extends AppCompatActivity {
    private AdView adView;
    Button b1,b2,b3,b4,b5,b6;
    private InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_secondsem);

        adView = findViewById(R.id.adView3);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        interstitialAd = new InterstitialAd(Secondsem.this);
        interstitialAd.setAdUnitId(getString(R.string.interadid));
        interstitialAd.loadAd(adRequest);
        interstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdOpened(){
                display();
            }
        });

        b1 = findViewById(R.id.button13);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Secondsem.this, Second1.class);
                startActivity(intent);
            }
        });

        b2 = findViewById(R.id.button14);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Secondsem.this, Second2.class);
                startActivity(intent);
            }
        });

        b3 =findViewById(R.id.button15);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Secondsem.this, Second3.class);
                startActivity(intent);
            }
        });

        b4 = findViewById(R.id.button16);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Secondsem.this, Second4.class);
                startActivity(intent);
            }
        });

        b5 = findViewById(R.id.button17);
        b5.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Secondsem.this, Second5.class);
                startActivity(intent);
            }
        });

        b6 =findViewById(R.id.button18);
        b6.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Secondsem.this, Second6.class);
                startActivity(intent);
            }
        });

    }
    public void display(){
        if(interstitialAd.isLoaded()){
            interstitialAd.show();
        }
    }
}
