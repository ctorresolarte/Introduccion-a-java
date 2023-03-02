class serHumano{
    String genero;
    String color;
    String pais;

    serHumano(){
        genero = "hombre";    
        color = "negro";
        pais = "colombia";
    }

    public static void main(String[] args) {
        serHumano humano = new serHumano();
        System.out.println("Genero "+humano.genero);
        System.out.println("Color "+humano.color);
        System.out.println("Pais "+humano.pais);
    }
}
