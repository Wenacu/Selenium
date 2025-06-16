package Herencia.Ejercicio2.modelos;

public class Triangulo extends Figura {
    private final double lado1;
    private final double lado2;
    private final double lado3;

    public Triangulo(double lado1, double lado2, double lado3) {
        this.lado1 = lado1;
        this.lado2 = lado2;
        this.lado3 = lado3;
        calcularPerimetro();
        calcularArea();
    }

    @Override
    public String toString() {
        final var multilinea = """
                {
                    lado1: %.2f
                    lado2: %.2f
                    lado3: %.2f
                    perimetro: %.2f
                    area: %.2f
                }
                """;
        return String.format(
                multilinea,
                lado1,
                lado2,
                lado3,
                perimetro,
                area
        );
    }

    private void calcularPerimetro() {
        perimetro = lado1 + lado2 + lado3;
    }

    private void calcularArea() {
        final var s = (lado1 + lado2 + lado3) / 2;
        area = Math.sqrt(s * (s - lado1) * (s - lado2) * (s - lado3));
    }
}
