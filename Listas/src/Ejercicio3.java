import java.util.List;
import java.util.Random;

public class Ejercicio3 {
    public static void main(String[] args) {
        final var lista = RandomUtilities.
                generarListaIntAleatoria(30, 10, 500, new Random());

        imprimirLista(lista);
        ordenarLista(lista);
        imprimirLista(lista);
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

    static void ordenarLista(List<Integer> lista) {
        final var n = lista.size();

        for (var i = 0; i < n; i++) { //pasos
            for (var j = 0; j < n - i - 1; j++) { //subpasos
                if (lista.get(j) > lista.get(j + 1)) { //pregunat si esta desordenado
                    final var temp = lista.get(j);
                    lista.set(j, lista.get(j + 1));
                    lista.set(j + 1, temp);
                }
            }
        }
    }

    static void imprimirLista(List<Integer> lista) {
        System.out.printf("La lista es: %s%n", lista);
    }
}
