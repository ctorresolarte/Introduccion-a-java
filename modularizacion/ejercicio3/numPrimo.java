package modularizacion.ejercicio3;

public class numPrimo {
    int num, primo=0, div = 1;

    numPrimo(int numero){
        String numCad = String.valueOf(numero);

        
        for (int i = 0; i < numCad.length(); i++) {
           if (numCad.charAt(i)%div == 0)  {
            primo++;
        }
        div++;
        }
    }
}
