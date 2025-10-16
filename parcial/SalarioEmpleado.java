import java.util.Scanner;

public class SalarioEmpleado {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Categorías de empleados:");
        System.out.println("1. Categoría $20.000 por hora");
        System.out.println("2. Categoría $15.000 por hora");
        System.out.println("3. Categoría $10.000 por hora");
        System.out.println("4. Categoría $7.500 por hora");

        System.out.print("Ingrese la categoría del empleado (1-4): ");
        int categoria = sc.nextInt();

        System.out.print("Ingrese el número de horas trabajadas durante el mes: ");
        int horasTrabajadas = sc.nextInt();

        double salarioPorHora = 0;
        switch (categoria) {
            case 1:
                salarioPorHora = 20000;
                break;
            case 2:
                salarioPorHora = 15000;
                break;
            case 3:
                salarioPorHora = 10000;
                break;
            case 4:
                salarioPorHora = 7500;
                break;
            default:
                System.out.println("Opcion no válida.");
                sc.close();
                return;
        }

        double salarioMensual = salarioPorHora * horasTrabajadas;

        double descuentoSalud = salarioMensual * .072;
        double salarioConDescuento = salarioMensual - descuentoSalud;
        // Ya no quiero seguir :(
        double subsidio = 0;
        if (salarioMensual < 1000000) {
            subsidio = salarioMensual * .15;
        }

        double salarioFinal = salarioConDescuento + subsidio;

        System.out.println("\n=== Detalles del salario ===");
        System.out.println("Salario mensual (Sin Descuentos): $" + salarioMensual);
        System.out.println("Descuento por salud: $" + descuentoSalud);
        System.out.println("Subsidio: $" + subsidio);
        System.out.println("Salario final: $" + salarioFinal);

        sc.close();
    }
}