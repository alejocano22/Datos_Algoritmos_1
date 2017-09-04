package Punto2.Recursion2;

/**
 * Laboratorio1. Punto 2.2 Codingbat Recursion II. En esta clase se encuentra el
 * ejercicio groupSum6 realizado de la seccion Recursion II de Codingbat.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Agosto 2017
 */
public class GroupSum6 {

    /**
     * Given an array of ints, is it possible to choose a group of some of the
     * ints, beginning at the start index, such that the group sums to the given
     * target? However, with the additional constraint that all 6's must be
     * chosen. (No loops needed.)
     *
     * groupSum6(0, [5, 6, 2], 8) → true groupSum6(0, [5, 6, 2], 9) → false
     * groupSum6(0, [5, 6, 2], 7) → false
     *
     * @param start
     * @param nums
     * @param target
     * @return
     */
    public boolean groupSum6(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }
        if (nums[start] == 6) {
            return groupSum6(start + 1, nums, target - nums[start]);
        }
        return groupSum6(start + 1, nums, target - nums[start]) || groupSum6(start + 1, nums, target);
    }
}
