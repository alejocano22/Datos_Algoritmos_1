package Punto2.Array2;

/**
 * Laboratorio2. Punto 2.1 Codingbat Array II. En esta clase se encuentra el
 * ejercicio sum67 realizado de la seccion Array II de Codingbat.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Septiembre 2017
 */
public class Sum67 {

    /**
     * Return the sum of the numbers in the array, except ignore sections of
     * numbers starting with a 6 and extending to the next 7 (every 6 will be
     * followed by at least one 7). Return 0 for no numbers.
     *
     * sum67([1, 2, 2]) → 5 sum67([1, 2, 2, 6, 99, 99, 7]) → 5 sum67([1, 1, 6,
     * 7, 2]) → 4
     *
     * @param nums
     * @return
     */
    public int sum67(int[] nums) {
        int sum = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 6) {
                sum += nums[i];
            } else {
                while (nums[i] != 7) {
                    i++;
                }
            }
        }
        return sum;
    }
}
