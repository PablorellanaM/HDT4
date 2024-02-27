package src;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

/**
 * Clase LectorArchivos para leer contenido de archivos de texto.
 * Autor: Pablo Orellana
 * Descripción: Encargada de leer y retornar el contenido de un archivo de
 * texto, línea por línea.
 */
public class LectorArchivos {
    private File archivo;

    /**
     * Constructor que inicializa el objeto LectorArchivos con un archivo
     * específico.
     * 
     * @param nombreArchivo El nombre del archivo a leer.
     */
    public LectorArchivos(String nombreArchivo) {
        this.archivo = new File(nombreArchivo);
    }

    /**
     * Lee el contenido del archivo línea por línea y lo retorna en una lista.
     * 
     * @return ArrayList<String> con las líneas leídas del archivo.
     */
    public ArrayList<String> leerArchivo() {
        ArrayList<String> lineas = new ArrayList<>();
        try (BufferedReader lector = new BufferedReader(new FileReader(archivo))) {
            String linea;
            while ((linea = lector.readLine()) != null) {
                lineas.add(linea);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
        return lineas;
    }
}
