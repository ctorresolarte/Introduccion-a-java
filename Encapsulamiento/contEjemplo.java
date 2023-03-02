package Encapsulamiento;

public class contEjemplo {
    
    public static void main(String[] args) {
        // clase2 obj1 = new clase2();
        // System.out.println("Dato 1 "+obj1.dato1);
        // System.out.println("Dato 2 "+obj1.dato2);
        // System.out.println("Cadena "+obj1.cad);
        // System.out.println("\n");


        // clase2 obj2 = new clase2();
        // obj2.dato1 = 33;
        // obj2.cad = "adios";

        // System.out.println("Dato 1 "+obj2.dato1);
        // System.out.println("Dato 2 "+obj2.dato2);
        // System.out.println("Cadena "+obj2.cad);

        clase2 obj1 = new clase2();
        clase2 obj2 = new clase2();
       
        System.out.println("Dato 1: "+obj1.muestra_dato1());
        System.out.println("Dato 2: "+obj1.dato2);
        System.out.println("Cadena: "+obj1.muestra_cadena());
        System.out.println("\n");

        obj1.establece_dato(33);
        obj2.establece_dato2(583);

        System.out.println("Nuevo dato1 = "+obj1.muestra_dato1());
        System.out.println("Nuevo dato2 = "+obj2.muestra_dato2());

        System.out.println("Dato 1: "+obj1.muestra_dato1());
        System.out.println("Dato 2: "+obj2.muestra_dato2());

    }
}
