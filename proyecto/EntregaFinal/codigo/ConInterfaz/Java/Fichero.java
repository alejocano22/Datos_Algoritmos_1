package clases;

/**
 * Clase Fichero [Extiende de Archivo]. Aqui se almacena la estructura base de
 * una clase tipo fichero.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 *
 * @version Octubre 2017
 */
public class Fichero extends Archivo {

    /**
     * Constructor de la clase Fichero.
     *
     * @param nombre Es el nombre del fichero.
     * @param ruta Es la ruta del fichero.
     * @param autor Es el autor del fichero.
     * @param peso Es el peso del fichero.
     */
    public Fichero(String nombre, String ruta, String autor, String peso) {
        super(nombre, ruta);
        this.autor = autor;
        this.peso = peso;
    }
}
