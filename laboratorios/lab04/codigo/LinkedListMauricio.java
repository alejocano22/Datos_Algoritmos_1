package lab04;

/**
 * Laboratorio 4. Punto 1.1. La plantilla de esta clase fue tomada del codigo
 * propuesto para el Laboratorio 4 de:
 * https://github.com/mauriciotoro/ST0245-Eafit/tree/master/laboratorios/lab04/codigo/Java/Laboratorio3/src
 *
 * En esta clase se encuentran implementados los metodos insert (Add), remove y
 * contains, ademas de otros metodos adicionales.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Octubre 2017
 */
public class LinkedListMauricio {

    /**
     * Atributos del linkedListMauricio.
     */
    private Node first;
    private int size;

    /**
     * Constructor de la clase LinkedListMauricio.
     */
    public LinkedListMauricio() {
        size = 0;
        first = null;
    }

    /**
     * Metodo getNode(). Este metodo retorna el nodo de una posicion especifica
     * de la lista.
     *
     * @param index Es el indice del nodo que se retornara
     * @return Se retorna el nodo de una posicion especifica de la Lista.
     * @throws IndexOutOfBoundsException
     */
    private Node getNode(int index) throws IndexOutOfBoundsException {
        if (index >= 0 && index < size) {
            Node temp = first;
            for (int i = 0; i < index; i++) {
                temp = temp.next;
            }
            return temp;
        } else {
            throw new IndexOutOfBoundsException();
        }
    }

    /**
     * Metodo get(). Este metodo retorna el elemento en una posicion especifica
     * de la lista
     *
     * @param index Es el indice del elemento a retornar
     * @return Es el elemento en la posicion buscada.
     */
    public int get(int index) {
        Node temp = null;
        try {
            temp = getNode(index);
        } catch (IndexOutOfBoundsException e) {
            System.out.println("No se encontro el elemento en la posicion: " + index + " [" + e.getMessage() + "]\n");
            System.exit(0);
        }
        return temp.data;
    }

    /**
     * Metodo size(). Este metodo retorna el tamaño de la lista.
     *
     * @return Se retorna el tamaño de la lista.
     */
    public int size() {
        return size;
    }

    /**
     * Metodo insert. Este metodo recive un dato y lo inserta en la lista en la
     * posicion index.
     *
     * @param data Es el dato que se va a insertar en la lista.
     * @param index Es la posicion en la que se va a insertar
     */
    public void insert(int data, int index) {
        if (size < index) {
            if(size != 0){
                System.out.println("No se puede insertar el elemento: \nIndex: " + index + "\nIndex maximo: " + (size-1)+"\n");
            }else{
                System.out.println("No se puede insertar el elemento: \nIndex: " + index + "\nIndex maximo: La lista no contiene elementos\n");
            }     
        } else if (index < 0) {
            System.out.println("No ingrese indices negativos\n");
        } else if (index == 0) {
            insertFirst(data);
        } else {
            Node nuevo = new Node(data);
            Node i = first;
            Node aux;
            int cont = 0;
            while (cont != index - 1) {
                i = i.next;
                cont++;
            }
            aux = i.next;
            i.next = nuevo;
            nuevo.next = aux;
            size++;
        }
    }

    /**
     * Metodo remove. Este metodo recive indice y elimina el elemento en dicha
     * posicion.
     *
     * @param index Es la posicion en la que se va a eliminar
     */
    public void remove(int index) {
        if (size < index) {
            if(size != 0){
                System.out.println("No se puede eliminar el elemento: \nIndex: " + index + "\nIndex maximo: " + (size-1)+"\n");
            }else{
                System.out.println("No se puede eliminar el elemento: \nIndex: " + index + "\nIndex maximo: La lista no contiene elementos\n");
            }
        } else if (index < 0) {
            System.out.println("No ingrese indices negativos\n");
        } else if (index == 0) {
            removeFirst();
        } else {
            Node i = first;
            Node aux;
            int cont = 0;
            while (cont != index-1) {
                i = i.next;
                cont++;
            }
            aux = i.next.next;
            i.next = aux;
            size--;
        }
        
    }

    /**
     * Metodo contains. Este metodo recive un dato y verifica si esta en la
     * lista
     *
     * @param data Es el dato que se va a buscar
     * @return Se retorna true si el dato se encuentra, de lo contrario se
     * retorna false.
     */
    public boolean contains(int data) {
        if (size > 0) {
            Node auxiliar = first;
            while (auxiliar != null) {
                if (auxiliar.data == data) {
                    return true;
                }
                auxiliar = auxiliar.next;
            }
        }
        return false;
    }

    //Metodos adicionales.
    /**
     * Metodo insertFirst. Este metodo recive un entero data y lo agrega al
     * inicio de la Lista
     *
     * @param data es el numero que se va a agregar al inicio de la lista
     */
    public void insertFirst(int data) {
        Node nuevo = new Node(data);
        if (size != 0) {
            nuevo.next = first;
            first = nuevo;
        } else {
            first = nuevo;
        }
        size++;
    }

    /**
     * metodo insertLast. Este metodo recive un entero data y lo agrega al final
     * de la Lista
     *
     * @param data es el numero que se va a agregar al final de la lista
     */
    public void insertLast(int data) {
        Node nuevo = new Node(data);
        if (size != 0) {
            Node index = first;
            while (index.next != null) {
                index = index.next;
            }
            index.next = nuevo;
        } else {
            first = nuevo;
        }
        size++;
    }

    /**
     * metodo removeLast. Este metodo borra el elemento del final de la lista.
     */
    public void removeLast() {
        if (size != 0) {
            Node auxiliar = first;
            while (auxiliar.next.next != null) {
                auxiliar = auxiliar.next;
            }
            auxiliar.next = null;
            size--;
        } else {
            System.out.println("La lista esta vacia.\n");
        }
    }

    /**
     * metodo removeFirst. Este metodo borra el elemento del inicio de la lista.
     */
    public void removeFirst() {
        if (size != 0) {
            Node aux = first;
            first = aux.next;
            size--;
        } else {
            System.out.println("La lista esta vacia. ");
        }

    }

    /**
     * metodo compare. Este metodo recibe una lista y la compara, si son iguales
     * retorna true y si son diferentes retorna false.
     *
     * @param lista Es la lista con la que vamos a comparar.
     * @return true si las listas son iguales, y false si son diferentes.
     */
    public boolean compare(LinkedListMauricio lista) {
        Node nodo1 = first;
        Node nodo2 = lista.first;
        while (nodo1 != null || nodo2 != null) {
            if (nodo1 == null && nodo2 != null || nodo2 == null && nodo1 != null || nodo1.data != nodo2.data) {
                return false;
            }
            nodo1 = nodo1.next;
            nodo2 = nodo2.next;
        }
        return true;
    }

    /**
     * metodo print. Este metodo imprime la lista.
     */
    public void print() {
        Node nodo = first;
        while (nodo != null) {
            System.out.print(nodo.data);
            if (nodo.next != null) {
                System.out.print(", ");
            }
            nodo = nodo.next;
        }
        System.out.println();
    }
}
