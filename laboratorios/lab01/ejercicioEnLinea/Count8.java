
package Punto2.Recursion1;

/**
 * Laboratorio1. Punto 2.1 Codingbat Recursion I. En esta clase se encuentra
 * el ejercicio count8 realizado de la seccion Recursion I de Codingbat.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Agosto 2017
 */
public class Count8 {
    /**
     *
     * Given a non-negative int n, compute recursively (no loops) the count of
     * the occurrences of 8 as a digit, except that an 8 with another 8
     * immediately to its left counts double, so 8818 yields 4. Note that mod
     * (%) by 10 yields the rightmost digit (126 % 10 is 6), while divide (/) by
     * 10 removes the rightmost digit (126 / 10 is 12).
     *
     * count8(8) → 1 count8(818) → 2 count8(8818) → 4
     *
     * @param n
     * @return
     */
    public int count8(int n) {
        int cont;
        if (n == 0) {
            return 0;
        } else if (n % 10 == 8 && (n / 10) % 10 == 8) {
            cont = 2;
        } else if (n % 10 == 8) {
            cont = 1;
        } else {
            cont = 0;
        }
        return cont + count8(n / 10);
    }
}
