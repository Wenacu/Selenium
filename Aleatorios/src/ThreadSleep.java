import java.util.Scanner;

public class ThreadSleep {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var numeroLeido = ScannerManager.
                leerInt(scanner, "Ingrese el tiempo del contador");
        scanner.close();

        mostrarContador(numeroLeido);

    }

    static void esperar(long n) {
        try {
            Thread.sleep(n * 1000);
        } catch (InterruptedException interruptedException) {
            System.err.printf("InterruptedException: %s%n",
                    interruptedException.getLocalizedMessage());
            System.out.println("Error al esperar");
        }
    }

    static void mostrarContador(int n) {
        for (var i = 0; i < n; i++) {
            System.out.println(i + 1);
            esperar(1); //esperar un segundo con el método

        }
    }
}
