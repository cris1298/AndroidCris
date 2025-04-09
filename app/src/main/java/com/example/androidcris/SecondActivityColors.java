package com.example.androidcris;

import android.graphics.Color;
import android.os.Bundle;
import android.widget.ListView;
import androidx.appcompat.app.AppCompatActivity;
import com.example.androidcris.adapters.ColorAdapter;
import com.example.androidcris.ColorItem;
import java.util.ArrayList;
import java.util.List;

public class SecondActivityColors extends AppCompatActivity {

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second_colors);

        List<ColorItem> colors = new ArrayList<>();
        colors.add(new ColorItem("Rojo", Color.RED));
        colors.add(new ColorItem("Azul", Color.BLUE));
        colors.add(new ColorItem("Verde", Color.GREEN));
        colors.add(new ColorItem("Amarillo", Color.YELLOW));
        colors.add(new ColorItem("Magenta", Color.MAGENTA));
        colors.add(new ColorItem("CYAN", Color.CYAN));

        ColorAdapter adapter = new ColorAdapter(this, colors);
        ListView listView = findViewById(R.id.listViewColores);
        listView.setAdapter(adapter);
    }
}