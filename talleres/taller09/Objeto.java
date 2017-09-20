package taller9;

/**
 * Taller 9. Punto 1. Objeto, en esta clase se encuentran basicamente la
 * plantilla que tendran los objetos en la Tabla de Hash (Funciona como auxiliar
 * para manejar de mejor manera la informacion en la tabla de Hash realizada y
 * así evitar las colisiones).
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera Chamat
 * @version Septiembre 2017
 */
public class Objeto {
    //Atributos
    private String nombre;
    private String atributo;

    //Constructor
    public Objeto(String nombre, String atributo) {
        this.nombre = nombre;
        this.atributo = atributo;
    }

    //Metodos
    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getAtributo() {
        return atributo;
    }

    public void setAtributo(String atributo) {
        this.atributo = atributo;
    }

}
