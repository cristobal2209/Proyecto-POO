
package CustomExceptions;


public class StringEmptyException extends Exception {
    public StringEmptyException() {
        super("Se debe introducir al menos una letra.");
    }
}
