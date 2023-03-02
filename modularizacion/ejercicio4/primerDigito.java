package modularizacion.ejercicio4;

public class primerDigito {
  int numEntero;
  String numCad, result;
  
  primerDigito(int num) {
    numCad = String.valueOf(num);
    result = String.valueOf(numCad.charAt(0)) ;
  }


}