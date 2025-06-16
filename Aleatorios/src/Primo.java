import java.util.Scanner;

public class Primo {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var n = ScannerManager.leerInt(scanner,
                "Ingrese un numero para verificar si es primo");
        scanner.close();

        final var esPrimo = esPrimo(n);
        System.out.printf("El numero %d es primo? %b%n", n, esPrimo);

    }

    static boolean esPrimo(int n) {
        var i = 2; //i es la cantidad de divisores

        while (i < n) {
            if (n % i != 0) {
                i++;
            } else {
                return false;
            }
        }
        return true;
    }
}
