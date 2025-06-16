import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class RandomUtilities {

    static int generarRandomInt(int min, int max, Random random) {
        if (max < min) {
            throw new IllegalArgumentException("max debe ser mayor o igual que min");
        }
        return random.nextInt(max - min + 1) + min;
    }

    static double generarRandomDouble(double min, double max, Random random) {
        if (max < min) {
            throw new IllegalArgumentException("max debe ser mayor o igual que min");
        }
        return (max - min) * random.nextDouble() + min;
    }

    static int[] generarRandomArrayInt(int n, int min, int max, Random random) {
        final var array = new int[n];
        for (var i = 0; i < n; i++) {
            array[i] = generarRandomInt(min, max, random);
        }
        return array;
    }

    static double[] generarRandomArrayDouble(int n, double min, double max, Random random) {
        final var array = new double[n];
        for (var i = 0; i < n; i++) {
            array[i] = generarRandomDouble(min, max, random);
        }
        return array;
    }

    static List<Integer> generarListaIntAleatoria(int n, int min, int max, Random random) {
        final var listaAleatoria = new ArrayList<Integer>();
        for (var i = 0; i < n; i++) {
            listaAleatoria.add(generarRandomInt(min, max, random));
        }
        return listaAleatoria;
    }

    static List<Double> generarListaDoubleAleatoria(int n, double min, double max, Random random) {
        final var listaAleatoria = new ArrayList<Double>();
        for (var i = 0; i < n; i++) {
            listaAleatoria.add(generarRandomDouble(min, max, random));
        }
        return listaAleatoria;
    }
}
