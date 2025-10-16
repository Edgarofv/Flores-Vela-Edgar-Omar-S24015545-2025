import java.util.Scanner;

public class NumeroPrimo {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.print("Ingrese un número: ");
        int numero = sc.nextInt();

        boolean esPrimo = true;

        if (numero <= 1) {
            esPrimo = false; 
        } else {
            for (int i = 2; i <= Math.sqrt(numero); i++) {
                if (numero % i == 0) {
                    esPrimo = false;
                    break;
                }
            }
        }
        
        System.out.println(esPrimo ? "El número es Primo." : "El número No es Primo.");

        sc.close();
    }
}