package taller8;

import java.util.Stack;

/**
 * Taller 8. Punto 3. 3. Escriba un programa para evaluar expresiones en
 * notación polaca inversa utilizando pilas. Por simplicidad, considere que no
 * hay espacio y que cada operando es de un solo dígito.
 *
 * @author Alejandro Cano Munera
 * @author Jorge Luis Herrera Chamat
 *
 * @version Septiembre 2017
 */
public class Punto3 {

    /**
     * Metodo main. Aqui se realizan las pruebas del Punto 3.
     *
     * @param args
     */
    public static void main(String[] args) {
        String str1 = "+2*35";
        String str2 = "+4-65";
        System.out.println("Expresion: " + str1);
        System.out.println("Resultado: " + polaca(str1));
        System.out.println();
        System.out.println("Expresion: " + str2);
        System.out.println("Resultado: " + polaca(str2));
        System.out.println();
        String str3 = "3 10 5 + *";
        System.out.println("Expresion: " + str3);
        System.out.println("Resultado: " + polacaInversa(str3));
        System.out.println();

    }

    /**
     * Metodo polaca. Este metodo recibe una cadena de una expresion en notación
     * polaca y la evalua utilizando pilas.
     *
     * @param str Es la cadena que contiene la expresión.
     * @return Es el resultado al evaluar la expresión.
     */
    public static int polaca(String str) {
        Stack<String> stack = new Stack();
        for (int i = 0; i < str.length(); i++) {
            stack.push(Character.toString(str.charAt(i)));
        }
        int res;
        while (stack.size() != 1) {
            try {
                int num1 = Integer.parseInt(stack.pop());
                int num2 = Integer.parseInt(stack.pop());
                switch (stack.pop()) {
                    case "+":
                        res = num2 + num1;
                        stack.push(Integer.toString(res));
                        break;
                    case "-":
                        res = num2 - num1;
                        stack.push(Integer.toString(res));
                        break;
                    case "*":
                        res = num2 * num1;
                        stack.push(Integer.toString(res));
                        break;
                    case "/":
                        res = num2 / num1;
                        stack.push(Integer.toString(res));
                        break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Expresion Erronea. [ " + e.getMessage() + " ]");
                return 0;
            }
        }
        return Integer.parseInt(stack.pop());
    }

    /**
     * Metodo polaca inversa. Este metodo recibe un string en notacion polaca
     * inversa y la evalua utilizando pilas.
     *
     * @param str Es la cadena que contiene la expresión.
     * @return Es el resultado al evaluar la expresión.
     */
    public static int polacaInversa(String str) {
        try {
            String[] array = str.split(" ");
            Stack<String> stack = new Stack();
            int res;
            for (int i = 0; i < array.length; i++) {
                if ("+".equals(array[i]) || "-".equals(array[i]) || "*".equals(array[i]) || "/".equals(array[i])) {
                    int num1 = Integer.parseInt(stack.pop());
                    int num2 = Integer.parseInt(stack.pop());
                    switch (array[i]) {
                        case "+":
                            res = num2 + num1;
                            stack.push(Integer.toString(res));
                            break;
                        case "-":
                            res = num2 - num1;
                            stack.push(Integer.toString(res));
                            break;
                        case "*":
                            res = num2 * num1;
                            stack.push(Integer.toString(res));
                            break;
                        case "/":
                            res = num2 / num1;
                            stack.push(Integer.toString(res));
                            break;
                    }
                } else {
                    stack.push(array[i]);
                }
            }
            return Integer.parseInt(stack.pop());
        } catch (Exception e) {
            System.out.println("Expresion Erronea. [ " + e.getMessage() + " ]");
            return 0;
        }
    }

}
