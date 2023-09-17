package co.dlacademy;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculadoraTest {

    @Test
    void  testSumarDosNumerosEnterosExitosamente(){
        //Arrange
        Calculadora calculadora = new Calculadora();
        int a = 5;
        int b = 10;
        int resultadoEsperado = 15;
        // Act
        int resultado = calculadora.sumar(a,b);
        //Assert
        Assertions.assertEquals(resultado,resultadoEsperado);

    }
}
