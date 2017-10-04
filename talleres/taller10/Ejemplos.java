package taller10;

/**
 * Taller10. Punto 3. Clase Ejemplo.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrea Chamat
 * @version Octubre 2017
 */
public class Ejemplos {

    public static void main(String[] args) {
        /**
         * Punto 3. Arbol Genealogico
         */
        Arbol arbol = new Arbol(new Nodo("Wilkenson"));
        Nodo raiz = arbol.getNodo();
        raiz.izquierdo = new Nodo("Joaquina");
        raiz.izquierdo.izquierdo = new Nodo("Eustaquina");
        raiz.izquierdo.derecho = new Nodo("Eustaquio");
        raiz.izquierdo.izquierdo.izquierdo = new Nodo("Florinda");
        raiz.izquierdo.derecho.derecho = new Nodo("Jovin");
        raiz.derecho = new Nodo("Sufranio");
        raiz.derecho.izquierdo = new Nodo("Piolina");
        raiz.derecho.derecho = new Nodo("Piolín");
        raiz.derecho.izquierdo.izquierdo = new Nodo("Wilberta");
        raiz.derecho.derecho.derecho = new Nodo("Usnavy");
        
        System.out.println("Recorrido en Inorden: ");
        arbol.imprimirInorden(raiz);
        System.out.println("\n");
        
        /**
         * Punto 6. Dibujar el arbol genealogico con el metodo Dibujar()
         */
        System.out.println("Codigo para dibujar el arbol: ");
        arbol.dibujar();
    }

    

}
