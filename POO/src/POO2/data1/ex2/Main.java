package POO2.data1.ex2;

import POO2.data1.FileManager;
import POO2.data1.ex2.parser.VideojuegoParser;
import ejercicio2.Videojuego;

import java.io.File;
import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        final var fileInput = new File("src/POO2/data1/ex2/videojuegos.csv");
        final var listaInput = FileManager.leerFile(fileInput);

        final var listaVideojuegos = VideojuegoParser.crearListaVideojuego(listaInput);
        final var listaXbox = filtrarListaXbox(listaVideojuegos);

        System.out.printf("La lista es: %s%n", listaXbox);
    }

    private static List<Videojuego> filtrarListaXbox(List<Videojuego> listaTotal) {
        final var listaXbox = new ArrayList<Videojuego>();
        for (var videojuego : listaTotal) {
            if (videojuego.getEmpresa().equals(Videojuego.Empresa.XBOX)) {
                listaXbox.add(videojuego);
            }
        }
        return listaXbox;
    }

}
