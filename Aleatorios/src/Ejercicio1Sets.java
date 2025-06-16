import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

public class Ejercicio1Sets {
    public static void main(String[] args) {
        final var set1 = crearSetGrupo1();

        final var scanner = new Scanner(System.in);
        final var set2 = crerSetGrupo2(scanner);

        scanner.close();

        set1.addAll(set2); //juntamos ambos sets y lo guardamos en set1
        imprimirSet(set1);
    }

    static Set<String> crearSetGrupo1() {
        return new HashSet<>(Arrays.asList("oso", "carro", "patito", "robot", "pelota"));
    }

    static Set<String> crerSetGrupo2(Scanner scanner) {
        final var set = new HashSet<String>();

        String regalo;
        do {
            regalo = ScannerManager.leerString(scanner, "Ingrese un regalo");
            if (!regalo.equals("salida")) {
                set.add(regalo);
            }
        } while (!regalo.equals("salida")); //mientras no sea salida

        return set;
    }

    static void imprimirSet(Set<String> set) {
        System.out.printf("El registro total es: %s%n", set);
    }
}
