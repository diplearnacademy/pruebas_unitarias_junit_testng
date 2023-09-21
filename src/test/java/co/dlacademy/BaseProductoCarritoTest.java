package co.dlacademy;

import com.github.javafaker.Faker;
import org.junit.jupiter.api.BeforeAll;

public class BaseProductoCarritoTest {
    protected static   String nombreProducto;
    protected static   double precio;

    @BeforeAll
    static void setup(){
        Faker faker = new Faker();
        nombreProducto = faker.commerce().productName();
        precio = faker.number().randomDouble(2,1,100);
    }
}
