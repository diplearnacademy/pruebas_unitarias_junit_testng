package co.dlacademy;

import java.util.ArrayList;
import java.util.List;

public class Carrito {

    private List<Producto> items;

    public Carrito() {
        items = new ArrayList<>();
    }

    public void agregarProducto(Producto producto) {
        items.add(producto);
    }

    public void eliminarProducto(Producto producto) {
        items.remove(producto);
    }

    public double calcularTotal() {
        double total = 0;

        for (Producto item: items ) {
            total += item.getPrecio();
        }
        return  total;
    }

    public List<Producto> getProductos() {
        return items;
    }
}
