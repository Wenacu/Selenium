import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class Ejercicio1Arrays {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        final var tamArray = ScannerManager.leerInt(scanner, "Ingrese el tamaño del array");
        final var min = ScannerManager.leerInt(scanner, "Ingrese el min");
        final var max = ScannerManager.leerInt(scanner, "Ingrese el max");
        final var escalar = ScannerManager.leerInt(scanner, "Ingrese el escalar");

        scanner.close();

        final var arrayOriginal = UtilitiesRandom.generarRandomArrayInt(tamArray, min, max, new Random());

        final var arrayNuevo = calcularProductoEscalar(arrayOriginal, escalar);

        imprimirInformacion(arrayOriginal, arrayNuevo);


    }

    static int[] calcularProductoEscalar(int[] array, int escalar) {
        final var n = array.length;
        final var nuevoArray = new int[n]; //misma logitud que el array original

        for (var i = 0; i < n; i++) {
            nuevoArray[i] = array[i] * escalar; //multiplico cada casilla por el escalar
        }

        return nuevoArray;
    }

    static void imprimirInformacion(int[] arrayOriginal, int[] arrayNuevo) {
        System.out.printf("El array original es: %s%n", Arrays.toString(arrayOriginal));
        System.out.printf("El array nuevo es: %s%n", Arrays.toString(arrayNuevo));
    }

}
