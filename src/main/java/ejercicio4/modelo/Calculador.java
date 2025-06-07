package ejercicio4.modelo;

import static java.time.LocalDate.now;
import static java.time.Month.of;

public abstract class Calculador {
    private LogTransaction log;
    private int mesEnPromocion;

    protected Calculador(int mesEnPromocion) {
        this.mesEnPromocion = mesEnPromocion;
        this.log = new LogTransaction();
    }

    public final double calcularPrecio(double precioProducto) {
        double precioTotal = precioProducto;
        if (of(mesEnPromocion).equals(now().getMonth())) {
            precioTotal += precioProducto * aumentoConPromocion();
        } else {
            precioTotal += precioProducto * aumentoSinPromocion();
        }
        log.log(CalculadorNoJubilado.class.getName());
        return precioTotal;
    }

    public abstract double aumentoConPromocion();

    public abstract double aumentoSinPromocion();

    public abstract String nombreClase();
}
