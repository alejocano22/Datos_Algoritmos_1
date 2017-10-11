package taller11;

/**
 * Clase BinarySearchTree. Donde se implementan los metodos y estructura en
 * general de un Arbol binario de busqueda.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Octubre 2017
 */
public class BinarySearchTree {

    /**
     * Clase Node. contiene la implementacion de un nodo
     */
    public class Node {

        //Atributos
        public Node left;
        public Node right;
        public int data;

        /**
         * Constructor de Node.
         *
         * @param d Es el dato que se contiene en el nodo.
         */
        public Node(int d) {
            data = d;
        }

        //Metodos auxiliares para la operacion de borrado
        /**
         * Metodo rightNull. Convierte al nodo derecho en nulo.
         */
        public void rightNull() {
            right = null;
        }

        /**
         * Metodo leftNull. Convierte al nodo izquierdo en nulo.
         */
        public void leftNull() {
            left = null;
        }
    }

    //Atributos (Raiz del arbol)
    private Node root;

    /**
     * Constructor de BinarySearchTree
     */
    public BinarySearchTree() {
        root = null;
    }

    /**
     * Punto 1. Metodo buscar. El cual recibe un entero n y lo busca en el
     * arbol.
     *
     * @param n Es el dato que se buscara dentro del arbol
     * @return Se retorna true si el dato n se encuentra en el arbol y false en
     * caso contrario
     */
    public boolean buscar(int n) {
        return buscarAux(n, root);

    }

    /**
     * Metodo buscarAux. El cual facilita la busqueda de manera recursiva
     *
     * @param n Es el numero que se esta buscando
     * @param nodo Es el nodo que se va a evaluar
     * @return Se retorna true si el valor se encontro y false de lo contrario.
     */
    private boolean buscarAux(int n, Node nodo) {
        if (nodo == null) {
            return false;
        }
        if (nodo.data == n) {
            return true;
        }
        if (n >= nodo.data) {
            return buscarAux(n, nodo.right);
        }
        return buscarAux(n, nodo.left);

    }

    /**
     * Punto 2. Metodo insertar. El cual recibe un entero n y lo inserta en el
     * arbol.
     *
     * @param n Es el entero n que se va a insertar al arbol
     */
    public void insertar(int n) {
        insertarAux(n, root);
    }

    /**
     * Metodo insertarAux. El cual facilita la inserción de manera recursiva.
     *
     * @param n Es el numero que se va a insertar
     * @param nodo Es el nodo que se va a evaluar
     */
    private void insertarAux(int n, Node nodo) {
        if (nodo == null) {
            root = new Node(n);
        } else {
            if (n >= nodo.data && nodo.right == null) {
                nodo.right = new Node(n);
            } else if (n >= nodo.data) {
                insertarAux(n, nodo.right);
            }

            if (n < nodo.data && nodo.left == null) {
                nodo.left = new Node(n);
            } else if (n < nodo.data) {
                insertarAux(n, nodo.left);
            }
        }
    }

    /**
     * Punto 3. Metodo borrar. El cual recibe un entero n y lo borra en el
     * arbol.
     *
     * @param n Es el entero n que se va a borrar en el arbol
     */
    public void borrar(int n) {
        borrarAux(n, root);
    }

    /**
     * Metodo borrarAux. El cual facilita el borrado de manera recursiva.
     *
     * @param n Es el numero que se va a borrar
     * @param nodo Es el nodo que se va a evaluar
     */
    private void borrarAux(int n, Node nodo) {
        if (nodo != null) {
            if (nodo.data == n) {
                if (nodo.left == null & nodo.right == null) {
                    nodo = null;
                } else if (nodo.left == null) {
                    nodo = nodo.right;
                } else if (nodo.right == null) {
                    nodo = nodo.left;
                } else {
                    nodo.data = buscarValor(nodo.left).right.data;
                    buscarValor(nodo.left).rightNull();
                }
            }
            if (nodo!=null && n < nodo.data) {
                borrarAux(n, nodo.left);
            } else if (nodo!=null && n > nodo.data) {
                borrarAux(n, nodo.right);
            }
        }
    }

    /**
     * Metodo buscarValor. Este metodo sirve como auxiliar de la tarea de
     * borrado ya que retorna el valor con el que se va a reemplazar el nodo que
     * se va a borrar en caso de necesitarlo.
     *
     * @param l Es el nodo apartir del cual se buscara el elemento
     * @return Se retorna el nodo con el cual se va a reemplazar el nodo que se
     * borrara.
     */
    private Node buscarValor(Node inicio) {
        if (inicio.right.right == null) {
            return inicio;
        } else {
            return buscarValor(inicio.right);
        }

    }

    /**
     * Metodo Dibujar(). Este metodo genera el codigo para esta herramienta:
     * http://www.webgraphviz.com/
     */
    public void dibujar() {
        System.out.println("digraph G {");
        auxdibujar("", root);
        System.out.println("}");
    }

    /**
     * Metodo Auxiliar de Dibujar.
     *
     * @param a Es una secuencia de caracteres especifica del programa
     * @param raiz Es la raiz que se evaluara
     */
    private void auxdibujar(String a, Node raiz) {
        if (raiz == null) {
            //Vacio
        } else if (raiz.left == null && raiz.right == null) {
            System.out.println("\"" + raiz.data + "\"");
        } else if (raiz.left == null) {
            System.out.print("\"" + raiz.data + "\" -> ");
            auxdibujar(a, raiz.left);
            auxdibujar(a, raiz.right);
        } else if (raiz.right == null) {
            System.out.print("\"" + raiz.data + "\" -> ");
            auxdibujar(a, raiz.left);
            auxdibujar(a, raiz.right);
        } else {
            System.out.print("\"" + raiz.data + "\" -> ");
            auxdibujar(a, raiz.left);
            System.out.print("\"" + raiz.data + "\" -> ");
            auxdibujar(a, raiz.right);
        }
    }

}
