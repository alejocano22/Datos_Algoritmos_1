package Punto1;

import java.util.Random;

/**
 * Laboratorio1. Punto 1.1 ArrayMax con recursión. En esta clase se encuentra
 * todo el codigo que corre el algoritmo de ArrayMax y mide sus tiempos de
 * ejecución.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Agosto 2017
 */
public class ArrayMax {

    /**
     * Metodo main(). En este metodo se realizan las pruebas del algoritmo
     * arrayMax. aquí mediante un ciclo for, se hacen los llamados al metodo
     * ArrayMax(int[] a, int n) que contiene el algoritmo, pasandole diferentes
     * valores, es decir, arreglos con tamaños diferentes, para calcular cuanto
     * es el tiempo de ejecucion.
     *
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 1; i <= 31401; i += 100) {
            int[] arreglo = arregloAleatorio(i);
            long startTime = System.nanoTime();
            arrayMax(arreglo, arreglo.length - 1);
            long estimatedTime = System.nanoTime() - startTime;
            System.out.println("n: " + i + " Tiempo: " + estimatedTime + " Nanosegundos");
        }
    }

    /**
     * Metodo arrayMax(int[] a, int n). este metodo calcula el elemento maximo
     * en un arreglo de enteros mediante recursión.
     *
     * @param a Es el arreglo de enteros al cual se le calculara el maximo.
     * @param n Es la longitud del arreglo.
     * @return El valor de retorno de este metodo es el elemento con el valor
     * mas alto del arreglo.
     */
    public static int arrayMax(int[] a, int n) {
        int max, temp = 0;
        max = a[n];
        if (n != 0) {
            temp = arrayMax(a, n - 1);
        }
        if (temp > max) {
            max = temp;
        }
        return max;
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

}
