package lab03;

import java.util.Arrays;
import java.util.LinkedList;

/**
 * Laboratorio3. Punto 4.3. En esta clase se encuentra todo el codigo del
 * ejercicio Hot Potato (Simulacro de parcial)y además se encuentra el metodo
 * main donde se realizan las pruebas de dicho ejercicio.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Septiembre 2017
 */
public class HotPotato {

    //Prueba
    public static void main(String[] args) {
        LinkedList<String> q = new LinkedList<>();
        q.addAll(Arrays.asList(new String[]{"Bill", "David", "Susan", "Jane", "Kent", "Brad"}));
        System.out.println("Gano: " + hotPotato(q, 7));
    }

    /**
     * HOT POTATO. En este metodo se realiza la simulación del juego hot potato
     * y se retorna al ganador de una lista de niños.
     *
     * @param q Es la lista de niños que jugaran
     * @param num Es el numero de veces que se rotaran la "papa" entre ellos.
     * @return Es el niño ganador
     */
    public static String hotPotato(LinkedList<String> q, int num) {
        System.out.println("HOT POTATO:");
        while (q.size() > 1) {
            System.out.println("En juego: " + q.toString());
            for (int i = 1; i <= num; i++) {
                q.addFirst(q.pollLast());
            }
            System.out.println("-> Salio: " + q.getFirst());
            q.remove();
        }
        return q.getFirst();
    }
}
