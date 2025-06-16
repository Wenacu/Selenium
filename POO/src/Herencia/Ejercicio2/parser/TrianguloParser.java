package Herencia.Ejercicio2.parser;

import Herencia.Ejercicio2.modelos.Triangulo;

import java.util.ArrayList;
import java.util.List;

public class TrianguloParser {
    public static List<Triangulo> generarListaTriangulo(List<String> listaInput) {
        final var listaTriangulo = new ArrayList<Triangulo>();

        for (var data : listaInput) {
            listaTriangulo.add(parsearTriangulo(data));
        }
        return listaTriangulo;
    }

    private static Triangulo parsearTriangulo(String data) {
        final var arrayString = data.split(",");

        final var lado1 = Double.parseDouble(arrayString[0]);
        final var lado2 = Double.parseDouble(arrayString[1]);
        final var lado3 = Double.parseDouble(arrayString[2]);


        return new Triangulo(lado1, lado2, lado3);


    }
}
