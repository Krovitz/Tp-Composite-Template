package ejercicio3.modelo;

import java.util.ArrayList;
import java.util.List;

public class GestorSeguros {
    private List<Seguros> seguros;


    public GestorSeguros() {
        this.seguros = new ArrayList<>();
    }

    public void agregarSeguros(Seguros seguros) {
        this.seguros.add(seguros);
    }

    public float calcularCostoTotal() {
        float total = 0;
        for (Seguros s : seguros) {
            total += s.costo();
        }
        return total;
    }
}
