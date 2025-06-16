package Herencia.Ejercicio2.parser;

import Herencia.Ejercicio2.modelos.Cuadrado;

import java.util.ArrayList;
import java.util.List;

public class CuadroParser {
    public static List<Cuadrado> generarListaCuadrado(List<String> listaInput) {
        final var listaCuadrado = new ArrayList<Cuadrado>();

        for (var data : listaInput) {
            listaCuadrado.add(parsearCuadrado(data));
        }
        return listaCuadrado;
    }

    private static Cuadrado parsearCuadrado(String data) {
        final var arrayString = data.split(",");

        final var lado = Double.parseDouble(arrayString[0]);


        return new Cuadrado(lado);


    }
}
