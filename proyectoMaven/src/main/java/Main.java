public class Main {
    public static void main(String[] args) {
        //System.out.println("Hello mundo");
        //System.out.println("Adios mundo");
        //final var nombre1 = System.getProperty("nombre1");
        //final var nombre2 = System.getProperty("nombre2");

        //final var multilinea = """
        //nombre1= %s
        //nombre2= %s
        //""";

        //System.out.printf(multilinea, convertirMayuscula(nombre1), convertirMayuscula(nombre2));

        //final var numero1 = Integer.parseInt(System.getProperty("numero1"));
        //final var numero2 = Integer.parseInt(System.getProperty("numero2"));

        //final var suma = calcularSuma(numero1, numero2);
        //System.out.printf("La suma es %d%n", suma);

        final var mavenHomePath = System.getenv("MAVEN_HOME");
        System.out.printf("maven home path: %s%n", mavenHomePath);

    }

    //private static String convertirMayuscula(String nombre) {
    // return nombre.toUpperCase();
    //}
    //private static int calcularSuma(int a, int b) {
    //return a + b;
    //}
    //gvhjbj
}
