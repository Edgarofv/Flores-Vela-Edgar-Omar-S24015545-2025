import java.util.Scanner;

public class Descuento {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el precio del producto: ");
        double precio = sc.nextDouble();
        double descuento = 0.15;
        double precioFinal = precio - (precio * descuento);
        System.out.print("El precio final con descuento es " + precioFinal);
        sc.close();
    }
}

