import java.util.Scanner;

public class NumeroN {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        System.out.println("El número ingresado es: " + numero);
        System.out.println(numero % 2 == 0 ? "El número es Par." : "El número No es Par.");

        sc.close();
    }
}