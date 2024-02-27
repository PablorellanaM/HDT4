package src;

/**
 * Calculadora simple para operaciones aritméticas básicas.
 * Implementa el patrón Singleton para asegurar una única instancia.
 * 
 * @author Pablo Orellana
 */
public class SimpleCalculator {
    private static SimpleCalculator uniqueInstance;

    // Constructor privado para prevenir instanciación
    private SimpleCalculator() {
    }

    /**
     * Obtiene la única instancia de la calculadora.
     * 
     * @return La instancia única de SimpleCalculator.
     */
    public static synchronized SimpleCalculator getInstance() {
        if (uniqueInstance == null) {
            uniqueInstance = new SimpleCalculator();
        }
        return uniqueInstance;
    }

    /**
     * Realiza la suma de dos números.
     * 
     * @param a Primer número.
     * @param b Segundo número.
     * @return La suma de a y b.
     */
    public double add(double a, double b) {
        return a + b;
    }

    /**
     * Realiza la resta de dos números.
     * 
     * @param a Primer número.
     * @param b Segundo número.
     * @return La resta de a y b.
     */
    public double subtract(double a, double b) {
        return a - b;
    }

    /**
     * Realiza la multiplicación de dos números.
     * 
     * @param a Primer número.
     * @param b Segundo número.
     * @return El producto de a y b.
     */
    public double multiply(double a, double b) {
        return a * b;
    }

    /**
     * Realiza la división de dos números.
     * 
     * @param a Dividendo.
     * @param b Divisor.
     * @return El cociente de a y b.
     */
    public double divide(double a, double b) {
        if (b == 0) {
            throw new IllegalArgumentException("Divisor cannot be zero.");
        }
        return a / b;
    }
}
