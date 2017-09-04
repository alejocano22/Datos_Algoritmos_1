package Punto2.Recursion1;

/**
 * Laboratorio1. Punto 2.1 Codingbat Recursion I. En esta clase se encuentra el
 * ejercicio count7 realizado de la seccion Recursion I de Codingbat.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Agosto 2017
 */
public class Count7 {

    /**
     * Given a non-negative int n, return the count of the occurrences of 7 as a
     * digit, so for example 717 yields 2. (no loops). Note that mod (%) by 10
     * yields the rightmost digit (126 % 10 is 6), while divide (/) by 10
     * removes the rightmost digit (126 / 10 is 12).
     *
     * count7(717) → 2 count7(7) → 1 count7(123) → 0
     *
     * @param n
     * @return
     */
    public int count7(int n) {
        int cont;
        if (n == 0) {
            return 0;
        } else if (n % 10 == 7) {
            cont = 1;
        } else {
            cont = 0;
        }
        return cont + count7(n / 10);
    }
}
