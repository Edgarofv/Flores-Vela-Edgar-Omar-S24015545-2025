import java.util.Scanner;

public class Salario {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese su salario mensual: ");
        double salarioMensual = sc.nextDouble();

        double incremento = salarioMensual * 0.25;
        double nuevoSalario = salarioMensual + incremento;

        System.out.println("El incremento es: $" + incremento);
        System.out.println("El nuevo salario es: $" + nuevoSalario);

        sc.close();
    }
}
