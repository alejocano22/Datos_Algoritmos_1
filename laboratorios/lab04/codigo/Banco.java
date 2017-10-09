package lab04;

import java.util.Arrays;
import java.util.LinkedList;
import java.util.Queue;

/**
 * Laboratorio 4. Punto 1.3. En esta clase se encuentra la implementación y
 * prueba de una simulacion de como 4 filas son atendidas por dos cajeros.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Octubre 2017
 */
public class Banco {

    /**
     * Metodo main. En este metodo se realizan las pruebas del simulador de
     * cajeros de banco.
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("  BANCO:");
        //Fila 1.
        Queue<String> fila1 = new LinkedList();
        fila1.addAll(Arrays.asList("Alejo", "Alberto", "Aleja", "Arenita", "Alicia", "Amelia", "Alexander"));
        //Fila 2.
        Queue<String> fila2 = new LinkedList();
        fila2.addAll(Arrays.asList("Beatriz", "Benito", "Benjamin"));
        //Fila 3.
        Queue<String> fila3 = new LinkedList();
        fila3.addAll(Arrays.asList("Carlos", "Camila", "Carolina", "Catalina"));
        //Fila 4.
        Queue<String> fila4 = new LinkedList();
        fila4.addAll(Arrays.asList("Daniel", "Dario"));
        //Metodo simular.
        simular(fila1, fila2, fila3, fila4);
    }

    /**
     * Metodo simular. Este metodo simula como se realizara la atencion de dos
     * cajeros (Cajero 1 [1::] y Cajero 2 [2::] de un banco a cuatro filas de
     * clientes. Para su implementacion se creo una "Cola de Colas", y se
     * recorrieron las mismas.
     *
     * @param fila1 Es la fila numero 1 del banco.
     * @param fila2 Es la fila numero 2 del banco.
     * @param fila3 Es la fila numero 3 del banco.
     * @param fila4 Es la fila numero 4 del banco.
     */
    public static void simular(Queue<String> fila1, Queue<String> fila2, Queue<String> fila3, Queue<String> fila4) {
        System.out.println("Filas: ");
        System.out.println("Fila 1: " + fila1.toString());
        System.out.println("Fila 2: " + fila2.toString());
        System.out.println("Fila 3: " + fila3.toString());
        System.out.println("Fila 4: " + fila4.toString());
        Queue<Queue> aux;
        Queue<Queue> fila = new LinkedList();
        fila.add(fila1);
        fila.add(fila2);
        fila.add(fila3);
        fila.add(fila4);
        boolean c1 = true;
        String cajero;
        System.out.println(" - Simulador -");
        while (!fila.isEmpty()) {
            if (c1 == true) {
                cajero = "1::";
            } else {
                cajero = "2::";
            }
            if (fila.peek().isEmpty()) {
                fila.remove();
            } else {
                aux = fila.poll();
                System.out.println(cajero + "" + aux.poll());
                fila.add(aux);
                c1 = !c1;
            }

        }
        System.out.println(" - Simulación terminada -");
    }
}
