package constructorParametros.EjerciciosConsParametros.ejercicio1;

import java.util.Scanner;

public class cuadrado {
    double lado1, lado2, lado3, lado4, perimetro, area;

    cuadrado(double l1, double l2, double l3, double l4) {
        lado1 = l1;
        lado2 = l2;
        lado3 = l3;
        lado4 = l4;
        perimetro = l1 + l2 + l3 + l4;
        area = l1 * l2;
    }
}
class cuadrado1{
    public static void main(String[] args) {
        Scanner teclado = new Scanner(System.in);
        double l1, l2, l3, l4;

        System.out.println("Lado 1: ");
        l1 = teclado.nextDouble();

        System.out.println("Lado 2: ");
        l2 = teclado.nextDouble();

        System.out.println("Lado 3: ");
        l3 = teclado.nextDouble();

        System.out.println("Lado 4: ");
        l4 = teclado.nextDouble();

        if (l1 != l2 || l1 != l3 || l1 != l4) {
            System.out.println("Los lados no son iguales, por lo tanto no es un cuadrado.");
        } else {
            cuadrado c1 = new cuadrado(l1,l2,l3,l4);

            System.out.println("\nCuadrado\n");
            System.out.println("Lado 1 "+c1.lado1);
            System.out.println("Lado 2 "+c1.lado2);
            System.out.println("Lado 3 "+c1.lado3);
            System.out.println("Lado 4 "+c1.lado4);
            System.out.println("Perimetro "+c1.perimetro);
            System.out.println("Area "+c1.area);
        }
        teclado.close();
    }
}