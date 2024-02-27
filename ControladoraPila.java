package src;

import java.io.File;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Controlador de Pila para la conversión y evaluación de expresiones.
 * Autor: Pablo Orellana
 * Esta clase gestiona la selección y operación de diferentes implementaciones
 * de pila.
 */

public class ControladorPila {
    private IStack<Character> pilaInfixPostfix;
    private IStack<String> pilaResultadoPostfix;
    private LectorExpresiones lector;

    /**
     * Crea instancias de las pilas necesarias para la conversión y evaluación.
     */
    public ControladorPila() {
        pilaInfixPostfix = new LinkedStack<>();
        pilaResultadoPostfix = new VectorStack<>();
        lector = new LectorExpresiones();
    }

    /**
     * Selecciona el tipo de pila a utilizar basado en la entrada del usuario.
     * 
     * @param tipoPila El tipo de implementación de pila elegida.
     */
    public void seleccionarPila(String tipoPila) {
        switch (tipoPila.toLowerCase()) {
            case "vector":
                pilaInfixPostfix = new VectorStack<>();
                pilaResultadoPostfix = new VectorStack<>();
                break;
            case "linked":
                pilaInfixPostfix = new LinkedStack<>();
                pilaResultadoPostfix = new LinkedStack<>();
                break;

            default:
                System.out.println("Tipo de pila no reconocido. Usando implementación por defecto.");
                break;
        }
    }

    /**
     * Procesa la expresión matemática desde un archivo.
     * 
     * @param rutaArchivo La ruta al archivo que contiene la expresión.
     */
    public void procesarExpresionDesdeArchivo(String rutaArchivo) {
        File archivo = new File(rutaArchivo);
        try (Scanner scanner = new Scanner(archivo)) {
            while (scanner.hasNextLine()) {
                String linea = scanner.nextLine();

                System.out.println("Procesando: " + linea);
            }
        } catch (Exception e) {
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }
    }

}
