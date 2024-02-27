package src;

/**
 * Interfaz para las operaciones fundamentales de una pila.
 * Autor: Pablo Orellana
 * Fecha de creación: 20/02/2024
 * Descripción: Define los métodos esenciales para manipular una pila.
 */
public interface IPila<T> {
    /**
     * Añade un elemento al tope de la pila.
     * 
     * @param elemento Elemento a añadir.
     */
    void apilar(T elemento);

    /**
     * Remueve y devuelve el elemento en el tope de la pila.
     * 
     * @return El elemento removido de la pila.
     */
    T desapilar();

    /**
     * Devuelve el elemento en el tope de la pila sin removerlo.
     * 
     * @return El elemento en el tope de la pila.
     */
    T consultarCima();

    /**
     * Verifica si la pila está vacía.
     * 
     * @return true si la pila no contiene elementos, false en caso contrario.
     */
    boolean estaVacia();
}
