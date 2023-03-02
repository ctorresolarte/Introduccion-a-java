package modularizacion.ejercicio4;

public class tercerDigito {
    int numero;
    String resultado;

    tercerDigito(int num){
        String numCad = String.valueOf(num);
        resultado = String.valueOf(numCad.charAt(2));
    }
}
