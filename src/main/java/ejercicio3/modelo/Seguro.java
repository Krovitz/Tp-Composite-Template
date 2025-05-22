package ejercicio3.modelo;

public class Seguro implements Seguros {
    private String nombre;
    private float costo;


    public Seguro(String nombre, float costo) {
        this.nombre = nombre;
        this.costo = costo;
    }


    @Override
    public float costo() {
        return this.costo;
    }

    @Override
    public void agregarSeguro(Seguros unSeguro) {
        //No hago nada porque es un Seguro no paquete
    }
}
