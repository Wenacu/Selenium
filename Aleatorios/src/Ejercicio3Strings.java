import java.util.Arrays;
import java.util.List;

public class Ejercicio3Strings {
    public static void main(String[] args) {
        final var data = crearData();
        final var precioUsd = calcularSumaUsd(data);
        final var precioPen = calcularSumaPen(precioUsd);

        mostrarInformacion(precioUsd, precioPen);
    }

    static List<String> crearData() {
        return Arrays.asList("$125.32", "$63.831", "$632.7", "$110.25678");
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
