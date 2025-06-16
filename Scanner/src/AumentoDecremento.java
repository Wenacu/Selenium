import java.util.Scanner;

public class AumentoDecremento {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        var numero = ScannerManager.leerInt(scanner, "Ingrese un numero");

        scanner.close();

        //Incrementamos en 1
        numero++;

        System.out.printf("El numero es: %d%n", numero);

    }
}
