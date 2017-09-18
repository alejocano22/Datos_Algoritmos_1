package Punto2.Array2;

/**
 * Laboratorio2. Punto 2.1 Codingbat Array II. En esta clase se encuentra el
 * ejercicio countEvens realizado de la seccion Array II de Codingbat.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Septiembre 2017
 */
public class CountEvens {

    /**
     * Return the number of even ints in the given array. Note: the % "mod"
     * operator computes the remainder, e.g. 5 % 2 is 1.
     *
     * countEvens([2, 1, 2, 3, 4]) → 3 countEvens([2, 2, 0]) → 3 countEvens([1,
     * 3, 5]) → 0
     *
     * @param nums
     * @return
     */
    public int countEvens(int[] nums) {
        int cont = 0;
        for (int i = 0; i < nums.length; i++) {
            if (nums[i] % 2 == 0) {
                cont++;
            }
        }
        return cont;
    }
}
