class Libro {
    String nombre, autor, editorial, genero;

    public static void main(String[] args) {
        Libro libro1 = new Libro();
        libro1.nombre = "Cien años de soledad";
        libro1.autor = "Gabriel garcia marques";
        libro1.editorial = "casa blanca";
        libro1.genero = "Romantico";

        System.out.println("Nombre: "+libro1.nombre);
        System.out.println("Autor: "+libro1.autor);
        System.out.println("Editorial: "+libro1.editorial);
        System.out.println("Genero: "+libro1.genero);
    }
}