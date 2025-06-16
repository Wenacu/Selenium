package POO2.data1;

import POO2.data1.ex1.input.parser.ProductoParser;
import ejercicio1.Producto;

import java.io.File;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        final var fileInput = new File("src/POO2/data1/ex1/input/productos.csv");
        final var listaInput = FileManager.leerFile(fileInput);

        final var arrayProductos = ProductoParser.obtenerArrayProductos(listaInput);
        ordenarArrayProducto(arrayProductos);

        System.out.printf("Array ordenado: %s%n", Arrays.toString(arrayProductos));


    }

    private static void ordenarArrayProducto(Producto[] array) {
        final var n = array.length;

        for (var i = 0; i < n; i++) {
            for (var j = 0; j < n - i - 1; j++) {
                if (array[j].getPrecio() > array[j + 1].getPrecio()) {
                    final var temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                }
            }

        }
    }
}
