package com.example.androidcris.adapters;

import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;

import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;

import com.example.androidcris.R;

import java.util.List;

public class BasicAdapter extends RecyclerView.Adapter<BasicAdapter.BasicViewHolder> {
    private List<Contacto> contactos;

    public BasicAdapter(List<Contacto> contactos) {
        this.contactos = contactos;
    }

    @NonNull
    @Override
    public BasicViewHolder onCreateViewHolder(@NonNull ViewGroup parent, int viewType) {
        View view = LayoutInflater.from(parent.getContext()).inflate(R.layout.item_basic, parent, false);
        return new BasicViewHolder(view);
    }

    @Override
    public void onBindViewHolder(@NonNull BasicViewHolder holder, int position) {
        Contacto contacto = contactos.get(position);
        holder.tvNombre.setText(contacto.getNombre());
        holder.tvTelefono.setText(contacto.getTelefono());
    }

    @Override
    public int getItemCount() {
        return contactos.size();
    }

    public class BasicViewHolder extends RecyclerView.ViewHolder {
        TextView tvNombre, tvTelefono;

        public BasicViewHolder(@NonNull View itemView) {
            super(itemView);
            tvNombre = itemView.findViewById(R.id.tvNombre);
            tvTelefono = itemView.findViewById(R.id.tvTelefono);
        }
    }
}
