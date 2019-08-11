package com.example.bugfix0908;

import androidx.appcompat.app.AppCompatActivity;

import android.os.Bundle;
import android.view.View;
import android.widget.TextView;

public class SecondActivity extends AppCompatActivity { //was missing in the manifest

    private TextView textView; // missing declaration

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        textView = findViewById(R.id.tv_display); //missing initialization
        textView.setVisibility(View.VISIBLE); //make view visible
    }
}
