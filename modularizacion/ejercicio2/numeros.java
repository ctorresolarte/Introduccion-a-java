package modularizacion.ejercicio2;

public class numeros {
    public static void main(String[] args) {
        numeroMayor nMayor = new numeroMayor(15, 45);//45
        numeroMenor nMenor = new numeroMenor(12, 6);//6
        numerosIguales nIguales = new numerosIguales(5, 15);//iguales

        System.out.println("Numero mayor: "+nMayor.mayor);
        System.out.println("Numero menor: "+nMenor.menor);
        System.out.println("Numeros iguales: "+nIguales);
    }
}
