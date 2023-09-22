package co.dlacademy;

import com.github.javafaker.Faker;
import org.testng.annotations.BeforeClass;

public class BaseProductoCarritoTest {

    protected static   String nombreProducto;
   protected static   double precio;

   @BeforeClass
    static void setup(){
       Faker faker = new Faker();
       nombreProducto = faker.commerce().productName();
       precio = faker.number().randomDouble(2,1,100);
    }
}
