package lab04;

import java.util.ArrayList;
import java.util.Scanner;
import java.util.Stack;

/**
 * Laboratorio 4. Punto 2.1. En esta clase se encuentra la implementación del
 * ejercicio en linea propuesto " The Blocks Problem " disponible en:
 * http://bit.ly/2hvOMEj.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Octubre 2017
 */
public class TheBlocksProblem {

    //Atributos
    public ArrayList<Stack> bloques = new ArrayList<>();
    public int size;

    /**
     * Constructor.
     *
     * @param n Es el numero de bloques que se ingresa.
     */
    public TheBlocksProblem(int n) {
        this.size = n;
        for (int i = 0; i < size; i++) {
            Stack pilapolicial = new Stack();
            pilapolicial.push(i);
            bloques.add(pilapolicial);
        }
    }

    /**
     * Metodo print. Imprime todo el "mundo de bloques"
     */
    private void print() {
        Stack bloquesA = new Stack();
        for (int i = 0; i < size; i++) {
            System.out.print(i + ":");
            while (!bloques.get(i).empty()) {
                bloquesA.push(bloques.get(i).pop());
            }
            while (!bloquesA.empty()) {
                System.out.print(" " + bloquesA.pop());
            }
            System.out.println();
        }

    }

    /**
     * Metodo moveOver. Mueve el bloque indicado sobre el segundo bloque
     *
     * @param a bloque a mover
     * @param b bloque hasta el que se va a mover
     */
    public void moveOver(int a, int b) {
        if (a != b) {
            for (int i = 0; i < size; i++) {
                boolean iA = bloques.get(i).contains(a);
                boolean iB = bloques.get(i).contains(b);
                if (iA != iB) {
                    if (iA) {
                        int g = (int) bloques.get(i).pop();
                        while (g != a) {
                            bloques.get(g).push(g);
                            g = (int) bloques.get(i).pop();
                        }

                    }
                    if (iB) {
                        bloques.get(i).push(a);
                    }
                }
            }
        }
    }

    /**
     * metodo moveOnto. Mueve el bloque indicado en el segundo bloque
     *
     * @param a primer bloque
     * @param b segundo bloque
     */
    public void moveOnto(int a, int b) {
        if (a != b) {
            for (int i = 0; i < size; i++) {
                boolean iA = bloques.get(i).contains(a);
                boolean iB = bloques.get(i).contains(b);
                if (iA != iB) {
                    if (iB) {
                        int g = (int) bloques.get(i).pop();
                        while (g != b) {
                            bloques.get(g).push(g);
                            g = (int) bloques.get(i).pop();
                        }
                        bloques.get(i).push(b);
                        bloques.get(i).push(a);

                    }
                    if (iA) {
                        int po = (int) bloques.get(i).pop();
                        while (po != a) {
                            bloques.get(po).push(po);
                            po = (int) bloques.get(i).pop();
                        }
                    }
                }
            }
        }
    }

    /**
     * Metodo pileOver. apila el bloque indicado sobre el segundo bloque
     *
     * @param a primer bloque
     * @param b segundo bloque
     */
    public void pileOver(int a, int b) {
        int pB = 0;
        int pA = 0;
        if (a != b) {
            for (int i = 0; i < size; i++) {
                boolean iA = bloques.get(i).contains(a);
                boolean iB = bloques.get(i).contains(b);
                if (iA) {
                    pA = i;
                }
                if (iB) {
                    pB = i;
                }
            }
            if (pA != pB) {
                Stack pilAx = new Stack();
                int g = (int) bloques.get(pA).pop();
                while (g != a) {
                    pilAx.push(g);
                    g = (int) bloques.get(pA).pop();
                }
                pilAx.push(a);
                while (!pilAx.empty()) {
                    bloques.get(pB).push(pilAx.pop());
                }

            }

        }
    }

    /**
     * Metodo pileOnto. apila el bloque indicado en el segundo bloque
     *
     * @param a primer bloque
     * @param b segundo bloque
     */
    public void pileOnto(int a, int b) {
        if (a != b) {
            int pB = 0;
            int pA = 0;
            for (int i = 0; i < size; i++) {
                boolean iA = bloques.get(i).contains(a);
                boolean iB = bloques.get(i).contains(b);
                if (iA) {
                    pB = i;
                }
                if (iB) {
                    pA = i;
                }
            }
            if (pA != pB) {
                int g = (int) bloques.get(pB).pop();
                while (g != b) {
                    bloques.get(g).push(g);
                    g = (int) bloques.get(pB).pop();
                }
                Stack Aux = new Stack();
                g = (int) bloques.get(pA).pop();
                while (g != a) {
                    Aux.push(g);
                    g = (int) bloques.get(pA).pop();
                }
                Aux.push(a);
                while (!Aux.empty()) {
                    bloques.get(pB).push(Aux.pop());
                }
            }
        }
    }

    /**
     * método main. Aqui se realizan las pruebas del ejercicio.
     *
     * @param args
     */
    public static void main(String[] args) {
        Scanner lec = new Scanner(System.in);
        int n = lec.nextInt();
        TheBlocksProblem a = new TheBlocksProblem(n);
        String comando;
        comando = lec.nextLine();
        do {
            String[] command = comando.split(" ");
            switch (command[0]) {
                case "move":
                    if (command[2].equals("onto")) {
                        a.moveOnto(Integer.parseInt(command[1]), Integer.parseInt(command[3]));
                    }
                    if (command[2].equals("over")) {
                        a.moveOver(Integer.parseInt(command[1]), Integer.parseInt(command[3]));
                    }
                    break;
                case "pile":
                    if (command[2].equals("over")) {
                        a.pileOver(Integer.parseInt(command[1]), Integer.parseInt(command[3]));
                    }
                    if (command[2].equals("onto")) {
                        a.pileOnto(Integer.parseInt(command[1]), Integer.parseInt(command[3]));
                    }
                    break;
                default:
                    break;
            }
            comando = lec.nextLine();
        } while (!comando.equals("quit"));
        a.print();
    }
}