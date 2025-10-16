import java.util.Scanner;

public class ConvertidorMetros {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Ingrese la cantidad en metros que desea convertir: ");
        double metros = sc.nextDouble(); 
        double pulgadas = metros * 39.37; 
        System.out.println("La cantidad en pulgadas es: " + pulgadas);
        sc.close();
    }
}