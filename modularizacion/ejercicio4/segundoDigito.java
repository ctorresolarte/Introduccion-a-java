package modularizacion.ejercicio4;

public class segundoDigito {
    int numero;
    String resultado;

    segundoDigito(int num){
        String numCad = String.valueOf(num);
         resultado = String.valueOf(numCad.charAt(1));
    }
}
