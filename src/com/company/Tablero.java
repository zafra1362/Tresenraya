package com.company;

public class Tablero {
    String tablero[][];
    int columnas;
    int filas;

    public Tablero(int columnas, int filas){
        this.filas = filas;
        this.columnas = columnas;
    }

    int fichac;
    int fichaf;
    String turno;

     void colocar(int fichac, int fichaf , String turno) {
        if (tablero[fichac - 1][fichaf - 1] == " _ ") {
            tablero[fichac - 1][fichaf - 1] = turno;
        }
    }

    public void rellenar(Tablero tablero) {
    for (int x = 0; x < tablero.columnas ; x++) {
        for (int y = 0; y < tablero.filas; y++) {
            tablero.tablero [x][y] = "-";
            }
        }
    }

    public void mostrar() {
        for (int x = 0; x < columnas; x++) {
            for (int y = 0; y < filas; y++) {
                System.out.println(tablero[x][y]);
            }
        }
    }
}