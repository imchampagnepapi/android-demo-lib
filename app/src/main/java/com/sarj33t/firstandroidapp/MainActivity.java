package com.sarj33t.firstandroidapp;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;

import com.sarj33t.android_demo_lib.HelloWorld;

public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        HelloWorld.printLog("imchampagnepapi", "Hello From Android Lib");
    }
}