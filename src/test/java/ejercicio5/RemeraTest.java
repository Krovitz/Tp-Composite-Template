package ejercicio5;

import ejercicio5.modelo.Importada;
import ejercicio5.modelo.Nacional;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class RemeraTest {

    @Test
    public void testRemeraImportada() {
        var remera = new Importada(100.0);
        // Precio base: 100 + 3% + 5% = 108.0
        // Precio final: 108.0 + 25% = 135.0
        assertEquals(135.0, remera.calcularPrecioVenta());
    }

    @Test
    public void testRemeraNacional() {
        var remera = new Nacional(100.0, 50.0);
        // Recargo: 20 * 0.015 = 0.3 -> 100 + 0.3 = 100.3
        // Bonificación: 100.3 * 0.80 = 80.24
        // Precio final: 80.24 * 1.15 = 92.28
        assertEquals(92.69, remera.calcularPrecioVenta());
    }
}
