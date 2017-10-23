package lab05;

/**
 * Laboratorio 5 (Punto 1). Clase Node. En esta clase se encuentra la implementacion de la
 * estructura de un nodo. La plantilla del codigo fue tomada del codigo
 * propuesto para el laboratio 5. Enlace:
 * https://github.com/mauriciotoro/ST0245-Eafit/tree/master/laboratorios/lab05/codigo/java/Laboratorio5/src
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Octubre 2017
 */
public class Node {

    /**
     * Atributos
     */
    public Node left;
    public Node right;
    public String data;

    /**
     * Constructor de Node.
     *
     * @param d Es el dato que se almacenara en el nodo.
     */
    public Node(String d) {
        data = d;
    }
}
