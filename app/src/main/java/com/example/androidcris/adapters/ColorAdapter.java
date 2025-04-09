package com.example.androidcris.adapters;

import android.content.Context;
import android.graphics.drawable.GradientDrawable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ArrayAdapter;
import android.widget.TextView;
import androidx.annotation.NonNull;
import com.example.androidcris.ColorItem;
import com.example.androidcris.R;

import java.util.List;

public class ColorAdapter extends ArrayAdapter<ColorItem> {

    public ColorAdapter(Context context, List<ColorItem> colors) {
        super(context, 0, colors);
    }

    @NonNull
    @Override
    public View getView(int position, View convertView, @NonNull ViewGroup parent) {
        if (convertView == null) {
            convertView = LayoutInflater.from(getContext()).inflate(R.layout.item_color, parent, false);
        }

        ColorItem item = getItem(position);
        if (item != null) {
            TextView tvNombre = convertView.findViewById(R.id.tvNombreColor);
            View colorView = convertView.findViewById(R.id.viewColor);
            TextView tvHex = convertView.findViewById(R.id.tvHexColor);

            tvNombre.setText(item.getNombre());
            tvHex.setText(String.format("#%06X", (0xFFFFFF & item.getColorHex())));

            GradientDrawable drawable = (GradientDrawable) colorView.getBackground();
            drawable.setColor(item.getColorHex());
        }

        return convertView;
    }
}