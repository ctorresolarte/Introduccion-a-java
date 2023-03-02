package modularizacion.ejercicio2;

public class numeroMenor {
    int num1, num2, menor;

    numeroMenor(int n1, int n2){
        num1 = n1;
        num2 = n2;
        if (num1<num2) {
            menor = num1;
        } else {
            menor = num2;
        }
    }
}
