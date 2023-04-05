package com.prayogosk.instadownloadvideo;

import android.app.ProgressDialog;
import android.content.Intent;
import android.net.Uri;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.view.View;
import android.webkit.DownloadListener;
import android.webkit.WebView;
import android.widget.Button;

public class MainActivity extends AppCompatActivity implements View.OnClickListener {

    private Button facebook;
    private Button instagram;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        facebook = findViewById(R.id.buttonFacebook);
        instagram = findViewById(R.id.buttonInstagram);

        facebook.setOnClickListener(this);
        instagram.setOnClickListener(this);

    }

    @Override
    public void onClick(View view) {

        if(view.getId() == R.id.buttonFacebook){
            Intent intent = new Intent(MainActivity.this, FacebookUnduhVideos.class);
            startActivity(intent);
        } else if(view.getId() == R.id.buttonInstagram){
            Intent intent = new Intent(MainActivity.this, InstagramUnduhReels.class);
            startActivity(intent);
        }

    }
}