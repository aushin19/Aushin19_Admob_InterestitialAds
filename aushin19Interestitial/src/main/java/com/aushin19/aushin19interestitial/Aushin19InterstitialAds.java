package com.aushin19.aushin19interestitial;

import android.app.Activity;
import android.content.Context;

import androidx.annotation.NonNull;

import com.google.android.gms.ads.AdRequest;
import com.google.android.gms.ads.LoadAdError;
import com.google.android.gms.ads.interstitial.InterstitialAd;
import com.google.android.gms.ads.interstitial.InterstitialAdLoadCallback;

public class Aushin19InterstitialAds {

    Context context;
    //ApplovinInterstitialAds applovinInterstitialAds;
    private String AD_UNIT_ID;
    private static InterstitialAd mInterstitialAd;

    public Aushin19InterstitialAds(Context context, String AD_UNIT_ID){
        this.context  = context;
        this.AD_UNIT_ID = AD_UNIT_ID;
    }

    public void loadAd(){
        AdRequest adRequest = new AdRequest.Builder().build();

        InterstitialAd.load(context,AD_UNIT_ID, adRequest,
                new InterstitialAdLoadCallback() {
                    @Override
                    public void onAdLoaded(@NonNull InterstitialAd interstitialAd) {
                        mInterstitialAd = interstitialAd;
                    }

                    @Override
                    public void onAdFailedToLoad(@NonNull LoadAdError loadAdError) {
                        mInterstitialAd = null;
                    }
                });
    }

    public void showAd(){
        if (mInterstitialAd != null) {
            mInterstitialAd.show((Activity) context);
        }
    }
}
