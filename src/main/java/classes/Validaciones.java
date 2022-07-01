
package classes;

import CustomExceptions.StringEmptyException;
import CustomExceptions.WrongCharException;
import java.util.InputMismatchException;
import java.util.Scanner;

/**
 * Validaciones provee de diferentes métodos para poder validar la entrada por teclado
 * de diferentes tipos de datos.
 * 
 * @author Cristóbal Cáceres
 * @author Pablo Araya
 * @author René Araya
 * @version 1.0
 */
public class Validaciones {
    private Scanner sc;
    private int flag;
    
    /**
     * valida la entrada de un numero double, en caso de que se ingrese un
     * tipo de dato diferente a double, preguntará de nuevo.
     * 
     * @return double leído
     */
    public double validarDouble() {
        double numDoub=0;
        do {
            flag = 0;
            sc = new Scanner(System.in);
            try {
                numDoub = sc.nextDouble();
            } catch (InputMismatchException e) {
                System.out.println("Ingrese un número decimal ocupando un punto (.)");
                flag = 1;
            }
        } while (flag == 1);
        return numDoub;
    }
    
    /**
     * valida la entrada de un char, en caso de que se ingrese un
     * tipo de dato diferente a char, preguntará de nuevo.
     * 
     * @return char leído
     */
    public char validarChar() {
        char caracter='a';
        do {
            sc = new Scanner(System.in);
            flag = 0;
            try {
                caracter = sc.next().charAt(0);
                if (caracter != 'F' && caracter != 'M') {
                    throw new WrongCharException();
                }
            } catch(WrongCharException e) {
                System.out.println(e.getMessage());
                flag = 1;
            }
        } while (flag == 1);
        return caracter;
    }
    
    /**
     * valida que un string ingresado no sea vacío, en caso de que se ingrese un
     * string vacío, preguntará de nuevo.
     * 
     * @return String leído
     */
    public String validarStringVacio() {
        String str=null;
        do {
            flag = 0;
            sc = new Scanner(System.in);
            try {
                str = sc.nextLine();
                if (str.isBlank())
                    throw new StringEmptyException();
            } catch(StringEmptyException e) {
                System.out.println(e.getMessage());
                flag = 1;
            }   
        } while (flag == 1);
        return str;
    }
    
    /**
     * valida la entrada de un numero int, en caso de que se ingrese un
     * tipo de dato diferente a int, preguntará de nuevo.
     * 
     * @return int leído
     */
    public int validarInt() {
        int numInt=0;
        do {
            flag = 0;
            sc = new Scanner(System.in);
            try {
                numInt = sc.nextInt();
            } catch(InputMismatchException e) {
                System.out.println("Ingrese un número entero");
                flag = 1;
            }
        } while (flag == 1);
        return numInt;
    }
}
