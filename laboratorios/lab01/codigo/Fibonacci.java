package Punto1;

/**
 * Laboratorio1. Punto 1.1 Fibonacci con recursión. En esta clase se encuentra
 * todo el codigo que corre el algoritmo de Fibonacci y mide sus tiempos de
 * ejecución.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Agosto 2017
 */
public class Fibonacci {

    /**
     * Metodo main(). En este metodo se realizan las pruebas del algoritmo
     * fibonacci. aquí mediante un ciclo for, se hacen los llamados al metodo
     * fibonacci(int n) que contiene el algoritmo, pasandole diferentes valores,
     * es decir, diferentes n que determinaran el enesimo termino de la serie
     * fibonnacci, para calcular cuanto es el tiempo de ejecucion.
     *
     * @param args
     */
    public static void main(String[] args) {
        for (int i = 0; i <= 100; i++) {
            long startTime = System.nanoTime();
            fibonacci(i);
            long estimatedTime = System.nanoTime() - startTime;
            System.out.println("n: " + i + " Tiempo: " + estimatedTime + " Nanosegundos");
        }

    }

    /**
     * Metodo fibonacci(int n). Este metodo calcula el enesimo termino (Valor
     * parametro) de la serie fibonacci.
     *
     * @param n Representa la posicion del termino en la serie fibonacci que se
     * quiere calcular.
     * @return El valor de retorno de este metodo es el valor del enesimo
     * termino de la serie fibonacci
     */
    public static long fibonacci(int n) {
        if (n <= 1) {
            return n;
        } else {
            return fibonacci(n - 1) + fibonacci(n - 2);
        }
    }

}
