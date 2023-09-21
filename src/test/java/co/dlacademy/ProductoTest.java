package co.dlacademy;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

public class ProductoTest {

    @Test
    public void testObtenerNombre() {
        Producto producto = new Producto("Producto 1", 10.0);
        assertEquals("Producto 1", producto.getNombre());
    }

    @Test
    public void testObtenerPrecio() {
        Producto producto = new Producto("Producto 2", 15.0);
        assertEquals(15.0, producto.getPrecio(), 0.01);
    }

    @Test
    public void testProductoSinNombre() {
        assertThrows(IllegalArgumentException.class, () -> new Producto("", 25.0));
        assertThrows(IllegalArgumentException.class, () -> new Producto(null, 25.0));
    }

    @Test
    public void testProductoPrecioNegativo() {
        assertThrows(IllegalArgumentException.class, () -> new Producto("Producto 2", 0));
    }




}

