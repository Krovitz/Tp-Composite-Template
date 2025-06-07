package ejercicio5.modelo;

public abstract class Remera {
    protected double precioUnitario;

    public Remera(double precioUnitario) {
        this.precioUnitario = precioUnitario;
    }

    public final double calcularPrecioVenta() {
        double precioBase = calcularPrecioBase();
        double precioFinal = aplicarGanancia(precioBase);
        return precioFinal;
    }

    protected abstract double calcularPrecioBase();

    protected abstract double aplicarGanancia(double precioBase);
}
