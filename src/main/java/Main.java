import ejercicio1.modelo.*;

public class Main {
    public static void main(String[] args) {
        var director = new EmpleadoJerarquico("Lucas",500f);
        var gerente = new EmpleadoJerarquico("Pedro", 200f);
        var mandoMedio = new EmpleadoJerarquico("Ana", 100f);
        var liderProyecto = new EmpleadoJerarquico("Felipe", 50f);
        var empleadoRegular = new EmpleadoRegular("Lucia", 25f);

        director.agregarEmpleado(gerente);
        gerente.agregarEmpleado(mandoMedio);
        mandoMedio.agregarEmpleado(liderProyecto);
        liderProyecto.agregarEmpleado(empleadoRegular);

        new LaserX(director).imprimirCostoSalarial();
    }
}