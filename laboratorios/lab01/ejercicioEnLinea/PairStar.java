package Punto2.Recursion1;

/**
 * Laboratorio1. Punto 2.1 Codingbat Recursion I. En esta clase se encuentra
 * el ejercicio pairStar realizado de la seccion Recursion I de Codingbat.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Agosto 2017
 */
public class PairStar {

    /**
     * Given a string, compute recursively a new string where identical chars
     * that are adjacent in the original string are separated from each other by
     * a "*".
     *
     * pairStar("hello") → "hel*lo" pairStar("xxyy") → "x*xy*y" pairStar("aaaa")
     * → "a*a*a*a"
     *
     * @param str
     * @return
     */
    public String pairStar(String str) {
        if (str.length() == 1 || str.length() == 0) {
            return str;
        } else if (str.charAt(0) == str.charAt(1)) {
            return str.charAt(0) + "*" + pairStar(str.substring(1));
        }
        return str.charAt(0) + pairStar(str.substring(1));
    }
}
