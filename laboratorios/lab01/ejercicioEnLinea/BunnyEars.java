package Punto2.Recursion1;

/**
 * Laboratorio1. Punto 2.1 Codingbat Recursion I. En esta clase se encuentra el
 * ejercicio bunnyEars realizado de la seccion Recursion I de Codingbat.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Agosto 2017
 */
public class BunnyEars {

    /**
     * We have a number of bunnies and each bunny has two big floppy ears. We
     * want to compute the total number of ears across all the bunnies
     * recursively (without loops or multiplication).
     *
     * bunnyEars(0) → 0 bunnyEars(1) → 2 bunnyEars(2) → 4
     *
     * @param bunnies
     * @return
     */
    public int bunnyEars(int bunnies) {
        if (bunnies == 0) {
            return 0;
        } else {
            return 2 + bunnyEars(bunnies - 1);
        }
    }
}
