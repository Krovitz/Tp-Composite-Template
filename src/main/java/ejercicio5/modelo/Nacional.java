package ejercicio5.modelo;

public class Nacional extends Remera {
    private double costoTransporte;

    public Nacional(double precioUnitario, double costoTransporte) {
        super(precioUnitario);
        this.costoTransporte = costoTransporte;
    }

    @Override
    protected double calcularPrecioBase() {
        double recargo = costoTransporte * 0.015;
        double precioConRecargo = precioUnitario + recargo;
        return precioConRecargo * 0.80;
    }

    @Override
    protected double aplicarGanancia(double precioBase) {
        return precioBase * 1.15;
    }
}
