import java.util.Scanner;

public class Supermercado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el total de la compra: ");
        double totalCompra = sc.nextDouble();

        System.out.print("Ingrese el número escogido al azar: ");
        int numero = sc.nextInt();

        double descuento = numero < 74 ? totalCompra * 0.15 : totalCompra * 0.20;
        double totalConDescuento = totalCompra - descuento;

        System.out.println("\n=== Detalles de la compra ===");
        System.out.println("Total de la compra: $" + totalCompra);
        System.out.println("Descuento aplicado: $" + descuento);
        System.out.println("Total a pagar: $" + totalConDescuento);

        sc.close();
    }
}