import java.util.Scanner;

public class Fibonacci {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var n = ScannerManager.leerInt(scanner,
                "Ingrese cantidad numeros serie de fibonacci");
        scanner.close();

        mostrarSerieFibonacci(n);
    }

    static void mostrarSerieFibonacci(int n) {
        //declarando los primeros numeros
        var anterior = 0;
        var actual = 1;

        //mostrando los 2 primeros números
        System.out.printf("%d %d ", anterior, actual);

        //mostrando los siguientes
        for (var i = 0; i < n; i++) {
            final var temp = anterior + actual;
            anterior = actual;
            actual = temp;
            System.out.printf("%d ", actual);
        }
    }
}
