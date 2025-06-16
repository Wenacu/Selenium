import java.util.Scanner;

public class EjercicioComparacion3 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var numeroLeido = ScannerManager.leerInt(scanner, "Ingrese numero");
        scanner.close();

        imprimirResultado(numeroLeido, esPar(numeroLeido), esMultiplo5(numeroLeido));

    }

    static boolean esPar(int numero) {
        return numero % 2 == 0;
    }

    static boolean esMultiplo5(int numero) {
        return numero % 5 == 0;
    }

    static void imprimirResultado(int numero, boolean esPar, boolean esMultiplo5) {
        System.out.printf("El numero %d es par? %b%n", numero, esPar);
        System.out.printf("El numero %d es multiplo de 5? %b%n", numero, esMultiplo5);
    }
}
