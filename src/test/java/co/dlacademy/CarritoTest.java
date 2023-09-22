package co.dlacademy;



import org.testng.annotations.*;

import static org.testng.Assert.assertEquals;
import static org.testng.Assert.assertTrue;


public class CarritoTest  extends  BaseProductoCarritoTest {
    private Carrito carrito;
    private Producto producto1;
    private Producto producto2;



    @DataProvider(name = "datosProductos")
    public Object[][] datosProductos() {
        return new Object[][]{
                {"blusa",45.0},
                {"guantes",56.0},
                {"pantalon",54.0}
        };

    }

    @Test(dataProvider = "datosProductos")
    @Parameters({"nombreProdcuto","precio"})
    public void testAgregarProducto(String nombreProdcuto,double precio) {
        Carrito carrito = new Carrito();
        Producto producto1 = new Producto(nombreProdcuto, precio);
        carrito.agregarProducto(producto1);
        assertEquals(1, carrito.getProductos().size());
        assertTrue(carrito.getProductos().contains(producto1));
    }

    @Test
    public void testEliminarProducto() {
        Carrito carrito = new Carrito();
        Producto producto1 = new Producto(nombreProducto, precio);
        carrito.agregarProducto(producto1);
        carrito.eliminarProducto(producto1);
        assertEquals(0, carrito.getProductos().size());
    }

    @Test
    public void testCalcularTotal() {
        Carrito carrito = new Carrito();
        Producto producto1 = new Producto("Artículo 1", 10.0);
        Producto producto2 = new Producto("Artículo 2", 15.0);
        carrito.agregarProducto(producto1);
        carrito.agregarProducto(producto2);
        assertEquals(25.0, carrito.calcularTotal(), 0.01);
    }

}
