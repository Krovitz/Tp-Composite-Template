package ejercicio2.modelo;

public class Tarea implements ItemProyecto {
    private String nombre;
    private float tiempo;


    public Tarea(String nombre, float tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    @Override
    public float calcularTiempo() {
        return this.tiempo;
    }

}
