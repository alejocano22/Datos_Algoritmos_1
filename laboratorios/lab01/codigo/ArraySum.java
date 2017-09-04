package Punto1;

import java.util.Random;

/**
 * Laboratorio1. Punto 1.1 ArraySum con recursión. En esta clase se encuentra
 * todo el codigo que corre el algoritmo de ArraySum y mide sus tiempos de
 * ejecución.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Agosto 2017
 */
public class ArraySum {

    /**
     * Metodo main(). En este metodo se realizan las pruebas del algoritmo
     * arraySum. aquí mediante un ciclo for, se hacen los llamados al metodo
     * ArraySum(int[] a, int n) que contiene el algoritmo, pasandole diferentes
     * valores, es decir, arreglos con tamaños diferentes, para calcular cuanto
     * es el tiempo de ejecucion.
     *
     * @param args
     */
    public static void main(String[] args) {
       for (int i = 1; i <= 31001; i += 100) {
            int[] arreglo = arregloAleatorio(i);
            long startTime = System.nanoTime();
            arraySum(arreglo, arreglo.length - 1);
            long estimatedTime = System.nanoTime() - startTime;
            System.out.println("n: " + i + " Tiempo: " + estimatedTime + " Nanosegundos");
        }
    }

    /**
     * Metodo arraySum(int[] a, int n). este metodo calcula la suma de los
     * elementos en un arreglo de enteros mediante recursión.
     *
     * @param a Es el arreglo de enteros al cual se le calculara el maximo.
     * @param n Es la longitud del arreglo.
     * @return El valor de retorno de este metodo es la suma de los elementos
     * del arreglo.
     */
    public static int arraySum(int[] a, int n) {
        int sum;
        if (n == 0) {
            sum = a[0];
        } else {
            sum = a[n] + arraySum(a, n - 1);
        }
        return sum;
    }
    
    /**
     * Metodo arregloAleatorio(int n). Este metodo recibe un entero n, y crea un
     * arreglo de tamaño n, con numeros enteros aleatorios entre 0 y 500.
     *
     * @param n representa la longitud del arreglo que sera creado.
     * @return El retorno de este metodo es un arreglo de tamaño n con numeros
     * enteros aleatorios entre 0 y 5000
     */
    public static int[] arregloAleatorio(int n) {
        int max = 500;
        int[] array = new int[n];
        Random generator = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = generator.nextInt(max);
        }
        return array;
    }
}
