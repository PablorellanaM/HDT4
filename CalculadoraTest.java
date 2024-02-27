package test;

import org.junit.*;
import src.Calculadora;

/**
 * Autor: Pablo Orellana
 * Descripción: Clase para probar las funcionalidades de la calculadora,
 * incluyendo la evaluación de expresiones en postfix.
 */

public class CalculadoraTest {

    /**
     * Prueba la evaluación de una expresión simple en formato postfix.
     */
    @Test
    public void pruebaEvaluacionSimple() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.evaluar("3 4 +");
        Assert.assertEquals("Evalúa la expresión 3 + 4", 7.0, resultado, 0.01);
    }

    /**
     * Prueba la evaluación de una expresión compleja en formato postfix.
     */
    @Test
    public void pruebaEvaluacionCompleja() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.evaluar("5 9 8 + 4 6 * * 7 + *");
        Assert.assertEquals("Evalúa la expresión compleja", 2075.0, resultado, 0.01);
    }

    /**
     * Prueba la evaluación de una expresión con división y potencia en formato
     * postfix.
     */
    @Test
    public void pruebaDivisionYPotencia() {
        Calculadora calculadora = new Calculadora();
        double resultado = calculadora.evaluar("9 3 / 2 ^");
        Assert.assertEquals("Evalúa la expresión con división y potencia", 9.0, resultado, 0.01);
    }

    /**
     * Prueba el manejo de una expresión que intenta dividir por cero.
     */
    @Test
    public void pruebaDivisionPorCero() {
        Calculadora calculadora = new Calculadora();
        try {
            calculadora.evaluar("4 0 /");
            Assert.fail("Debería lanzar ArithmeticException por división por cero");
        } catch (ArithmeticException e) {
            Assert.assertTrue("Manejo correcto de división por cero", true);
        }
    }
}
