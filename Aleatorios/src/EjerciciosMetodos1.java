import java.util.Random;

public class EjerciciosMetodos1 {
    public static void main(String[] args) {
        final var random = new Random();

        final var masa = UtilitiesRandom.generarRandomDouble(100, 300, random);
        final var aceleracion = UtilitiesRandom.generarRandomDouble(3, 5, random);

        final var fuerza = calcularFuerza(masa, aceleracion);
        imprimirResultado(masa, aceleracion, fuerza);
    }

    static double calcularFuerza(double masa, double aceleracion) {
        return masa * aceleracion;
    }

    static void imprimirResultado(double masa, double aceleracion, double fuerza) {
        System.out.printf("Para una masa %.4f y aceleración %.4f se tiene una fuerza de %.4f%n",
                masa, aceleracion, fuerza);
    }
}
