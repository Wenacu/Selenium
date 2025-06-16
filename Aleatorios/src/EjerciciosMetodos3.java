import java.util.Random;

public class EjerciciosMetodos3 {
    public static void main(String[] args) {
        final var random = new Random();

        final var cateto1 = UtilitiesRandom.generarRandomDouble(10, 30, random);
        final var cateto2 = UtilitiesRandom.generarRandomDouble(10, 30, random);

        final var hipotenusa = calcularHipotenusa(cateto1, cateto2);
        imprimirResutado(cateto1, cateto2, hipotenusa);
    }

    static double calcularHipotenusa(double cateto1, double cateto2) {
        return Math.sqrt(Math.pow(cateto1, 2) + (Math.pow(cateto2, 2)));
    }

    static void imprimirResutado(double cateto1, double cateto2, double hipotenusa) {
        System.out.printf("Para los catetos %.3f & %.3f tenemos una hipotenusa de %.3f%n",
                cateto1, cateto2, hipotenusa);
    }
}
