package lab03;

import java.util.*;

/**
 * Laboratorio3. Punto 2.2 Codeforce 313-B. En esta clase se encuentra el
 * ejercicio "B. Ilya and Queries" realizado en la plataforma de Codeforce.
 * (Enlace: http://codeforces.com/problemset/problem/313/B)
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Septiembre 2017
 */
public class IlyaAndQueries {

    /**
     * "B. Ilya and Queries".
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner lect = new Scanner(System.in);
        //String de caracteres.
        String str = lect.next();
        char[] array = str.toCharArray();

        int n = str.length();
        int[] aux = new int[n + 1];
        aux[1] = 0;

        //Llenar arreglo aux
        if (array[0] == array[1]) {
            aux[1] = 1;
        }
        for (int i = 1; i < n - 1; i++) {
            if (array[i] == array[i + 1]) {
                aux[i + 1] = aux[i] + 1;
            } else {
                aux[i + 1] = aux[i];
            }
        }
        
        //Total de preguntas.
        int total = lect.nextInt();
        //Preguntas.
        for (int i = 0; i < total; i++) {
            int left = lect.nextInt();
            int right = lect.nextInt();
            int cont = aux[right - 1] - aux[left - 1];
            System.out.println(cont);
        }

    }

}

