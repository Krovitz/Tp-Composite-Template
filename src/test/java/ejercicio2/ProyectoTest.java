package ejercicio2;

import ejercicio2.modelo.HistoriaDeUsuario;
import ejercicio2.modelo.Proyecto;
import ejercicio2.modelo.Spike;
import ejercicio2.modelo.Tarea;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ProyectoTest {

    @Test
    public void calcularTiempoProyectoTest() {
        var proyectoScrum = new Proyecto();
        var historiaUsuario = new HistoriaDeUsuario("Generar convenio");
        var spike = new Spike("Spike 1", 150f);
        var tarea = new Tarea("Tarea 1", 100f);

        historiaUsuario.agregarTarea(tarea);
        proyectoScrum.agregarItem(historiaUsuario);
        proyectoScrum.agregarItem(spike);

        assertEquals(250f, proyectoScrum.calcularTiempoProyecto());
    }

    @Test
    public void calcularHistoriaUsuario() {
        var historiaUsuario = new HistoriaDeUsuario("Generar convenioo");
        var tarea1 = new Tarea("Tarea 1", 85f);
        var tarea2 = new Tarea("Tarea 2", 50f);
        var tarea3 = new Tarea("Tarea 3", 35f);

        historiaUsuario.agregarTarea(tarea1);
        historiaUsuario.agregarTarea(tarea2);
        historiaUsuario.agregarTarea(tarea3);

        assertEquals(170f, historiaUsuario.calcularTiempo());

    }
}
