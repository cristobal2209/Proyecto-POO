
package CustomExceptions;

public class WrongCharException extends Exception{
    public WrongCharException() {
        super("Se debe introducir el caracter esperado.");
    }
}
