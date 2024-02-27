package src;

/**
 * Implementación de un Nodo doblemente enlazado para uso en estructuras de
 * datos.
 * Autor: Pablo Orellana
 */
public class NodoDoble<T> {
    private T dato;
    private NodoDoble<T> siguiente;
    private NodoDoble<T> anterior;

    /**
     * Constructor que inicializa el nodo con un dato.
     * 
     * @param dato El dato almacenado en el nodo.
     */
    public NodoDoble(T dato) {
        this.dato = dato;
        this.siguiente = null;
        this.anterior = null;
    }

    /**
     * Establece el nodo siguiente.
     * 
     * @param siguiente El nodo que sigue al actual.
     */
    public void establecerSiguiente(NodoDoble<T> siguiente) {
        this.siguiente = siguiente;
    }

    /**
     * Obtiene el nodo siguiente.
     * 
     * @return El nodo siguiente.
     */
    public NodoDoble<T> obtenerSiguiente() {
        return this.siguiente;
    }

    /**
     * Establece el nodo anterior.
     * 
     * @param anterior El nodo anterior al actual.
     */
    public void establecerAnterior(NodoDoble<T> anterior) {
        this.anterior = anterior;
    }

    /**
     * Obtiene el nodo anterior.
     * 
     * @return El nodo anterior.
     */
    public NodoDoble<T> obtenerAnterior() {
        return this.anterior;
    }

    /**
     * Obtiene el dato del nodo.
     * 
     * @return El dato almacenado en el nodo.
     */
    public T obtenerDato() {
        return this.dato;
    }
}
