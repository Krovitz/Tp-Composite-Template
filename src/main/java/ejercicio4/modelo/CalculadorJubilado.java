package ejercicio4.modelo;


public class CalculadorJubilado extends Calculador {


    public CalculadorJubilado(int mesEnPromocion, ProveedorDeFecha fecha) {
        super(mesEnPromocion, fecha);
    }

    @Override
    public double aumentoConPromocion() {
        return 0;
    }

    @Override
    public double aumentoSinPromocion() {
        return 0.1;
    }

}