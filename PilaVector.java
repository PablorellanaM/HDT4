package src;

import java.util.Vector;

/**
 * Implementación de Pila usando Vector de Java.
 * Autor: Pablo Orellana
 * Descripción: Define una pila basada en la estructura de datos Vector de Java.
 * 
 * @param <E> Tipo genérico de los elementos de la pila.
 */
public class PilaVector<E> implements IPila<E> {

    private Vector<E> elementos;

    /**
     * Constructor que inicializa el vector de la pila.
     */
    public PilaVector() {
        elementos = new Vector<E>();
    }

    /**
     * Añade un elemento al tope de la pila.
     * 
     * @param item El elemento a añadir.
     */
    @Override
    public void apilar(E item) {
        elementos.add(item);
    }

    /**
     * Elimina y retorna el elemento del tope de la pila.
     * 
     * @return El elemento en el tope de la pila.
     */
    @Override
    public E desapilar() {
        if (estaVacia()) {
            return null;
        }
        return elementos.remove(elementos.size() - 1);
    }

    /**
     * Retorna el elemento en el tope de la pila sin eliminarlo.
     * 
     * @return El elemento en el tope de la pila.
     */
    @Override
    public E consultarCima() {
        if (estaVacia()) {
            return null;
        }
        return elementos.get(elementos.size() - 1);
    }

    /**
     * Verifica si la pila está vacía.
     * 
     * @return Verdadero si la pila está vacía, falso en caso contrario.
     */
    @Override
    public boolean estaVacia() {
        return elementos.isEmpty();
    }
}
