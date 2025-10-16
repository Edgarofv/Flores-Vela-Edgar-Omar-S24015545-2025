import java.util.Scanner;

public class Comisiones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        double totalComision = 0;

        System.out.println("Ingrese el valor de las 4 ventas realizadas:");

        for (int i = 1; i <= 4; i++) {
            System.out.print("Venta " + i + ": ");
            double venta = sc.nextDouble();

            double comision = 0;
            if (venta <= 10000000) {
                comision = venta * 0.02; 
            } else if (venta < 15000000) {
                comision = venta * 0.04; 
            } else {
                comision = venta * 0.10; 
            }

            totalComision += comision;
        }

        System.out.println("La comisión total del vendedor es: $" + totalComision);

        sc.close();
    }
}