package ejercicio5.modelo;

public class Importada extends Remera {

    public Importada(double precioUnitario) {
        super(precioUnitario);
    }

    @Override
    protected double calcularPrecioBase() {
        return precioUnitario * (1 + 0.03 + 0.05);
    }

    @Override
    protected double aplicarGanancia(double precioBase) {
        return precioBase * 1.25;
    }
}
