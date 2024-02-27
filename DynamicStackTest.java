package test;

import org.junit.*;
import src.DynamicStack;

/**
 * Autor: Pablo Orellana
 * Descripción: Clase para probar las funcionalidades de la pila implementada
 * con un ArrayList.
 */

public class DynamicStackTest {

    /**
     * Verifica la inserción de elementos en la pila.
     */
    @Test
    public void pruebaAgregarElemento() {
        DynamicStackTest<Integer> pila = new DynamicStackTest<>();
        pila.agregar(1);
        Assert.assertEquals("Confirma que el último elemento agregado es 1", (Integer) 1, pila.obtenerUltimo());
    }

    /**
     * Comprueba la eliminación correcta de elementos de la pila.
     */
    @Test
    public void pruebaEliminarElemento() {
        DynamicStackTest<Integer> pila = new DynamicStackTest<>();
        pila.agregar(2);
        pila.agregar(3);
        Assert.assertEquals("Confirma que el elemento removido es 3", (Integer) 3, pila.eliminar());
        Assert.assertEquals("Confirma que el nuevo tope es 2", (Integer) 2, pila.obtenerUltimo());
    }

    /**
     * Verifica que la pila se encuentre vacía tras eliminar todos sus elementos.
     */
    @Test
    public void pruebaPilaVacia() {
        DynamicStackTest<Integer> pila = new DynamicStackTest<>();
        pila.agregar(4);
        pila.eliminar();
        Assert.assertTrue("La pila debe estar vacía", pila.estaVacia());
    }

    /**
     * Prueba el tamaño de la pila después de varias operaciones de agregado y
     * eliminación.
     */
    @Test
    public void pruebaTamanioPila() {
        DynamicStackTest<Integer> pila = new DynamicStackTest<>();
        pila.agregar(5);
        pila.agregar(6);
        Assert.assertEquals("El tamaño de la pila debe ser 2", 2, pila.tamanio());
    }
}
