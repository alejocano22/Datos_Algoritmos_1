package Punto1;

import java.util.Random;

/**
 * Laboratorio1. Punto 1.1 ArraySum. En esta clase se encuentra todo el codigo
 * que corre el algoritmo de arraySum y mide sus tiempos de ejecución.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Septiembre 2017
 */
public class ArraySum {

    /**
     * Metodo main(). En este metodo se realizan las pruebas del algoritmo
     * arraySum. aquí mediante un ciclo for, se hacen los llamados al metodo
     * arraySum(int[] a) que contiene el algoritmo, pasandole diferentes
     * valores, es decir, arreglos con tamaños diferentes, para calcular cuanto
     * es el tiempo de ejecucion.
     *
     * @param args
     */
    public static void main(String[] args) {
        
        for (int i = 100000; i <= 100000000; i *= 10) {
            int[] arreglo = arregloAleatorio(i);
            long startTime = System.currentTimeMillis();
            arraySum(arreglo);
            long estimatedTime = System.currentTimeMillis() - startTime;
            System.out.println("n: " + i + " Tiempo: " + estimatedTime + " Milisegundos");
        }
    }
    
    /**
     * Metodo arraySum(int[] a). este metodo calcula la suma de los elementos en
     * un arreglo de enteros. O(n)
     *
     * @param a Es el arreglo de enteros al cual se le calculara la suma de sus
     * elementos.
     * @return El valor de retorno de este metodo es la suma de los elementos
     * del arreglo.
     */
    public static int arraySum(int[] a) {
        int sum = 0;
        for (int i = 0; i < a.length; i++) {
            sum = sum + a[i];
        }
        return sum;
    }

    /**
     * Metodo arregloAleatorio(int n). Este metodo recibe un entero n, y crea un
     * arreglo de tamaño n, con numeros enteros aleatorios entre 0 y 100.
     *
     * @param n representa la longitud del arreglo que sera creado.
     * @return El retorno de este metodo es un arreglo de tamaño n con numeros
     * enteros aleatorios entre 0 y 100
     */
    public static int[] arregloAleatorio(int n) {
        int max = 100;
        int[] array = new int[n];
        Random generator = new Random();
        for (int i = 0; i < n; i++) {
            array[i] = generator.nextInt(max);
        }
        return array;
    }
}
