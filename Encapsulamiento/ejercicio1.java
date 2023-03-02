package Encapsulamiento;

import constructorParametros.EjerciciosConsParametros.triangulo;

class Triangulo {
    private int base, altura, area;

    Triangulo() {
        base = 20;
        altura = 10;
        area = (base * altura) / 2;
    }

    public int base_triangulo() {
        return base;
    }

    public int altura_triangulo() {
        return altura;
    }

    public int area_triangulo() {
        return area;
    }

    public static void main(String[] args) {
        Triangulo trian1 = new Triangulo();

        System.out.println("Base: "+trian1.base);
        System.out.println("Altura: "+trian1.altura);
        System.out.println("Area: "+trian1.area);
    }
}