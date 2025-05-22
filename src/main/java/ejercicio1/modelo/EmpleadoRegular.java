package ejercicio1.modelo;

public class EmpleadoRegular implements Empleado{
    private String nombre;
    private float salario;

    public EmpleadoRegular(String nombre, float salario) {
        this.nombre = nombre;
        this.salario = salario;
    }

    @Override
    public float calcularSalario() {
        return this.salario;
    }
}
