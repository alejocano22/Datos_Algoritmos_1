package Punto2.Recursion2;

/**
 * Laboratorio1. Punto 2.2 Codingbat Recursion II. En esta clase se encuentra el
 * ejercicio groupNoAdj realizado de la seccion Recursion II de Codingbat.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Agosto 2017
 */
public class GroupNoAdj {

    /**
     * Given an array of ints, is it possible to choose a group of some of the
     * ints, such that the group sums to the given target with this additional
     * constraint: If a value in the array is chosen to be in the group, the
     * value immediately following it in the array must not be chosen. (No loops
     * needed.)
     *
     * groupNoAdj(0, [2, 5, 10, 4], 12) → true groupNoAdj(0, [2, 5, 10, 4], 14)
     * → false groupNoAdj(0, [2, 5, 10, 4], 7) → false
     *
     * @param start
     * @param nums
     * @param target
     * @return
     */
    public boolean groupNoAdj(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return (target == 0);
        }
        if (groupNoAdj(start + 2, nums, target - nums[start])) {
            return true;
        }
        if (groupNoAdj(start + 1, nums, target)) {
            return true;
        }
        return false;
    }

}
