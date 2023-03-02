package condicinales;

public class TestIR {
    public static void main(String[] args) {
        double salario = 3300.0;
        double impuestoRenta;

        if (salario >= 1900.0 && salario <= 2800) {
            impuestoRenta = salario * (7.5 / 100);
                System.out.println("El valor del impuesto de renta a pagar es: " + impuestoRenta);
            int deducible = 142;
                System.out.println("Pero puedes deducir " + deducible + " y te quedaria en " + (impuestoRenta - deducible));
        } 
         else if (salario >= 2800.01 && salario <= 3751.0) {
            impuestoRenta = salario *(15/100);
                System.out.println("El valor del impuesto de renta a pagar es: " + impuestoRenta);
            int deducible = 350;
                System.out.println("Pero puedes deducir " + deducible + " y te quedaria en " + (impuestoRenta - deducible));
        }
        else if (salario >= 3751.01 && salario <= 4664.00) {
            impuestoRenta = salario * (22.5 / 100);
                System.out.println("El valor del impuesto de renta a pagar es: " + impuestoRenta);
            int deducible = 636;
                System.out.println("Pero puedes deducir " + deducible + " y te quedaria en " + (impuestoRenta - deducible));
        }
    }
}
