import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Excepciones3 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        final var lista = new ArrayList<Integer>();

        int numeroLeido;

        do {
            numeroLeido = ScannerManager.
                    leerInt(scanner, "Ingrese un numero para agregarlo a lista");
            if (numeroLeido != -1) {
                lista.add(numeroLeido);
            }
        } while (numeroLeido != -1);
        scanner.close();

        mostrarLista(lista);
    }

    static void mostrarLista(List<Integer> lista) {
        System.out.printf("La lista %s%n", lista);
    }
}
