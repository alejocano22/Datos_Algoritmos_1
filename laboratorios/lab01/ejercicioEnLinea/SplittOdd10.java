package Punto2.Recursion2;

/**
 * Laboratorio1. Punto 2.2 Codingbat Recursion II. En esta clase se encuentra el
 * ejercicio splitOdd10 realizado de la seccion Recursion II de Codingbat.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Agosto 2017
 */
public class SplittOdd10 {

    /**
     * Given an array of ints, is it possible to divide the ints into two
     * groups, so that the sum of one group is a multiple of 10, and the sum of
     * the other group is odd. Every int must be in one group or the other.
     * Write a recursive helper method that takes whatever arguments you like,
     * and make the initial call to your recursive helper from splitOdd10(). (No
     * loops needed.)
     *
     * splitOdd10([5, 5, 5]) → true splitOdd10([5, 5, 6]) → false splitOdd10([5,
     * 5, 6, 1]) → true
     *
     * @param nums
     * @return
     */
    public boolean splitOdd10(int[] nums) {
        int i = 0;
        int s1 = 0;
        int s2 = 0;
        return metodoAux(nums, i, s1, s2);
    }

    public boolean metodoAux(int[] nums, int i, int s1, int s2) {
        if (i >= nums.length) {
            return (s1 % 10 == 0 && s2 % 2 != 0) || (s2 % 10 == 0 && s1 % 2 != 0);
        }
        int v;
        v = nums[i];
        return (metodoAux(nums, i + 1, s1 + v, s2) || metodoAux(nums, i + 1, s1, s2 + v));
    }
}
