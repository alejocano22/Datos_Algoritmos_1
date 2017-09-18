package Punto2.Array3;

/**
 * Laboratorio2. Punto 2.2 Codingbat Array III. En esta clase se encuentra el
 * ejercicio linearIn realizado de la seccion Array III de Codingbat.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Septiembre 2017
 */
public class LinearIn {

    /**
     * Given two arrays of ints sorted in increasing order, outer and inner,
     * return true if all of the numbers in inner appear in outer. The best
     * solution makes only a single "linear" pass of both arrays, taking
     * advantage of the fact that both arrays are already in sorted order.
     *
     * linearIn([1, 2, 4, 6], [2, 4]) → true linearIn([1, 2, 4, 6], [2, 3, 4]) →
     * false linearIn([1, 2, 4, 4, 6], [2, 4]) → true
     *
     * @param outer
     * @param inner
     * @return
     */
    public boolean linearIn(int[] outer, int[] inner) {
        for (int i = 0; i < inner.length; i++) {
            if (!buscar(inner[i], outer)) {
                return false;
            }
        }
        return true;
    }

    /**
     * Metodo buscar. El cual sirve como metodo auxiliar al metodo linearIn.
     *
     * @param e
     * @param outer
     * @return
     */
    public boolean buscar(int e, int[] outer) {
        for (int i = 0; i < outer.length; i++) {
            if (outer[i] == e) {
                return true;
            }
        }
        return false;
    }
}
