package POO2.data1.ex1.input.parser;

import ejercicio1.Producto;

import java.util.List;

public class ProductoParser {
    public static Producto[] obtenerArrayProductos(List<String> listaInput) {
        final var n = listaInput.size();

        final var arrayProductos = new Producto[n];

        for (var i = 0; i < n; i++) {
            arrayProductos[i] = parsearProducto(listaInput.get(i));
        }

        return arrayProductos;
    }

    private static Producto parsearProducto(String data) {
        final var arrayString = data.split(",");


        final var nombre = arrayString[0];
        final var precio = Double.parseDouble(arrayString[1]);
        final var stock = Integer.parseInt(arrayString[2]);
        final var peso = Double.parseDouble(arrayString[3]);
        final var parecible = Boolean.parseBoolean(arrayString[4]);
        final var volumen = Double.parseDouble(arrayString[5]);

        return new Producto(nombre, precio, stock, peso, parecible, volumen);
    }
}
