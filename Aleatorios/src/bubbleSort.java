import java.util.Arrays;
import java.util.Random;

public class bubbleSort {
    public static void main(String[] args) {
        final var arrayAleatorio = UtilitiesRandom.
                generarRandomArrayInt(30, 10, 500, new Random());

        imprimirInformacion(arrayAleatorio);
        ordenarArray(arrayAleatorio);
        imprimirInformacion(arrayAleatorio);
    }

    static void ordenarArray(int[] array) {
        final var n = array.length;

        for (var i = 0; i < n; i++) { //pasos
            for (var j = 0; j < n - i - 1; j++) { //subpasos
                if (array[j] > array[j + 1]) { //preguntamos si esta desordenado
                    final var temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    static void imprimirInformacion(int[] array) {
        System.out.printf("%s%n", Arrays.toString(array));
    }
}
