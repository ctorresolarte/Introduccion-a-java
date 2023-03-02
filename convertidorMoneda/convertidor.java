package convertidorMoneda;

import java.util.Scanner;

public class convertidor {
    public static void main(String[] args) {
        Scanner tec = new Scanner(System.in);
        double num, conversion;
       
        int monedaConvertir;

        System.out.println("Ingresa el valor a convertir");
        num = tec.nextDouble();

        System.out.println("Seleciona el tipo de moneda a la que desea convertir");
        System.out.println("===========================");
        System.out.println("1. Dolares");
        System.out.println("2. Peso argentino");
        System.out.println("3. Bitcoin");
        System.out.println("4. Euros");
        System.out.println("5. Peso mexicano");
        System.out.println("6. Yen japones");
        System.out.println("===========================");
        monedaConvertir = tec.nextInt();

        tec.close();

        switch (monedaConvertir) {
            case 1:
                conversion = num*0.0002;
                System.out.println(num + " pesos equivalen a " + conversion + " dolares");
                break;

            case 2:
                conversion = num*0.0404;
                System.out.println(num + " pesos equivalen a " + conversion + " Pesos argentinos");
                break;

            case 3:
                conversion = num*4.81;
                System.out.println(num + " pesos equivalen a " + conversion + " Bitcoins");
                break;

            case 4:
                conversion = num*0.0002;
                System.out.println(num + " pesos equivalen a " + conversion + " euros");
                break;

            case 5:
                conversion = num*0.0037;
                System.out.println(num + " pesos equivalen a " + conversion + " Pesos mexicanos");
                break;

            case 6:
                conversion = num*0.0280;                
                System.out.println(num + " pesos equivalen a " + conversion + " Yenes japonese");
                break;

            default:
                System.out.println("la moneda ingresada no existe");
                break;
        }
    }
}
