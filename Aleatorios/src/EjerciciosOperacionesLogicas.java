import java.util.Random;

public class EjerciciosOperacionesLogicas {
    public static void main(String[] args) {
        final var random = new Random();

        final var numero = UtilitiesRandom.generarRandomInt(10, 200, new Random());
        

        System.out.printf("El numero %d es par y mayor que 50? %b%n", numero, preguntarCondiciones1(numero));
        System.out.printf("El numero %d es multiplo de 3 o menor igual que 45? %b%n", numero, preguntarCondiciones2(numero));


    }

    static boolean preguntarCondiciones1(int numero) {
        return (numero % 2 == 0) && (numero > 50);
    }

    static boolean preguntarCondiciones2(int numero) {
        return (numero % 3 == 0) || (numero <= 35);
    }
}
