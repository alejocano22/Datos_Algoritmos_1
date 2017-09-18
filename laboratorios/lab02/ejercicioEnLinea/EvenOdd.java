package Punto2.Array2;

/**
 * Laboratorio2. Punto 2.1 Codingbat Array II. En esta clase se encuentra el
 * ejercicio evenOdd realizado de la seccion Array II de Codingbat.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Septiembre 2017
 */
public class EvenOdd {

    /**
     * Return an array that contains the exact same numbers as the given array,
     * but rearranged so that all the even numbers come before all the odd
     * numbers. Other than that, the numbers can be in any order. You may modify
     * and return the given array, or make a new array.
     *
     * evenOdd([1, 0, 1, 0, 0, 1, 1]) → [0, 0, 0, 1, 1, 1, 1] evenOdd([3, 3, 2])
     * → [2, 3, 3] evenOdd([2, 2, 2]) → [2, 2, 2]
     *
     * @param nums
     * @return
     */
    public int[] evenOdd(int[] nums) {
        int cont = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                int aux = nums[cont];
                nums[cont] = nums[i];
                nums[i] = aux;
                cont++;
            }
        }
        return nums;
    }
}
