package Punto2.Array3;

/**
 * Laboratorio2. Punto 2.2 Codingbat Array III. En esta clase se encuentra el
 * ejercicio fix34 realizado de la seccion Array III de Codingbat.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Septiembre 2017
 */
public class Fix34 {

    /**
     * Return an array that contains exactly the same numbers as the given
     * array, but rearranged so that every 3 is immediately followed by a 4. Do
     * not move the 3's, but every other number may move. The array contains the
     * same number of 3's and 4's, every 3 has a number after it that is not a
     * 3, and a 3 appears in the array before any 4.
     *
     * fix34([1, 3, 1, 4]) → [1, 3, 4, 1] fix34([1, 3, 1, 4, 4, 3, 1]) → [1, 3,
     * 4, 1, 1, 3, 4] fix34([3, 2, 2, 4]) → [3, 4, 2, 2]
     *
     * @param nums
     * @return
     */
    public int[] fix34(int[] nums) {
        int actual;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3 && nums[i + 1] != 4) {
                for (int j = 0; j < nums.length; j++) {
                    if (nums[j] == 4 && nums[j - 1] != 3) {
                        actual = nums[i + 1];
                        nums[i + 1] = nums[j];
                        nums[j] = actual;
                    }
                }
            }
        }
        return nums;
    }
}
