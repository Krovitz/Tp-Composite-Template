package ejercicio3;

import ejercicio3.modelo.GestorSeguros;
import ejercicio3.modelo.Paquete;
import ejercicio3.modelo.Seguro;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SeguroTest {

    @Test
    public void calcularCostoPaqueteTest() {
        var gestorSeguros = new GestorSeguros();
        var paquete = new Paquete();
        var antirobo = new Seguro("Antirobo", 100f);
        var auto = new Seguro("De auto", 200f);
        var vida = new Seguro("De vida", 150f);

        paquete.agregarSeguro(antirobo);
        paquete.agregarSeguro(auto);
        paquete.agregarSeguro(vida);

        gestorSeguros.agregarSeguros(paquete);

        assertEquals(382.5f, gestorSeguros.calcularCostoTotal());
    }

    @Test
    public void calcularCostoPaqueteConPaquetesInternosTest() {
        var gestorSeguros = new GestorSeguros();
        var paquete = new Paquete();
        var paquete2 = new Paquete();
        var antirobo = new Seguro("Antirobo", 100f);
        var auto = new Seguro("De auto", 200f);
        var vida = new Seguro("De vida", 150f);

        paquete.agregarSeguro(antirobo);
        paquete.agregarSeguro(auto);
        paquete.agregarSeguro(vida);

        paquete2.agregarSeguro(auto);
        paquete2.agregarSeguro(vida);
        paquete2.agregarSeguro(vida);

        gestorSeguros.agregarSeguros(paquete);

        assertEquals(382.5f, gestorSeguros.calcularCostoTotal());
    }
}
