package com.example.user.alc40;

import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.WebView;

public class AboutAlc extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_about_alc);

        WebView webView = findViewById(R.id.web_view);
        webView.loadUrl("https://andela.com/alc/");
    }
}
