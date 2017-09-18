package Punto2.Array3;

/**
 * Laboratorio2. Punto 2.2 - 3.7 Codingbat Array III. En esta clase se encuentra
 * el ejercicio maxSpan realizado de la seccion Array III de Codingbat.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Septiembre 2017
 */
public class MaxSpan {

    /**
     * Consider the leftmost and righmost appearances of some value in an array.
     * We'll say that the "span" is the number of elements between the two
     * inclusive. A single value has a span of 1. Returns the largest span found
     * in the given array. (Efficiency is not a priority.)
     *
     * maxSpan([1, 2, 1, 1, 3]) → 4 maxSpan([1, 4, 2, 1, 4, 1, 4]) → 6
     * maxSpan([1, 4, 2, 1, 4, 4, 4]) → 6
     *
     * @param nums
     * @return
     */
    public int maxSpan(int[] nums) {
        if (nums.length == 1) {
            return 1;
        }
        int span = 0;
        int spanActual = 0;
        for (int i = 0; i < nums.length; i++) {
            int actual = nums[i];
            for (int j = nums.length - 1; j > 0; j--) {
                if (nums[j] == actual) {
                    spanActual = j + 1 - i;
                    break;
                }
            }
            if (spanActual > span) {
                span = spanActual;
            }
        }
        return span;
    }
}
