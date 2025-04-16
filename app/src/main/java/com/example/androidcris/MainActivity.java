package com.example.androidcris;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);


        Button btnVerColores = findViewById(R.id.btn_ver_colores);
        btnVerColores.setOnClickListener(v -> {
            startActivity(new Intent(this, SecondActivityColors.class));
        });
    }
}