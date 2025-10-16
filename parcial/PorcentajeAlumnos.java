import java.util.Scanner;

public class PorcentajeAlumnos {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese la cantidad de hombres en el grupo: ");
        int hombres = sc.nextInt();

        System.out.print("Ingrese la cantidad de mujeres en el grupo: ");
        int mujeres = sc.nextInt();

        int totalEstudiantes = hombres + mujeres;

        double porcentajeHombres = (hombres * 100) / totalEstudiantes;
        double porcentajeMujeres = (mujeres * 100) / totalEstudiantes;

        System.out.println("El porcentaje de hombres es: " + porcentajeHombres + "%");
        System.out.println("El porcentaje de mujeres es: " + porcentajeMujeres + "%");

        sc.close();
    }
}