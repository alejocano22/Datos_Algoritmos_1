package taller9;

/**
 * Taller 9. Punto 1. TestTablaDeHash, en esta clase en encuentran los test
 * hechos a la implementacion de una tabla de Hash.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera Chamat
 * @version Septiembre 2017
 */
public class TestTablaDeHash {

    /**
     * Meotodo main. Donde se encuentran las pruebas realizadas.
     * @param args 
     */
    public static void main(String[] args) {
        TablaDeHash hash = new TablaDeHash();
        Objeto l = new Objeto("lunes", "Soleado");
        Objeto m = new Objeto("Martes", "Lluvioso");
        Objeto w = new Objeto("Miercoles", "Nublado");
        Objeto j = new Objeto("Jueves", "Soleado");
        Objeto v = new Objeto("Viernes", "Mucha Nieve");
        Objeto s = new Objeto("Sabado", "Tormenta");
        Objeto d = new Objeto("Domingo", "Lluvia leve");
        hash.insertar(l);
        hash.insertar(m);
        hash.insertar(w);
        hash.insertar(j);
        hash.insertar(v);
        hash.insertar(s);
        hash.insertar(d);
        hash.imprimir();
        System.out.println(hash.buscar("Sabado"));
        System.out.println(hash.buscar("Octubre"));
    }
}
