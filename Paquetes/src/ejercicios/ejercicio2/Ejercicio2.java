package ejercicios.ejercicio2;

import ejercicios.ejercicio1.FileManager;

import java.io.File;
import java.util.List;

public class Ejercicio2 {
    public static void main(String[] args) {
        final var listaInput = FileManager.
                leerFile(new File("src/ejercicios/ejercicio2/input/precios.csv"));

        final var precioUsd = calcularSumaUsd(listaInput);
        final var precioPen = calcularSumaPen(precioUsd);

        mostrarInformacion(precioUsd, precioPen);
    }

    static double obtenerPrecio(String precio) {
        final var precioSinDolar = precio.replace("$", ""); //Para quitar $
        return Double.parseDouble(precioSinDolar);
    }

    static double calcularSumaUsd(List<String> data) {
        var suma = 0.0;

        for (var elemento : data) {
            suma += obtenerPrecio(elemento);
        }
        return suma;
    }

    static double calcularSumaPen(double precioUsd) {
        return precioUsd * 3.5;

    }

    static void mostrarInformacion(double precioUsd, double precioPen) {
        System.out.printf("El precio total en usd es: %.2f%n", precioUsd);
        System.out.printf("El precio total en pen es: %.2f%n", precioPen);
    }
}
