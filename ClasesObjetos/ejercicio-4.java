class silla {
    String tipoSilla;
    String color;
    String material;

    silla() {
        tipoSilla = "butaca";
        color = "negra";
        material = "polipropileno";
    }

    public static void main(String[] args) {
        silla silla1 = new silla();
        System.out.println("Tipo de silla: " + silla1.tipoSilla);
        System.out.println("Color: " + silla1.color);
        System.out.println("Material: " + silla1.material);

    }
}