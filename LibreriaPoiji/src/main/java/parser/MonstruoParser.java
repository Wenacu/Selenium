package parser;

import modelos.Monstruo;
import reader.ExcelReader;

public class MonstruoParser {
    public static Monstruo[] obtenerArrayMonstruo() {
        final var listaMonstruo = ExcelReader.obtenerListaMonstruo();
        final var n = listaMonstruo.size();

        final var arrayMonstruo = new Monstruo[n];

        for (var i = 0; i < n; i++) {
            arrayMonstruo[i] = listaMonstruo.get(i);
        }

        return arrayMonstruo;
    }
}
