package Punto1;

import java.util.Random;

/**
 * Laboratorio1. Punto 1.1 GroupSum con recursión. En esta clase se encuentra
 * todo el codigo que corre el algoritmo de GroupSum y mide sus tiempos de
 * ejecución.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Agosto 2017
 */
public class GroupSum {

    /**
     * Metodo main(). En este metodo se realizan las pruebas del algoritmo
     * groupSum. aquí mediante un ciclo for, se hacen los llamados al metodo
     * GroupSum(int start, int[] nums, int target) que contiene el algoritmo,
     * pasandole diferentes valores, es decir, arreglos de tamaño diferente y un
     * numero aleatorio, para calcular cuanto es el tiempo de ejecucion.
     *
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 30; i += 1) {
            int[] arreglo = arregloAleatorio(i);
            int n = numeroAleatorio();
            long startTime = System.nanoTime();
            GroupSum(0, arreglo, n);
            long estimatedTime = System.nanoTime() - startTime;
            System.out.println("n: " + i + " Tiempo: " + estimatedTime + " Nanosegundos");
        }
    }

    /**
     * metodo GroupSum(int start, int[] nums, int target). este metodo analiza
     * si los subconjuntos de un arreglo pueden sumar un numero determinado
     * (target).
     *
     * @param start Es la posicion desde donde se comienza a recorrer el arreglo
     * @param nums Es el arreglo que se esta recorriendo.
     * @param target Es el valor al que se quiere llegar mediante la suma de los
     * subconjuntos del arreglo.
     * @return El valor de retorno de este metodo es un boolean que nos indica
     * si el valor target al que se queria llegar si fue hallado mediante la
     * suma de los subconjuntos del arreglo.
     */
    public static boolean GroupSum(int start, int[] nums, int target) {
        if (start >= nums.length) {
            return target == 0;
        } else {
            return GroupSum(start + 1, nums, target - nums[start]) || GroupSum(start + 1, nums, target);
        }

    }

    /**
     * Metodo arregloAleatorio(int n). Este metodo recibe un entero n, y crea un
     * arreglo de tamaño n, con numeros enteros aleatorios entre 0 y 5000.
     *
     * @param n representa la longitud del arreglo que sera creado.
     * @return El retorno de este metodo es un arreglo de tamaño n con numeros
     * enteros aleatorios entre 0 y 5000
     */
    public static int[] arregloAleatorio(int n) {
        int max = 5000;
        int[] array = new int[n];
        Random generator = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = generator.nextInt(max);
        }
        return array;
    }

    /**
     * Metodo numeroAleatorio(). Este metodo Generar un numero entero aleatorio
     * entre 0 y 5000.
     *
     * @return El valor de retorno de este metodo es un numero entero aleatorio
     * entre 0 y 5000.
     */
    public static int numeroAleatorio() {
        int max = 5000;
        Random generator = new Random();
        return generator.nextInt(max);
    }
}
