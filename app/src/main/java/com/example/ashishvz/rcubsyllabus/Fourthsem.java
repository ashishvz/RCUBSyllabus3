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

public class Fourthsem extends AppCompatActivity {
   private AdView  adView;
   Button button,b1,b2,b3,b4;
   private InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fourthsem);

        adView = findViewById(R.id.adView6);
        AdRequest adRequest = new  AdRequest.Builder().build();
        adView.loadAd(adRequest);

        interstitialAd = new InterstitialAd(Fourthsem.this);
        interstitialAd.setAdUnitId(getString(R.string.interadid));
        interstitialAd.loadAd(adRequest);
        interstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdOpened(){
                display();
            }
        });

        button = findViewById(R.id.button29);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fourthsem.this, Fourth1.class);
                startActivity(intent);
            }
        });

        b1 = findViewById(R.id.button30);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fourthsem.this, Fourth2.class);
                startActivity(intent);
            }
        });

        b2 =findViewById(R.id.button31);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fourthsem.this, Fourth3.class);
                startActivity(intent);
            }
        });

        b3 = findViewById(R.id.button32);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fourthsem.this, Fourth4.class);
                startActivity(intent);
            }
        });

        b4 =findViewById(R.id.button33);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fourthsem.this, Fourth5.class);
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
