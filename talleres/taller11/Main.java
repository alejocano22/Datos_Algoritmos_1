package taller11;

/**
 * Clase Main. Aquí se realizan las pruebas del Arbol implementado.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Octubre 2017
 */
public class Main {

    /**
     * Clase Main. Aquí se realizan las pruebas del Arbol implementado.
     * @param args 
     */
    public static void main(String[] args) {
        //Creando el arbol
        BinarySearchTree arbol = new BinarySearchTree();
        //Insertar
        arbol.insertar(5);
        arbol.insertar(3);
        arbol.insertar(7);
        arbol.insertar(6);
        arbol.insertar(8);
        arbol.insertar(9);
        System.out.println("Busquedas:");
        System.out.println(arbol.buscar(0));
        System.out.println(arbol.buscar(5));
        System.out.println(arbol.buscar(9));
        //Dibujo del arbol
        arbol.dibujar();
    }

}
