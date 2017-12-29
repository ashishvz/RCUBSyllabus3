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

public class Sixthsem extends AppCompatActivity {

    private AdView adView;
    Button button,b1,b2,b3,b4;
    private InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_sixthsem);

        adView = findViewById(R.id.adView7);
        AdRequest adRequest = new  AdRequest.Builder().build();
        adView.loadAd(adRequest);

        interstitialAd = new InterstitialAd(Sixthsem.this);
        interstitialAd.setAdUnitId(getString(R.string.interadid));
        interstitialAd.loadAd(adRequest);
        interstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdOpened(){
                display();
            }
        });

        button = findViewById(R.id.button34);
        button.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sixthsem.this, Sixth1.class);
                startActivity(intent);
            }
        });

        b2 = findViewById(R.id.button35);
        b2.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sixthsem.this, Sixth2.class);
                startActivity(intent);
            }
        });

        b3 =findViewById(R.id.button36);
        b3.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sixthsem.this, Sixth3.class);
                startActivity(intent);
            }
        });

        b4 = findViewById(R.id.button37);
        b4.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sixthsem.this, Sixth4.class);
                startActivity(intent);
            }
        });

        b1 =findViewById(R.id.button38);
        b1.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                Intent intent = new Intent(Sixthsem.this, Sixth5.class);
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
