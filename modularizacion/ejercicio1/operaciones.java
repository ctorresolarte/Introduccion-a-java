package modularizacion.ejercicio1;

import java.util.Scanner;

public class operaciones {
    public static void main(String[] args) {
        suma suma = new suma(5, 5);
        resta resta = new resta(20, 10);
        multiplicacion multi = new multiplicacion(3, 2);
        division division = new division(25, 5);

        System.out.println("Suma "+suma.suma);
        System.out.println("Resta "+resta.resta);
        System.out.println("Multiplicacion "+multi.multiplicacion);
        System.out.println("division "+division.division);
    }
}