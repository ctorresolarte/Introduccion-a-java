class empleado{
    String nombre;
    String cargo;
    byte edad;
    int documento;

    public static void main(String[] args) {
        empleado empleado1 = new empleado();
        empleado1.nombre = "Carlos arturo";
        empleado1.cargo = "Operario corte y embalaje";
        empleado1.edad = 23;
        empleado1.documento = 1099215695;

        System.out.println("Nombre: "+empleado1.nombre);
        System.out.println("Cargo: "+empleado1.cargo);
        System.out.println("Edad: "+empleado1.edad);
        System.out.println("Documento: "+empleado1.documento);

    }
}
