
package Punto2.Recursion1;

/**
 * Laboratorio1. Punto 2.1 Codingbat Recursion I. En esta clase se encuentra
 * el ejercicio array11 realizado de la seccion Recursion I de Codingbat.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Agosto 2017
 */
public class Array11 {
     /**
     * Given an array of ints, compute recursively the number of times that the
     * value 11 appears in the array. We'll use the convention of considering
     * only the part of the array that begins at the given index. In this way, a
     * recursive call can pass index+1 to move down the array. The initial call
     * will pass in index as 0.
     *
     * array11([1, 2, 11], 0) → 1 array11([11, 11], 0) → 2 array11([1, 2, 3, 4],
     * 0) → 0
     *
     * @param nums
     * @param index
     * @return
     */
    public int array11(int[] nums, int index) {
        int cont;
        if (index == nums.length) {
            return 0;
        } else if (nums[index] == 11) {
            cont = 1;
        } else {
            cont = 0;
        }
        return cont + array11(nums, index + 1);
    }
}
