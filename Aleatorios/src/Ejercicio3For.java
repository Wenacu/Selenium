import java.util.Random;

public class Ejercicio3For {
    public static void main(String[] args) {
        final var n = UtilitiesRandom.generarRandomInt(15, 100, new Random());

        final var suma1 = calcularSuma1(n);
        final var suma2 = calcularSuma2(n);
        final var suma3 = calcularSuma3(n);

        System.out.printf("suma1: %d%n", suma1);
        System.out.printf("suma2: %d%n", suma2);
        System.out.printf("suma3: %d%n", suma3);
    }

    static int calcularSuma1(int n) {
        var suma = 0;

        for (var i = 1; i <= n; i++) {
            suma += i;
        }
        return suma;
    }

    static int calcularSuma2(int n) {
        var suma = 0;
        for (var i = 1; i < n; i++) {
            if (n % 2 == 0) {
                suma += i;
            }
        }
        return suma;
    }

    static int calcularSuma3(int n) {
        var suma = 0;
        for (var i = 1; i < n; i++) {
            if (n % 5 == 0) {
                suma += i;
            }
        }
        return suma;
    }
}
