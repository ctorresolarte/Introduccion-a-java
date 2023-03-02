class carro {
    String marca;
    int modelo;
    String placa;
    String color;
    String tipoVehiculo;

    public static void main(String[] args) {
        carro carro1 = new carro();
        carro1.marca = "Hyundai";
        carro1.modelo = 2001;
        carro1.placa = "akd321";
        carro1.color = "gris";
        carro1.tipoVehiculo = "sedan";

        System.out.println("Marca "+carro1.marca);
        System.out.println("Modelo "+carro1.modelo);
        System.out.println("Placa "+ carro1.placa);
        System.out.println("Color "+carro1.color);
        System.out.println("Tipo de vehiculo "+carro1.tipoVehiculo);
    }
}
