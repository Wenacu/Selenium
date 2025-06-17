package principal;

import com.github.javafaker.Faker;

public class Main {
    public static void main(String[] args) {
        //Logs.error("Esto es un error");
        //Logs.info("Soy un paso de algo nivel");
        //Logs.debug("Soy un paso técnico");
        //Logs.trace("Soy un paso detallado");

        final var faker = new Faker();
        System.out.printf("nombre: %s%n", faker.name().name());
    }
}
