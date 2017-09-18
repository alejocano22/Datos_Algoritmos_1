package Punto2.Array3;

/**
 * Laboratorio2. Punto 2.2 Codingbat Array III. En esta clase se encuentra el
 * ejercicio canBalance realizado de la seccion Array III de Codingbat.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Septiembre 2017
 */
public class canBalance {

    /**
     * Given a non-empty array, return true if there is a place to split the
     * array so that the sum of the numbers on one side is equal to the sum of
     * the numbers on the other side.
     *
     * canBalance([1, 1, 1, 2, 1]) → true canBalance([2, 1, 1, 2, 1]) → false
     * canBalance([10, 10]) → true
     *
     * @param nums
     * @return
     */
    public boolean canBalance(int[] nums) {
        int sum1, sum2;
        int c = 1;
        if (nums.length == 1) {
            return false;
        } else {
            do {
                sum1 = 0;
                sum2 = 0;
                for (int i = 0; i < nums.length; i++) {
                    if (i < c) {
                        sum1 = sum1 + nums[i];
                    } else {
                        sum2 = sum2 + nums[i];
                    }
                }
                if (sum1 == sum2) {
                    return true;
                }
                c++;
            } while (c < nums.length);
            return false;
        }
    }
}
