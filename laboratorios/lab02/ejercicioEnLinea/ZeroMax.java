package Punto2.Array2;

/**
 * Laboratorio2. Punto 2.1 Codingbat Array II. En esta clase se encuentra el
 * ejercicio zeroMax realizado de la seccion Array II de Codingbat.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Septiembre 2017
 */
public class ZeroMax {

    /**
     * Return a version of the given array where each zero value in the array is
     * replaced by the largest odd value to the right of the zero in the array.
     * If there is no odd value to the right of the zero, leave the zero as a
     * zero.
     *
     * zeroMax([0, 5, 0, 3]) → [5, 5, 3, 3] zeroMax([0, 4, 0, 3]) → [3, 4, 3, 3]
     * zeroMax([0, 1, 0]) → [1, 1, 0]
     *
     * @param nums
     * @return
     */
    public int[] zeroMax(int[] nums) {
        for (int i = 0; i < nums.length - 1; i++) {
            if (nums[i] == 0) {
                int max = 0;
                for (int j = i; j < nums.length; j++) {
                    if (nums[j] % 2 != 0 && max < nums[j]) {
                        max = nums[j];
                        nums[i] = max;
                    }
                }
            }
        }
        return nums;
    }
}
