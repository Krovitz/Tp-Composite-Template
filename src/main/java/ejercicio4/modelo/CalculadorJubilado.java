package ejercicio4.modelo;


public class CalculadorJubilado extends Calculador {


    public CalculadorJubilado(int mesEnPromocion) {
        super(mesEnPromocion);
    }

    @Override
    public double aumentoConPromocion() {
        return 0.1;
    }

    @Override
    public double aumentoSinPromocion() {
        return 1;
    }

    @Override
    public String nombreClase() {
        return this.getClass().getName();
    }
}