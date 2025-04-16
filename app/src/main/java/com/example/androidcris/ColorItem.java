package com.example.androidcris;

public class ColorItem {
    private String nombre;
    private int colorHex;

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

    public String getHexCode() {
        return String.format("#%06X", (0xFFFFFF & colorHex));
    }
}