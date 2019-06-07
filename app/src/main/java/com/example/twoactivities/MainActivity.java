package com.example.twoactivities;

import android.content.Intent;
import android.support.v7.app.AppCompatActivity;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.EditText;

public class MainActivity extends AppCompatActivity {

    // Setup logging of button activation for main button
    private static final String LOG_TAG = MainActivity.class.getSimpleName();
    // KEY for Intent EXTRA and a variable to hold the text
    public static final String EXTRA_MESSAGE = "com.example.android.twoactivities.extra.MESSAGE";
    private EditText mMessageEditText;


    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        mMessageEditText = (EditText)findViewById(R.id.editText_main);
    }

    // Setting up method for onClick on main button, intent and message
    public void launchSecondActivity(View view) {
        Log.d(LOG_TAG, "button clicked");
        Intent intent = new Intent(this, SecondActivity.class);
        String message = mMessageEditText.getText().toString();
        intent.putExtra(EXTRA_MESSAGE, message);
        startActivity(intent);
    }
}
