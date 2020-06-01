package com.company;

import java.util.Scanner;

public class Posicion {

    Scanner scanner = new Scanner(System.in);

    public int posicionColumna() {
        System.out.print("Dime una columna para poner la ficha: ");
        return scanner.nextInt();
    }

    public int posicionFila() {
        System.out.print("Dime una fila para poner la ficha: ");
        return scanner.nextInt();
    }
}
