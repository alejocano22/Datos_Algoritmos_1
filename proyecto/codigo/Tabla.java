package proyectodatos;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.HashMap;
import java.util.LinkedList;
import java.util.Scanner;

/**
 * Clase de la estructura de datos del proyecto 
 */
public class Tabla {
    
    /**
     * 
     */
    HashMap<String, LinkedList<Archivo>> a;
    HashMap<String, LinkedList<Archivo>> b;
    HashMap<String, LinkedList<Archivo>> c;
    HashMap<String, LinkedList<Archivo>> d;
    
    /**
     * Método constructor de la clase, Crea cuatro tablas Hash
     */
    public Tabla(){
    a=new HashMap<>();
    b=new HashMap<>();
    c=new HashMap<>();
    d=new HashMap<>();
    
    }
    
    /**
     * Inserta un nuevo archivo en la estructura
     * @param direccion Es la dirección en el disco en la que se encuentra el archivo
     * @param a Es el archivo que se va a guardar
     */
    public void insertar(String direccion, Archivo a){
        if(this.a.get(direccion)==null){
            this.a.put(direccion, new LinkedList<>());
            this.a.get(direccion).add(a);
        }else{
            this.a.get(direccion).add(Math.abs(direccion.hashCode()%this.a.get(direccion).size()), a);
        }        
        if(this.b.get(a.nombre)==null){
            this.b.put(a.nombre, new LinkedList<>());
            this.b.get(a.nombre).add(a);
        }else{
            this.b.get(a.nombre).add(Math.abs(direccion.hashCode()%this.a.get(direccion).size()), a);
        }
        if(this.c.get(a.autor)==null){
            this.c.put(a.autor, new LinkedList<>());
            this.c.get(a.autor).add(a);
        }else{
            this.c.get(a.autor).add(Math.abs(direccion.hashCode()%this.a.get(direccion).size()), a);
        }
        if(this.d.get(String.valueOf(a.tamaño))==null){
            this.d.put(String.valueOf(a.tamaño), new LinkedList<>());
            this.d.get(String.valueOf(a.tamaño)).add(a);
        }else{
            this.d.get(String.valueOf(direccion)).add(Math.abs(direccion.hashCode()%this.a.get(direccion).size()), a);
        }
    }
    /**
     * Busca un archivo en la estructura, por cualquiera de sus cuatro datos
     * @param direccion Es el dato por el que se va a buscar el archivo
     */
    public void buscar(String direccion){
    if(this.a.get(direccion)!=null){
        if(this.a.get(direccion).get(Math.abs(direccion.hashCode()%this.a.get(direccion).size()))!=null){
            iA(this.a.get(direccion).get(Math.abs(direccion.hashCode()%this.a.get(direccion).size())));
        }
    }else if(this.b.get(direccion)!=null){
        if(this.b.get(direccion).get(Math.abs(direccion.hashCode()%this.b.get(direccion).size()))!=null){
            iA(this.b.get(direccion).get(Math.abs(direccion.hashCode()%this.b.get(direccion).size())));
        }
    }else if(this.c.get(direccion)!=null){
        if(this.c.get(direccion).get(Math.abs(direccion.hashCode()%this.c.get(direccion).size()))!=null){
            iA(this.c.get(direccion).get(Math.abs(direccion.hashCode()%this.c.get(direccion).size())));
        }
    }if(this.d.get(direccion)!=null){
        if(this.d.get(direccion).get(Math.abs(direccion.hashCode()%this.d.get(direccion).size()))!=null){
            iA(this.d.get(direccion).get(Math.abs(direccion.hashCode()%this.d.get(direccion).size())));
        }
    }
    }
    
    /**
     * Imprime un archivo mostrando todos sus datos 
     * @param ar Es el archivo que se va a imprirmir
     */
    public void iA(Archivo ar){
        System.out.println(ar.nombre+" Por: "+ar.autor+"  "+ar.tamaño+"Mb");
    }
    
    /**
     * Borra un archivo de la estructura, por cualquiera de sus cuatro datos
     * @param direccion Es el dato por el cual se va a buscar el archivo que se pretende borrar
     */
    public void borrar(String direccion){
        if(this.a.get(direccion).get(direccion.hashCode())!= null){
            a.get(direccion).remove(direccion.hashCode());
    }else if(this.b.get(direccion).get(direccion.hashCode())!= null){
        b.get(direccion).remove(direccion.hashCode());
    }else if(this.c.get(direccion).get(direccion.hashCode())!= null){
        c.get(direccion).remove(direccion.hashCode());
    }else if(this.d.get(direccion).get(direccion.hashCode())!= null){
        d.get(direccion).remove(direccion.hashCode());
    }else{
        System.out.println("No such file or directory");
    }
    }
    
    /**
     * Lee un archivo de texto 
     * @param file Es el nombre del archivo de texto que se va a leer
     * @throws FileNotFoundException Lanza un error si el archivo que se busca no existe
     */
    public void read(String file) throws FileNotFoundException{       
        Scanner lec=new Scanner(new File(file));      
        String line;
        while(lec.hasNextLine()){
            line=lec.nextLine();
            String apache=line.substring(1);
            char[] arr=apache.toCharArray();
            String amp=arr.toString();
        }
    }
    
    /**
     * Invoca el método read() que lee un archivo de texto, aplicando try-catch
     * @param file Es el nombre del archivo de texto que se va a leer
     */
    public void leerTxt(String file){
        try {
            read(file);
        } catch (FileNotFoundException ex) {
            
        }
    }
    
    /**
     * Método main del proyecto
     */
    public static void main(String[] args) {
        
    }
    
}
