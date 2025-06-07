package ejercicio4.modelo;


public class CalculadorNoJubilado extends Calculador {


    public CalculadorNoJubilado(int mesEnPromocion, ProveedorDeFecha fecha) {
        super(mesEnPromocion, fecha);
    }


    @Override
    public double aumentoConPromocion() {
        return 0.15;
    }

    @Override
    public double aumentoSinPromocion() {
        return 0.21;
    }

}
