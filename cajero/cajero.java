package cajero;

import java.util.*;

// import javax.swing.*;
public class cajero {
    public static void main(String[] args) {
        byte opcion;
        int contCuenta = 5000000;
        int numTelefono = 2105738782;
        Scanner teclado = new Scanner(System.in);
        teclado.close();

        System.out.println("BIENVENIDO A BANCOLOMBIA");
        System.out.println("=================================");
        System.out.println("Escoja una opcion para continuar");
        System.out.println("=================================");
        System.out.println("1. Retiros nequi");
        System.out.println("2. opcion 2");
        System.out.println("3. opcion 3");
        System.out.println("4. opcion 4");

        System.out.println("opcion");
        opcion = teclado.nextByte();

        switch (opcion) {
            case 1:
                System.out.println("Ingrese numero de telefono");
                int telefono = teclado.nextInt();

                if (telefono == numTelefono) {
                    System.out.println("Su cuenta posee un saldo de $ " + contCuenta);
                    double cod = Math.random() * 999999;
                    int numConver = (int) cod;
                    System.out.println("Su codigo para retirar es: " + numConver);
                    System.out.println("Seleccione el monto a retirar");
                    System.out.println("=================================");
                    System.out.println("1.10000");
                    System.out.println("2.20000");
                    System.out.println("3.50000");
                    System.out.println("4.100000");
                    System.out.println("5.200000");
                    System.out.println("6.Otro");
                    System.out.println("=================================");
                    System.out.println("Opcion");
                    opcion = teclado.nextByte();

                    switch (opcion) {
                        case 1:
                            int valRetiro = 10000;
                            System.out.println("Ingrese el codigo: ");
                            int codIngresado = teclado.nextInt();
                            short intentos = 1;
                            if (codIngresado != numConver) {
                                while (intentos < 3) {
                                    System.out.println("Codigo erroneo, ingrese nuevamente el codigo: ");
                                    codIngresado = teclado.nextInt();
                                    intentos++;
                                    if (intentos == 3) {
                                        System.out.println("Intentelo mas tarde");
                                    }
                                }
                            } else {
                                System.out.println("RETIRO EXITOSO!!!");
                                System.out.println("=================================");
                                System.out.println("Desea ver su saldo?");
                                System.out.println("1. Si");
                                System.out.println("2. No");
                                opcion = teclado.nextByte();

                                if (opcion == 1) {
                                    System.out.println("Su saldo es: " + (contCuenta - valRetiro));
                                } else {
                                    System.out.println("Gracias por usar nuestros servicios");
                                }
                            }
                            break;
                    }

                } else {
                    System.out.println("Error...Tu numero no coincide.");
                }
                break;
        }
    }
}