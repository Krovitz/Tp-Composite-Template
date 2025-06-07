package ejercicio4.modelo;


public class CalculadorNoJubilado extends Calculador {


    public CalculadorNoJubilado(int mesEnPromocion) {
        super(mesEnPromocion);
    }


    @Override
    public double aumentoConPromocion() {
        return 0.15;
    }

    @Override
    public double aumentoSinPromocion() {
        return 0.21;
    }

    @Override
    public String nombreClase() {
        return this.getClass().getName();
    }
}
