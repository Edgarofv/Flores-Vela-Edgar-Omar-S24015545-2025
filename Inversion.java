import java.util.Scanner;

public class Inversion {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el capital a invertir: ");
        double capital = sc.nextDouble();
        double tasaInteres = 0.02;
        double ganancia = capital * tasaInteres;
        double total = capital + ganancia;

        System.out.println("La ganancia después de un mes es: $" + ganancia);
        System.out.println("El total después de un mes es: $" + total);

        sc.close();
    }
}