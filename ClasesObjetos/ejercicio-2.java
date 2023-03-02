class fruta{
    String nombreFruta;
    String color;
    double precio;
    
    fruta(){
        nombreFruta = "manzana";
        color = "verde";
        precio = 1500;
    }

    public static void main(String[] args) {
        fruta fruta1 = new fruta();
        System.out.println("La fruta es "+fruta1.nombreFruta);
        System.out.println("El color de la "+fruta1.nombreFruta+" es "+ fruta1.color);
        System.out.println("El precio de la "+fruta1.nombreFruta+" es "+fruta1.precio);

    }
}
