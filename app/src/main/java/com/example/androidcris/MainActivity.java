package com.example.androidcris;

import android.content.Intent;
import android.os.Bundle;
import android.util.Log;
import android.view.View;
import android.widget.Button;
import android.widget.TextView;

import androidx.activity.EdgeToEdge;
import androidx.appcompat.app.AppCompatActivity;
import androidx.core.graphics.Insets;
import androidx.core.view.ViewCompat;
import androidx.core.view.WindowInsetsCompat;

public class MainActivity extends AppCompatActivity {
    private int counter = 0;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        //EdgeToEdge.enable(this);
        setContentView(R.layout.activity_main);

//        Button btnShowMessage = findViewById(R.id.button);
//        TextView tvMessage = findViewById(R.id.tvMessage);

//        btnTvMessage.setOnClickListener(new View.OnClickListener() {
//            @Override
//            public void onClick(View view) {
//                Log.i("MAIN_APP", "Clic en boton!!");
//
//                btnTvMessage.setText("Hola Clase 2025-1");
//            }
//        });

        //lambda expression
//        btnShowMessage.setOnClickListener(v -> {
//            counter++;
//            Log.i("MAIN_APP", "Clic en boton!!!"+ counter);
//            tvMessage.setText("Clic número: " + counter);
////            tvMessage.setText("Hola Clase 2025-");
//
//            //Iniciar nueva actividad
//                Intent intent = new Intent(MainActivity.this, SecondActivity.class);
//                startActivity(intent);
//        });


//        ViewCompat.setOnApplyWindowInsetsListener(findViewById(R.id.main), (v, insets) -> {
//            Insets systemBars = insets.getInsets(WindowInsetsCompat.Type.systemBars());
//            v.setPadding(systemBars.left, systemBars.top, systemBars.right, systemBars.bottom);
//            return insets;
//        });
    }
}