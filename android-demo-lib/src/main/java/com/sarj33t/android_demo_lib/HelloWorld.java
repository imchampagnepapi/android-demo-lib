package com.sarj33t.android_demo_lib;

import android.util.Log;

public class HelloWorld {
    public static void main(String[] args){
        /// Main Method
    }

    /// Prints Message with Tag in Logcat
    public static void printLog(String tag, String message){
        Log.d(tag, message);
    }
}
