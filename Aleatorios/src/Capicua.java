import java.util.Scanner;

public class Capicua {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);
        final var n = ScannerManager.leerInt(scanner,
                "Ingrese numero a verificar su es capicua");
        scanner.close();

        final var nInvertido = invertirNumero(n);
        final var esCapicua = esCapicua(n, nInvertido);

        System.out.printf("El numero %d es capicua? %b%n", n, esCapicua);
    }

    static int invertirNumero(int n) {
        var aux = n;
        var inverso = 0;

        while (aux != 0) {
            //residuo es contante ya que no se redeclara dentro del bucle
            final var residuo = aux % 10;
            inverso = inverso * 10 + residuo;
            aux /= 10;
        }
        return inverso;
    }

    static boolean esCapicua(int n, int nInvertido) {
        return n == nInvertido;
    }
}
