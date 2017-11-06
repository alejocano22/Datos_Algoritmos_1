package lab06;

/**
 * Laboratorio 6. Clase Pareja. Esta clase permite hacer una lista que tenga dos
 * valores en sus nodos. La plantilla de esta clase fue tomada del Github del
 * docente Mauricio Toro, en el siguiente enlace:
 * https://github.com/mauriciotoro/ST0245-Eafit/tree/master/laboratorios/lab06
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 *
 * @version Noviembre 2017
 */

public class Pareja {

    /**
     * Atributos, Vertice y Peso.
     */
    public int vertice;
    public int peso;

    /**
     * Constructor de la clase Pareja.
     * @param v Es el vertice.
     * @param p Es el peso.
     */
    public Pareja(int v, int p) {
        vertice = v;
        peso = p;
    }
}
