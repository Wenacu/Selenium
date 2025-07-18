import java.util.Arrays;

public class Ejercicio1Strings {
    public static void main(String[] args) {
        final var arrayNombres = crearData();
        mostrarArray(arrayNombres);
        ordenarArray(arrayNombres);
        mostrarArray(arrayNombres);
    }

    static String[] crearData() {
        return new String[]{"Carlos", "Rodrigo", "Juan", "Arturo", "Daniel", "Mayra"};
    }

    static void ordenarArray(String[] array) {
        final var n = array.length;

        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n - i - 1; j++) {
                //preguntamos si el actual es mayor alfabéticamente que el siguiente
                if (array[j].compareTo(array[j + 1]) >= 0) {
                    final var temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }
        }
    }

    static void mostrarArray(String[] array) {
        System.out.printf("El array es: %s%n", Arrays.toString(array));
    }
}
