package Punto2.Array2;

/**
 * Laboratorio2. Punto 2.1 Codingbat Array II. En esta clase se encuentra el
 * ejercicio haveThree realizado de la seccion Array II de Codingbat.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Septiembre 2017
 */
public class HaveThree {

    /**
     * Given an array of ints, return true if the value 3 appears in the array
     * exactly 3 times, and no 3's are next to each other.
     *
     * haveThree([3, 1, 3, 1, 3]) → true haveThree([3, 1, 3, 3]) → false
     * haveThree([3, 4, 3, 3, 4]) → false
     *
     * @param nums
     * @return
     */
    public boolean haveThree(int[] nums) {
        int cont = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 3) {
                cont++;
                if (i < nums.length - 1) {
                    if (nums[i + 1] == 3) {
                        return false;
                    }
                }
            }
        }
        return cont == 3;
    }
}
