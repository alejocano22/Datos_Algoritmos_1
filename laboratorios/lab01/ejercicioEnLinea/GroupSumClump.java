package Punto2.Recursion2;

/**
 * Laboratorio1. Punto 2.2 Codingbat Recursion II. En esta clase se encuentra el
 * ejercicio groupSumClump realizado de la seccion Recursion II de Codingbat.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Agosto 2017
 */
public class GroupSumClump {

    /**
     * Given an array of ints, is it possible to choose a group of some of the
     * ints, such that the group sums to the given target, with this additional
     * constraint: if there are numbers in the array that are adjacent and the
     * identical value, they must either all be chosen, or none of them chosen.
     * For example, with the array {1, 2, 2, 2, 5, 2}, either all three 2's in
     * the middle must be chosen or not, all as a group. (one loop can be used
     * to find the extent of the identical values).
     *
     * groupSumClump(0, [2, 4, 8], 10) → true groupSumClump(0, [1, 2, 4, 8, 1],
     * 14) → true groupSumClump(0, [2, 4, 4, 8], 14) → false
     *
     * @param start
     * @param nums
     * @param target
     * @return
     */
    public boolean groupSumClump(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        }
        int c = 1;
        for (int i = 1; i < nums.length; i++) {
            int h;
            if (nums[i - 1] == nums[i]) {
                c += 1;
            }
        }
        return groupSumClump(start + c, nums, target - nums[start]) || groupSumClump(start + 1, nums, target);
    }
}
