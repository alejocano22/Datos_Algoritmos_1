package Punto2.Array3;

/**
 * Laboratorio2. Punto 2.2 Codingbat Array III. En esta clase se encuentra el
 * ejercicio fix45 realizado de la seccion Array III de Codingbat.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Septiembre 2017
 */
public class Fix45 {

    /**
     * (This is a slightly harder version of the fix34 problem.) Return an array
     * that contains exactly the same numbers as the given array, but rearranged
     * so that every 4 is immediately followed by a 5. Do not move the 4's, but
     * every other number may move. The array contains the same number of 4's
     * and 5's, and every 4 has a number after it that is not a 4. In this
     * version, 5's may appear anywhere in the original array.
     *
     * fix45([5, 4, 9, 4, 9, 5]) → [9, 4, 5, 4, 5, 9] fix45([1, 4, 1, 5]) → [1,
     * 4, 5, 1] fix45([1, 4, 1, 5, 5, 4, 1]) → [1, 4, 5, 1, 1, 4, 5]
     *
     * @param nums
     * @return
     */
    public int[] fix45(int[] nums) {
        int actual;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 4 && nums[i + 1] != 5) {
                if (nums[0] == 5) {
                    actual = nums[i + 1];
                    nums[i + 1] = nums[0];
                    nums[0] = actual;
                } else {
                    for (int j = 0; j < nums.length; j++) {
                        if (nums[j] == 5 && nums[j - 1] != 4) {
                            actual = nums[i + 1];
                            nums[i + 1] = nums[j];
                            nums[j] = actual;
                        }
                    }
                }
            }
        }
        return nums;
    }
}
