package src;

/**
 * Implementación de Pila con Lista Enlazada.
 * Autor: Pablo Orellana
 * Descripción: Esta clase define una pila genérica utilizando una estructura de
 * lista enlazada.
 * 
 * @param <E> Tipo genérico de elementos en la pila.
 */
public class PilaEnlazada<E> implements IPila<E> {
    private Nodo<E> cima; // Nodo superior de la pila

    /**
     * Constructor que inicializa la pila vacía.
     */
    public PilaEnlazada() {
        cima = null; // La pila se inicializa sin elementos.
    }

    /**
     * Agrega un elemento a la cima de la pila.
     * 
     * @param elemento Elemento a agregar.
     */
    public void apilar(E elemento) {
        Nodo<E> nuevoNodo = new Nodo<>(elemento);
        nuevoNodo.establecerSiguiente(cima); // El siguiente del nuevo nodo es la antigua cima.
        cima = nuevoNodo; // Actualiza la cima de la pila al nuevo nodo.
    }

    /**
     * Elimina y devuelve el elemento en la cima de la pila.
     * 
     * @return El elemento en la cima de la pila, o null si la pila está vacía.
     */
    public E desapilar() {
        if (estaVacia()) {
            return null;
        }
        E elemento = cima.obtenerDato(); // Obtiene el dato de la cima.
        cima = cima.obtenerSiguiente(); // Mueve la cima al siguiente nodo.
        return elemento;
    }

    /**
     * Consulta el elemento en la cima de la pila sin eliminarlo.
     * 
     * @return El elemento en la cima de la pila, o null si la pila está vacía.
     */
    public E cima() {
        if (estaVacia()) {
            return null;
        }
        return cima.obtenerDato();
    }

    /**
     * Verifica si la pila está vacía.
     * 
     * @return true si la pila está vacía, false en caso contrario.
     */
    public boolean estaVacia() {
        return cima == null;
    }
}
