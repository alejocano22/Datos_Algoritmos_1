package Punto2.Array2;

/**
 * Laboratorio2. Punto 2.1 Codingbat Array II. En esta clase se encuentra el
 * ejercicio withoutTen realizado de la seccion Array II de Codingbat.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Septiembre 2017
 */
public class WithoutTen {

    /**
     * Return a version of the given array where all the 10's have been removed.
     * The remaining elements should shift left towards the start of the array
     * as needed, and the empty spaces a the end of the array should be 0. So
     * {1, 10, 10, 2} yields {1, 2, 0, 0}. You may modify and return the given
     * array or make a new array.
     *
     * withoutTen([1, 10, 10, 2]) → [1, 2, 0, 0] withoutTen([10, 2, 10]) → [2,
     * 0, 0] withoutTen([1, 99, 10]) → [1, 99, 0]
     *
     * @param nums
     * @return
     */
    public int[] withoutTen(int[] nums) {
        int[] aux = new int[nums.length];
        int cont = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] != 10) {
                aux[cont] = nums[i];
                cont++;
            }
        }
        return aux;
    }
}
