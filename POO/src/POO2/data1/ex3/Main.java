package POO2.data1.ex3;

import POO2.data1.FileManager;
import POO2.data1.ex3.parser.VectorParser;

import java.io.File;

public class Main {
    public static void main(String[] args) {
        final var fileInput = new File("src/POO2/data1/ex3/vectores.csv");
        final var listaInput = FileManager.leerFile(fileInput);

        final var mapVector = VectorParser.crearMapVector(listaInput);

        final var vectorLorenzo = mapVector.get("LORENZO");
        final var vectorLola = mapVector.get("LOLA");
        final var vectorRicardo = Vector2D.calcularSuma("RICARDO", vectorLorenzo, vectorLola);

        System.out.printf("nombre: %s, modulo: %.2f%n", vectorLorenzo.getNombre(), vectorLorenzo.getModulo());
        System.out.printf("nombre: %s, modulo: %.2f%n", vectorLola.getNombre(), vectorLola.getModulo());
        System.out.printf("nombre: %s, modulo: %.2f%n", vectorRicardo.getNombre(), vectorRicardo.getModulo());
    }
}
