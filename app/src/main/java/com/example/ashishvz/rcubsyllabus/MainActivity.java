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

public class MainActivity extends AppCompatActivity {

    Button button, b1, b2, b3, b4, b5;
    private AdView adView;
    private InterstitialAd interstitialAd;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        adView =findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        adView.loadAd(adRequest);

        interstitialAd = new InterstitialAd(MainActivity.this);
        interstitialAd.setAdUnitId(getString(R.string.interadid));
        interstitialAd.loadAd(adRequest);
        interstitialAd.setAdListener(new AdListener(){
            @Override
            public void onAdOpened(){
                display();
            }
         });
     button = findViewById(R.id.button);
     button.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent intent = new Intent(MainActivity.this, Firstsem.class);
             startActivity(intent);
         }
     });

     b2 = findViewById(R.id.button2);
     b2.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent intent = new Intent(MainActivity.this, Secondsem.class);
             startActivity(intent);
         }
     });

     b3 =findViewById(R.id.button3);
     b3.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent intent = new Intent(MainActivity.this, Thirdsem.class);
             startActivity(intent);
         }
     });

     b4 = findViewById(R.id.button4);
     b4.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent intent = new Intent(MainActivity.this, Fourthsem.class);
             startActivity(intent);
         }
     });

     b5 = findViewById(R.id.button5);
     b5.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent intent = new Intent(MainActivity.this, Fifthsem.class);
             startActivity(intent);
         }
     });

     b1 =findViewById(R.id.button6);
     b1.setOnClickListener(new View.OnClickListener() {
         @Override
         public void onClick(View view) {
             Intent intent = new Intent(MainActivity.this, Sixthsem.class);
             startActivity(intent);
         }
     });
    }
    private  void display(){
        if (interstitialAd.isLoaded()) {
            interstitialAd.show();
        }
    }

}
