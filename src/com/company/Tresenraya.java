package com.company;

import java.util.Scanner;

public class Tresenraya {

    Scanner scanner = new Scanner(System.in);

    static Turno t = new Turno();

    public String turno;

    static Tablero tablero = new Tablero(3, 3);

    Posicion ficha = new Posicion();

    public void iniciar() {
        turno = " 0 ";

        tablero.tablero = new String[tablero.filas][tablero.columnas];
        tablero.rellenar(tablero);

            rellenar();

            cambio();
        }


    private void rellenar() {
        t.turnos(turno);
        int fila = ficha.posicionFila();
        int columna = ficha.posicionColumna();
        System.out.println("");
        tablero.colocar(columna, fila, turno);
        tablero.mostrar();
    }


    private void cambio() {
        if (turno == " 0 ") turno = " X ";
        else turno = " 0 ";
    }
}





