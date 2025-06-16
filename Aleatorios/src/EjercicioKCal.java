import java.util.Scanner;

public class EjercicioKCal {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);


        String diaSemana;

        do {
            diaSemana = ScannerManager.leerString(scanner,
                    "Ingrese el dia de la semana, escriba SALIDA para terminar");
            if (!diaSemana.equals("SALIDA")) {
                imprimirResultado(diaSemana, calcularKCal(DiaSemana.valueOf(diaSemana)));
            }
        } while (!diaSemana.equals("SALIDA"));
        scanner.close();
    }

    static int calcularKCal(DiaSemana diaSemana) {
        return switch (diaSemana) {
            case LUNES -> 350;
            case MARTES -> 420;
            case MIERCOLES -> 220;
            case JUEVES -> 600;
            case VIERNES -> 125;
            case SABADO -> 250;
            case DOMINGO -> 100;
        };
    }

    static void imprimirResultado(String diaSemana, int kCal) {
        System.out.printf("Para el dia %s se tiene que quemar %dkcal%n", diaSemana, kCal);

    }

    enum DiaSemana {
        LUNES,
        MARTES,
        MIERCOLES,
        JUEVES,
        VIERNES,
        SABADO,
        DOMINGO
    }
}
