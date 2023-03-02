package constructorParametros.EjerciciosConsParametros;

class hexagono {
    double lado, apotema, area, perimetro;

    hexagono(double l, double a) {
        lado = l;
        apotema = a;
        perimetro = lado * 6;
        area = (perimetro * apotema) / 2;
    }

    public static void main(String[] args) {
        hexagono hexagono1 = new hexagono(6, 5);
        System.out.println("Hexagono 1");
        System.out.println("Lado " + hexagono1.lado);
        System.out.println("Apotema " + hexagono1.apotema);
        System.out.println("Perimetro " + hexagono1.perimetro);
        System.out.println("Area " + hexagono1.area);
        System.out.println("\n");

        
        hexagono hexagono2 = new hexagono(12, 25);
        System.out.println("Hexagono 2");
        System.out.println("Lado " + hexagono2.lado);
        System.out.println("Apotema " + hexagono2.apotema);
        System.out.println("Perimetro " + hexagono2.perimetro);
        System.out.println("Area " + hexagono2.area);
    }
}
