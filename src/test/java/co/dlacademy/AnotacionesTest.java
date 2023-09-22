//package co.dlacademy;
//
//import org.junit.jupiter.api.*;
//
//@TestMethodOrder(MethodOrderer.OrderAnnotation.class)
//public class AnotacionesTest {
//
//    @BeforeEach
//    void beforeMethod(){
//        System.out.println("se ejecuta  antes de cada test ");
//    }
//
//    @AfterEach
//    void afterMethod(){
//        System.out.println("se ejecuta despues de cada test");
//    }
//
//    @BeforeAll
//    static void beforeClass(){
//        System.out.println("se ejecuta antes del primer test una vez por toda la clase");
//    }
//
//    @AfterAll
//    static void afterClass(){
//        System.out.println("se ejecuta despues  del ultimo test una vez por toda la clase");
//    }
//
//    @Test
//    @Order(3)
//    void test1(){
//        System.out.println("ejecutar test 1");
//
//    }
//
//    @Test
//    @Order(2)
//    void test2(){
//        System.out.println("ejecutar test 2");
//
//    }
//
//    @Test
//    @Order(1)
//    void test3(){
//        System.out.println("ejecutar test 3");
//
//    }
//}
