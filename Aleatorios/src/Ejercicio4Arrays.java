import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio4Arrays {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        final var tamArray = ScannerManager.leerInt(scanner, "Ingrese el tamaño del array");
        final var min = ScannerManager.leerInt(scanner, "Ingrese el min");
        final var max = ScannerManager.leerInt(scanner, "Ingrese el max");
        scanner.close();

        final var arrayRadios = UtilitiesRandom.
                generarRandomArrayDouble(tamArray, min, max, new Random());
        final var arrayPerimetros = calcularArrayPerimetro(arrayRadios);
        final var arrayAreas = calcularArrayArea(arrayRadios);

        imprimirInformacion(arrayRadios, arrayPerimetros, arrayAreas);
    }

    static double[] calcularArrayPerimetro(double[] arrayRadios) {
        final var n = arrayRadios.length;
        final var arrayPerimetros = new double[n];

        for (var i = 0; i < n; i++) {
            arrayPerimetros[i] = 2 * Math.PI * arrayRadios[i];

        }

        return arrayPerimetros;
    }

    static double[] calcularArrayArea(double[] arrayRadios) {
        final var n = arrayRadios.length;
        final var arrayAreas = new double[n];

        for (var i = 0; i < n; i++) {
            arrayAreas[i] = Math.PI * Math.pow(arrayRadios[i], 2);
        }
        return arrayAreas;
    }

    static void imprimirInformacion(double[] arrayRadios, double[] arrayPerimetros,
                                    double[] arrayAreas) {
        System.out.printf("Array radios: %s%n", Arrays.toString(arrayRadios));
        System.out.printf("Array perimetros: %s%n", Arrays.toString(arrayPerimetros));
        System.out.printf("Array areas: %s%n", Arrays.toString(arrayAreas));
    }

}
