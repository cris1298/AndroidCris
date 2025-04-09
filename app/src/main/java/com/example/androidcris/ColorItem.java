package com.example.androidcris;

public class ColorItem {
    private final String nombre;
    private final int colorHex;

    public ColorItem(String nombre, int colorHex) {
        this.nombre = nombre;
        this.colorHex = colorHex;
    }

    public String getNombre() {
        return nombre;
    }

    public int getColorHex() {
        return colorHex;
    }
}