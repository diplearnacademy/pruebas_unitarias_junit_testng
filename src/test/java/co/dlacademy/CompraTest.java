package co.dlacademy;


import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertNotNull;

public class CompraTest {
    private Compra compra;
    private Carrito carrito;
    private Producto producto1;
    private Producto producto2;

    @BeforeMethod
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

