package ciclos.ciclo_DoWhile;

import java.util.Scanner;

class numPrimos {
  public static void main(String[] args) {
    Scanner tec = new Scanner(System.in);
    int i = 0, divisor = 1, j = 0;
    String num;

    System.out.println("ingrese un numero");
    num = tec.nextLine();
    tec.close();
    do {
      if (num.charAt(i) % divisor == 0) {
        j++;
      } else {

      }
      i++;
    } while (j < num.length());
    j++;

    // do {
    // if (num.charAt(i) % divisor == 0) {
    // cont++;
    // }
    // if (cont == 2) {
    // System.out.println(num.charAt(i)+" es primo");
    // } else {
    // System.out.println(num.charAt(i)+" no es primo");
    // }
    // i++;
    // divisor++;
    // } while (i < num.length() - 1);

  }
}