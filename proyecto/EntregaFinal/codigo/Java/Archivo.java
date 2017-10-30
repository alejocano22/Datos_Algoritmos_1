package clases;

/**
 * Clase [Abstracta] Archivo. Aqui se almacena la estructura base de una clase
 * tipo Archivo (Directorio y Fichero), con el fin de manejar el polimorfismo en
 * el proyecto.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 *
 * @version Octubre 2017
 */
public abstract class Archivo {

    /**
     * Atributos de la clase Archivo.
     */
    String nombre;
    String ruta;
    String autor;
    String peso;

    /**
     * Constructor de la clase Archivo.
     *
     * @param nombre Es el nombre del archivo.
     * @param ruta Es la ruta donde se encuentra el archivo.
     */
    public Archivo(String nombre, String ruta) {
        this.nombre = nombre;
        this.ruta = ruta;
    }

    /**
     * getNombre.
     *
     * @return Retorna el nombre del archivo.
     */
    public String getNombre() {
        return nombre;
    }

    /**
     * setNOmbre.
     *
     * @param nombre Modifica el nombre del archivo.
     */
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    /**
     * getRuta.
     *
     * @return Retorna la ruta del archivo.
     */
    public String getRuta() {
        return ruta;
    }

    /**
     * setRuta.
     *
     * @param ruta Modifica la ruta del archivo.
     */
    public void setRuta(String ruta) {
        this.ruta = ruta;
    }

    /**
     * getAutor.
     *
     * @return Retorna el nombre del autor.
     */
    public String getAutor() {
        return autor;
    }

    /**
     * setAutor.
     *
     * @param autor Modifica el nombre del autor.
     */
    public void setAutor(String autor) {
        this.autor = autor;
    }

    /**
     * getPeso.
     *
     * @return Retorna el peso del archivo.
     */
    public String getPeso() {
        return peso;
    }

    /**
     * setPeso.
     *
     * @param peso Modifica el peso del archivo.
     */
    public void setPeso(String peso) {
        this.peso = peso;
    }

}
