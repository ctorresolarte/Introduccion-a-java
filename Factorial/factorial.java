package Factorial;

import java.util.Scanner;

public class factorial {
    public static void main(String[] args) {
        int numero, numGuardado = 1;

        Scanner teclado = new Scanner(System.in);
        System.out.println("Ingrese un numero");
        numero = teclado.nextInt();
        for (int i = 1; i <= numero; i++) {
            numGuardado *= i;
        }
        System.out.println("El factorial de "+ numero +" es "+numGuardado);
        teclado.close();
    }
}