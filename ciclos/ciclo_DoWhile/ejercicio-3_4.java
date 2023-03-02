package ciclos.ciclo_DoWhile;

import java.util.Scanner;

class digitosParesImpares {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        int num, i=0;
        String numCadena;

        System.out.println("Ingrese un numero");
        num = tec.nextInt();
        numCadena = num + " ";
        tec.close();

        do {
            if(numCadena.charAt(i)%2 != 0){
                System.out.println("el numero "+numCadena.charAt(i)+ " es impar");
            }else{
                System.out.println("el numero "+numCadena.charAt(i)+ " es par");
            }
            i++;

        } while (i!= numCadena.length()-1);

    }
}
