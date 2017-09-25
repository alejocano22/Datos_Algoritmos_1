
package lab03;

/**
 * Laboratorio3. Punto 1.4. En esta clase se encuentra la plantilla de los datos
 * que manejara un pedido.
 *
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Septiembre 2017
 */
public class Solicitud {
    //Atributos
    private String nombre;
    private int pedido;

    //Constructor
    public Solicitud(String nombre, int pedido) {
        this.nombre = nombre;
        this.pedido = pedido;
    }

    //Metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getPedido() {
        return pedido;
    }

    public void setPedido(int pedido) {
        this.pedido = pedido;
    }
    
}
