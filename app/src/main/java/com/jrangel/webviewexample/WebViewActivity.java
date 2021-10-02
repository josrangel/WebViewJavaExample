package com.jrangel.webviewexample;

import android.os.Bundle;
import android.webkit.WebSettings;
import android.webkit.WebView;

import androidx.appcompat.app.AppCompatActivity;

public class WebViewActivity extends AppCompatActivity {

    private WebView wvNavigator;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_web_view);
        initWebView();
    }

    private void initWebView() {
        wvNavigator = findViewById(R.id.wvNavigator);
        WebSettings ajustesVisorWeb = wvNavigator.getSettings();
        ajustesVisorWeb.setJavaScriptEnabled(true);
        wvNavigator.loadUrl(Constants.URL_PAGE);
    }
}