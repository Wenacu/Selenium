import java.util.Random;

public class EjerciciosMetodos4 {
    public static void main(String[] args) {
        final var random = new Random();

        final var radio = UtilitiesRandom.generarRandomInt(10, 25, random);

        final var area = calcularArea(radio);
        final var perimetro = calcularPerimetro(radio);

        imprimirResultado(radio, area, perimetro);
    }

    static double calcularArea(int radio) {
        return Math.PI * Math.pow(radio, 2);
    }

    static double calcularPerimetro(int radio) {
        return 2 * Math.PI * radio;
    }

    static void imprimirResultado(int radio, double area, double perimetro) {
        System.out.printf("Para un radio de %d se tiene un area de %.3f & un perimetro de %.3f",
                radio, area, perimetro);
    }
}
