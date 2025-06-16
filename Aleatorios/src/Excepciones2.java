import java.util.Arrays;
import java.util.Random;

public class Excepciones2 {
    public static void main(String[] args) {
        final var random = new Random();

        final var array1 = UtilitiesRandom.generarRandomArrayInt(15, 0, 6, random);
        mostrarArray(array1);

        final var array2 = UtilitiesRandom.generarRandomArrayInt(15, 0, 6, random);
        mostrarArray(array2);

        final var arrayDivision = dividirArrays(array1, array2);
        mostrarArray(arrayDivision);
    }

    static int[] dividirArrays(int[] array1, int[] array2) {
        final var n = array1.length;
        final var arrayDivision = new int[n];

        for (var i = 0; i < n; i++) {
            int cociente;

            try {
                cociente = array1[i] / array2[i]; //lanza posible excepcion
            } catch (ArithmeticException arithmeticException) {
                cociente = -1; //si cae asignamos -1
            }

            arrayDivision[i] = cociente;

        }

        return arrayDivision;
    }

    static void mostrarArray(int[] array) {
        System.out.printf("El array es: %s%n", Arrays.toString(array));

    }
}
