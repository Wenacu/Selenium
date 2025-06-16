package ejercicios.ejercicio4;

import ejercicios.ejercicio1.FileManager;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {
    public static void main(String[] args) {
        final var listaInput = FileManager.
                leerFile(new File("src/ejercicios/ejercicio4/input/nombres.csv"));

        final var listaGanadores = obtenerGanadores(listaInput);

        FileManager.escribirFile(
                new File("src/ejercicios/ejercicio4/output/ganadores.txt"), listaGanadores
        );
    }

    private static List<String> obtenerGanadores(List<String> listaNombres) {
        final var listaGanadores = new ArrayList<String>();
        for (var nombre : listaNombres) {
            if (nombre.startsWith("T") && nombre.endsWith("O")) {
                listaGanadores.add(nombre);
            }
        }

        return listaGanadores;
    }
}
