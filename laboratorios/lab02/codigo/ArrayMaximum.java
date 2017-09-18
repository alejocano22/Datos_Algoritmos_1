package Punto1;

import java.util.Random;

/**
 * Laboratorio2. Punto 1.1 ArrayMaximum. En esta clase se encuentra todo el
 * codigo que corre el algoritmo de arrayMaximum y mide sus tiempos de
 * ejecución.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Septiembre 2017
 */
public class ArrayMaximum {

    /**
     * Metodo main(). En este metodo se realizan las pruebas del algoritmo
     * arrayMaximum. aquí mediante un ciclo for, se hacen los llamados al metodo
     * arrayMaximum(int[] a) que contiene el algoritmo, pasandole diferentes
     * valores, es decir, arreglos con tamaños diferentes, para calcular cuanto
     * es el tiempo de ejecucion.
     *
     * @param args
     */
    public static void main(String[] args) {
        
        for (int i = 100000; i <= 100000000; i *= 10) {
            int[] arreglo = arregloAleatorio(i);
            long startTime = System.currentTimeMillis();
            arrayMaximum(arreglo);
            long estimatedTime = System.currentTimeMillis() - startTime;
            System.out.println("n: " + i + " Tiempo: " + estimatedTime + " Milisegundos");
        }
    }

    /**
     * Metodo arrayMaximum(int[] a). este metodo calcula el elemento maximo en
     * un arreglo de enteros. O(n)
     * 
     * @param a Es el arreglo de enteros al cual se le calculara el maximo.
     * @return El valor de retorno de este metodo es el elemento con el valor
     * mas alto del arreglo.
     */
    public static int arrayMaximum(int[] a) {
        int max = a[0];
        for (int i = 0; i < a.length; i++) {
            if (a[i] > max) {
                max = a[i];
            }
        }
        return max;
    }

    /**
     * Metodo arregloAleatorio(int n). Este metodo recibe un entero n, y crea un
     * arreglo de tamaño n, con numeros enteros aleatorios entre 0 y 1000.
     *
     * @param n representa la longitud del arreglo que sera creado.
     * @return El retorno de este metodo es un arreglo de tamaño n con numeros
     * enteros aleatorios entre 0 y 1000
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
