package ejercicios.ejercicio3;

import ejercicios.ejercicio1.FileManager;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio3 {
    public static void main(String[] args) {
        final var listaInput = FileManager.
                leerFile(new File("src/ejercicios/ejercicio3/input/notas.csv"));

        final var listaAlto = new ArrayList<String>();
        final var listaMedio = new ArrayList<String>();
        final var listaBajo = new ArrayList<String>();

        rellenarListaNotas(listaInput, listaAlto, listaMedio, listaBajo);

        FileManager.escribirFile(
                new File("src/ejercicios/ejercicio3/output/notasAlta.txt"), listaAlto
        );
        FileManager.escribirFile(
                new File("src/ejercicios/ejercicio3/output/notasMedia.txt"), listaMedio
        );
        FileManager.escribirFile(
                new File("src/ejercicios/ejercicio3/output/notasBaja.txt"), listaBajo
        );
    }

    private static void rellenarListaNotas(
            List<String> listaInput,
            List<String> listaAlto,
            List<String> listaMedio,
            List<String> listaBajo
    ) {
        for (var alumno : listaInput) {
            final var arrayData = alumno.split(","); //Se usa la coma para separar

            final var nombre = arrayData[0];
            final var nota = Integer.parseInt(arrayData[1]);

            final var calificacion = calificarAlumno(nota);

            //se agrega el nombre a alista segun la calificacion
            switch (calificacion) {
                case ALTO -> listaAlto.add(nombre);
                case MEDIO -> listaMedio.add(nombre);
                case BAJO -> listaBajo.add(nombre);
            }
        }
    }

    private static Nota calificarAlumno(int nota) {
        if (nota >= 16) {
            return Nota.ALTO;
        } else if (nota >= 10) {
            return Nota.MEDIO;
        } else {
            return Nota.BAJO;
        }

    }

    private enum Nota {
        ALTO,
        MEDIO,
        BAJO
    }
}

