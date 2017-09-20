package taller9;

import java.util.*;

/**
 * Taller 9. Puntos 3, 4 y 5. En esta clase se encuentra todoa la implementacion
 * del codigo de los punto 3, 4 y 5 (Problemas de pedrito con su HashTable).
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera Chamat
 * @version Septiembre 2017
 */
public class PedritoHashTable {

    /**
     * Punto 3. Agregar un elemento a la tabla de Hash.
     *
     * @param tabla Es la tabla de Hash a la cual se le va a agregar el elemento
     * @param empresa Es el atributo empresa el cual se va a asociar
     * @param pais Es el atributo pais el cual se va a asociar
     */
    public static void agregar(HashMap tabla, String empresa, String pais) {
        tabla.put(empresa, pais);
    }

    /**
     * Punto4. buscar un elemento en la tabla de Hash.
     *
     * @param empresas Es la tabla de Hash donde de va a realizar la busqueda
     * @param key Es la "llave" con la cual se buscara en la tabla
     */
    public static void buscar(HashMap empresas, String key) {
        if (empresas.get(key) != null) {
            System.out.println(empresas.get(key));
        } else {
            System.out.println("La empresa que busca no existe");
        }
    }

    /**
     * Punto 5. Se realiza una busqueda en la tabla Hash con el nombre del pais
     * y se determina si en dicho pais exiten o no empresas registradas.
     *
     * @param tabla Es la tabla de Hash donde se realizara la busqueda
     * @param pais Es el pais el cual se buscara en la tabla
     */
    public static void buscarPorPais(HashMap tabla, String pais) {
        if (tabla.containsValue(pais)) {
            System.out.println("Si existen empresas en este pais!");
        } else {
            System.out.println("No hay empresas registradas en este país");
        }
    }

    /**
     * Metodo Main. En este metodo se realizan las diferentes pruebas a los
     * puntos 3, 4 y 5 del taller.
     *
     * @param args
     */
    public static void main(String[] args) {
        HashMap empresas = new HashMap();
        //Agregar
        agregar(empresas, "Google", "Estados unidos");
        agregar(empresas, "La locura", "Colombia");
        agregar(empresas, "Nokia", "Finlandia");
        agregar(empresas, "Sony", "Japón");

        //Buscar
        System.out.println("Busquedas: ");
        buscar(empresas, "Google");
        buscar(empresas, "La locura");
        buscar(empresas, "Nokia");
        buscar(empresas, "Sony");
        buscar(empresas, "Motorola");
        System.out.println();

        //Busqueda por pais
        System.out.println("Busqueda por país: ");
        buscarPorPais(empresas, "Colombia");
        buscarPorPais(empresas, "Rusia");
    }
}
