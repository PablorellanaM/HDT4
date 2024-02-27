package src;

import java.util.Scanner;

/**
 * Clase de arranque para la demostración de estructuras de datos.
 * Autor: Pablo Orellana
 */
public class AplicacionPrincipal {
    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        ControladorDePilas controlador = new ControladorDePilas();

        System.out.println("\nEVALUADOR DE EXPRESIONES CON DIFERENTES ESTRUCTURAS");
        System.out.println("1. Uso de ArrayList");
        System.out.println("2. Uso de Vector");
        System.out.println("3. Uso de Lista Enlazada");
        System.out.println("Seleccione la estructura a utilizar:");

        int opcion = entrada.nextInt();

        switch (opcion) {
            case 1:
                controlador.ejecutarArrayList();
                break;
            case 2:
                controlador.ejecutarVector();
                break;
            case 3:
                controlador.ejecutarListaEnlazada();
                break;
            default:
                System.out.println("Opción no válida. Intente de nuevo.");
                break;
        }
    }
}
