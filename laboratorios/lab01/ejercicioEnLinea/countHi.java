package Punto2.Recursion1;

/**
 * Laboratorio1. Punto 2.1 Codingbat Recursion I. En esta clase se encuentra el
 * ejercicio countHi realizado de la seccion Recursion I de Codingbat.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Agosto 2017
 */
public class countHi {

    /**
     * Given a string, compute recursively (no loops) the number of times
     * lowercase "hi" appears in the string.
     *
     * countHi("xxhixx") → 1 countHi("xhixhix") → 2 countHi("hi") → 1
     *
     * @param str
     * @return
     */
    public int countHi(String str) {
        int cont = 0;
        if (str.length() == 1 || str.length() == 0) {
            return 0;
        } else if (str.charAt(0) == 'h' && str.charAt(1) == 'i') {
            cont = 1;
        }
        return cont + countHi(str.substring(1));
    }
}
