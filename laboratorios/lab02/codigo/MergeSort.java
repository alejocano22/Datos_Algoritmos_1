package Punto1;

import java.util.Random;

/**
 * Laboratorio2. Punto 1.1 MergeSort. En esta clase se encuentra todo el codigo
 * que corre el algoritmo de mergeSort y mide sus tiempos de ejecución.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Septiembre 2017
 */
public class MergeSort {

    /**
     * Metodo main(). En este metodo se realizan las pruebas del algoritmo
     * mergeSort. aquí mediante un ciclo for, se hacen los llamados al metodo
     * mergeSort(int[] a) que contiene el algoritmo, pasandole diferentes
     * valores, es decir, arreglos con tamaños diferentes, para calcular cuanto
     * es el tiempo de ejecucion.
     *
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 100000; i <= 100000000; i *= 10) {
            int[] arreglo = arregloAleatorio(i);
            long startTime = System.currentTimeMillis();
            mergeSort(arreglo);
            long estimatedTime = System.currentTimeMillis() - startTime;
            System.out.println("n: " + i + " Tiempo: " + estimatedTime + " Milisegundos");
        }
    }

    /**
     * Metodo mergeSort(int[] a). Este metodo ordena de menor a mayor un arreglo
     * de enteros. El codigo de este metodo fue tomado y modificado del codigo
     * propuesto para el laboratorio2 por el docente Mauricio Toro. (Taken from
     * www.cs.cmu.edu/) (Toro, M (2017) mergeSort (Version 1.0) [Source code].)
     * O(n log(n))
     *
     * @param a Es el arreglo de enteros el se ordenara
     */
    public static void mergeSort(int[] a) {
        int[] tmp = new int[a.length];
        mergeSort(a, tmp, 0, a.length - 1);
    }

    /**
     * Metodo mergeSort(int[] a, int[] tmp, int left, int right). El cual
     * funciona como auxiliar del metodo mergeSort(int[] a). En este metodo
     * recursivamente se declaran los valores que funcionaran como parametros
     * mientras se realiza el ordemanimiento del arreglo
     *
     * @param a Es el arreglo que se ordenara.
     * @param tmp Es la longitud del arreglo que se ordenara.
     * @param left Es el primer valor (valor mas a la izquierda) del arreglo
     * @param right Es el ultimo valor (valor mas a la derecha) del arreglo
     */
    private static void mergeSort(int[] a, int[] tmp, int left, int right) {
        if (left < right) {
            int center = (left + right) / 2;
            mergeSort(a, tmp, left, center);
            mergeSort(a, tmp, center + 1, right);
            merge(a, tmp, left, center + 1, right);
        }
    }

    /**
     * metodo merge(int[] a, int[] tmp, int left, int right, int rightEnd). El
     * cual funciona como auxiliar del metodo mergeSort(int[] a, int[] tmp, int
     * left, int right). En este metodo se realizan las operaciones de copiado y
     * ordenamiento del arreglo
     *
     * @param a Es el arreglo que se ordenara
     * @param tmp Es la longitud del arreglo que se ordenara.
     * @param left Es el primer valor (valor mas a la izquierda) del arreglo
     * @param right Es el ultimo valor (valor mas a la derecha) del arreglo
     * @param rightEnd Indica cuando el valor right termina.
     */
    private static void merge(int[] a, int[] tmp, int left, int right, int rightEnd) {
        int leftEnd = right - 1;
        int k = left;
        int num = rightEnd - left + 1;
        while (left <= leftEnd && right <= rightEnd) {
            if (a[left] <= a[right]) {
                tmp[k++] = a[left++];
            } else {
                tmp[k++] = a[right++];
            }
        }
        while (left <= leftEnd) // Copy rest of first half
        {
            tmp[k++] = a[left++];
        }
        while (right <= rightEnd) // Copy rest of right half
        {
            tmp[k++] = a[right++];
        }
        // Copy tmp back
        for (int i = 0; i < num; i++, rightEnd--) {
            a[rightEnd] = tmp[rightEnd];
        }
    }

    /**
     * Metodo arregloAleatorio(int n). Este metodo recibe un entero n, y crea un
     * arreglo de tamaño n, con numeros enteros aleatorios entre 0 y 1000.
     *
     * @param n representa la longitud del arreglo que sera creado.
     * @return El retorno de este metodo es un arreglo de tamaño n con numeros
     * enteros aleatorios entre 0 y 1000.
     */
    public static int[] arregloAleatorio(int n) {
        int max = 1000;
        int[] array = new int[n];
        Random generator = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = generator.nextInt(max);
        }
        return array;
    }
}
