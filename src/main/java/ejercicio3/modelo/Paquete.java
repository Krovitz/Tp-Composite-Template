package ejercicio3.modelo;

import java.util.ArrayList;
import java.util.List;

public class Paquete implements Seguros {
    private List<Seguros> seguros;


    public Paquete() {
        this.seguros = new ArrayList<>();
    }

    @Override
    public void agregarSeguro(Seguros unSeguro) {
        seguros.add(unSeguro);
    }

    public float descuento() {
        return (seguros.size() * 5f) / 100f; //Problema:Los paquetes incluidos tambien acumulan 5% de descuento

    }

    @Override
    public float costo() {
        float total = 0;
        for (Seguros s : seguros) {
            total += s.costo();
        }
        return total - (total * descuento());
    }

}
