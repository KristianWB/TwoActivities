package com.example.twoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;

public class MainActivity extends AppCompatActivity {

    // Setup logging of button activation for main button
    private static final String LOG_TAG = MainActivity.class.getSimpleName();

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
    }

    // Setting up method for onClick on main button, intent and message
    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "button clicked");
        Intent intent = new Intent(this, SecondActivity.class);
        startActivity(intent);
    }
}
