package com.company;

public class Tablero {
    String tablero[][];
    int filas;
    int columnas;

    void rellenar(Tablero tablero) {
    for (int x = 0; x < tablero.filas ; x++) {
        for (int y = 0; y < tablero.columnas; y++) {
            tablero.tablero [x][y] = "-";
        }
        
        }
    }
}