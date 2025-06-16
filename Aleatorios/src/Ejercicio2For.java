import java.util.Random;

public class Ejercicio2For {
    public static void main(String[] args) {
        final var n = UtilitiesRandom.generarRandomInt(15, 100, new Random());

        final var contador1 = contarValores1(n);
        final var contador2 = contarValores2(n);
        final var contador3 = contarValores3(n);

        System.out.printf("1er contador: %d%n", contador1);
        System.out.printf("2do contador: %d%n", contador2);
        System.out.printf("3er contador: %d%n", contador3);
    }

    static int contarValores1(int n) {
        var contador = 0;
        for (var i = 1; i < n; i++) {
            if (i % 2 == 0) { //Para sacar los divisibles entre 2
                contador++;
            }
        }
        return contador;
    }

    static int contarValores2(int n) {
        var contador = 0;
        for (var i = 1; i <= n; i++) {
            if (i % 3 == 0) { //Multiplos de 3
                contador++;
            }
        }
        return contador;
    }

    static int contarValores3(int n) {
        var contador = 0;
        for (var i = 1; i <= n; i++) {
            if (i % 10 == 0) { //Multiplos del 10 o terminados en 0
                contador++;
            }
        }
        return contador;
    }
}
