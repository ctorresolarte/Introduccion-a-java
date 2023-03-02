package constructorParametros.EjerciciosConsParametros.ejercicio3;

public class pentagono {
    double lado, apotema, area;

    pentagono(double l, double a){
        lado = l;
        apotema = a;
        area = 5*((lado*apotema)/2);
    }
}

class pentagono1{
    public static void main(String[] args) {
        pentagono pentagono1 = new pentagono(5, 2);
        System.out.println("Area: " +pentagono1.area);
        System.out.println("Lado: "+pentagono1.lado);
        System.out.println("Apotema: "+pentagono1.apotema);

    }
}
