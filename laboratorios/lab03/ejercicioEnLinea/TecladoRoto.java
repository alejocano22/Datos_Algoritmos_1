package lab03;

import java.util.LinkedList;

/**
 * Laboratorio3. Punto 2.1 En esta clase se encuentra todo el codigo del
 * ejercicio "Teclado Roto" y además se encuentra el metodo main donde se
 * realizan las pruebas de dicho ejercicio.
 *
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Septiembre 2017
 */
public class TecladoRoto {

    /**
     * Metodo Organizar(). Este metodo recibe un String con el texto a organizar
     * y mediante el uso de una lista enlazada organizada las palabras en el
     * texto que se trocaron por el "Teclado roto".
     *
     * @param txt Es el texto que se va a organizar.
     * @return Haciendo uso del metodo imprimirLista() se retorna el texto
     * organizado.
     */
    public static String Organizar(String txt) {
        int pos = 0;
        boolean inicio = false;
        LinkedList<Character> list = new LinkedList<>();
        for (int i = 0; i < txt.length(); i++) {
            if (txt.charAt(i) == '[') {
                inicio = true;
                pos = 0;
            } else if (txt.charAt(i) == ']') {
                inicio = false;
            } else if (inicio) {
                list.add(pos, (char) txt.charAt(i));
                pos++;
            } else {
                list.add((char) txt.charAt(i));
            }
        }
        return ImprimirLista(list);
    }

    /**
     * Metodo ImprimirLista(). El cual recibe una lista enlazada y retorna un
     * String con su contenido.
     *
     * @param list Es la lista la cual se va a imprimir.
     * @return Es el String con los elementos de la lista.
     */
    public static String ImprimirLista(LinkedList<Character> list) {
        String str = "";
        for (Character n : list) {
            str = str.concat(n.toString());
        }
        return str;
    }

    /**
     * Metodo Main. Aqui se realizan las pruebas del algoritmo.
     *
     * @param args
     */
    public static void main(String[] args) {
        String test1 = "This_is_a_[Beiju]_text";
        String test2 = "[[]][][]Happy_Birthday_to_Tsinghua_University";
        System.out.println(Organizar(test1));
        System.out.println(Organizar(test2));
    }

}
