package com.example.lifecycleproject;

import android.os.Bundle;
import android.util.Log;
import android.widget.Button;
import android.widget.TextView;

import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private int count = 0;
    private TextView countText;
    private static final String TAG = "Verdon";

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);
        Log.d(TAG, "onCREATE");

        countText = findViewById(R.id.count_text);
        if (savedInstanceState != null) {
            count = savedInstanceState.getInt("count");
        }
        countText.setText("Adrian's Count: " + count);

        Button countButton = findViewById(R.id.count_button);

        countButton.setOnClickListener(v -> {
            count++;
            countText.setText("Adrian's Count: " + count);
        });
    }

    @Override
    protected void onStart () {
        super.onStart();
        Log.d(TAG, "onSTART");
    }

    @Override
    protected void onResume () {
        super.onResume();
        Log.d(TAG, "onRESUME");
    }

    @Override
    protected void onPause () {
        super.onPause();
        Log.d(TAG, "onPAUSE");
    }

    @Override
    protected void onStop () {
        super.onStop();
        Log.d(TAG, "onSTOP");
    }

    @Override
    protected void onRestart () {
        super.onRestart();
        Log.d(TAG, "onRESTART");
    }

    @Override
    protected void onDestroy () {
        super.onDestroy();
        Log.d(TAG, "onDESTROY");
    }

    @Override
    protected void onSaveInstanceState(Bundle outState) {
        super.onSaveInstanceState(outState);
        outState.putInt("count", count);
    }
}