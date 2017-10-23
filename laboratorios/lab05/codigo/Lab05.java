package lab05;

/**
 * Laboratorio 5 (Punto 1). Clase Lab05. El codigo de esta clase fue tomado y
 * modificado del codigo propuesto para el laboratio 5. Enlace:
 * https://github.com/mauriciotoro/ST0245-Eafit/tree/master/laboratorios/lab05/codigo/java/Laboratorio5/src
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Octubre 2017
 */
public class Lab05 {

    /**
     * Metodo dibujarArbol. El cual recibe un arbol y genera el codigo para
     * dibujar el codigo en la herramienta: http://www.webgraphviz.com
     *
     * @param a Es el arbol que se va a dibujar.
     */
    public static void dibujarArbol(BinaryTree a) {
        System.out.println("/* arbolito para http://www.webgraphviz.com/ */");
        System.out.println("digraph arbolito {");
        System.out.println("size=\"6,6\";");
        System.out.println("node [color=aquamarine, style=filled];");
        dibujarArbolAux(a.root);
        System.out.println("}");
    }

    /**
     * Metodo dibujarArbolAux. Este metodo funciona como auxiliar para el metodo
     * dibujarArbol, aqui se evaluan y se crean las expresiones para los nodos.
     *
     * @param nodo Es el nodo que se va a evaluar
     */
    public static void dibujarArbolAux(Node nodo) {
        if (nodo != null) {
            for (Node n : new Node[]{nodo.left, nodo.right}) {
                if (n != null) {
                    System.out.println("\"" + nodo.data + "\" -> \"" + n.data + "\";");
                }
                dibujarArbolAux(n);
            }
        }
    }

    /**
     * Metodo Main. Aqui se crean y se realizan las pruebas de los ejercicios
     * planteados del punto 1.
     *
     * @param args
     */
    public static void main(String[] args) {
        //Punto 1.1. Creando el árbol genealogico de descendientes directos
        BinaryTree tree = new BinaryTree();
        //Primer nivel.
        Node hijo = new Node("Alejandro");
        tree.root = hijo;
        //Segundo nivel
        Node mama = new Node("Jenny");
        Node papa = new Node("Diego");
        hijo.left = mama;
        hijo.right = papa;
        //Tercer nivel
        Node abuelaMaterna = new Node("Amanda");
        Node abueloMaterno = new Node("Luis");
        Node abuelaPaterna = new Node("Socorro");
        Node abueloPaterno = new Node("Luis H");
        mama.left = abuelaMaterna;
        mama.right = abueloMaterno;
        papa.left = abuelaPaterna;
        papa.right = abueloPaterno;
        //Cuarto nivel
        Node mamaAbuelaMaterna = new Node("Graciela");
        Node papaAbuelaMaterna = new Node("Miguel Angel");
        Node mamaAbueloMaterno = new Node("Teresa");
        Node papaAbueloMaterno = new Node("Emilio");
        Node mamaAbuelaPaterna = new Node("Isaura");
        Node papaAbuelaPaterna = new Node("Eucebio");
        Node mamaAbueloPaterno = new Node("Virgelina");
        Node papaAbueloPaterno = new Node("Leonardo");
        abuelaMaterna.left = mamaAbuelaMaterna;
        abuelaMaterna.right = papaAbuelaMaterna;
        abueloMaterno.left = mamaAbueloMaterno;
        abueloMaterno.right = papaAbueloMaterno;
        abuelaPaterna.left = mamaAbuelaPaterna;
        abuelaPaterna.right = papaAbuelaPaterna;
        abueloPaterno.left = mamaAbueloPaterno;
        abueloPaterno.right = papaAbueloPaterno;
        //Quinto nivel
        Node abuelaMaternaAbuelaMaterna = new Node(" ");
        Node abueloMaternoAbuelaMaterna = new Node("  ");
        Node abuelaPaternaAbuelaMaterna = new Node("   ");
        Node abueloPaternoAbuelaMaterna = new Node("    ");
        Node abuelaMaternaAbueloMaterno = new Node("     ");
        Node abueloMaternoAbueloMaterno = new Node("      ");
        Node abuelaPaternaAbueloMaterno = new Node("       ");
        Node abueloPaternoAbueloMaterno = new Node("        ");
        Node abuelaMaternaAbuelaPaterna = new Node("Mariana");
        Node abueloMaternoAbuelaPaterna = new Node("Leon");
        Node abuelaPaternaAbuelaPaterna = new Node("Filomena");
        Node abueloPaternoAbuelaPaterna = new Node("Reyes");
        Node abuelaMaternaAbueloPaterno = new Node("         ");
        Node abueloMaternoAbueloPaterno = new Node("          ");
        Node abuelaPaternaAbueloPaterno = new Node("Ana");
        Node abueloPaternoAbueloPaterno = new Node("Victor");
        mamaAbuelaMaterna.left = abuelaMaternaAbuelaMaterna;
        mamaAbuelaMaterna.right = abueloMaternoAbuelaMaterna;
        papaAbuelaMaterna.left = abuelaPaternaAbuelaMaterna;
        papaAbuelaMaterna.right = abueloPaternoAbuelaMaterna;
        mamaAbueloMaterno.left = abuelaMaternaAbueloMaterno;
        mamaAbueloMaterno.right = abueloMaternoAbueloMaterno;
        papaAbueloMaterno.left = abuelaPaternaAbueloMaterno;
        papaAbueloMaterno.right = abueloPaternoAbueloMaterno;
        mamaAbuelaPaterna.left = abuelaMaternaAbuelaPaterna;
        mamaAbuelaPaterna.right = abueloMaternoAbuelaPaterna;
        papaAbuelaPaterna.left = abuelaPaternaAbuelaPaterna;
        papaAbuelaPaterna.right = abueloPaternoAbuelaPaterna;
        mamaAbueloPaterno.left = abuelaMaternaAbueloPaterno;
        mamaAbueloPaterno.right = abueloMaternoAbueloPaterno;
        papaAbueloPaterno.left = abuelaPaternaAbueloPaterno;
        papaAbueloPaterno.right = abueloPaternoAbueloPaterno;

        //Punto 1.2. Imprime el árbol familiar
        System.out.println("Arbol Familiar: ");
        tree.recursivePrint();
        System.out.println();

        //Punto 1.2. Longitud 
        System.out.println("Longitud de descendencia: " + tree.maxheight());
        System.out.println();

        //Punto 1.2. Buscar
        System.out.println("Buscar algunos familiares: ");
        System.out.println("Diego:     " + tree.search("Diego"));
        System.out.println("Luis:      " + tree.search("Luis"));
        System.out.println("Alejandro: " + tree.search("Alejandro"));
        System.out.println("Daniel:    " + tree.search("Daniel"));
        System.out.println();

        //Punto 1.3. Buscar abuela materna.
        System.out.println("Buscar abuela materna: ");
        tree.getGrandMothersName("Alejandro");
        tree.getGrandMothersName("Jenny");
        tree.getGrandMothersName("Diego");
        tree.getGrandMothersName("Luis");
        tree.getGrandMothersName("Daniel");
        System.out.println();
        
        //Punto 1.2. Dibuja el árbol familiar para la herramienta http://www.webgraphviz.com
        dibujarArbol(tree);      
        
    }
}
