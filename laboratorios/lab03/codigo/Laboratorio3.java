package lab03;

import java.util.*;

/**
 * Laboratorio3. Punto 1. En esta clase se encuentra todo el codigo de los
 * ejercicios 1.1, 1.2, 1.3 y 1.4 y además se encuentra el metodo main donde se
 * realizan las pruebas de dichos ejercicios (metodos).
 *
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Septiembre 2017
 */
public class Laboratorio3 {

    /**
     * Punto 1.1 Multiplicar (con ArrayList). Este metodo recibe un ArrayList y
     * retorna la multiplicacion de todos los numeros en dicho arreglo.
     *
     * @param array Es el arreglo el cual se va a evaluar.
     * @return Es el valor de la multiplicacion de los elementos en el arreglo.
     */
    public static int multiplicar(ArrayList<Integer> array) {
        int mult = 1;
        for (Integer n : array) {
            mult *= n;
        }
        return mult;
    }

    /**
     * Punto 1.1 Multiplicar (con LinkedList). Este metodo recibe una lista
     * enlazada (LinkedList) y retorna la multiplicacion de todos los numeros en
     * dicha lista.
     *
     * @param list Es la lista la cual se va a evaluar.
     * @return Es el valor de la multiplicacion de los elementos en la lista.
     */
    public static int multiplicar(LinkedList<Integer> list) {
        int mult = 1;
        for (Integer n : list) {
            mult *= n;
        }
        return mult;
    }

    /**
     *
     * Punto 1.2 SmartInsert (con ArrayList). Este metodo recibe un ArrayList y
     * un entero, verifica que este no se encuentre en el arreglo y lo agrega al
     * final del mismo, de lo contrario, deja el arreglo intacto.
     *
     * @param array Es el arreglo la cual se va a evaluar.
     * @param data Es el valor de tipo entero que se desea agregar al arreglo.
     */
    public static void SmartInsert(ArrayList<Integer> array, int data) {
        boolean in = false;
        for (Integer n : array) {
            if (n == data) {
                in = true;
                break;
            }
        }
        if (in == false) {
            array.add(data);
        }
    }

    /**
     *
     * Punto 1.2 SmartInsert (con linkedList). Este metodo recibe una una lista
     * enlazada (LinkedList) y un entero, verifica que este no se encuentre en
     * la lista y lo agrega al final de la misma, de lo contrario, deja la lista
     * intacta.
     *
     * @param list Es la lista la cual se va a evaluar.
     * @param data Es el valor de tipo entero que se desea agregar a la lista.
     */
    public static void SmartInsert(LinkedList<Integer> list, int data) {
        boolean in = false;
        for (Integer n : list) {
            if (n == data) {
                in = true;
                break;
            }
        }
        if (in == false) {
            list.add(data);
        }
    }

    /**
     * Punto 1.3 pivote (con ArrayList). Este metodo recibe un ArrayList de
     * enteros y calcula la posicion mas optima para colocar un pivote.
     *
     * @param array Es la lista de pesos donde se buscara la posicion mas optima
     * para el pivote.
     * @return El valor de retorno es la posicion mas optima para colocar un
     * pivote.
     */
    public static int pivote(ArrayList<Integer> array) {
        int sum1, sum2, i;
        int c = 0;
        int piv = 0;
        int conpiv = 1000000;
        do {
            sum1 = 0;
            sum2 = 0;
            i = 0;
            for (Integer n : array) {
                if (i < c) {
                    sum1 += n;
                } else {
                    sum2 += n;
                }
                i++;
            }
            if (conpiv > Math.abs(sum1 - sum2)) {
                conpiv = Math.abs(sum1 - sum2);
                piv = c - 1;
            }
            c++;
        } while (c < array.size());
        return piv;
    }

    /**
     * Punto 1.3 pivote (con LinkedList). Este metodo recibe un LinkedList de
     * enteros y calcula la posicion mas optima para colocar un pivote.
     *
     * @param list Es la lista de pesos donde se buscara la posicion mas optima
     * para el pivote.
     * @return El valor de retorno es la posicion mas optima para colocar un
     * pivote.
     */
    public static int pivote(LinkedList<Integer> list) {
        int sum1, sum2, i;
        int c = 0;
        int piv = 0;
        int conpiv = 1000000;
        do {
            sum1 = 0;
            sum2 = 0;
            i = 0;
            for (Integer n : list) {
                if (i < c) {
                    sum1 += n;
                } else {
                    sum2 += n;
                }
                i++;
            }
            if (conpiv > Math.abs(sum1 - sum2)) {
                conpiv = Math.abs(sum1 - sum2);
                piv = c - 1;
            }
            c++;
        } while (c < list.size());
        return piv;
    }

    /**
     * Punto 1.4 asignar (con ArrayList). Este metodo recibe dos ArrayList, uno
     * con neveras y otro con solicitudes, y asigna las neveras a las
     * solicitudes en orden de llegada.
     *
     * @param almacen Son las neveras disponibles en el almacen
     * @param pedidos Son los pedidos que se intentaran suplir
     */
    public static void asignar(ArrayList<Nevera> almacen, ArrayList<Solicitud> pedidos) {
        for (Solicitud pedido : pedidos) {
            System.out.println("Pedido: " + pedido.getNombre());
            for (int j = 0; j < pedido.getPedido(); j++) {
                if (!almacen.isEmpty()) {
                    System.out.println("(" + almacen.get(almacen.size() - 1).getCodigo() + ", '" + almacen.get(almacen.size() - 1).getNombre() + "')");
                    almacen.remove(almacen.size() - 1);
                } else {
                    System.out.println();
                    break;
                }
            }
        }
    }

    /**
     * Punto 1.4 asignar (con LinkedList). Este metodo recibe dos listas
     * enlazadas (linkedList), una con neveras y otra con solicitudes, y asigna
     * las neveras a las solicitudes en orden de llegada.
     *
     * @param almacen Son las neveras disponibles en el almacen
     * @param pedidos Son los pedidos que se intentaran suplir
     */
    public static void asignar(LinkedList<Nevera> almacen, LinkedList<Solicitud> pedidos) {
        for (Solicitud pedido : pedidos) {
            System.out.println("Pedido: " + pedido.getNombre());
            for (int j = 0; j < pedido.getPedido(); j++) {
                if (!almacen.isEmpty()) {
                    System.out.println("(" + almacen.getLast().getCodigo() + ", '" + almacen.pollLast().getNombre() + "')");
                } else {
                    System.out.println();
                    break;
                }
            }

        }
    }

    /**
     * Metodo main(). En este metodo se realizan las pruebas de los algorimos de
     * los puntos 1.1(Multiplicar), 1.2(SmartInsert), 1.3(pivote) y
     * 1.4(asignar).
     *
     * @param args
     */
    public static void main(String[] args) {
        System.out.println("    Punto 1: ");
        System.out.println("Punto 1.1");

        //Punto 1.1 ArrayList
        ArrayList<Integer> array1_1 = new ArrayList<>();
        array1_1.addAll(Arrays.asList(new Integer[]{1, 2, 3, 4}));
        System.out.println("- Array: " + array1_1.toString());
        System.out.println("  Multiplicación: " + multiplicar(array1_1));
        ArrayList<Integer> array1_2 = new ArrayList<>();
        array1_2.addAll(Arrays.asList(new Integer[]{10, 10, 10, 10}));
        System.out.println("- Array: " + array1_2.toString());
        System.out.println("  Multiplicación: " + multiplicar(array1_2));
        ArrayList<Integer> array1_3 = new ArrayList<>();
        array1_3.addAll(Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println("- Array: " + array1_3.toString());
        System.out.println("  Multiplicación: " + multiplicar(array1_3));

        //Punto 1.1 LinkedList
        LinkedList<Integer> linked1_1 = new LinkedList<>();
        linked1_1.addAll(Arrays.asList(new Integer[]{1, 2, 3, 4}));
        System.out.println("- LinkedList: " + linked1_1.toString());
        System.out.println("  Multiplicación: " + multiplicar(linked1_1));
        LinkedList<Integer> linked1_2 = new LinkedList<>();
        linked1_2.addAll(Arrays.asList(new Integer[]{10, 10, 10, 10}));
        System.out.println("- LinkedList: " + linked1_2.toString());
        System.out.println("  Multiplicación: " + multiplicar(linked1_2));
        LinkedList<Integer> linked1_3 = new LinkedList<>();
        linked1_3.addAll(Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println("- LinkedList: " + linked1_3.toString());
        System.out.println("  Multiplicación: " + multiplicar(linked1_3));
        System.out.println();

        System.out.println("Punto 1.2");
        //Punto 1.2 ArrayList
        ArrayList<Integer> array2_1 = new ArrayList<>();
        array2_1.addAll(Arrays.asList(new Integer[]{1, 2, 3, 4}));
        System.out.println("- Array: " + array2_1.toString());
        System.out.println("  Insetar: " + 1);
        SmartInsert(array2_1, 1);
        System.out.println("  Resultado: " + array2_1.toString());
        ArrayList<Integer> array2_2 = new ArrayList<>();
        array2_2.addAll(Arrays.asList(new Integer[]{5, 6, 7, 8, 9}));
        System.out.println("- Array: " + array2_2.toString());
        System.out.println("  Insetar: " + 10);
        SmartInsert(array2_2, 10);
        System.out.println("  Resultado: " + array2_2.toString());
        ArrayList<Integer> array2_3 = new ArrayList<>();
        array2_3.addAll(Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println("- Array: " + array2_3.toString());
        System.out.println("  Insetar: " + 0);
        SmartInsert(array2_3, 0);
        System.out.println("  Resultado: " + array2_3.toString());

        //Punto 1.2 LinkedList
        LinkedList<Integer> linked2_1 = new LinkedList<>();
        linked2_1.addAll(Arrays.asList(new Integer[]{1, 2, 3, 4}));
        System.out.println("- LinkedList: " + linked2_1.toString());
        System.out.println("  Insetar: " + 1);
        SmartInsert(linked2_1, 1);
        System.out.println("  Resultado: " + linked2_1.toString());
        LinkedList<Integer> linked2_2 = new LinkedList<>();
        linked2_2.addAll(Arrays.asList(new Integer[]{5, 6, 7, 8, 9}));
        System.out.println("- LinkedList: " + linked2_2.toString());
        System.out.println("  Insetar: " + 10);
        SmartInsert(linked2_2, 10);
        System.out.println("  Resultado: " + linked2_2.toString());
        LinkedList<Integer> linked2_3 = new LinkedList<>();
        linked2_3.addAll(Arrays.asList(new Integer[]{1, 2, 3, 4, 5, 6, 7, 8, 9, 10}));
        System.out.println("- LinkedList: " + linked2_3.toString());
        System.out.println("  Insetar: " + 0);
        SmartInsert(linked2_3, 0);
        System.out.println("  Resultado: " + linked2_3.toString());
        System.out.println();

        System.out.println("Punto 1.3");
        //Punto 1.3 ArrayList
        ArrayList<Integer> array3_1 = new ArrayList<>();
        array3_1.addAll(Arrays.asList(new Integer[]{10, 20, 5, 3, 20, 10}));
        System.out.println("- Array: " + array3_1.toString());
        System.out.println("  Pivote: " + pivote(array3_1));
        ArrayList<Integer> array3_2 = new ArrayList<>();
        array3_2.addAll(Arrays.asList(new Integer[]{10, 2, 4, 8}));
        System.out.println("- Array: " + array3_2.toString());
        System.out.println("  Pivote: " + pivote(array3_2));
        ArrayList<Integer> array3_3 = new ArrayList<>();
        array3_3.addAll(Arrays.asList(new Integer[]{10, 2, 5, 2, 11}));
        System.out.println("- Array: " + array3_3.toString());
        System.out.println("  Pivote: " + pivote(array3_3));

        //Punto 1.3 LinkedList
        LinkedList<Integer> linked3_1 = new LinkedList<>();
        linked3_1.addAll(Arrays.asList(new Integer[]{10, 20, 5, 3, 20, 10}));
        System.out.println("- LinkedList: " + linked3_1.toString());
        System.out.println("  Pivote: " + pivote(linked3_1));
        LinkedList<Integer> linked3_2 = new LinkedList<>();
        linked3_2.addAll(Arrays.asList(new Integer[]{10, 2, 4, 8}));
        System.out.println("- LinkedList: " + linked3_2.toString());
        System.out.println("  Pivote: " + pivote(linked3_2));
        LinkedList<Integer> linked3_3 = new LinkedList<>();
        linked3_3.addAll(Arrays.asList(new Integer[]{10, 2, 5, 2, 11}));
        System.out.println("- LinkedList: " + linked3_3.toString());
        System.out.println("  Pivote: " + pivote(linked3_3));
        System.out.println();

        System.out.println("Punto 1.4");
        /**
         * Punto 1.4. el cual hace uso de las clases Nevera y Solicitud para el
         * manejo de la información.
         */
        //Crear Neveras
        Nevera nevera1 = new Nevera(1, "haceb");
        Nevera nevera2 = new Nevera(2, "lg");
        Nevera nevera3 = new Nevera(3, "ibm");
        Nevera nevera4 = new Nevera(4, "haceb");
        Nevera nevera5 = new Nevera(5, "lg");
        Nevera nevera6 = new Nevera(6, "ibm");
        Nevera nevera7 = new Nevera(7, "haceb");
        Nevera nevera8 = new Nevera(8, "lg");
        Nevera nevera9 = new Nevera(9, "ibm");
        Nevera nevera10 = new Nevera(8, "lg");
        Nevera nevera11 = new Nevera(9, "ibm");
        //Crear Solicitudes
        Solicitud solicitud1 = new Solicitud("exito", 1);
        Solicitud solicitud2 = new Solicitud("olimpica", 4);
        Solicitud solicitud3 = new Solicitud("lal4", 2);
        Solicitud solicitud4 = new Solicitud("eafit", 10);

        //Punto 1.4 ArrayList
        System.out.println("- Con ArrayList: ");
        ArrayList<Nevera> ArrayAlmacen = new ArrayList<>();
        ArrayAlmacen.addAll(Arrays.asList(new Nevera[]{nevera1, nevera2, nevera3, nevera4, nevera5, nevera6, nevera7, nevera8, nevera9, nevera10, nevera11}));
        ArrayList<Solicitud> ArraySolicitud = new ArrayList<>();
        ArraySolicitud.addAll(Arrays.asList(new Solicitud[]{solicitud1, solicitud2, solicitud3, solicitud4}));
        asignar(ArrayAlmacen, ArraySolicitud);
        
        //Punto 1.4 LinkedList
        System.out.println("- Con LinkedList: ");
        LinkedList<Nevera> linkedAlmacen = new LinkedList<>();
        linkedAlmacen.addAll(Arrays.asList(new Nevera[]{nevera1, nevera2, nevera3, nevera4, nevera5, nevera6, nevera7, nevera8, nevera9, nevera10, nevera11}));
        LinkedList<Solicitud> linkedSolicitud = new LinkedList<>();
        linkedSolicitud.addAll(Arrays.asList(new Solicitud[]{solicitud1, solicitud2, solicitud3, solicitud4}));
        asignar(linkedAlmacen, linkedSolicitud);

    }

}
