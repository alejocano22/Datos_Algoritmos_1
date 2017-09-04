
package Punto2.Recursion1;

/**
 * Laboratorio1. Punto 2.1 Codingbat Recursion I. En esta clase se encuentra
 * el ejercicio bunnyEars2 realizado de la seccion Recursion I de Codingbat.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Agosto 2017
 */
public class BunnyEars2 {
    /**
     * We have bunnies standing in a line, numbered 1, 2, ... The odd bunnies
     * (1, 3, ..) have the normal 2 ears. The even bunnies (2, 4, ..) we'll say
     * have 3 ears, because they each have a raised foot. Recursively return the
     * number of "ears" in the bunny line 1, 2, ... n (without loops or
     * multiplication).
     *
     * bunnyEars2(0) → 0 bunnyEars2(1) → 2 bunnyEars2(2) → 5
     *
     * @param bunnies
     * @return
     */
    public int bunnyEars2(int bunnies) {
        int ears = 0;
        if (bunnies == 0) {
            return 0;
        } else if (bunnies % 2 != 0) {
            ears = 2;
        } else if (bunnies % 2 == 0) {
            ears = 3;
        }
        return ears + bunnyEars2(bunnies - 1);
    }
}
