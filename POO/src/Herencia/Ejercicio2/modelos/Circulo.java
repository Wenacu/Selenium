package Herencia.Ejercicio2.modelos;

public class Circulo extends Figura {
    private final double radio;

    public Circulo(double radio) {
        this.radio = radio;
        calcularPerimetro();
        calcularArea();
    }

    @Override
    public String toString() {
        final var multilinea = """
                {
                    radio: %.2f
                    perimetro: %.2f
                    area: %.2f
                }
                """;
        return String.format(
                multilinea,
                radio,
                perimetro,
                area
        );
    }

    private void calcularPerimetro() {
        perimetro = 2 * Math.PI * radio;
    }

    private void calcularArea() {
        area = Math.PI * Math.pow(radio, 2);
    }
}
