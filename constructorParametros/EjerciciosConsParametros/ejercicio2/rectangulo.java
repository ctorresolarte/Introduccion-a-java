package constructorParametros.EjerciciosConsParametros.ejercicio2;

import java.util.Scanner;

public class rectangulo {
    double ladoA, ladoB, ladoC, ladoD, area, perimetro;

    rectangulo(double la, double lb, double lc, double ld){
        ladoA = la;
        ladoB = lb;
        ladoC = lc;
        ladoD = ld;
        area = la*lb;
        perimetro = la+lb+lc+ld;
    }
}
class rectangulo1 {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double l1, l2, l3, l4;

        System.out.println("Lado 1: ");
        l1 = tec.nextDouble();
        System.out.println("Lado 2: ");
        l2 = tec.nextDouble();
        System.out.println("Lado 3: ");
        l3 = tec.nextDouble();
        System.out.println("Lado 4: ");
        l4 = tec.nextDouble();

        if (l1 == l3 && l2 == l4) {
            rectangulo r1 = new rectangulo(l1, l2, l3, l4);

            System.out.println("Lado 1: "+r1.ladoA);
            System.out.println("Lado 2: "+r1.ladoB);
            System.out.println("Lado 3: "+r1.ladoC);
            System.out.println("Lado 4: "+r1.ladoD);
            System.out.println("Perimetro: "+r1.perimetro);
            System.out.println("Area: "+r1.area);


        } else {
            System.out.println("Uno de los angulos de la figura no forma un angulo recto, rectifique las medidas de los lados");
        }
    }
}