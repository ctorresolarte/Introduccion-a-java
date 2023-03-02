package constructorParametros.EjerciciosConsParametros;

import java.util.Scanner;

public class triangulo {
    int base;
    int altura;
    int area;

    public triangulo(int bas, int alt) {
        base = bas;
        altura = alt;
        area = (base * altura) / 2;
    }

    public static void main(String[] args) {
        // * Introduciendo los datos por el teclado */
        Scanner teclado = new Scanner(System.in);
        teclado.close();
        int b1, a1, b2, a2;

        System.out.println("Base 1: ");
        b1 = teclado.nextInt();
        System.out.println("altura 1: ");
        a1 = teclado.nextInt();

        System.out.println("Base 2: ");
        b2 = teclado.nextInt();
        System.out.println("altura 2: ");
        a2 = teclado.nextInt();

        triangulo t1 = new triangulo(b1, a1);
        triangulo t2 = new triangulo(b2, a2);

        System.out.println("\nPrimer Triangulo\n");
        System.out.println("Base: " + t1.base);
        System.out.println("Altura: " + t1.altura);
        System.out.println("Area: " + t1.area);

        System.out.println("\nSegundo Triangulo\n");
        System.out.println("Base: " + t2.base);
        System.out.println("Altura: " + t2.altura);
        System.out.println("Area: " + t2.area);

        // triangulo trian1 = new triangulo(20,15);
        // triangulo trian2 = new triangulo(10,40);
        // triangulo trian3 = new triangulo(40,20);

        // System.out.println("\nPrimer Triangulo\n");
        // System.out.println("Base: "+trian1.base);
        // System.out.println("Altura: "+trian1.altura);
        // System.out.println("Area: "+trian1.area);

        // System.out.println("\nSegundo Triangulo\n");
        // System.out.println("Base: "+trian2.base);
        // System.out.println("Altura: "+trian2.altura);
        // System.out.println("Area: "+trian2.area);

        // System.out.println("\nTercer Triangulo\n");
        // System.out.println("Base: "+trian3.base);
        // System.out.println("Altura: "+trian3.altura);
        // System.out.println("Area: "+trian3.area);
    }

}
