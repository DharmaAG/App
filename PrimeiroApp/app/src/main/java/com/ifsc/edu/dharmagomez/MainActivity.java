package com.ifsc.edu.dharmagomez;

import androidx.appcompat.app.AppCompatActivity;


import android.os.Bundle;
import android.widget.Button;
import android.widget.Toast;


public class MainActivity extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        Button welcomeButton = findViewById(R.id.welcomeButton);
        welcomeButton.setOnClickListener(view -> {minhaAcao();});
    }

    void minhaAcao(){
        Toast.makeText(
                this,
                R.string.welcomeToast,
                Toast.LENGTH_SHORT
        ).show();
    }
}