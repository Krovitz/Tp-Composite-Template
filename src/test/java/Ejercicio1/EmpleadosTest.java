package Ejercicio1;

import ejercicio1.modelo.EmpleadoJerarquico;
import ejercicio1.modelo.EmpleadoRegular;
import ejercicio1.modelo.LaserX;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class EmpleadosTest {

    @Test
    public void calcularSalarialDirectorTest() {
        var director = new EmpleadoJerarquico("Lucas", 500f);
        var gerente = new EmpleadoJerarquico("Pedro", 200f);
        var mandoMedio = new EmpleadoJerarquico("Ana", 100f);
        var liderProyecto = new EmpleadoJerarquico("Felipe", 50f);
        var empleadoRegular = new EmpleadoRegular("Lucia", 25f);

        director.agregarEmpleado(gerente);
        gerente.agregarEmpleado(mandoMedio);
        mandoMedio.agregarEmpleado(liderProyecto);
        liderProyecto.agregarEmpleado(empleadoRegular);

        assertEquals(875f, new LaserX(director).imprimirCostoSalarial());
    }

    @Test
    public void calcularSalarialEmpleadoRegularTest() {
        var empleadoRegular = new EmpleadoRegular("Lucia", 25f);
        assertEquals(25f, new LaserX(empleadoRegular).imprimirCostoSalarial());
    }
}
