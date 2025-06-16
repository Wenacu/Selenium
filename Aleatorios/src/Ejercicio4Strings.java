import java.util.ArrayList;
import java.util.List;

public class Ejercicio4Strings {
    public static void main(String[] args) {
        final var data = obtenerData();
        final var arrayNombres = obtenerArrayNombres(data);
        final var listaA = obtenerNombresA(arrayNombres);

        mostrarLista(listaA);
    }

    static String obtenerData() {
        return "CARLOS,ARTURO,MARIA,ANA,ANAHIS,RODRIGO,PEDRO,ARMANDO";
    }
    
    static String[] obtenerArrayNombres(String data) {
        return data.split(",");
    }

    static List<String> obtenerNombresA(String[] arrayNombres) {
        final var listaA = new ArrayList<String>();
        for (var nombre : arrayNombres) {
            if (nombre.startsWith("A")) {
                listaA.add(nombre);
            }
        }
        return listaA;
    }

    static void mostrarLista(List<String> listaNombres) {
        System.out.printf("La lista es: %s%n", listaNombres);
    }
}
