import java.util.Scanner;

public class Ejercicio2 {
    public static void main(String[] args) {
        final var scanner = new Scanner(System.in);

        System.out.print("Ingrese su nombre: ");
        final var nombre = scanner.nextLine();

        System.out.print("Ingrese su edad: ");
        final var edad = scanner.nextInt();
        
        System.out.print("Ingrese su estatura: ");
        final var estatura = scanner.nextDouble();
        scanner.close();

        imprimirResultado(nombre, edad, estatura);
    }

    static void imprimirResultado(String nombre, int edad, double estatura) {
        System.out.printf("Mi nombre es %s, tengo %d de edad y mido %.2fcm%n",
                nombre, edad, estatura);
    }
}
