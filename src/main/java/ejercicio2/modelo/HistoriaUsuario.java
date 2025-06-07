package ejercicio2.modelo;

import java.util.ArrayList;
import java.util.List;

public class HistoriaUsuario implements ItemProyecto {
    private String nombre;
    private List<ItemProyecto> tareas;

    public HistoriaUsuario(String nombre) {
        this.nombre = nombre;
        this.tareas = new ArrayList<>();
    }

    public void agregarTarea(ItemProyecto tarea) {
        tareas.add(tarea);
    }

    @Override
    public float duracion() {
        float duracion = 0;
        for (ItemProyecto t : tareas) {
            duracion += t.duracion();
        }
        return duracion;
    }
}
