package Herencia.Ejercicio2.parser;

import Herencia.Ejercicio2.modelos.Circulo;

import java.util.ArrayList;
import java.util.List;

public class CirculoParser {
    public static List<Circulo> generarListaCirculo(List<String> listaInput) {
        final var listaCirculo = new ArrayList<Circulo>();

        for (var data : listaInput) {
            listaCirculo.add(parsearCirculo(data));
        }
        return listaCirculo;
    }

    private static Circulo parsearCirculo(String data) {
        final var arrayString = data.split(",");

        final var radio = Double.parseDouble(arrayString[0]);


        return new Circulo(radio);


    }
}
