package com.example.dellse.healthmeter;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.widget.TextView;
import android.widget.Button;

import com.google.android.gms.ads.AdListener;
import com.google.android.gms.ads.AdView;
import com.google.android.gms.ads.InterstitialAd;
import com.google.android.gms.ads.MobileAds;
import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.AdView;

public class MainActivity extends AppCompatActivity {


    public int y=0;


    public double n,k;
   public double health=0,a=0.5;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
     //Banner Ads
        MobileAds.initialize(getApplicationContext(), "ca-app-pub-7339653404752392~2328708660");

        AdView mAdView = (AdView) findViewById(R.id.adView);
        AdRequest adRequest = new AdRequest.Builder().build();
        mAdView.loadAd(adRequest);

        //Interstitial Ads



    }



        String[] q = {"Is your Muscle weight more than fat ?", "Do you have a supportive social Network ?", "Do you eat fast food ?",
                "Do you go to gym ?",
                "Are you addicted to Porn ?",
                "Do you go for jogging in the morning ?",
                "Do you like to participate in Sports ?",
                "Are you in relationship ?",
                "Was your cgpa above 9 in any semester ?",
                "Do you masterbate ?"};

    public void result(View v) {
        if (y == 10) {
            n = health * 10;
            String fit = "You are " + n + " % fit";
            TextView text = (TextView) findViewById(R.id.text);
            text.setText(fit);


        }
    }

    public void start(View v) {


        TextView text = (TextView) findViewById(R.id.text);
        text.setText(q[0]);
        k = 1;

    }


    public void yes(View v) {



        if (y != 10) {
            if (k != 0 && y != 10) {

                if (y == 0 || y == 1 || y == 3 || y == 5 || y == 6)
                    health++;
                y++;
                if (y != 10) {
                    TextView text = (TextView) findViewById(R.id.text);
                    text.setText(q[y]);

                }
            }
        } else {
            TextView text = (TextView) findViewById(R.id.text);
            text.setText("Press Fitness Button to check Fitness ");
        }

    }


    public void no(View v) {

        if (y != 10) {
            if (k != 0 && y != 10) {


                if (y == 0 || y == 1 || y == 3 || y == 5 || y == 6)
                    health = health + 0;
                else
                    health++;

                y++;
                if (y != 10) {
                    TextView text = (TextView) findViewById(R.id.text);
                    text.setText(q[y]);
                }
            }
        } else {
            TextView text = (TextView) findViewById(R.id.text);
            text.setText("Press Fitness Button to check Fitness ");
        }

    }


    public void sometimes(View v) {
        if (y != 10) {
            if (k != 0 && y != 10) {

                if (y == 0 || y == 1 || y == 3 || y == 5 || y == 6)
                    health = health + 0.5;
                y++;
                if (y != 10) {
                    TextView text = (TextView) findViewById(R.id.text);
                    text.setText(q[y]);
                }
            }
        } else {
            TextView text = (TextView) findViewById(R.id.text);
            text.setText("Press Fitness Button to check Fitness ");
        }

    }







    public void exit(View v)
    {

        System.exit(0);
    }


}
