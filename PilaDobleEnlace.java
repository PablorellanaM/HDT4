package src;

/**
 * Implementación de Pila con Lista Doblemente Enlazada.
 * Autor: Pablo Orellana
 * Descripción: Esta clase define una pila utilizando una estructura de lista
 * doblemente enlazada.
 * 
 * @param <E> Tipo genérico de elementos en la pila.
 */
public class PilaDobleEnlace<E> implements IPila<E> {

    private NodoDoble<E> ultimoNodo;

    /**
     * Constructor de la pila, inicializa con un nodo final nulo.
     */
    public PilaDobleEnlace() {
        this.ultimoNodo = new NodoDoble<>(null);
    }

    /**
     * Agrega un elemento a la pila.
     * 
     * @param elemento Elemento a agregar.
     */
    public void apilar(E elemento) {
        NodoDoble<E> nuevoNodo = new NodoDoble<>(elemento);
        if (!estaVacia()) {
            nuevoNodo.establecerAnterior(ultimoNodo);
            ultimoNodo.establecerSiguiente(nuevoNodo);
        }
        ultimoNodo = nuevoNodo;
    }

    /**
     * Elimina y devuelve el elemento en la cima de la pila.
     * 
     * @return El elemento eliminado de la pila.
     */
    public E desapilar() {
        if (estaVacia()) {
            return null;
        }
        E elemento = ultimoNodo.obtenerDato();
        ultimoNodo = ultimoNodo.obtenerAnterior();
        if (ultimoNodo != null) {
            ultimoNodo.establecerSiguiente(null);
        }
        return elemento;
    }

    /**
     * Consulta el elemento en la cima de la pila sin eliminarlo.
     * 
     * @return El elemento en la cima, o null si la pila está vacía.
     */
    public E consultarCima() {
        return estaVacia() ? null : ultimoNodo.obtenerDato();
    }

    /**
     * Verifica si la pila está vacía.
     * 
     * @return true si la pila no tiene elementos, false en caso contrario.
     */
    public boolean estaVacia() {
        return ultimoNodo == null || ultimoNodo.obtenerDato() == null;
    }
}
