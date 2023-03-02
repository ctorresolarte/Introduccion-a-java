package modularizacion.ejercicio4;

public class aplicacion {
    public static void main(String[] args) {
     primerDigito numero = new primerDigito(1997);
     segundoDigito numero2 = new segundoDigito(1997);
     tercerDigito numero3 = new tercerDigito(1997);
     digitosRepetidos numero4 = new digitosRepetidos(1999);


     System.out.println("el primer digito es "+numero.result);
     System.out.println("el segondo digito es "+numero2.resultado);
     System.out.println("el tercer digito es "+numero3.resultado);
     System.out.println("el  digito repetido es "+numero4.repetido);
    }
}
