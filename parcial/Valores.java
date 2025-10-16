import java.util.Scanner;

public class Valores {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el primer valor: ");
        double valor1 = sc.nextDouble();

        System.out.print("Ingrese el segundo valor: ");
        double valor2 = sc.nextDouble();

        System.out.print("Ingrese el tercer valor: ");
        double valor3 = sc.nextDouble();

        if (valor1 == valor2 && valor2 == valor3) {
            System.out.println("Los tres valores son iguales.");
        } else {
            double mayor = Math.max(valor1, Math.max(valor2, valor3));
            double menor = Math.min(valor1, Math.min(valor2, valor3));
            double promedio = (valor1 + valor2 + valor3) / 3;

            System.out.println("El mayor valor es: " + mayor);
            System.out.println("El menor valor es: " + menor);
            System.out.println("El promedio es: " + promedio);
        }

        sc.close();
    }
}