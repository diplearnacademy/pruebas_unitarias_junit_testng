package co.dlacademy;

import org.junit.jupiter.api.*;

public class AnotacionesTest {

    @BeforeEach
    void beforeMethod(){
        System.out.println("se ejecuta  antes de cada test ");
    }

    @AfterEach
    void afterMethod(){
        System.out.println("se ejecuta despues de cada test");
    }

    @BeforeAll
    static void beforeClass(){
        System.out.println("se ejecuta antes del primer test una vez por toda la clase");
    }

    @AfterAll
    static void afterClass(){
        System.out.println("se ejecuta despues  del ultimo test una vez por toda la clase");
    }

    @Test
    void test1(){
        System.out.println("ejecutar test 1");

    }

    @Test
    void test2(){
        System.out.println("ejecutar test 2");

    }
}
