package co.dlacademy;


import org.testng.annotations.Parameters;
import org.testng.annotations.Test;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertThrows;

public class ProductoTest extends BaseProductoCarritoTest {


    @Test
    void productoHeredadoTest(){
        System.out.println(nombreProducto);
        System.out.println(precio);
        Producto producto = new Producto(nombreProducto,precio);
        assertEquals(nombreProducto,producto.getNombre());

    }


    @Test
    @Parameters({"nombreProducto","precio"})
    public void testObtenerNombre(String nombreProducto,String precio) {
        System.out.println(nombreProducto);
        System.out.println(precio);
        Producto producto = new Producto(nombreProducto,Double.parseDouble(precio));
        assertEquals(nombreProducto, producto.getNombre());
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

