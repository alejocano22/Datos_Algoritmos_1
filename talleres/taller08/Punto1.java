package taller8;

import java.util.Stack;

/**
 * Taller 8. Punto 2. La pila está triste porque sus elementos en orden inverso,
 * es decir, 3, 2, 1. Ayúdele, por favor, escribiendo un código que invierta sus
 * elementos de orden.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera Chamat
 *
 * @version Septiembre 2017
 */
public class Punto1 {

    /**
     * Metodo main. Aqui se realizan las pruebas del Punto 1.
     *
     * @param args
     */
    public static void main(String[] args) {
        Stack<Integer> stack = new Stack();
        stack.push(1);
        stack.push(2);
        stack.push(3);
        imprimir(inversa(stack));
    }

    /**
     * Metodo inversa. El cual recibe una pila e invierte sus elementos en otra
     * pila, la cual retorna.
     *
     * @param stack Es la pila a la cual se le van a invertir los elementos.
     * @return Se retorna la pila invertida.
     */
    public static Stack<Integer> inversa(Stack<Integer> stack) {
        Stack<Integer> aux = new Stack();
        while (!stack.isEmpty()) {
            aux.push(stack.pop());
        }
        return aux;
    }

    /**
     * Metodo imprimir. El cual recibe una pila e imprime sus elementos.
     *
     * @param stack Es la pila la cual se va a imprimir
     */
    public static void imprimir(Stack<Integer> stack) {
        while (!stack.isEmpty()) {
            System.out.println(stack.pop());
        }
    }
}
