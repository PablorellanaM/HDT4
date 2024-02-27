package test;

import org.junit.*;
import src.PilaDoblementeEnlazada;

/**
 * Autor: Pablo Orellana
 * Descripción: Clase para probar las funcionalidades de la pila implementada
 * con una lista doblemente enlazada.
 */

public class PilaDoblementeEnlazadaTest {

    /**
     * Verifica la inserción de elementos en la pila.
     */
    @Test
    public void pruebaAgregarElemento() {
        PilaDoblementeEnlazada<Integer> pila = new PilaDoblementeEnlazada<>();
        pila.agregar(10);
        Assert.assertEquals("Confirma que el último elemento agregado es 10", (Integer) 10, pila.obtenerUltimo());
    }

    /**
     * Comprueba la eliminación correcta de elementos de la pila.
     */
    @Test
    public void pruebaEliminarElemento() {
        PilaDoblementeEnlazada<Integer> pila = new PilaDoblementeEnlazada<>();
        pila.agregar(20);
        pila.agregar(30);
        Assert.assertEquals("Confirma que el elemento removido es 30", (Integer) 30, pila.eliminar());
        Assert.assertEquals("Confirma que el nuevo tope es 20", (Integer) 20, pila.obtenerUltimo());
    }

    /**
     * Verifica que la pila se encuentre vacía tras eliminar todos sus elementos.
     */
    @Test
    public void pruebaPilaVacia() {
        PilaDoblementeEnlazada<Integer> pila = new PilaDoblementeEnlazada<>();
        pila.agregar(40);
        pila.eliminar();
        Assert.assertTrue("La pila debe estar vacía", pila.estaVacia());
    }

    /**
     * Prueba el tamaño de la pila después de varias operaciones de agregado y
     * eliminación.
     */
    @Test
    public void pruebaTamanioPila() {
        PilaDoblementeEnlazada<Integer> pila = new PilaDoblementeEnlazada<>();
        pila.agregar(50);
        pila.agregar(60);
        pila.eliminar();
        pila.agregar(70);
        Assert.assertEquals("El tamaño de la pila debe ser 2", 2, pila.tamanio());
    }
}
