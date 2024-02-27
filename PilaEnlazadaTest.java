package test;

import org.junit.*;
import src.PilaEnlazada;

/**
 * Autor: Pablo Orellana
 * Descripción: Clase que verifica las operaciones de la pila implementada con
 * estructura de lista enlazada.
 */

public class PilaEnlazadaTest {

    /**
     * Verifica que el método agregar (push) inserta correctamente los elementos en
     * la pila.
     */
    @Test
    public void pruebaAgregarElemento() {
        PilaEnlazada<Integer> pila = new PilaEnlazada<>();
        pila.agregar(1);
        Assert.assertEquals("Confirma que el último elemento agregado es 1", (Integer) 1, pila.obtenerUltimo());
    }

    /**
     * Verifica que el método eliminar (pop) funciona correctamente, removiendo el
     * elemento en el tope.
     */
    @Test
    public void pruebaEliminarElemento() {
        PilaEnlazada<Integer> pila = new PilaEnlazada<>();
        pila.agregar(2);
        pila.agregar(3);
        Assert.assertEquals("Confirma que el elemento removido es 3", (Integer) 3, pila.eliminar());
        Assert.assertEquals("Confirma que el nuevo tope es 2", (Integer) 2, pila.obtenerUltimo());
    }

    /**
     * Verifica que la pila esté vacía tras eliminar todos los elementos.
     */
    @Test
    public void pruebaPilaVaciaDespuesDeEliminar() {
        PilaEnlazada<Integer> pila = new PilaEnlazada<>();
        pila.agregar(4);
        pila.eliminar();
        Assert.assertTrue("Verifica que la pila está vacía", pila.estaVacia());
    }

    /**
     * Verifica el tamaño de la pila tras varias operaciones.
     */
    @Test
    public void pruebaTamanioPila() {
        PilaEnlazada<Integer> pila = new PilaEnlazada<>();
        pila.agregar(5);
        pila.agregar(6);
        Assert.assertEquals("Confirma que el tamaño de la pila es 2", 2, pila.tamanio());
    }
}
