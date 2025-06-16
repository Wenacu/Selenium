import java.util.Scanner;

public class EjercicioBancario {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var montoInicial = ScannerManager.leerDouble(scanner, "Ingrese el monto inicial");
        scanner.close();


        imprimirResultado(montoInicial, calcularMonto(montoInicial));
    }

    static double calcularMonto(double montoInicial) {
        final var aumento1 = (montoInicial % 2 == 0) ? montoInicial * 0.1 : 0; //si es par se le aumenta 10%
        final var aumento2 = (montoInicial % 3 == 0) ? 500 : 0; //si e sun multiplo de 3 se aumenta 500
        final var aumento3 = (montoInicial > 500) ? 300 : 0; //si es mayor que 500 se le aumenta 300

        return montoInicial + aumento1 + aumento2 + aumento3;
    }

    static void imprimirResultado(double montoInicial, double montoFinal) {
        System.out.printf("Para el prestamo inicial %.2f se le cobrara un monto final de %.2f%n",
                montoInicial, montoFinal);

    }
}
