package Herencia.Ejercicio2;

import Herencia.Ejercicio2.parser.CirculoParser;
import Herencia.Ejercicio2.parser.CuadroParser;
import Herencia.Ejercicio2.parser.TrianguloParser;
import POO2.data1.FileManager;
import POO2.data1.utilities.UtilitiesRandom;

import java.io.File;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final var listaInputCirculo =
                FileManager.leerFile(new File("src/Herencia/Ejercicio2/input/circulos.csv"));
        final var listaInputCuadrado =
                FileManager.leerFile(new File("src/Herencia/Ejercicio2/input/cuadrados.csv"));
        final var listaInputTriangulo =
                FileManager.leerFile(new File("src/Herencia/Ejercicio2/input/triangulos.csv"));

        final var listaCirculos = CirculoParser.generarListaCirculo(listaInputCirculo);
        final var listaCuadrados = CuadroParser.generarListaCuadrado(listaInputCuadrado);
        final var listaTriangulos = TrianguloParser.generarListaTriangulo(listaInputTriangulo);

        final var random = new Random();
        final var randomIndexCirculo = UtilitiesRandom.generarRandomInt(0, listaCirculos.size() - 1, random);
        final var randomIndexCuadrados = UtilitiesRandom.generarRandomInt(0, listaCuadrados.size() - 1, random);
        final var randomIndexTriangulos = UtilitiesRandom.generarRandomInt(0, listaTriangulos.size() - 1, random);

        System.out.printf("Random circulo: %s%n", listaCirculos.get(randomIndexCirculo));
        System.out.printf("Random cuadrados: %s%n", listaCuadrados.get(randomIndexCuadrados));
        System.out.printf("Random triangulos: %s%n", listaTriangulos.get(randomIndexTriangulos));
    }
}
