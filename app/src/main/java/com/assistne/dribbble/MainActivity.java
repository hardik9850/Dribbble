package com.assistne.dribbble;

import android.app.Activity;
import android.content.Intent;
import android.os.Bundle;
import android.view.View;

import com.assistne.dribbble.bezierindicator.BezierActivity;
import com.assistne.dribbble.emailreceipt.EmailReceiptActivity;
import com.assistne.dribbble.framestday004.FStD4Activity;
import com.assistne.dribbble.yahooweather.YahooWeatherActivity;

public class MainActivity extends Activity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void goFStD4Activity(View view) {
        startActivity(new Intent(this, FStD4Activity.class));
    }

    public void goAnimationActivity(View view) {
        startActivity(new Intent(this, AnimationActivity.class));
    }

    public void goEmailReceipt(View view) {
        startActivity(new Intent(this, EmailReceiptActivity.class));
    }

    public void goYahooWeather(View view) {
        startActivity(new Intent(this, YahooWeatherActivity.class));
    }

    public void goBezierIndicator(View view) {
        startActivity(new Intent(this, BezierActivity.class));
    }
}
