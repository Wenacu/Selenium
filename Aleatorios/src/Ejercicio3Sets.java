import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio3Sets {
    public static void main(String[] args) {
        final var set1 = crearSetAnimales1();

        final var scanner = new Scanner(System.in);
        final var set2 = crerSetAnimales2(scanner);

        scanner.close();

        set1.retainAll(set2); //intersección y se guarda en set1
        imprimirSet(set1);
    }

    static Set<String> crearSetAnimales1() {
        return new HashSet<>(Arrays.asList("oso", "gorila", "zebra", "leon", "pantera"));
    }

    static Set<String> crerSetAnimales2(Scanner scanner) {
        final var set = new HashSet<String>();

        String animal;
        do {
            animal = ScannerManager.leerString(scanner, "Ingrese un animal");
            if (!animal.equals("salida")) {
                set.add(animal);
            }
        } while (!animal.equals("salida")); //mientras no sea salida

        return set;
    }

    static void imprimirSet(Set<String> set) {
        System.out.printf("Los animales en comun son: %s%n", set);
    }
}
