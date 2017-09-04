package Punto2.Recursion2;

/**
 * Laboratorio1. Punto 2.2 Codingbat Recursion II. En esta clase se encuentra el
 * ejercicio split53 realizado de la seccion Recursion II de Codingbat.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Agosto 2017
 */
public class Split53 {

    /**
     *
     * Given an array of ints, is it possible to divide the ints into two
     * groups, so that the sum of the two groups is the same, with these
     * constraints: all the values that are multiple of 5 must be in one group,
     * and all the values that are a multiple of 3 (and not a multiple of 5)
     * must be in the other. (No loops needed.)
     *
     * split53([1, 1]) → true split53([1, 1, 1]) → false split53([2, 4, 2]) →
     * true
     *
     * @param nums
     * @return
     */
    public boolean split53(int[] nums) {
        int index = 0;
        int s1 = 0;
        int s2 = 0;
        return metodoAux(nums, index, s1, s2);
    }
    
    /**
     * MetodoAux(). Para hacer la recursion
     * @param nums
     * @param index
     * @param s1
     * @param s2
     * @return 
     */
    private boolean metodoAux(int[] nums, int index, int s1, int s2) {
        if (index >= nums.length) {
            return s1 == s2;
        }
        int value = nums[index];
        if (value % 5 == 0) {
            return metodoAux(nums, index + 1, s1 + value, s2);
        }
        if (value % 3 == 0 && value % 5 != 0) {
            return metodoAux(nums, index + 1, s1, s2 + value);
        }
        return metodoAux(nums, index + 1, s1 + value, s2) || metodoAux(nums, index + 1, s1, s2 + value);
    }
}
