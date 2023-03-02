package ciclos.ciclo_DoWhile;

import java.util.Scanner;

class Factorial{
    public static void main(String[] args) {
        Scanner Tec = new Scanner(System.in);

        int num, facto=1, i=1;

        System.out.println("Ingrese un numero:");
        num = Tec.nextInt();
        do {
            facto *= i; 
            i++;
        } while (i <= num);
        System.out.println("El factorial de "+num+" es: "+facto);
        Tec.close();
    }
}
