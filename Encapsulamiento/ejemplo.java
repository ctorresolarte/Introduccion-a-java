package Encapsulamiento;

class clase2 {
//  int dato1, dato2;
//  String cad;

//  clase2(){
//     dato1 = 10;
//     dato2 = 20;
//     cad = "hola";
//  }

    private int dato1;
    private int dato2;
    private String cad;

    public clase2() {
        dato1 = 10;
        dato2 = 20;
        cad = "hola";
    }

    public int muestra_dato1() {// metodo getter
        return dato1;
    }
    public int muestra_dato2() {// metodo getter
        return dato2;
    }
    public String muestra_cadena() {// metodo getter
        return cad;
    }


    public void establece_dato(int d) {//metodo setter
        dato1 = d;
    }
    public void establece_dato2(int d) {//metodo setter
        dato2= d;
    }
}
