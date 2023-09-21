package co.dlacademy;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class CompraTest {
    private Compra compra;
    private Carrito carrito;
    private Producto producto1;
    private Producto producto2;

    @BeforeEach
    public void setUp() {
        carrito = new Carrito();
        producto1 = new Producto("Producto 1", 10.0);
        producto2 = new Producto("Producto 2", 15.0);
        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);
        compra = new Compra(carrito);
    }

    @Test
    public void testObtenerFecha() {
        carrito = new Carrito();
        producto1 = new Producto("Producto 1", 10.0);
        producto2 = new Producto("Producto 2", 15.0);
        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);
        compra = new Compra(carrito);
        assertNotNull(compra.getFecha());
    }

    @Test
    public void testObtenerCarrito() {
        carrito = new Carrito();
        producto1 = new Producto("Producto 1", 10.0);
        producto2 = new Producto("Producto 2", 15.0);
        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);
        compra = new Compra(carrito);
        assertEquals(carrito, compra.getCarrito());
    }

    @Test
    public void testObtenerTotal() {
        carrito = new Carrito();
        producto1 = new Producto("Producto 1", 10.0);
        producto2 = new Producto("Producto 2", 15.0);
        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);
        compra = new Compra(carrito);
        assertEquals(25.0, compra.getTotal(), 0.01);
    }
}

