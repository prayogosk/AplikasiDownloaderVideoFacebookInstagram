package com.prayogosk.instadownloadvideo;

import android.annotation.SuppressLint;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.webkit.DownloadListener;
import android.webkit.WebView;

public class FacebookUnduhVideos extends AppCompatActivity {

    private WebView facebookVideos;

    @SuppressLint("MissingInflatedId")
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_facebook_unduh_videos);

        facebookVideos = findViewById(R.id.facebook_Videos);

        facebookVideos.getSettings().setJavaScriptEnabled(true);

        facebookVideos.setDownloadListener(new DownloadListener() {
            @Override
            public void onDownloadStart(String url, String userAgent, String contentDisposition, String mimetype, long contentLength) {

                Intent in = new Intent(Intent.ACTION_VIEW);
                in.setData(Uri.parse(url));

                startActivity(in);
            }
        });

        facebookVideos.loadUrl("https://snapsave.app/id/#google_vignette");
    }
}