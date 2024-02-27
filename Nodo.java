package src;

/**
 * Modelo de Nodo genérico para estructuras de datos.
 * Autor: Pablo Orellana
 * Esta clase define un nodo genérico utilizado en estructuras de datos como
 * listas enlazadas.
 */
public class Nodo<T> {
    private T valor; // El valor que almacena el nodo
    private Nodo<T> siguiente; // Referencia al siguiente nodo en la estructura

    /**
     * Constructor para crear un nuevo nodo con un valor especificado.
     * 
     * @param valor El valor a almacenar en el nodo.
     */
    public Nodo(T valor) {
        this.valor = valor;
        this.siguiente = null; // Inicialmente, el nodo no tiene un siguiente nodo vinculado
    }

    /**
     * Obtiene el valor almacenado en el nodo.
     * 
     * @return El valor del nodo.
     */
    public T obtenerValor() {
        return valor;
    }

    /**
     * Establece el valor del nodo.
     * 
     * @param valor El nuevo valor para el nodo.
     */
    public void establecerValor(T valor) {
        this.valor = valor;
    }

    /**
     * Obtiene el siguiente nodo en la estructura.
     * 
     * @return El siguiente nodo.
     */
    public Nodo<T> obtenerSiguiente() {
        return siguiente;
    }

    /**
     * Establece el siguiente nodo en la estructura.
     * 
     * @param siguiente El nodo a establecer como el siguiente.
     */
    public void establecerSiguiente(Nodo<T> siguiente) {
        this.siguiente = siguiente;
    }
}
