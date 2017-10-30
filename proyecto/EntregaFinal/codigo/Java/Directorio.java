package clases;

//Librerias adicionales.
import java.util.LinkedList;

/**
 * Clase Directorio [Extiende de Archivo]. Aqui se almacena la estructura base
 * de una clase tipo Directorio.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 *
 * @version Octubre 2017
 */
public class Directorio extends Archivo {

    /**
     * Atributos de la clase Directorio. listaArchvios es una lista enlazada que
     * contiene todos los nombres de los archivos dentro de un Directorio.
     */
    private LinkedList<String> listaArchivos = new LinkedList<>();

    /**
     * Constructor de la clase Directorio.
     *
     * @param nombre Es el nombre del directorio.
     * @param ruta Es la ruta del directorio.
     * @param autor Es el autor del directorio.
     * @param peso Es el peso del directorio.
     */
    public Directorio(String nombre, String ruta, String autor, String peso) {
        super(nombre, ruta);
        this.autor = autor;
        this.peso = peso;
    }

    /**
     * Metodo agregarArchivo. Este metodo recive un String con el nombre de un
     * archivo y lo inserta en la lista enlazada del directorio.
     *
     * @param archivo Es el nombre del archivo que se va insertar.
     */
    public void agregarArchivo(String archivo) {
        listaArchivos.addLast(archivo);
    }

    /**
     * Metodo listar. Este metodo lista todos los elementos dentro del
     * directorio, es decir, se recorre toda la lista enlazada.
     */
    public void listar() {
        if (listaArchivos.isEmpty()) {
            System.out.println("No Existen Archivos dentro de este directorio");
            System.out.println();
        } else {
            System.out.println("Archivos existentes en: " + nombre);
            for (int i = 0; i < listaArchivos.size(); i++) {
                System.out.println("[" + i + "] " + listaArchivos.get(i));
            }
        }
    }
}
