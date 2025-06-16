package Herencia;

import Herencia.Ejercicio1.parser.AbogadoParser;
import Herencia.Ejercicio1.parser.DentistaParser;
import Herencia.Ejercicio1.parser.IngenieroParser;
import POO2.data1.FileManager;
import POO2.data1.utilities.UtilitiesRandom;

import java.io.File;
import java.util.Random;

public class Main {
    public static void main(String[] args) {
        final var listaInputIngeniero =
                FileManager.leerFile(new File("src/Herencia/Ejercicio1/input/ingenieros.csv"));
        final var listaInputAbogado =
                FileManager.leerFile(new File("src/Herencia/Ejercicio1/input/abogados.csv"));
        final var listaInputDentista =
                FileManager.leerFile(new File("src/Herencia/Ejercicio1/input/dentistas.csv"));

        final var listaIngenieros = IngenieroParser.generarListaIngeniero(listaInputIngeniero);
        final var listaAbogados = AbogadoParser.generarListaAbogado(listaInputAbogado);
        final var listaDentistas = DentistaParser.generarListaDentista(listaInputDentista);

        final var random = new Random();
        final var randomIndexIngeniero = UtilitiesRandom.generarRandomInt(0, listaIngenieros.size() - 1, random);
        final var randomIndexAbogado = UtilitiesRandom.generarRandomInt(0, listaAbogados.size() - 1, random);
        final var randomIndexDentista = UtilitiesRandom.generarRandomInt(0, listaDentistas.size() - 1, random);

        System.out.printf("Random ingeniero: %s%n", listaIngenieros.get(randomIndexIngeniero));
        System.out.printf("Random dentista: %s%n", listaDentistas.get(randomIndexDentista));
        System.out.printf("Random abogado: %s%n", listaAbogados.get(randomIndexAbogado));
    }
}
