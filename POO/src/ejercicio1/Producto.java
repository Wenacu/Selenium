package ejercicio1;

public class Producto {
    private final String nombre;
    private final double precio;
    private final int stock;
    private final double peso;
    private final boolean parecible;
    private final double volumen;

    public Producto(String nombre, double precio, int stock, double peso,
                    boolean parecible, double volumen) {
        this.nombre = nombre;
        this.precio = precio;
        this.stock = stock;
        this.peso = peso;
        this.parecible = parecible;
        this.volumen = volumen;
    }

    @Override
    public String toString() {
        final var multilinea = """
                {
                   nombre: %s
                   precio: %.2f
                   stock: %d
                   peso: %.2f
                   parecible: %b
                   volumen: %.2f
                }
                """;
        return String.format(
                multilinea,
                nombre,
                precio,
                stock,
                peso,
                parecible,
                volumen

        );
    }

    public String getNombre() {
        return nombre;
    }

    public double getPrecio() {
        return precio;
    }

    public int getStock() {
        return stock;
    }
}
