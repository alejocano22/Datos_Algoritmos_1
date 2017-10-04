package taller10;

/**
 * Taller10. Punto 2. Clase Arbol.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrea Chamat
 * @version Octubre 2017
 */
public class Arbol {

    private Nodo raiz;

    public Arbol(Nodo raiz) {
        this.raiz = raiz;
    }

    public Nodo getNodo() {
        return raiz;
    }

    /**
     * Punto 4. Metodo imprimirInorden(). Este metodo imprime en inorden un
     * arbol binario.
     *
     * @param raiz
     * @return
     */
    public StringBuffer imprimirInorden(Nodo raiz) {
        StringBuffer sb = new StringBuffer();

        if (raiz == null) {
            //Vacio
        } else if (raiz.izquierdo == null && raiz.derecho == null) {
            System.out.print(raiz.dato + " ");
            sb.append(raiz.dato);
        } else {
            Nodo n = raiz;
            sb.append(imprimirInorden(n.izquierdo));
            System.out.print(n.dato + " ");
            sb.append(imprimirInorden(n.derecho));
        }

        return sb;
    }

    /**
     * Punto 5. Metodo Dibujar(). Este metodo genera el codigo para esta
     * herramienta: http://www.webgraphviz.com/
     */
    public void dibujar() {
        System.out.println("digraph G {");
        auxdibujar("", raiz);
        System.out.println("}");
    }

    /**
     * Punto 5. Metodo Auxiliar de Dibujar.
     *
     * @param a
     * @param raiz
     */
    private void auxdibujar(String a, Nodo raiz) {
        if (raiz == null) {
            //Vacio
        } else if (raiz.izquierdo == null && raiz.derecho == null) {
            System.out.println("\"" + raiz.dato + "\"");
        } else if (raiz.izquierdo == null) {
            System.out.print("\"" + raiz.dato + "\" -> ");
            auxdibujar(a, raiz.izquierdo);
            auxdibujar(a, raiz.derecho);
        } else if (raiz.derecho == null) {
            System.out.print("\"" + raiz.dato + "\" -> ");
            auxdibujar(a, raiz.izquierdo);
            auxdibujar(a, raiz.derecho);
        } else {
            System.out.print("\"" + raiz.dato + "\" -> ");
            auxdibujar(a, raiz.izquierdo);
            System.out.print("\"" + raiz.dato + "\" -> ");
            auxdibujar(a, raiz.derecho);
        }
    }

}
