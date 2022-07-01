
package Interfaces;

/**
 * Esta interfaz provee de los siguientes metodos para poder manejar una colección
 * de vegetales de un usuario: agregarVegetal, eliminarVegetal y mostrarVegetales.
 * 
 * @author Cristóbal Cáceres
 * @author Pablo Araya
 * @author René Araya
 * @version 1.0
 */
public interface Usuario {
    
    /**
     * Permite agregar un vegetal a una coleccion
     * 
     * @param nombre nombre del vegetal
     * @param tipo tipo del vegetal
     * @param idVegetal id unico del vegetal
     * @return boolean que debe indicar si se pudo agregar el usuario
     */
    public boolean agregarVegetal(String nombre, int tipo, int idVegetal);
    
    /**
     * Permite eliminar un vegetal de una coleccion
     * 
     * @param idVegetal id unico de un vegetal a eliminar
     * @return boolean que indica se se elimino exitosamente
     */
    public boolean eliminarVegetal(int idVegetal);
    
    /**
     * Permite mostrar los vegetales de una coleccion
     */
    public void mostrarVegetales();
    
}
