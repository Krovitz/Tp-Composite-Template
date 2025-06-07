package ejercicio2.modelo;

import java.util.ArrayList;
import java.util.List;

public class Proyecto {
    private List<ItemProyecto> items;


    public Proyecto() {
        this.items = new ArrayList<>();
    }

    public void agregarItem(ItemProyecto item) {
        items.add(item);
    }

    public float calcularDuracion() {
        float tiempoTotal = 0;
        for (ItemProyecto i : items) {
            tiempoTotal += i.duracion();
        }
        return tiempoTotal;
    }

}
