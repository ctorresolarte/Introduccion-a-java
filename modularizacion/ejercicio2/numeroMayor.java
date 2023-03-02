package modularizacion.ejercicio2;

class numeroMayor {
    int num1, num2, mayor;

    numeroMayor(int n1, int n2){
        num1 = n1;
        num2 = n2;
        if (num1 > num2) {
            mayor = num1;
        } else {
            mayor = num2;
        }
    }
}
