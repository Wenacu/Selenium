import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio2Arrays {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        final var tamArray = ScannerManager.leerInt(scanner, "Ingrese el tamaño del array");
        final var min = ScannerManager.leerInt(scanner, "Ingrese el min");
        final var max = ScannerManager.leerInt(scanner, "Ingrese el max");

        scanner.close();

        final var random = new Random();
        final var array1 = UtilitiesRandom.generarRandomArrayInt(tamArray, min, max, random);
        final var array2 = UtilitiesRandom.generarRandomArrayInt(tamArray, min, max, random);
        final var arraySuma = calcularSumaArray(array1, array2);

        imprimirInformacion(array1, array2, arraySuma);

    }

    static int[] calcularSumaArray(int[] array1, int[] array2) {
        final var n = array1.length;
        final var arraySuma = new int[n];

        for (var i = 0; i < n; i++) {
            arraySuma[i] = array1[i] + array2[i];
        }

        return arraySuma;
    }

    static void imprimirInformacion(int[] array1, int[] array2, int[] arraySuma) {
        System.out.printf("array1: %s%n", Arrays.toString(array1));
        System.out.printf("array2: %s%n", Arrays.toString(array2));
        System.out.printf("array suma: %s%n", Arrays.toString(arraySuma));
    }
}
