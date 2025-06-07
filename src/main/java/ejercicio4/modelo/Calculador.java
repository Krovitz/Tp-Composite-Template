package ejercicio4.modelo;

import static java.time.Month.of;

public abstract class Calculador {
    private LogTransaction log;
    private int mesEnPromocion;
    private ProveedorDeFecha proveedorDeFecha;

    protected Calculador(int mesEnPromocion, ProveedorDeFecha proveedorDeFecha) {
        this.mesEnPromocion = mesEnPromocion;
        this.proveedorDeFecha = proveedorDeFecha;
        this.log = new LogTransaction();
    }

    public final double calcularPrecio(double precioProducto) {
        double precioTotal = precioProducto;
        if (of(mesEnPromocion).equals(proveedorDeFecha.fecha().getMonth())) {
            precioTotal += precioProducto * aumentoConPromocion();
        } else {
            precioTotal += precioProducto * aumentoSinPromocion();
        }
        log.log(CalculadorNoJubilado.class.getName());
        return precioTotal;
    }

    public abstract double aumentoConPromocion();

    public abstract double aumentoSinPromocion();

}
