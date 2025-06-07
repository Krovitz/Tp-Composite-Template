package ejercicio4;

import ejercicio4.modelo.CalculadorJubilado;
import ejercicio4.modelo.CalculadorNoJubilado;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class CalculadorTest {

    @Test
    public void calcularPrecioJubiladoTest() {
        var jubilado = new CalculadorJubilado(2, new ProveedorDeFechaFake());

        assertEquals(220, jubilado.calcularPrecio(200));
    }

    @Test
    public void calcularPrecioJubiladoImpuestoTest() {
        var jubilado = new CalculadorJubilado(5, new ProveedorDeFechaFake());

        assertEquals(200, jubilado.calcularPrecio(200));
    }

    @Test
    public void calcularPrecioNoJubiladoPromocion() {
        var noJubilado = new CalculadorNoJubilado(5, new ProveedorDeFechaFake());

        assertEquals(230, noJubilado.calcularPrecio(200));
    }

    @Test
    public void calcularPrecioNoJubiladoNoPromocion() {
        var noJubilado = new CalculadorNoJubilado(3, new ProveedorDeFechaFake());

        assertEquals(242, noJubilado.calcularPrecio(200));
    }
}
