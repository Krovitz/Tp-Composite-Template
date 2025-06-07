package ejercicio2.main;

import ejercicio2.modelo.HistoriaUsuario;
import ejercicio2.modelo.Proyecto;
import ejercicio2.modelo.Spike;
import ejercicio2.modelo.Tarea;

public class Main {
    public static void main(String[] args) {
        var proyectoScrum = new Proyecto();
        var historiaUsuario = new HistoriaUsuario("Generar convenio");
        var spike = new Spike("Spike 1", 150f);
        var tarea = new Tarea("Tarea 1", 100f);

        historiaUsuario.agregarTarea(tarea);
        proyectoScrum.agregarItem(historiaUsuario);
        proyectoScrum.agregarItem(spike);

        System.out.println(proyectoScrum.calcularDuracion());
    }
}
