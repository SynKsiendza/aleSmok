package com.smog_alert.alesmok;

import androidx.appcompat.app.AppCompatActivity;

import android.annotation.SuppressLint;
import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @SuppressLint("SetJavaScriptEnabled")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        WebView mWebView = findViewById(R.id.wvPortal);
        mWebView.loadUrl("file:///android_asset/www/index.html");
        WebSettings mWebSettings = mWebView.getSettings();
        mWebSettings.setJavaScriptEnabled(true);
        WebSettings settings = mWebView.getSettings();
        settings.setDomStorageEnabled(true);
    }

}