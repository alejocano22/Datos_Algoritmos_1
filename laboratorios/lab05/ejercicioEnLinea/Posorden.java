package lab05;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Laboratorio 5. Punto 2.1. Dado el recorrido en pre-orden de un árbol de
 * búsqueda binario, su tarea es encontrar el recorrido en pos-orden del árbol.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Octubre 2017
 */
public class Posorden {

    //Raiz
    private static Nodo root;

    /**
     * Constructor de Posorden (Arbol binario).
     */
    public Posorden() {
        root = null;
    }

    /**
     * Clase Nodo. Aqui se encuentra la implementación de un nodo para un arbol
     * binario.
     */
    private static class Nodo {

        //Atributos
        Nodo izq;
        Nodo der;
        int dato;

        /**
         * Constructor del nodo.
         *
         * @param dato Es el dato tipo entero que tendra el nodo.
         */
        public Nodo(int dato) {
            this.dato = dato;
        }
    }

    /**
     * Metodo insertar. El cual recibe un entero n y lo inserta en el arbol.
     *
     * @param n Es el entero n que se va a insertar al arbol
     */
    private static void insertar(int n) {
        insertarAux(n, root);
    }

    /**
     * Metodo insertarAux. El cual facilita la inserción de manera recursiva.
     *
     * @param n Es el numero que se va a insertar
     * @param nodo Es el nodo que se va a evaluar
     */
    private static void insertarAux(int n, Nodo nodo) {
        if (nodo == null) {
            root = new Nodo(n);
        } else {
            if (n >= nodo.dato && nodo.der == null) {
                nodo.der = new Nodo(n);
            } else if (n >= nodo.dato) {
                insertarAux(n, nodo.der);
            }
            if (n < nodo.dato && nodo.izq == null) {
                nodo.izq = new Nodo(n);
            } else if (n < nodo.dato) {
                insertarAux(n, nodo.izq);
            }
        }

    }

    /**
     * metodo printPosorden. Este metodo imprimer un arbol binario en posorden
     * (Nodo izquierdo, Nodo derecho, raiz)
     *
     * @param nodo Es el nodo que se va a evaluar.
     */
    private static void printPosorden(Nodo nodo) {
        if (nodo != null) {
            printPosorden(nodo.izq);
            printPosorden(nodo.der);
            System.out.println(nodo.dato);

        }
    }

    /**
     * Metodo numero. El cual se usa para verificar si un valor ingresado como
     * String si es un numero. Se utiliza para evitar excepciones.
     *
     * @param str Es la cadena que se va a evaluar.
     * @return Se retorna true si la cadena es de tipo numerico, se retorna
     * false en caso contrario.
     */
    private static boolean numero(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            System.err.println(e.getMessage());
            return false;
        }
    }

    /**
     * Metodo Main. Aqui se realizan las pruebas del ejercicio 2.1 del
     * laboratorio 5. El programam termina con un enter (vacio) o cuando se
     * ingresa un parametro incorrecto.
     *
     * @param args
     * @throws IOException
     */
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Entrada: ");
        String raiz = br.readLine();

        if (numero(raiz)) {
            root = new Nodo(Integer.valueOf(raiz));
            String n = br.readLine();

            while (!n.isEmpty()) {
                if (numero(n)) {
                    insertar(Integer.valueOf(n));
                    n = br.readLine();

                } else {
                    System.out.println("Nota: Se ingreso un parametro incorrectamente.\n");
                    break;
                }
            }
            System.out.println("Salida: ");
            printPosorden(root);

        } else {
            System.out.println("Nota: La raiz del árbol esta vacia.");
        }

    }
}
