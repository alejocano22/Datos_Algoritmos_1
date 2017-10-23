package lab05;

import java.util.AbstractMap.SimpleEntry;
import java.util.Scanner;
import java.util.Stack;

/**
 * Laboratorio 5. Punto 2.2. Solución del ejercicio 112 - Tree Summing; de la
 * plataforma UVa. Enlace: http://bit.ly/2iNuHaa
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Octubre 2017
 */
public class TreeSumming {

    /**
     * Método main.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);

        StringBuilder bin = new StringBuilder();
        StringBuilder salida = new StringBuilder();

        while (lec.hasNextLine()) {
            bin.append(lec.nextLine());
            String Arb = bin.toString();

            int inicio = Arb.indexOf('(');

            if (inicio == -1 || bounArb(Arb) == -1) {
                continue;
            }

            int sum = Integer
                    .parseInt(Arb.substring(0, inicio).trim());
            Arb = Arb.substring(inicio);

            if (ArbSuma(Arb.replaceAll("\\s", ""), sum)) {
                salida.append("yes\n");
            } else {
                salida.append("no\n");
            }

            bin.setLength(0);
        }

        salida.deleteCharAt(salida.length() - 1);
        System.out.println(salida.toString());
    }

    /**
     * Calcula la suma de las ramas, define si la condición se cumple
     *
     * @param tree Árbol en el que se opera
     * @param sum Suma que se calcula
     * @return Retorna true si la suma se cumple, de lo contrario retorna false.
     */
    public static boolean ArbSuma(String tree, int sum) {
        boolean valoret = false;
        Stack<SimpleEntry<Integer, String>> frontier = new Stack<>();
        frontier.push(new SimpleEntry<>(sum, tree));

        SimpleEntry<Integer, String> actual;
        String actArb, Nuevo;
        int sumaActual, nuevaSum;

        if (tree.length() == 2) {
            return false;
        }

        while (!frontier.isEmpty()) {
            actual = frontier.pop();
            sumaActual = actual.getKey();
            actArb = actual.getValue();

            if (actArb.length() == 2) {
                continue;
            }

            nuevaSum = Integer.parseInt(actArb.substring(1,
                    actArb.indexOf('(', 1)));
            nuevaSum = sumaActual - nuevaSum;

            Nuevo = actArb.substring(actArb.indexOf('(', 1),
                    actArb.length() - 1);

            if (Nuevo.equals("()()")) {
                if (nuevaSum == 0) {
                    valoret = true;
                    break;
                } else {
                    continue;
                }
            }

            int boun = bounArb(Nuevo);

            String leftSubtree = Nuevo.substring(0, boun + 1);
            String rightSubtree = Nuevo.substring(boun + 1);

            frontier.add(new SimpleEntry<>(nuevaSum, rightSubtree));
            frontier.add(new SimpleEntry<>(nuevaSum, leftSubtree));
        }

        return valoret;
    }

    /**
     * Metodo auxiliar bounArb. El cual sirve para crear el arbol segun los
     * parametros dados.
     *
     * @param tree
     * @return
     */
    public static int bounArb(String tree) {
        char[] arregloArb = tree.toCharArray();

        int i;
        int cont = 0;

        for (i = 0; i < arregloArb.length; i++) {
            switch (arregloArb[i]) {
                case '(':
                    cont++;
                    break;
                case ')':
                    cont--;
                    break;
                default:
                    continue;
            }

            if (cont == 0) {
                break;
            }
        }

        if (cont != 0) {
            i = -1;
        }
        return i;
    }
}
