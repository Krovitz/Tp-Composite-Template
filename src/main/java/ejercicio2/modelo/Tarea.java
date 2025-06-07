package ejercicio2.modelo;

public class Tarea implements ItemProyecto {
    private String nombre;
    private float duracion;


    public Tarea(String nombre, float duracion) {
        this.nombre = nombre;
        this.duracion = duracion;
    }

    @Override
    public float duracion() {
        return this.duracion;
    }

}
