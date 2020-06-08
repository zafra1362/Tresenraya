package com.company;

public class Tablero {
    String tablero[][];
    int columnas;
    int filas;

    public Tablero(int filas, int columnas){
        this.filas = filas;
        this.columnas = columnas;
    }

    int fichac;
    int fichaf;
    String turno;

     void colocar(int fichac, int fichaf , String turno) {
        if (tablero[fichaf - 1][fichac - 1] == " _ ") {
            tablero[fichaf - 1][fichac - 1] = turno;
        }
    }

    public void rellenar(Tablero tablero) {
    for (int x = 0; x < tablero.filas ; x++) {
        for (int y = 0; y < tablero.columnas; y++) {
            tablero.tablero [x][y] = " _ ";
            }
        }
    }

    public void mostrar() {
        for (int x = 0; x < filas; x++) {
            for (int y = 0; y < columnas; y++) {
                System.out.print(tablero[x][y]);
            }
            System.out.println("");
        }
    }
}