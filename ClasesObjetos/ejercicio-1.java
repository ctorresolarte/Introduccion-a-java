class casa{
    double areaConstruida;
    String direccion;
    String color; 

    casa(){
        areaConstruida = 456.7;
        direccion= "cll walabi 42 sidney";
        color ="yellow";
    }

public static void main(String[] args) {
    casa propiedadesCasa = new casa();
    // propiedadesCasa.areaConstruida = 456.2;
    // propiedadesCasa.direccion = "cll-22#6-47";
    // propiedadesCasa.color = "roja";

    System.out.println("el area de la casa es de " + propiedadesCasa.areaConstruida+ " mts^2");
    System.out.println("la direccion de la casa es " + propiedadesCasa.direccion);
    System.out.println("el color de la casa es " + propiedadesCasa.color);
}
}
