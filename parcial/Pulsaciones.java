import java.util.Scanner;

public class Pulsaciones {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese su edad: ");
        int edad = sc.nextInt();
        int pulsaciones = (220 - edad) / 10;
        System.out.println("El número de pulsaciones por cada 10 segundos de ejercicio es: " + pulsaciones);
        sc.close();
    }
}
