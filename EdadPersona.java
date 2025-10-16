import java.util.Scanner;

public class EdadPersona {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese el año de nacimiento: ");
        int añoNacimiento = sc.nextInt();

        System.out.print("Ingrese el año actual: ");
        int añoActual = sc.nextInt();

        int edad = añoActual - añoNacimiento;

        System.out.println("La edad de la persona es: " + edad + " años.");

        sc.close();
    }
}