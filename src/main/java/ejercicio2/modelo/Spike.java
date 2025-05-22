package ejercicio2.modelo;

public class Spike implements ItemProyecto {
    private String nombre;
    private float tiempo;


    public Spike(String nombre, float tiempo) {
        this.nombre = nombre;
        this.tiempo = tiempo;
    }

    @Override
    public float calcularTiempo() {
        return this.tiempo;
    }
}
