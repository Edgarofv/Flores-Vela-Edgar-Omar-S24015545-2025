import java.util.Scanner;

public class Temperatura {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la temperatura en grados centígrados: ");
        double centigrados = sc.nextDouble();

        double fahrenheit = (centigrados * 9 / 5) + 32;

        double kelvin = centigrados + 273.15;

        System.out.println("La temperatura en grados Fahrenheit es: " + fahrenheit);
        System.out.println("La temperatura en grados Kelvin (absoluta) es: " + kelvin);

        sc.close();
    }
}