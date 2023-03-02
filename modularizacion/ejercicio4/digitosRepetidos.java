package modularizacion.ejercicio4;

public class digitosRepetidos {
  int numero;
  char repetido;
  String numCad;

  digitosRepetidos(int num) {

    numCad = String.valueOf(num);
    char[] cadena = numCad.toCharArray();

    for (int i = 0; i < cadena.length; i++) {
      for (int j = i + 1; j < cadena.length; j++) {
        if (cadena[i] == cadena[j]) {
          repetido = cadena[i];
        }
      }
    }
  }

}