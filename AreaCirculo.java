import java.util.Scanner;

public class AreaCirculo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Ingrese el valor del radio de la circunferencia: ");
        double radio = sc.nextDouble();
        final double PI = 3.1416;
        
        double longitud = 2 * PI * radio;
        double area = PI * Math.pow(radio, 2);
        
        System.out.println("La longitud de la circunferencia es: " + longitud);
        System.out.println("El área del círculo es: " + area);
        sc.close();
    }
}