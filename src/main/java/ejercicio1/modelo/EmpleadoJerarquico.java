package ejercicio1.modelo;

import java.util.ArrayList;
import java.util.List;

public class EmpleadoJerarquico implements Empleado{
    private String nombre;
    private float salario;
    private List<Empleado> empleados;

    public EmpleadoJerarquico(String nombre, float salario) {
        this.nombre = nombre;
        this.salario = salario;
        this.empleados = new ArrayList<>();
    }

    public void agregarEmpleado(Empleado empleado){
        empleados.add(empleado);
    }

    public float salario() {
        return salario;
    }

    @Override
    public float calcularSalario() {
        float total = this.salario;
        for (Empleado e : empleados){
            total += e.calcularSalario();
        }
        return total;
    }
}
