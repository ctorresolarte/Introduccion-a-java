class computador{
    String procesador;
    byte ram;
    int discoDuro;

    computador(){
        procesador = "Intel";
        ram = 16;
        discoDuro = 516;
    }
    
    public static void main(String[] args) {
            computador computador1 = new computador();
            System.out.println("Pocesador: "+computador1.procesador);
            System.out.println("Ram: "+computador1.ram);
            System.out.println("Disco duro: "+computador1.discoDuro);
    }
}
