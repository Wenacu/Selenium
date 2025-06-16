import java.util.Random;

public class EjercicioRandom {
    public static void main(String[] args) {
        final var random = new Random();

        final var randomInt = UtilitiesRandom.generarRandomInt(20, 100, random);
        final var randomDouble = UtilitiesRandom.generarRandomDouble(100, 500, random);

        System.out.printf("Random int: %d%n", randomInt);
        System.out.printf("Random double: %.2f%n", randomDouble);
    }
}
