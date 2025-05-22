package ejercicio2.modelo;

import java.util.ArrayList;
import java.util.List;

public class HistoriaDeUsuario implements ItemProyecto {
    private String nombre;
    private List<Tarea> tareas;

    public HistoriaDeUsuario(String nombre) {
        this.nombre = nombre;
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(Tarea tarea) {
        tareas.add(tarea);
    }

    @Override
    public float calcularTiempo() {
        float tiempo = 0;
        for (ItemProyecto t : tareas) {
            tiempo += t.calcularTiempo();
        }
        return tiempo;
    }
}
