package taller8;

import java.util.LinkedList;
import java.util.Queue;

/**
 * Taller 8. Punto 2. Un cristiano, un musulman y un judío llegan a un bar. El
 * cristiano llega primero, el musuman llega segundo y el judío llega de
 * tercero. Atiéndalos, por favor, en el orden en que llegaron, imprimiendo
 * “Atendiendo a “ y el nombre de la persona. Gracias.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera Chamat
 *
 * @version Septiembre 2017
 */
public class Punto2 {

    /**
     * Metodo main. Aqui se realizan las pruebas del Punto 2.
     *
     * @param args
     */
    public static void main(String[] args) {
        Queue<String> queue = new LinkedList();
        queue.add("Juan");
        queue.add("María");
        queue.add("Pedro");
        cola(queue);
    }

    /**
     * Metodo cola. Este metodo recive una cola de clientes e imprime en que
     * orden se deben atender.
     *
     * @param queue Es la cola de clientes.
     */
    public static void cola(Queue<String> queue) {
        while (!queue.isEmpty()) {
            System.out.println("Atendiendo a: " + queue.remove());
        }
    }
}
