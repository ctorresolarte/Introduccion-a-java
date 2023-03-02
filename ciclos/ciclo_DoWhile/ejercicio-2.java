package ciclos.ciclo_DoWhile;

import java.util.Scanner;

class cantDigitos {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int num;
        String numCadena;
        
        System.out.println("ingrese un numero");
        num = tec.nextInt();
        numCadena = String.valueOf(num);
        tec.close();

        do {
            System.out.println("El numero " + num + " tiene " + numCadena.length() + " digitos");
            break;
        } while (num != 0);
    }
}
