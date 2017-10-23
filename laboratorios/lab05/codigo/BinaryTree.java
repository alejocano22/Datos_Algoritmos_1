package lab05;

/**
 * Laboratorio 5 (Punto 1). Clase BinaryTree. En esta clase se encuentra la
 * implementacion de la estructura de un arbol binario. La plantilla del codigo
 * fue tomada del codigo propuesto para el laboratio 5. Enlace:
 * https://github.com/mauriciotoro/ST0245-Eafit/tree/master/laboratorios/lab05/codigo/java/Laboratorio5/src
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Octubre 2017
 */
public class BinaryTree {

    //Raiz
    public Node root;

    /**
     * Constructor de BinaryTree.
     */
    public BinaryTree() {
        root = null;
    }

    /**
     * Metodo max2. Este metodo compara dos numeros y retorna el mayor.
     *
     * @param i Es un numero a comparar.
     * @param j Es un numero a comparar.
     * @return Se retorna el numero mas grande.
     */
    private int max2(int i, int j) {
        if (i > j) {
            return i;
        }
        return j;
    }

    /**
     * Metodo maxheightAUX. El cual funciona como auxiliar del metodo maxheight,
     * su funcion es clacular la maxima extension de un arbol.
     *
     * @param node Es el nodo que se va a evaluar.
     * @return Se rotorna la longitud del arbol.
     */
    private int maxheightAUX(Node node) {
        if (node == null) {
            return 0;
        } else {
            return max2(maxheightAUX(node.left), maxheightAUX(node.right)) + 1;
        }
    }

    /**
     * Metodo maxheight. El cual calcula la longitud de un arbol
     *
     * @return Se rotorna la longitud del arbol, resultado adquirido luego de
     * utilizar el metodo maxheightAUX.
     */
    public int maxheight() {
        return maxheightAUX(root);
    }

    /**
     * Metodo recursivePrintAUX. el cual funciona como auxiliar del metodo
     * recursivePrint. Este metodo imprimer un arbol de manera recursiva en
     * pos-order
     *
     * @param node Es el nodo que se va a evaluar
     */
    private void recursivePrintAUX(Node node) {
        if (node != null) {
            recursivePrintAUX(node.left);
            recursivePrintAUX(node.right);
            System.out.println(node.data);
        }

    }

    /**
     * Metodo recursivePrint. El cual imprimer los elementos de un arbol en
     * pos-order.
     */
    public void recursivePrint() {
        recursivePrintAUX(root);
    }

    /**
     * Punto 1.2. Metodo search. El cual recibe el nombre de una persona y la
     * busca en el arbol.
     *
     * @param n Es la persona que se buscara dentro del arbol
     * @return Se retorna true si la persona se encuentra en el arbol y false en
     * caso contrario
     */
    public boolean search(String n) {
        return searchAux(n, root);

    }

    /**
     * Metodo searchAux. El cual facilita la busqueda de manera recursiva
     *
     * @param n Es la persona que se esta buscando.
     * @param nodo Es el nodo que se va a evaluar.
     * @return Se retorna true si la persona se encontro y false de lo
     * contrario.
     */
    private boolean searchAux(String n, Node nodo) {
        if (nodo == null) {
            return false;
        }
        if (nodo.data.equals(n)) {
            return true;
        }
        return searchAux(n, nodo.right) || searchAux(n, nodo.left);
    }

    /**
     * Punto 1.3. Metodo getGrandMothersName. El cual recibe el nombre de una
     * persona y busca su abuela materna en el arbol
     *
     * @param n Es la persona que se le buscara su abuela materna en el arbol
     */
    public void getGrandMothersName(String n) {
        if (getGrandMothersNameAux(n, root) == false) {
            System.out.println("No se encontro abuela materna para: " + n);
        }
    }

    /**
     * Metodo getGrandMothersNameAux. El cual facilita la busqueda de manera
     * recursiva
     *
     * @param n Es la persona que se le esta buscando la abuela materna.
     * @param nodo Es el nodo que se va a evaluar.
     * @return Se retorna el nombre de la abuela materna si se encontro, de lo
     * contrario se retorna null.
     */
    private boolean getGrandMothersNameAux(String n, Node nodo) {
        if (nodo == null) {
            return false;
        }
        if (nodo.data.equals(n)) {
            if (nodo.left.left != null) {
                String abuelaMaterna = nodo.left.left.data;
                System.out.println("La abuela materna de: " + n + " es: " + abuelaMaterna);
                return true;
            }
            return false;
        }
        return getGrandMothersNameAux(n, nodo.left) || getGrandMothersNameAux(n, nodo.right);
    }
}
