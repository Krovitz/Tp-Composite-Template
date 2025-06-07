package ejercicio4;

import ejercicio4.modelo.ProveedorDeFecha;

import java.time.LocalDate;

public class ProveedorDeFechaFake implements ProveedorDeFecha {
    @Override
    public LocalDate fecha() {
        return LocalDate.of(2025, 05, 10);
    }
}
