package POO2.data1.ex3.parser;

import POO2.data1.ex3.Vector2D;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class VectorParser {
    public static Map<String, Vector2D> crearMapVector(List<String> listaInput) {
        final var map = new HashMap<String, Vector2D>();

        for (var elemento : listaInput) {
            final var vector = parsearVector(elemento);
            map.put(vector.getNombre(), vector);
        }

        return map;
    }

    private static Vector2D parsearVector(String data) {
        final var arrayString = data.split(",");

        final var nombre = arrayString[0];
        final var x = Double.parseDouble(arrayString[1]);
        final var y = Double.parseDouble(arrayString[2]);

        return new Vector2D(nombre, x, y);
    }
}
