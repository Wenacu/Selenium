package ejercicio2;

public class Main {
    public static void main(String[] args) {
        final var videojuego1 = new Videojuego("BLUE PROTOCOL", 2011, 58.99,
                45, Videojuego.Genero.TERROR, Videojuego.Empresa.XBOX);

        final var videojuego2 = new Videojuego("VALHEIM", 2015, 49.99,
                15, Videojuego.Genero.ACCION, Videojuego.Empresa.PLAY_STATION);

        final var videojuego3 = new Videojuego("MARIO BROS", 1998, 69.99,
                5, Videojuego.Genero.COMEDIA, Videojuego.Empresa.NINTENDO);

        System.out.printf("videojuego1: %s%n", videojuego1);
        System.out.printf("videojuego2: %s%n", videojuego2);
        System.out.printf("videojuego3: %s%n", videojuego3);
    }
}
