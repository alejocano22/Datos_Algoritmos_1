package proyectodatos;

/**
 * Clase Archivo que se usa para identificar los archivos que maneja la estructura
 */
public class Archivo {
    
    /**
     * Datos del archivo
     */
        public String nombre;
        public String autor;
        public double tamaño;
        
        /**
         * Método constructor de la clase, crea un objeto Archivo nuevo
         * @param n Es el nombre del archivo
         * @param a Es el autor del archivo
         * @param t Es el tamaño del archivo
         */
        public Archivo(String n, String a, double t){
            this.nombre=n;
            this.autor=a;
            this.tamaño=t;
        }
    
}
