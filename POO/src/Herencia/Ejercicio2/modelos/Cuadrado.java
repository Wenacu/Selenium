package Herencia.Ejercicio2.modelos;

public class Cuadrado extends Figura {
    private final double lado;

    public Cuadrado(double lado) {
        this.lado = lado;
        calcularPerimetro();
        calcularArea();
    }

    @Override
    public String toString() {
        final var multilinea = """
                {
                    lado: %.2f
                    perimetro: %.2f
                    area: %.2f
                }
                """;
        return String.format(
                multilinea,
                lado,
                perimetro,
                area
        );
    }

    private void calcularPerimetro() {
        perimetro = 4 * lado;
    }

    private void calcularArea() {
        area = Math.pow(lado, 2);
    }
}
