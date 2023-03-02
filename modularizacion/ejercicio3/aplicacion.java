package modularizacion.ejercicio3;

public class aplicacion {
    public static void main(String[] args) {
        contDigitos contadorDigitos = new contDigitos(19845997);//8
        contNum6 contadorNumSeis = new contNum6(186666566);//x
        numImpar numeroImpar = new numImpar(5433874);//4
        numPares numeroPar = new numPares(488788811);//6
        numPrimo numPrim = new numPrimo(2357);//x

        System.out.println("cantidad de digitos "+contadorDigitos.num);
        System.out.println("veces que el numero 6 se repite "+contadorNumSeis.contNumero);
        System.out.println("numeros impares "+numeroImpar.numImp);
        System.out.println("numeros pares "+numeroPar.numPar);
        System.out.println("numeros primos "+numPrim.primo);
    }
}
