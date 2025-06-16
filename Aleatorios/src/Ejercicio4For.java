import java.util.Random;

public class Ejercicio4For {
    public static void main(String[] args) {
        final var n = UtilitiesRandom.generarRandomInt(5, 20, new Random());
        final var promedioSimple = calcularPromedioSimple(n);
        imprimirResultado(n, promedioSimple);
    }

    static int calcularPromedioSimple(int n) {
        var suma = 0;
        for (var i = 1; i <= n; i++) {
            suma += i;
        }
        return suma / n;
    }

    static void imprimirResultado(int n, int promedio) {
        System.out.printf("El promeido simple desde 1 hasta %d es %d%n", n, promedio);
    }
}
