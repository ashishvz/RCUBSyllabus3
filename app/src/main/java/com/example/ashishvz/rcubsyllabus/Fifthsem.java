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

public class Fifthsem extends AppCompatActivity {
    private AdView adView;
    Button button,b1,b2,b3,b4;
    private InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_fifthsem);

        adView = findViewById(R.id.adView5);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        interstitialAd = new InterstitialAd(Fifthsem.this);
        interstitialAd.setAdUnitId(getString(R.string.interadid));
        interstitialAd.loadAd(adRequest);
        interstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdOpened(){
                display();
            }
        });

        button = findViewById(R.id.button24);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fifthsem.this, Fifth1.class);
                startActivity(intent);
            }
        });

        b2 = findViewById(R.id.button25);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fifthsem.this, Fifth2.class);
                startActivity(intent);
            }
        });

        b3 =findViewById(R.id.button26);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fifthsem.this, Fifth3.class);
                startActivity(intent);
            }
        });

        b4 = findViewById(R.id.button27);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fifthsem.this, Fifth4.class);
                startActivity(intent);
            }
        });

        b1 =findViewById(R.id.button28);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Fifthsem.this, Fifth5.class);
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
