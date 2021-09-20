package com.simrankamra.browser;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.webkit.WebView;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    public void loadGoogle(View v){

        Intent intent = new Intent(this, WebActivity.class);
        startActivity(intent);
    }

    public void loadBing(View v){

        Intent intent = new Intent(this, MainActivity2.class);
        startActivity(intent);
    }
}