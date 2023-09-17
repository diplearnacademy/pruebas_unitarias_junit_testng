package co.dlacademy;

import java.util.ArrayList;
import java.util.List;

public class HistorialCompra {
    private List<Compra> compras;

    public HistorialCompra() {
        compras = new ArrayList<>();
    }

    public void agregarCompra(Carrito carrito) {
        Compra compra = new Compra(carrito);
        compras.add(compra);
    }

    public List<Compra> obtenerCompras() {
        return compras;
    }
}

