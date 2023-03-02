package constructorParametros.EjerciciosConsParametros;

class Octagono{
    double lado, apotema, area, perimetro;

    Octagono(double l, double a){
        lado = l;
        apotema = a;
        area = 4*(apotema*lado);
        perimetro = 8*lado;
    }

    public static void main(String[] args) {
        Octagono octa1 = new Octagono(12, 6);
        System.out.println("Area "+octa1.area);
        System.out.println("Lado "+octa1.lado);
        System.out.println("Apotema "+octa1.apotema);
        System.out.println("Perimetro "+octa1.perimetro);

    }
}