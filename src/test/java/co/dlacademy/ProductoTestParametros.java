//package co.dlacademy;
//
//import org.junit.jupiter.api.Test;
//
//import java.util.stream.Stream;
//import org.junit.jupiter.api.Test;
//import org.junit.jupiter.params.ParameterizedTest;
//import org.junit.jupiter.params.provider.Arguments;
//import org.junit.jupiter.params.provider.EnumSource;
//import org.junit.jupiter.params.provider.MethodSource;
//import org.junit.jupiter.params.provider.ValueSource;
//
//import static org.junit.jupiter.api.Assertions.assertEquals;
//
//
//import static org.junit.jupiter.api.Assertions.assertThrows;
//import static org.junit.jupiter.params.provider.Arguments.arguments;
//
//public class ProductoTestParametros {
//
//    private static Stream<Arguments> productos() {
//        return Stream.of(
//                arguments("producto1", 10.0),
//                arguments("producto2", 6.8),
//                arguments("producto3", 27.8),
//                arguments("producto4", 89.8),
//                arguments("producto4", 89.8),
//                arguments("producto4", 89.8)
//        );
//
//    }
//
//    private static Stream<Arguments> productosObjeto() {
//        return Stream.of(
//                arguments(new Producto("tenis",10.0),"tenis"),
//                arguments(new Producto("medias",89.0),"medias"),
//                arguments(new Producto("saco",78.0),"saco"),
//                arguments(new Producto("chaqueta",45.0),"botas")
//        );
//
//    }
//
//
//    @ParameterizedTest
//    @MethodSource("productosObjeto")
//     void testObtenerNombreObjeto(Producto producto,String valorEsperado) {
//
//        assertEquals(valorEsperado, producto.getNombre());
//    }
//
//
//
//
//    @ParameterizedTest
//    @MethodSource("productos")
//    public void testObtenerNombreParametros(String nombreProducto,double precio) {
//        Producto producto = new Producto(nombreProducto, precio);
//        assertEquals(nombreProducto, producto.getNombre());
//    }
//
//    @Test
//    public void testObtenerPrecio() {
//        Producto producto = new Producto("Producto 2", 15.0);
//        assertEquals(15.0, producto.getPrecio(), 0.01);
//    }
//
//    @Test
//    public void testProductoSinNombre() {
//        assertThrows(IllegalArgumentException.class, () -> new Producto("", 25.0));
//        assertThrows(IllegalArgumentException.class, () -> new Producto(null, 25.0));
//    }
//
//    @Test
//    public void testProductoPrecioNegativo() {
//        assertThrows(IllegalArgumentException.class, () -> new Producto("Producto 2", 0));
//    }
//
//
//
//
//}
//
