package modularizacion.ejercicio3;

public class numPares {
    int num, numPar=0;

    numPares(int numero){
        String cadNum = String.valueOf(numero);
        for (int i = 0; i < cadNum.length(); i++) {
            if (cadNum.charAt(i)%2==0) {
                numPar++;
            }
        }
    }
}
