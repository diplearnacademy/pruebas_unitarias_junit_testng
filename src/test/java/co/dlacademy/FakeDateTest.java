package co.dlacademy;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class FakeDateTest extends BaseProductoCarritoTest {



    @Test
    public void testObtenerNombre() {
        System.out.println(nombreProducto);
        System.out.println(precio);
        Producto producto = new Producto(nombreProducto, precio);
        assertEquals(nombreProducto, producto.getNombre());
    }

    @Test
    public void testObtenerPrecio() {
        System.out.println(nombreProducto);
        System.out.println(precio);
        Producto producto = new Producto(nombreProducto, precio);
        assertEquals(precio, producto.getPrecio(), 0.01);
    }
}
