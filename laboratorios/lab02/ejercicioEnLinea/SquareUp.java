package Punto2.Array3;

/**
 * Laboratorio2. Punto 2.2 Codingbat Array III. En esta clase se encuentra el
 * ejercicio squareUp realizado de la seccion Array III de Codingbat.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Septiembre 2017
 */
public class SquareUp {

    /**
     * Given n>=0, create an array length n*n with the following pattern, shown
     * here for n=3 : {0, 0, 1, 0, 2, 1, 3, 2, 1} (spaces added to show the 3
     * groups).
     *
     * squareUp(3) → [0, 0, 1, 0, 2, 1, 3, 2, 1] squareUp(2) → [0, 1, 2, 1]
     * squareUp(4) → [0, 0, 0, 1, 0, 0, 2, 1, 0, 3, 2, 1, 4, 3, 2, 1]
     *
     * @param n
     * @return
     */
    public int[] squareUp(int n) {
        int rango = n;
        int periodo = n;
        int valor = 1;
        int[] arr = new int[n * n];
        if (n == 1) {
            arr[0] = 1;
            return arr;
        }
        for (int i = arr.length - 1; i > 0; i--) {
            if (i % periodo == 0) {
                arr[i] = valor;
                if (valor > rango) {
                    arr[i] = 0;
                }
                rango--;
                valor = 1;
            } else {
                if (valor > rango) {
                    valor++;
                } else {
                    arr[i] = valor;
                    valor++;
                }
            }
        }
        return arr;
    }
}
