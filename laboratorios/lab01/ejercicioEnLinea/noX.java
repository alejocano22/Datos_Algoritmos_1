package Punto2.Recursion1;

/**
 * Laboratorio1. Punto 2.1 Codingbat Recursion I. En esta clase se encuentra el
 * ejercicio noX realizado de la seccion Recursion I de Codingbat.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera
 * @version Agosto 2017
 */
public class noX {

    /**
     * public String noX(String str) { String str2=""; if(str.length()==0){
     * return str; }else if(str.charAt(0)!='x'){ str2=str.substring(0,1); }
     * return str2+noX(str.substring(1)); }
     *
     * @param str
     * @return
     */
    public String noX(String str) {
        String str2 = "";
        if (str.length() == 0) {
            return str;
        } else if (str.charAt(0) != 'x') {
            str2 = str.substring(0, 1);
        }
        return str2 + noX(str.substring(1));
    }
}
