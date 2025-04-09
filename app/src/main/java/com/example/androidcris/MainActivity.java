package com.example.androidcris;

import android.content.Intent;
import android.os.Bundle;
import android.widget.Button;  // Import necesario para el Button
import androidx.appcompat.app.AppCompatActivity;

public class MainActivity extends AppCompatActivity {
    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_main);

        // Corrección: Usa el ID correcto del botón
        Button btnVerColores = findViewById(R.id.btn_ver_colores);
        btnVerColores.setOnClickListener(v -> {
            startActivity(new Intent(this, SecondActivityColors.class));
        });
    }
}