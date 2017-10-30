package clases;

//Librerias Adicionales.
import java.util.Scanner;
import java.util.TreeMap;

/**
 * Clase Arbol. Aqui se almacena la estructura base de una clase tipo Arbol (Que
 * en sintesis seria la estructura de datos en si del proyector), se hacen uso
 * de la libreria TreeMap que es una implementacion de un Arbol Rojo-Negro de
 * Java.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 *
 * @version Octubre 2017
 */
public class Arbol {

    /**
     * Implementación del TreeMap de la libreria de Java. Para el arbol
     * principal se utiliza como clave principale el nombre del archivo y dentro
     * de este nodo se crea un sub arbol que guarda el objeto Archivo por su
     * ruta, para de esta manera evitar colisiones, se crea en sintesis un arbol
     * de arboles que nos garantiza una complejidad en el peor de los casos de
     * busqueda O(log n) sinedo n el numero de elementos en el arbol.
     */
    static TreeMap<String, TreeMap<String, Archivo>> arbol = new TreeMap<>();

    /**
     * Metodo agregar. Este metodo recibe como parametro un objeto tipo Archivo,
     * con el nombre del archivo realiza la busqueda del nodo correspondiente en
     * el arbol principal, si en dicho nodo no hay elementos crea un nuevo sub
     * arbol (sub treeMap) y se agrega el elemento en la raiz. Si el arbol ya
     * exite en dicho nodo, se recorre el subarbol utilizando como clave
     * principal la ruta dela achivo.
     *
     * @param archivo Es el archivo que se va agregar a la estructura de datos.
     */
    public static void agregar(Archivo archivo) {
        if (arbol.get(archivo.getNombre()) == null) {
            TreeMap<String, Archivo> subArbol = new TreeMap<>();
            subArbol.put(archivo.getRuta(), archivo);
            arbol.put(archivo.getNombre(), subArbol);
        } else {
            arbol.get(archivo.getNombre()).put(archivo.getRuta(), archivo);
        }
    }

    /**
     * Metodo buscar. El cual recibe como parametro un nombre, y partiendo de
     * esta informacion se busca en el arbol. Si el archivo existe se imprime la
     * ruta. Si es de tipo directorio se pregunta si se desean listar todos los
     * elementos en dicha ruta ya que esto aumentaria la complejidad. Ademas si
     * existen varios archivos con dicho nombre se realiza lo mismo del caso
     * anterior.
     *
     * @param nombre Es el nombre que se va a buscar.
     */
    public static void buscar(String nombre) {
        TreeMap auxiliar = arbol.get(nombre);
        if (auxiliar == null) {
            System.out.println();
            System.out.println("El fichero o directorio no existe.");
        } else {
            if (auxiliar.size() == 1) {
                System.out.println();
                System.out.println("El archivo " + nombre + " existe en la siguiente ruta: ");
                Archivo archivo = (Archivo) auxiliar.firstEntry().getValue();
                System.out.println("Ruta: " + archivo.getRuta());
                if (archivo instanceof Directorio) {
                    System.out.println("  ¿Desea listar todos los archivos de este directorio?");
                    System.out.println("Tenga en cuenta que si lista todos los archivos \ncontenidos aqui la complejidad es O(n)");
                    System.out.println("- Digite 1 si desea listar.");
                    System.out.println("- Por lo contrario digite otra tecla");
                    Scanner lect = new Scanner(System.in);
                    String key = lect.nextLine();
                    if ("1".equals(key)) {
                        ((Directorio) archivo).listar();
                    }
                }
            } else {
                System.out.println("El archivo " + nombre + " existe en la siguiente ruta: ");
                Archivo archivo = (Archivo) auxiliar.firstEntry().getValue();
                System.out.println("Ruta: " + archivo.getRuta());
                System.out.println(" Nota: Existen otros archivos con este mismo nombre");
                System.out.println("  ¿Desea listar todos los archivos con este mismo nombre?");
                System.out.println("Tenga en cuenta que si lista todos los archivos \ncontenidos aqui la complejidad es O(n)");
                System.out.println("- Digite 1 si desea listar.");
                System.out.println("- Por lo contrario digite otra tecla");
                Scanner lect = new Scanner(System.in);
                String key = lect.nextLine();
                if ("1".equals(key)) {
                    Object[] arrayAuxiliar = auxiliar.values().toArray();
                    System.out.println("Nombre: " + (Archivo) auxiliar.firstEntry().getValue());
                    System.out.println("Rutas: ");
                    int i = 0;
                    for (Object arrayAux : arrayAuxiliar) {
                        System.out.println("[" + i + "]" + ((Archivo) arrayAux).getRuta());
                        i++;
                    }
                }
            }
        }
    }

    /**
     * Metodo buscarPorRuta. El cual recibe como parametro una ruta de un
     * archivo y la busca en el arbol. Ademas se pregunta si se desean listar
     * los archivos contenidos en dicha ruta, ya que esto aumentaria la
     * complejidad a O(n)
     *
     * @param ruta Es la ruta por la cual se buscara.
     */
    public static void buscarPorRuta(String ruta) {
        //Se busca el ultimo elemento de la ruta utilizando Split
        String[] rutaAux = ruta.split("/");
        //Se busca en el arbol
        TreeMap arbolAuxiliar = arbol.get(rutaAux[rutaAux.length - 1]);
        if (arbolAuxiliar == null) {
            System.out.println();
            System.out.println("El fichero o directorio no existe.");
        } else {
            if (arbolAuxiliar.size() == 1) {
                System.out.println();
                System.out.println("El archivo " + rutaAux[rutaAux.length - 1] + " existe en la siguiente ruta:");
                Archivo archivo = (Archivo) arbolAuxiliar.firstEntry().getValue();
                System.out.println("Ruta: " + archivo.getRuta());
                if (archivo instanceof Directorio) {
                    System.out.println("  ¿Desea listar todos los archivos de este directorio?");
                    System.out.println("Tenga en cuenta que si lista todos los archivos \ncontenidos aqui la complejidad es O(n)");
                    System.out.println("- Digite 1 si desea listar.");
                    System.out.println("- Por lo contrario digite otra tecla");
                    Scanner lect = new Scanner(System.in);
                    String key = lect.nextLine();
                    if ("1".equals(key)) {
                        ((Directorio) archivo).listar();
                    }
                }
            } else {
                Archivo archivo = (Archivo) arbolAuxiliar.get(ruta);
                if (archivo != null) {
                    System.out.println("El archivo " + rutaAux[rutaAux.length - 1] + " existe en la siguiente ruta: ");
                    System.out.println("Ruta: " + archivo.getRuta());
                    if (archivo instanceof Directorio) {
                        System.out.println("  ¿Desea listar todos los archivos de este directorio?");
                        System.out.println("Tenga en cuenta que si lista todos los archivos \ncontenidos aqui la complejidad es O(n)");
                        System.out.println("- Digite 1 si desea listar.");
                        System.out.println("- Por lo contrario digite otra tecla");
                        Scanner lect = new Scanner(System.in);
                        String key = lect.nextLine();
                        if ("1".equals(key)) {
                            ((Directorio) archivo).listar();
                        }
                    }
                } else {
                    System.out.println();
                    System.out.println("El fichero o directorio no existe.");
                }
            }
        }

    }

    /**
     * Metodo leerTxtBuscarPorRutaLeer. Este metodo realiza un busqueda por la
     * ruta. (A diferencia del metodo bucarPorRuta, este metodo es utilizado en
     * la lectura del archivo txt, ya que no lanza mensajes).
     *
     * @param ruta es la ruta que se va a buscar.
     * @return se retorna el directorio encontrado.
     */
    public static Directorio leerTxtBuscarPorRuta(String ruta) {
        String[] arrayAux = ruta.split("/");
        TreeMap arbolAux = arbol.get(arrayAux[arrayAux.length - 1]);
        if (arbolAux == null) {
        } else {
            if (arbolAux.size() == 1) {
                Directorio directorio = (Directorio) arbolAux.firstEntry().getValue();
                return directorio;
            } else {
                return (Directorio) arbolAux.get(ruta);

            }
        }
        return null;
    }

}
