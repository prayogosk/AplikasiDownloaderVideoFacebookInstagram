package com.prayogosk.instadownloadvideo;

import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.DownloadListener;
import android.webkit.WebView;

public class InstagramUnduhReels extends AppCompatActivity {

    private WebView instagramReels;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_instagram_unduh_reels);

        instagramReels = findViewById(R.id.webView);

        instagramReels.getSettings().setJavaScriptEnabled(true);

        instagramReels.setDownloadListener(new DownloadListener() {
            @Override
            public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {

                Intent in = new Intent(Intent.ACTION_VIEW);
                in.setData(Uri.parse(url));

                startActivity(in);
            }
        });

        instagramReels.loadUrl("https://inflact.com/downloader/instagram/");
    }
}