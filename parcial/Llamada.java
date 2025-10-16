import java.util.Scanner;

public class Llamada {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la duración de la llamada en minutos: ");
        int minutos = sc.nextInt();

        double costo;

        if (minutos <= 3) {
            costo = 10.00; 
        } else {
            costo = 10.00 + (minutos - 3) * 1.00; 
        }

        System.out.println("El costo total de la llamada es: $" + costo);

        sc.close();
    }
}
