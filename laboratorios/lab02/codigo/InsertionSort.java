package Punto1;

import java.util.Random;

/**
 * Laboratorio2. Punto 1.1 InsertionSort. En esta clase se encuentra todo el
 * codigo que corre el algoritmo de insertionSort y mide sus tiempos de
 * ejecución.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Septiembre 2017
 */
public class InsertionSort {

    /**
     * Metodo main(). En este metodo se realizan las pruebas del algoritmo
     * insertionSort. aquí mediante un ciclo for, se hacen los llamados al
     * metodo insertionSort(int[] a) que contiene el algoritmo, pasandole
     * diferentes valores, es decir, arreglos con tamaños diferentes, para
     * calcular cuanto es el tiempo de ejecucion.
     *
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 100000; i <= 100000000; i *= 10) {
            int[] arreglo = arregloAleatorio(i);
            long startTime = System.currentTimeMillis();
            insertionSort(arreglo);
            long estimatedTime = System.currentTimeMillis() - startTime;
            System.out.println("n: " + i + " Tiempo: " + estimatedTime + " Milisegundos");
        }
    }

    /**
     * Metodo insertionSort(int[] a). Este metodo ordena de menor a mayor un
     * arreglo de enteros. El codigo de este metodo fue tomado y modificado del
     * codigo propuesto para el laboratorio2 por el docente Mauricio Toro.
     * (Toro, M (2017) insertionSort (Version 1.0) [Source code].) O(n^2)
     *
     * @param a Es el arreglo de enteros el se ordenara
     */
    public static void insertionSort(int[] a) {
        int temp, j;
        for (int i = 0; i < a.length; i++) {
            j = i;
            while (j > 0 && a[j - 1] > a[j]) {
                temp = a[j];
                a[j] = a[j - 1];
                a[j - 1] = temp;
                j = j - 1;
            }
        }
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
