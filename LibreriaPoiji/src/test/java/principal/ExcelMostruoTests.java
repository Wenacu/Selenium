package principal;

import modelos.Monstruo;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;
import reader.ExcelReader;
import utilities.BaseTest;

import java.util.List;

public class ExcelMostruoTests extends BaseTest {
    private List<Monstruo> listaMonstruo;

    @BeforeMethod
    public void setUp() {
        listaMonstruo = ExcelReader.obtenerListaMonstruo();

    }

    @Test
    public void primerTest() {
        final var primerMonstruo = listaMonstruo.get(0);
        System.out.printf("El nombre del 1er monstruo es: %s%n", primerMonstruo.getNombre());
    }
}//corregir final video 80
