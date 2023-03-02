package Encapsulamiento;

 class pentagono {
    private int lado, apotema, area, perimetro;

    pentagono(){
        lado = 20;
        apotema = 17;
        area = ((lado*5)*apotema)/2;
        perimetro = lado*5;
    }

    public int lado_penta(){//metodo get
        return lado;
    }
    public int apot_penta(){//metodo get
        return apotema;
    }
    public int area_penta(){//metodo get
        return area;
    }
    public int peri_penta(){//metodo get
        return perimetro;
    }

    public static void main(String[] args) {
        pentagono penta1 = new pentagono();
        
        System.out.println("Area = "+penta1.area);
        System.out.println("Lado = "+penta1.lado);
        System.out.println("Apotema = "+penta1.apotema);
        System.out.println("Perimetro = "+penta1.perimetro);

    }
}
