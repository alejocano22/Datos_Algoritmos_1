package lab04;

/**
 * Laboratorio 4. Punto 1.1. La plantilla de esta clase fue tomada del codigo
 * propuesto para el Laboratorio 4 de:
 * https://github.com/mauriciotoro/ST0245-Eafit/tree/master/laboratorios/lab04/codigo/Java/Laboratorio3/src
 *
 * Clase Lab04. Aquí se realizan algunan pruebas del funcionamiento del
 * LinkedListMauricio.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Octubre 2017
 */
public class Lab04 {

    public static void main(String[] args) {
        LinkedListMauricio list = new LinkedListMauricio();
        list.insert(5, 0);
        list.insert(4, 0);
        list.insert(3, 0);
        list.insert(2, 0);
        list.insert(1, 0);
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
        System.out.println(list.contains(3));
        list.remove(2);
        System.out.println(list.contains(3));
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }

}
