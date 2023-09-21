package co.dlacademy;

import org.junit.jupiter.api.*;

import java.util.stream.Stream;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;


@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
public class CarritoTest {
    private Carrito carrito;
    private Producto producto1;
    private Producto producto2;

    @BeforeEach
    public void setUp() {
        carrito = new Carrito();
        producto1 = new Producto("Artículo 1", 10.0);
        producto2 = new Producto("Artículo 2", 15.0);
    }

    @AfterEach
    public void tearDown() {
        carrito = null;
        producto1 = null;
        producto2 = null;
    }

    @Test
    @Order(1)
    public void testAgregarProducto() {
        carrito.agregarProducto(producto1);
        assertEquals(1, carrito.getProductos().size());
        assertTrue(carrito.getProductos().contains(producto1));
    }

    @Test
    @Order(2)
    public void testEliminarProducto() {
        carrito.agregarProducto(producto1);
        carrito.eliminarProducto(producto1);
        assertEquals(0, carrito.getProductos().size());
    }

    @Test
    @Order(3)
    public void testCalcularTotal() {
        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);
        assertEquals(25.0, carrito.calcularTotal(), 0.01);
    }

}
