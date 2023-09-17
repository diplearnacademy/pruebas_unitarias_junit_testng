package co.dlacademy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class HistorialCompraTest {
    private HistorialCompra historial;
    private Carrito carrito;
    private Producto producto1;
    private Producto producto2;

    @BeforeEach
    public void setUp() {
        historial = new HistorialCompra();
        carrito = new Carrito();
        producto1 = new Producto("Producto 1", 10.0);
        producto2 = new Producto("Producto 2", 15.0);
    }

    @Test
    public void testAgregarCompra() {
        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);
        historial.agregarCompra(carrito);

        assertEquals(1, historial.obtenerCompras().size());
        assertEquals(carrito, historial.obtenerCompras().get(0).getCarrito());
    }
}


