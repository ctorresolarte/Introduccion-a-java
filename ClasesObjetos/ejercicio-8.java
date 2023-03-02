class ciudad{
    String nombre, departamento;
    double temperatura, poblacion;

    ciudad(){
        nombre = "cucuta";
        departamento = "santander";
        temperatura = 25;
        poblacion = 1111111;
    }

    public static void main(String[] args) {
        ciudad ciudad1 = new ciudad();
        System.out.println("Ciudad: "+ciudad1.nombre);
        System.out.println("Departamento: "+ciudad1.departamento);
        System.out.println("Temperatura: "+ciudad1.temperatura);
        System.out.println("Poblacion: "+ciudad1.poblacion);
    }
}
