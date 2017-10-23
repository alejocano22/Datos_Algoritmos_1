package lab05;

/**
 * Laboratorio 5. Clase Nodo, en esta clase se encuentran implementados los
 * codigos del punto 4 (Simulacro parcial) con el fin de corroborar las
 * respuestas.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Octubre 2017
 */
class Nodo {

    //Atributos
    Nodo izq;
    Nodo der;
    int dato;

    //Constructor
    public Nodo(int dato) {
        this.dato = dato;
    }

    /**
     * Punto 4. Clase Node. Es un nodo de Strings.
     */
    static class Node {

        //Atributos
        public Node left;
        public Node right;
        public String data;

        //Constructor
        public Node(String d) {
            data = d;
        }
    }

    /**
     * Punto 1. Calcular la altura maxima de un arbol binario.
     *
     * @param raiz Es la raiz del arbol que se va a evaluar
     * @return Es la altura del arbol.
     */
    static int altura(Nodo raiz) {
        if (raiz == null) {
            return 0;
        }
        int izq = altura(raiz.izq) + 1;
        int der = altura(raiz.der) + 1;
        return Math.max(izq, der);
    }

    /**
     * Punto 3. Sumar el camino.
     *
     * @param a Es el nodo que se esta evaluando.
     * @param suma Es a la suma que se quiere llegar.
     * @return Se retorna true si se llego a la suma, de lo contrario se retorna
     * false.
     */
    static boolean sumaElCamino(Nodo a, int suma) {
        if (a == null) {
            return false;
        }
        if (a.izq == null && a.der == null) {
            return suma == a.dato;
        } else {
            return sumaElCamino(a.izq, suma - a.dato) || sumaElCamino(a.der, suma - a.dato);
        }
    }

    /**
     * Punto 4. Imprimir en preorder
     *
     * @param node Es el nodo que se esta evaluando.
     */
    public static void preorder(Node node) {
        if (node != null) {
            System.out.println(node.data);
            preorder(node.left);
            preorder(node.right);
        }
    }

    /**
     * Punto 4.4. Imprimir en el orden requerido.
     *
     * @param node Es el nodo que se esta evaluando.
     */
    public static void print(Node node) {
        if (node != null) {
            print(node.right);             //Linea: 5
            print(node.left);              //Linea: 4
            System.out.println(node.data); //Linea: 3
        }
    }

    public static void main(String[] args) {
        //Arbol planteado en el punto 3.
        //Raiz
        Nodo raiz = new Nodo(5);
        //Segundo nivel
        Nodo raizizq = new Nodo(4);
        Nodo raizder = new Nodo(8);
        raiz.izq = raizizq;
        raiz.der = raizder;
        //Tercer nivel
        Nodo tresuno = new Nodo(11);
        Nodo tresdos = new Nodo(13);
        Nodo trestres = new Nodo(4);
        raizizq.izq = tresuno;
        raizizq.der = null;
        raizder.izq = tresdos;
        raizder.der = trestres;
        //Cuarto nivel
        Nodo cuatrouno = new Nodo(7);
        Nodo cuatrodos = new Nodo(2);
        Nodo cuatrotres = new Nodo(1);
        tresuno.der = cuatrouno;
        tresuno.izq = cuatrodos;
        tresdos.der = null;
        tresdos.izq = null;
        trestres.izq = null;
        trestres.der = cuatrotres;
        //Quinto nivel
        cuatrouno.der = null;
        cuatrouno.izq = null;
        cuatrodos.der = null;
        cuatrodos.izq = null;
        cuatrotres.der = null;
        cuatrotres.izq = null;

        //Pruebas
        System.out.println("Altura: " + altura(raiz));
        System.out.println("Suma de caminos del arbol: ");
        System.out.println(sumaElCamino(raiz, 27));
        System.out.println(sumaElCamino(raiz, 22));
        System.out.println(sumaElCamino(raiz, 26));
        System.out.println(sumaElCamino(raiz, 18));

        //Punto 4. Arbol planteado
        //Primer nivel (Raiz)
        Node wilkenson = new Node("Wilkenson");
        //Segundo nivel
        Node joaquina = new Node("Joaquina");
        Node sufranio = new Node("Sufranio");
        wilkenson.left = joaquina;
        wilkenson.right = sufranio;
        //Tercer nivel
        Node eustaquia = new Node("Eustaquia");
        Node eustaquio = new Node("Eustaquio");
        Node piolina = new Node("Piolina");
        Node piolin = new Node("piolin");
        joaquina.left = eustaquia;
        joaquina.right = eustaquio;
        sufranio.left = piolina;
        sufranio.right = piolin;
        //Cuarto nivel
        Node florinda = new Node("Florinda");
        Node jovin = new Node("Jovin");
        Node wilberta = new Node("Wilberta");
        Node usnavy = new Node("Usnavy");
        eustaquia.left = florinda;
        eustaquia.right = null;
        eustaquio.left = null;
        eustaquio.right = jovin;
        piolina.left = wilberta;
        piolina.right = null;
        piolin.left = null;
        piolin.right = usnavy;
        System.out.println("\nPreorder: ");
        preorder(wilkenson);
        System.out.println("\nSalida esperada: ");
        print(wilkenson);

    }
}
