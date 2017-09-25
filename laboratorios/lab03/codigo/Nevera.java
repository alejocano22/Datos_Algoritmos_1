package lab03;

/**
 * Laboratorio3. Punto 1.4. En esta clase se encuentra la plantilla de los datos
 * que manejara una nevera.
 *
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Septiembre 2017
 */
public class Nevera {
    //Atributos
    private int codigo;
    private String nombre;
    
    //Constructor
    public Nevera(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    //Metodos
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

}
