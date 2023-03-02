package modularizacion.ejercicio3;

public class contDigitos {
    int num;

    contDigitos(int numero) {
        String cadNum = String.valueOf(numero);
        num = cadNum.length();
    }
}
