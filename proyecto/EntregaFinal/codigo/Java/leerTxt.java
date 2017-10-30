package clases;

//Librerias adicionales
import java.io.*;
import java.util.LinkedList;

/**
 * Clase leerTxt. Esta clase se utiliza para leer el txt e ingresar los datos a
 * la estructura de datos contenida en la clase Arbol.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 *
 * @version Octubre 2017
 */
public class leerTxt {

    //Ruta donde se encuentra el archivo que se leera
    static String rutaPC = "Datos.txt";

    /**
     * Metodo leer. Este metodo lee todo un archivo txt, analiza sus datos y los
     * agrega a la estructura de datos.
     */
    public static void leer() {
        LinkedList<String> datos = new LinkedList<>();
        try {
            FileInputStream fistream = new FileInputStream(new File(rutaPC));
            InputStreamReader Fichero = new InputStreamReader(fistream, "Unicode");
            BufferedReader bff = new BufferedReader(Fichero);

            String linea;
            int anterior = 0;
            LinkedList<String> rutas = new LinkedList<>();
            int i = 0;

            while ((linea = bff.readLine()) != null) {
                datos.add(linea);
                if (i > 0) {
                    String[] split1 = datos.get(i).split("─ ");
                    String[] datosArchivo = separarLinea(datos.get(i));
                    int espacios = split1[0].length();
                    String ruta;

                    //Condicionales para manejar la jerarquia de archivos y las rutas.
                    if (espacios > anterior) {
                        anterior = espacios;
                        Arbol.leerTxtBuscarPorRuta(ruta(rutas)).agregarArchivo(datosArchivo[2]);
                        rutas.add(datosArchivo[2]);
                        ruta = ruta(rutas);

                    } else if (espacios < anterior) {
                        anterior -= 4;
                        for (int j = anterior; j >= espacios; j -= 4) {
                            if (!rutas.isEmpty()) {
                                rutas.removeLast();
                            }
                        }

                        if (!rutas.isEmpty()) {
                            rutas.removeLast();
                        }

                        if (Arbol.leerTxtBuscarPorRuta(ruta(rutas)) != null) {
                            Arbol.leerTxtBuscarPorRuta(ruta(rutas)).agregarArchivo(datosArchivo[2]);

                        }
                        rutas.add(datosArchivo[2]);
                        ruta = ruta(rutas);
                    } else {
                        rutas.removeLast();
                        Arbol.leerTxtBuscarPorRuta(ruta(rutas)).agregarArchivo(datosArchivo[2]);
                        anterior = espacios;
                        rutas.add(datosArchivo[2]);
                        ruta = ruta(rutas);
                    }

                    //Agregar Directorios y ficheros
                    if (linea.contains("4.0K")) {
                        Directorio dir = new Directorio(datosArchivo[2], ruta, datosArchivo[1], datosArchivo[0]);
                        Arbol.agregar(dir);
                    } else {
                        Fichero dir = new Fichero(datosArchivo[2], ruta, datosArchivo[1], datosArchivo[0]);
                        Arbol.agregar(dir);

                    }

                } else if (i == 0) {
                    String firstString = datos.get(0);
                    firstString = firstString.substring(0, firstString.length() - 1);
                    Directorio dir = new Directorio(firstString, "", "", "");
                    rutas.add(firstString);
                    Arbol.agregar(dir);
                }
                i++;
            }
            System.out.println("El fichero se leyo correctamente.");
        } catch (Exception e) {
            System.out.println("Se ha producido un error a la hora de leer el archivo " + rutaPC + ".");
            System.out.println("Error: " + e.getMessage());
        }
    }

    /**
     * Metodo separar lineas. Este metodo recibe un String y retorna en un
     * arreglo la informacion alli contenida.
     *
     * @param linea Es el string que contiene la informacion.
     * @return Es el arreglo con la informacion separada.
     */
    public static String[] separarLinea(String linea) {
        String datos[] = linea.split("─");
        datos[2] = datos[2].substring(2);
        String datos2[] = datos[2].split("]");
        String datos3[] = datos2[0].split(" ");
        String datos4[] = new String[3];
        //Manejo de errores.
        if (datos3.length > 2) {
            datos2[1] = datos2[1].substring(2);
            datos4[0] = datos3[0];
            datos4[1] = datos3[2];
            datos4[2] = datos2[1];
        } else {
            datos2[1] = datos2[1].substring(2);
            datos4[0] = datos3[0];
            datos4[1] = datos3[1];
            datos4[2] = datos2[1];
        }
        //[0] autor
        //[1] peso
        //[2] nombre
        return datos4;
    }

    /**
     * Metodo ruta. El cual retorna la ruta de un archivo. Recorre el linked
     * list donde se contiene toda la gerarquia de este y la concatena en un
     * String
     *
     * @param datos es la lista enlazada que contiene los datos de la jerarquia
     * de rutas.
     * @return Se retorna un String con la ruta del elemento
     */
    private static String ruta(LinkedList<String> datos) {
        String rut = "";
        for (int i = 0; i < datos.size(); i++) {
            rut = rut.concat(datos.get(i).concat("/"));
        }
        return rut;
    }

}
