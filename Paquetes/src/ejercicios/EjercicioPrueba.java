package ejercicios;

import utilities.UtilitiesRandom;

import java.util.Random;

public class EjercicioPrueba {
    public static void main(String[] args) {
        final var numeroAleatorio = generarNum();
        mostrarInformacion(numeroAleatorio);
    }

    private static int generarNum() {
        return UtilitiesRandom.
                generarRandomInt(5, 10, new Random());
    }

    private static void mostrarInformacion(int num) {
        System.out.printf("El numero aletaorio es: %d%n", num);
    }
}
