package com.example.androidcris;

import android.os.Bundle;
import androidx.appcompat.app.AppCompatActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.example.androidcris.adapters.BasicAdapter;
import com.example.androidcris.adapters.Contacto;
import java.util.ArrayList;
import java.util.List;

public class SecondActivity extends AppCompatActivity {
    private List<Contacto> data = new ArrayList<>();
    private BasicAdapter adapter;

    @Override
    protected void onCreate(Bundle savedInstanceState) {
        super.onCreate(savedInstanceState);
        setContentView(R.layout.activity_second);

        // Referencia al RecyclerView
        RecyclerView rvBasic = findViewById(R.id.rvBasic);

        // Lista inicial con nombres y números
        data.add(new Contacto("Cristopher", "987654321"));
        data.add(new Contacto("Juan Pérez", "123456789"));
        data.add(new Contacto("Ana Torres", "555666777"));
        data.add(new Contacto("Laura Méndez", "999888777"));
        data.add(new Contacto("Carlos Ruiz", "666111222"));

        // Configurar RecyclerView
        rvBasic.setLayoutManager(new LinearLayoutManager(this));
        adapter = new BasicAdapter(data);
        rvBasic.setAdapter(adapter);
    }
}
