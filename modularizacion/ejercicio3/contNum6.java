package modularizacion.ejercicio3;

public class contNum6 {
    int num, contNumero=0;
    char seis = 6;
    contNum6(int numero){
        String numCad = String.valueOf(numero);

        for (int i = 0; i < numCad.length(); i++) {
            if(numCad.charAt(i) == seis){
                contNumero++;
            }
        }
    }
    public static void main(String[] args) {
        contNum6 contadorNumSeis = new contNum6(186666566);//x

        System.out.println("hay "+contadorNumSeis.contNumero);
    }
}
