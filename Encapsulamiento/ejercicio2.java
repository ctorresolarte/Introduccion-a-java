package Encapsulamiento;

class Triangulo2 {
    private int base, altura, area;

    Triangulo2(){
        base = 50;
        altura = 30;
        area = (base*altura)/2;
    }

    public int Base_triangulo(){
        return base;
    }
    public int Altura_trinagulo(){
        return altura;
    }
    public int Area_triangulo(){
        return area;
    }

    public static void main(String[] args) {
        Triangulo2 trian = new Triangulo2();

        System.out.println("area: "+trian.area);
    }
}
