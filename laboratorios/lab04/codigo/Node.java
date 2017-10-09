package lab04;

/**
 * Laboratorio 4. Punto 1.1. La plantilla de esta clase fue tomada del codigo
 * propuesto para el Laboratorio 4 de:
 * https://github.com/mauriciotoro/ST0245-Eafit/tree/master/laboratorios/lab04/codigo/Java/Laboratorio3/src
 *
 * Clase nodo: Contiene la estructura base de un nodo.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Octubre 2017
 */
public class Node {

    /**
     * Atributos del nodo.
     */
    public int data;
    public Node next;

    /**
     * Constructor de la Clase nodo.
     *
     * @param data
     */
    public Node(int data) {
        next = null;
        this.data = data;
    }

}
