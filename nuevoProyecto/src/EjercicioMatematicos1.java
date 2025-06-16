public class EjercicioMatematicos1 {
    public static void main(String[] args) {
        final var velocidadInicial = 15.24;
        final var aceleracion = 3.75;
        final var tiempo = 5;
        final var velocidadFinal = velocidadInicial + aceleracion * tiempo;

        System.out.printf("Para una velocidad inicial %.3f, una aceleración %.3f, " +
                        "y un tiempo %d se obtiene una velocidad final de %.3f",
                velocidadInicial, aceleracion, tiempo, velocidadFinal);

    }
}
