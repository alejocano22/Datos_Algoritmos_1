package Punto2.Recursion1;

/**
 * Laboratorio1. Punto 2.1 Codingbat Recursion I. En esta clase se encuentra el
 * ejercicio powerN realizado de la seccion Recursion I de Codingbat.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Agosto 2017
 */
public class PowerN {

    /**
     * Given base and n that are both 1 or more, compute recursively (no loops)
     * the value of base to the n power, so powerN(3, 2) is 9 (3 squared).
     *
     * powerN(3, 1) → 3 powerN(3, 2) → 9 powerN(3, 3) → 27
     *
     * @param base
     * @param n
     * @return
     */
    public int powerN(int base, int n) {
        if (n == 1) {
            return base;
        } else {
            return base * powerN(base, n - 1);
        }
    }
}
