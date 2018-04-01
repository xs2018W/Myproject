package com.example.windows_8.myapplication;

import android.app.Activity;
import android.os.Bundle;
import android.util.Log;

public class MainActivity extends Activity {

    static final String TAG = MainActivity.class.getSimpleName();
    public void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        // The activity is being created.
    }
    @Override
    protected void onStart() {
        super.onStart();
        Log.e(TAG, "Activity is onStart");
    }
    @Override
    protected void onResume() {
        super.onResume();
        Log.e(TAG, "Activity is onResume");
    }
    @Override
    protected void onPause() {
        super.onPause();
        Log.e(TAG, "Activity is onPause");
    }
    @Override
    protected void onStop() {
        super.onStop();
        Log.e(TAG, "Activity is onStop");
    }
    @Override
    protected void onDestroy() {
        super.onDestroy();
        Log.e(TAG, "Activity is onDestroy");
    }
}

