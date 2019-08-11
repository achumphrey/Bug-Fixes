package com.example.bugfix0908;

import androidx.appcompat.app.AppCompatActivity;

import android.content.Intent;
import android.os.Bundle;
import android.view.View;
import android.widget.Button;

public class MainActivity extends AppCompatActivity {

private Button btnGoToActivity;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main); //this line was missing

        btnGoToActivity = findViewById(R.id.btn_go_to_activity); //initialization was missing
        btnGoToActivity.setOnClickListener(new View.OnClickListener() {
            @Override
            public void onClick(View view) {
                goToNextActivity(); // this method call was missing
            }
        });
    }

    private void goToNextActivity(){

        Intent intent = new Intent(this,SecondActivity.class);
        startActivity(intent); //this line was missing
    }

}
