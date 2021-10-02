package com.jrangel.webviewexample;

import android.content.Intent;
import android.net.Uri;
import android.os.Bundle;
import android.view.View;

import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void openForIntent(View v) {
        Intent i = new Intent(Intent.ACTION_VIEW);
        i.setData(Uri.parse(Constants.URL_PAGE));
        startActivity(i);
    }

    public void openForWebView(View v) {
        Intent intent = new Intent(MainActivity.this, WebViewActivity.class);
        startActivity(intent);
    }
}