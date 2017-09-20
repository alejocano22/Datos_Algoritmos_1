package taller9;

import java.util.LinkedList;

/**
 * Taller 9. Punto 1. TablaDeHash, en esta clase en encuentra la implementacion
 * de una tabla de Hash.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera Chamat
 * @version Septiembre 2017
 */
public class TablaDeHash {

    /**
     * Atributo.
     */
    private LinkedList<Objeto>[] tabla;

    /**
     * Constructor. Se inicializan todas las posiciones del arreglo con listas
     * enlazadas vacias.
     */
    public TablaDeHash() {
        tabla = new LinkedList[10];
        for (int i = 0; i < tabla.length; i++) {
            LinkedList<Objeto> lista = new LinkedList();
            tabla[i] = lista;
        }
    }

    /**
     * Metodo funcionHash. Este metodo se encarga de asignarle por medio de una
     * funcion un numero en la tabla Hash a una cadena de caracteres
     *
     * @param txt Es la cadena de cracteres que se va a procesar
     * @return Es el valor de la cadena de caracteres despues de aplicada la
     * funcion.
     */
    private int funcionHash(String txt) {
        int code = 0;
        for (int i = 0; i < txt.length(); i++) {
            code += (int) (((int) txt.charAt(i)) * Math.pow((double) 31, (double) (txt.length() - 1 - i)));
        }
        return Math.abs(code % 10);
    }

    /**
     * Metodo buscar. El cual busca un elemento en la Tabla Hash
     *
     * @param txt Es el elemento que se va a buscar.
     * @return Es la busqueda encontrada o en efecto, sin encontrar.
     */
    public String buscar(String txt) {
        System.out.println("Buscar: ");
        for (int i = 0; i < tabla[funcionHash(txt)].size(); i++) {
            if (tabla[funcionHash(txt)].get(i).getNombre().equals(txt)) {
                return "Nombre: " + txt + "\nAtributo: " + tabla[funcionHash(txt)].get(i).getAtributo() + "\n";
            }
        }
        return "Nombre: " + txt + "\nNo se encontro\n";
    }

    /**
     * Metodo insertar. El cual inserta un elemento de tipo Objeto en la tabla
     * de Hash.
     *
     * @param objeto Es el elemento a ser insertado
     */
    public void insertar(Objeto objeto) {
        tabla[funcionHash(objeto.getNombre())].add(objeto);
    }

    /**
     * Metodo imprimir. El cual imprime todos los elementos de la tabla de Hash
     */
    public void imprimir() {
        System.out.println("Tabla De Hash: ");
        for (int i = 0; i < tabla.length; i++) {
            System.out.println("Posicion: " + i);
            if (tabla[i].isEmpty()) {
                System.out.println("[]");
            } else {
                for (int j = 0; j < tabla[i].size(); j++) {
                    System.out.println("[" + j + "] " + tabla[i].get(j).getNombre());
                }
            }
        }
        System.out.println();
    }

}
