package test;

import org.junit.*;
import src.ControladorPilas;
import java.util.ArrayList;

/**
 * Autor: Pablo Orellana
 * Descripción: Clase para probar las funcionalidades del controlador de pilas,
 * incluyendo la conversión de infix a postfix.
 */

public class ControladorPilasTest {

    /**
     * Prueba para verificar la correcta conversión de expresiones de infix a
     * postfix.
     */
    @Test
    public void pruebaConversionInfixPostfix() {
        ControladorPilas controlador = new ControladorPilas();
        String resultado = controlador.infixAPostfix("3 + 4 * 2 / ( 1 - 5 ) ^ 2 ^ 3");
        Assert.assertEquals("Verifica la conversión de infix a postfix", "3 4 2 * 1 5 - 2 3 ^ ^ / +", resultado);
    }

    /**
     * Prueba para verificar el manejo de expresiones con paréntesis anidados.
     */
    @Test
    public void pruebaManejoParentesisAnidados() {
        ControladorPilas controlador = new ControladorPilas();
        String resultado = controlador.infixAPostfix("( 3 + 4 ) * ( 2 - 1 )");
        Assert.assertEquals("Verifica la conversión con paréntesis anidados", "3 4 + 2 1 - *", resultado);
    }

    /**
     * Prueba para verificar el manejo de errores en expresiones mal formadas.
     */
    @Test
    public void pruebaExpresionMalFormada() {
        ControladorPilas controlador = new ControladorPilas();
        try {
            controlador.infixAPostfix("3 + * 4");
            Assert.fail("Debería lanzar una excepción por expresión mal formada");
        } catch (IllegalArgumentException e) {
            Assert.assertTrue("Manejo correcto de la excepción", true);
        }
    }
}
