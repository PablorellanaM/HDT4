package src;
import java.util.ArrayList;

/**
 * Implementa una estructura de datos tipo pila utilizando una lista dinámica.
 * @param <E> Tipo de elementos que almacenará la pila.
 * @author Pablo Orellana
 */
public class DynamicStack<E> implements IStack<E> {
    private ArrayList<E> elements;

    /**
     * Constructor que inicializa la lista interna.
     */
    public DynamicStack() {
        elements = new ArrayList<>();
    }

    /**
     * Añade un elemento al tope de la pila.
     * @param item El elemento a añadir.
     */
    @Override
    public void push(E item) {
        elements.add(item);
    }

    /**
     * Retorna y elimina el elemento en el tope de la pila.
     * @return El elemento en el tope de la pila.
     */
    @Override
    public E pop() {
        if (isEmpty()) {
            return null; // Considerar lanzar una excepción si es necesario.
        }
        return elements.remove(elements.size() - 1);
    }

    /**
     * Retorna el elemento en el tope de la pila sin eliminarlo.
     * @return El elemento en el tope de la pila.
     */
    @Override
    public E top() {
        if (isEmpty()) {
            return null; // Considerar lanzar una excepción si es necesario.
        }
        return elements.get(elements.size() - 1);
    }

    /**
     * Verifica si la pila está vacía.
     * @return true si la pila está vacía, false en caso contrario.
     */
    @Override
    public boolean isEmpty() {
        return elements.isEmpty();
    }

    /**
     * Retorna el número de elementos en la pila.
     * @return El tamaño de la pila.
     */
    @Override
    public int size() {
        return elements.size();
    }
}
