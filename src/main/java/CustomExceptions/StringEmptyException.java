/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package CustomExceptions;

/**
 *
 * @author crist
 */
public class StringEmptyException extends Exception {
    public StringEmptyException() {
        super("Se debe introducir al menos una letra.");
    }
}
