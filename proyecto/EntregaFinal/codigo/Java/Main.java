package clases;

//Librerias adicionales.
import java.util.*;

/**
 * Clase Main. Esta es la clase principal del proyecto y es el punto de entrada
 * desde donde se ejecuta el metodo principal Main. En esta clase se contiene el
 * menu del proyecto, y desde donde se hace uso de la estructura de datos.
 *
 * Este Proyecto se realizo en colaboracion con: Luisa María Vásquez Gómez, Luis
 * Javier Palacios Mesa, Sebastián Giraldo Gómez y Santiago Escobar Mejía.
 * -UNIVERSIDAD EAFIT-
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 *
 * @version Octubre 2017
 */
public class Main {

    public static void main(String[] args) {
        System.out.println("          Bienvenido");
        System.out.println("En estos momentos estamos cargando los datos del archivo " + leerTxt.rutaPC + " a la estructura de datos.");
        System.out.println("Esto podria tardar unos seguntos.");
        System.out.println("       ...     ");
        //Metodo que lee el archivo
        leerTxt.leer();
        //Declaración del arbol de la estructura de datos.
        Arbol arbol = new Arbol();
        //Se llama el menú de la aplicación.
        menu(arbol);
    }

    /**
     * Metodo menu. El cual se despliega todo el menu que tendra las opciones
     * del proyecto.
     *
     * @param arbol es el arbol de la estructura de datos del proyecto.
     */
    public static void menu(Arbol arbol) {
        opciones();
        int opcion = 1;
        while (opcion != 0) {
            try {
                Scanner lect = new Scanner(System.in);
                opcion = lect.nextInt();
                lect.nextLine();
                switch (opcion) {
                    case 0:
                        System.out.println("Finalizando...");
                        break;

                    case 1:
                        buscar(arbol);
                        System.out.println();
                        break;

                    case 2:
                        buscarPorRuta(arbol);
                        System.out.println();
                        break;

                    case 3:
                        insertarFichero(arbol);
                        System.out.println();
                        break;

                    case 4:
                        insertarDirectorio(arbol);
                        System.out.println();
                        break;

                    default:
                        System.out.println("Se ha ingresado un comado invalido.");
                        opciones();

                }
            } catch (Exception e) {
                System.out.println("Se ha ingresado un comado invalido.");
                opciones();
            }
            opciones();
        }

    }

    /**
     * Metodo buscar. Este metodo pide los datos iniciales para realizar una
     * busqueda por nombre en el arbol.
     *
     * @param arbol Es el arbol de la estructura de datos.
     */
    public static void buscar(Arbol arbol) {
        try {
            Scanner lect = new Scanner(System.in);
            String nombre;
            System.out.println("Digite el nombre del directorio o fichero: ");
            nombre = lect.nextLine();
            Arbol.buscar(nombre);
            System.out.println();
            System.out.println("El proceso ha finalizado exitosamente.");
        } catch (Exception e) {
            System.out.println(" Se encontro un error con los datos ingresados");
            System.out.println("Error: " + e.getMessage());
            System.out.println("Intentalo de nuevo");
        }
    }

    /**
     * Metodo buscar. Este metodo pide los datos iniciales para realizar una
     * busqueda por ruta en el arbol.
     *
     * @param arbol Es el arbol de la estructura de datos.
     */
    public static void buscarPorRuta(Arbol arbol) {
        try {
            Scanner lect = new Scanner(System.in);
            String ruta;
            System.out.println("Digite la ruta del directorio o fichero: ");
            ruta = lect.nextLine();
            Arbol.buscarPorRuta(ruta);
            System.out.println();
            System.out.println("El proceso ha finalizado exitosamente.");
        } catch (Exception e) {
            System.out.println(" Se encontro un error con los datos ingresados");
            System.out.println("Error: " + e.getMessage());
            System.out.println("Intentalo de nuevo");
        }
    }

    /**
     * Metodo insertarFichero. El cual recibe como parametro el arbol de la
     * estructura de datos, pide los datos necesarios, crea un nuevo fichero y
     * lo ingresa al arbol.
     *
     * @param arbol es el arbol de la estructura de datos.
     */
    public static void insertarFichero(Arbol arbol) {
        try {
            Scanner lect = new Scanner(System.in);
            String nombre;
            String ruta;
            String autor;
            String peso;
            System.out.println("Digite el nombre del fichero: ");
            nombre = lect.nextLine();
            System.out.println("Digite la ruta donde se encuentra el fichero: ");
            ruta = lect.nextLine();
            System.out.println("Digite el autor del fichero: ");
            autor = lect.nextLine();
            System.out.println("Digite el peso del fichero: ");
            peso = lect.nextLine();
            Fichero nuevo = new Fichero(nombre, ruta, autor, peso);
            Arbol.agregar(nuevo);
            System.out.println();
            System.out.println("El proceso ha finalizado exitosamente.");
        } catch (Exception e) {
            System.out.println(" Se encontro un error con los datos ingresados");
            System.out.println("Error: " + e.getMessage());
            System.out.println("Intentalo de nuevo");
        }
    }

    /**
     * Metodo insertarDirectorio. El cual recibe como parametro el arbol de la
     * estructura de datos, pide los datos necesarios, crea un nuevo directorio
     * y lo ingresa al arbol.
     *
     * @param arbol es el arbol de la estructura de datos.
     */
    public static void insertarDirectorio(Arbol arbol) {
        try {
            Scanner lect = new Scanner(System.in);
            String nombre;
            String ruta;
            String autor;
            String peso;
            System.out.println("");
            System.out.println("Ingresa el nombre del directorio: ");
            nombre = lect.next();
            System.out.println("Ingresa la ruta en la que se encuentra el directorio: ");
            ruta = lect.next();
            System.out.println("Ingresa el autor del directorio: ");
            autor = lect.next();
            System.out.println("Ingresa el peso del directorio: ");
            peso = lect.next();
            Directorio nuevo = new Directorio(nombre, ruta, autor, peso);
            Arbol.agregar(nuevo);
            System.out.println();
            System.out.println("El proceso ha finalizado exitosamente.");
        } catch (Exception e) {
            System.out.println(" Se encontro un error con los datos ingresados");
            System.out.println("Error: " + e.getMessage());
            System.out.println("Intentalo de nuevo");
        }
    }

    /**
     * Metodo opciones. Este metodo despliega las opciones que se pueden
     * ejecutar en el proyecto.
     */
    public static void opciones() {
        System.out.println();
        System.out.println("Digite el comando que desee ejecutar.");
        System.out.println("1 para Buscar directorio o fichero");
        System.out.println("2 para Buscar por ruta");
        System.out.println("3 para Insertar fichero");
        System.out.println("4 para Insertar directorio");
        System.out.println("0 para Finalizar el proceaso");
        System.out.println();
    }
}
