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

        tablero.tablero = new String[tablero.columnas][tablero.filas];
        tablero.rellenar(tablero);

            rellenar();

            turno();
        }


    private void rellenar() {
        t.turnos(turno);
        int columna = ficha.posicionColumna();
        int fila = ficha.posicionFila();
        tablero.colocar(columna, fila, turno);
        tablero.mostrar();
    }


    private void turno() {
        if (turno.equals(" 0 ")) turno = " x ";
        else turno = " 0 ";
    }
}





