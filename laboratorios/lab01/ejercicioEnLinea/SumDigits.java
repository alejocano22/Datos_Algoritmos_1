package Punto2.Recursion1;

/**
 * Laboratorio1. Punto 2.1 Codingbat Recursion I. En esta clase se encuentra el
 * ejercicio sumDigits realizado de la seccion Recursion I de Codingbat.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Agosto 2017
 */
public class SumDigits {

    /**
     * Given a non-negative int n, return the sum of its digits recursively (no
     * loops). Note that mod (%) by 10 yields the rightmost digit (126 % 10 is
     * 6), while divide (/) by 10 removes the rightmost digit (126 / 10 is 12).
     *
     * sumDigits(126) → 9 sumDigits(49) → 13 sumDigits(12) → 3
     *
     * @param n
     * @return
     */
    public int sumDigits(int n) {
        if (n == 0) {
            return 0;
        } else {
            return n % 10 + sumDigits(n / 10);
        }
    }
}
