import java.util.Scanner;

public class Universidad {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la nota numérica (0.0 - 5.0): ");
        double nota = sc.nextDouble();

        if (nota >= 0.0 && nota <= 1.0) {
            System.out.println("Valoración: P (Pésimo)");
        } else if (nota > 1.0 && nota <= 2.0) {
            System.out.println("Valoración: M (Mal)");
        } else if (nota > 2.0 && nota <= 2.9) {
            System.out.println("Valoración: R (Regular)");
        } else if (nota >= 3.0 && nota <= 4.0) {
            System.out.println("Valoración: B (Bien)");
        } else if (nota > 4.0 && nota <= 5.0) {
            System.out.println("Valoración: E (Excelente)");
        } else {
            System.out.println("Nota no disponible intente de nuevo");
        }

        sc.close();
    }
}
