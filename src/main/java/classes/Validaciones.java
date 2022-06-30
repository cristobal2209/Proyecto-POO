
package classes;

import CustomExceptions.StringEmptyException;
import CustomExceptions.WrongCharException;
import java.util.InputMismatchException;
import java.util.Scanner;

public class Validaciones {
    private Scanner sc;
    private int flag;
    
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
