package ciclos.ciclo_DoWhile;

import java.util.Scanner;

class digParesImpares {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int num1,
                num2,
                i = 0,
                j = 0,
                contPar = 0,
                contImpar = 0,
                contPar2 = 0,
                contImpar2 = 0,
                x = 0,
                y = 0;

        System.out.println("Introduce un numero");
        num1 = tec.nextInt();
        System.out.println("Introduce un numero");
        num2 = tec.nextInt();

        tec.close();
        String cadNum1 = String.valueOf(num1);
        String cadNum2 = String.valueOf(num2);
        do {
            if (cadNum1.charAt(i) % 2 == 0) {
                contPar++;
            } else {
                contImpar++;
            }
            i++;

            if (cadNum2.charAt(j) % 2 == 0) {
                contPar2++;
            } else {
                contImpar2++;
            }
            j++;
            x++;
            y++;
        } while (x <= cadNum1.length() - 1 && y <= cadNum2.length() - 1);

        if (contPar > contPar2) {
            System.out.println("El numero " + num1 + " tiene mas numeros pares que " + num2+" "+contPar);
        } else {
            System.out.println("El numero " + num2 + " tiene mas numeros pares que " + num1+" "+contImpar);
        }

        if (contImpar > contImpar2) {
            System.out.println("El numero " + num1 + " tiene mas numeros impares que " + num2+" "+contPar2);
        } else {
            System.out.println("El numero " + num2 + " tiene mas numeros impares que " + num1+" "+contImpar2);


        }

    }
}
