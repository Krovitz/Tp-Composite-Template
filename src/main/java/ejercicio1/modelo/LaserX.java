package ejercicio1.modelo;

public class LaserX {
    private Empleado empleado;

    public LaserX(Empleado empleado) {
        this.empleado = empleado;
    }

    public float imprimirCostoSalarial() {
        return empleado.calcularSalario();
    }
}
