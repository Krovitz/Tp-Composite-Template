package ejercicio5.modelo;

public class Nacional extends Remera {
    private double costoTransporte;

    public Nacional(double precioUnitario, double costoTransporte) {
        super(precioUnitario);
        this.costoTransporte = costoTransporte;
    }

    @Override
    protected double calcularPrecioBase() {
        // 1.5% del costo de transporte como recargo - 20% de bonificación
        double recargo = costoTransporte * 0.015;
        double precioConRecargo = precioUnitario + recargo;
        return precioConRecargo * 0.80; // aplica bonificación
    }

    @Override
    protected double aplicarGanancia(double precioBase) {
        // 15% de ganancia
        return precioBase * 1.15;
    }
}
