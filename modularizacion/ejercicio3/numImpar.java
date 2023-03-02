package modularizacion.ejercicio3;

public class numImpar {
    int num, numImp=0;
     numImpar(int numero){
        String cadNum = String.valueOf(numero);
        for (int i = 0; i < cadNum.length(); i++) {
            if (cadNum.charAt(i)%2 != 0) {
                numImp++;
            }
        }
     }
}
