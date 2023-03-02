package modularizacion.ejercicio2;

public class numerosIguales {
    int num1, num2;
    String cad1 = "son iguales", cad2 ="no son iguales";

      numerosIguales(int n1, int n2) {
        num1 = n1;
        num2 = n2;
       if (num1 == num2) {
        System.out.println(cad1);
       }else{
        System.out.println(cad2);
       }
    }
}
  