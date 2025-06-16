import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio2Sets {
    public static void main(String[] args) {
        final var set1 = crearSetUtiles1();

        final var scanner = new Scanner(System.in);
        final var set2 = crerSetUtiles2(scanner);

        scanner.close();

        set1.removeAll(set2); //A-B y se guarda en el set 1
        imprimirSet(set1);
    }

    static Set<String> crearSetUtiles1() {
        return new HashSet<>(Arrays.asList("lapicero", "borrador", "lonchera",
                "mochila", "corrector", "goma", "tijera"));

    }

    static Set<String> crerSetUtiles2(Scanner scanner) {
        final var set = new HashSet<String>();

        String utilEscolar;
        do {
            utilEscolar = ScannerManager.leerString(scanner, "Ingrese un util");
            if (!utilEscolar.equals("salida")) {
                set.add(utilEscolar);
            }
        } while (!utilEscolar.equals("salida")); //mientras no sea salida

        return set;
    }

    static void imprimirSet(Set<String> set) {
        System.out.printf("Los utiles faltantes para su 2ndo hijo son: %s%n", set);
    }

}
