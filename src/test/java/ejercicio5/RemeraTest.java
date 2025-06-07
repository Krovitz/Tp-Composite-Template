package ejercicio5;

import ejercicio5.modelo.Importada;
import ejercicio5.modelo.Nacional;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemeraTest {

    @Test
    public void testRemeraImportada() {
        var remera = new Importada(100.0);
        assertEquals(135.0, remera.calcularPrecioVenta());
    }

    @Test
    public void testRemeraNacional() {
        var remera = new Nacional(100.0, 50.0);
        assertEquals(92.69, remera.calcularPrecioVenta());
    }
}
