package ejercicios.ejercicio1.output;

import ejercicios.ejercicio1.FileManager;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio1 {
    public static void main(String[] args) {
        final var listaInput = FileManager.
                leerFile(new File("src/ejercicios/ejercicio1/input/videojuegos.csv"));

        final var arrayJuegos = convertirListaArray(listaInput);
        ordenarArray(arrayJuegos);
        final var listaJuegosOrdenada = convertirArrayLista(arrayJuegos);

        FileManager.escribirFile(
                new File("src/ejercicios/ejercicio1/output/videojuegosOrdenados.txt"),
                listaJuegosOrdenada
        );
    }

    private static String[] convertirListaArray(List<String> listaJuegos) {
        final var n = listaJuegos.size();

        final var arrayJuegos = new String[n];

        for (var i = 0; i < n; i++) {
            arrayJuegos[i] = listaJuegos.get(i);
        }
        return arrayJuegos;
    }

    private static void ordenarArray(String[] arrayJuegos) {
        final var n = arrayJuegos.length;

        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n - i - 1; j++) {
                if (arrayJuegos[j].compareTo(arrayJuegos[j + 1]) >= 0) {
                    final var temp = arrayJuegos[j];
                    arrayJuegos[j] = arrayJuegos[j + 1];
                    arrayJuegos[j + 1] = temp;
                }
            }
        }
    }

    private static List<String> convertirArrayLista(String[] arrayJuegos) {
        final var lista = new ArrayList<String>();

        for (var juego : arrayJuegos) {
            lista.add(juego);
        }
        return lista;
    }
}
