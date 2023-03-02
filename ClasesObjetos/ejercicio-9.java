class Trompeta{
    int longitud;
    String parte1, parte2, parte3, parte4;

    Trompeta(){
        longitud = 50;
        parte1 = "embocadura";
        parte2 = "pistones";
        parte3 = "tuberías";
        parte4 = "pabellón";
    }
    public static void main(String[] args) {
        Trompeta tromp1 = new Trompeta();
        System.out.println("Longitud "+tromp1.longitud+" cm");
        System.out.println("Parte 1: "+tromp1.parte1);
        System.out.println("Parte 2: "+tromp1.parte2);
        System.out.println("Parte 3: "+tromp1.parte3);
        System.out.println("Parte 4: "+tromp1.parte4);

    }
}