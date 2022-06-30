
package Interfaces;

/**
 * Esta interfaz estandariza para cualquier registro los metodos que se necesitan
 * para controlar un registro.
 * @author Cristóbal Cáceres
 * @author Pablo Araya
 * @author René Araya
 * @Versión 1.0
 */
public interface Registro {
    
    /**
     * Se obtiene el objeto usuario en base a un id unico.
     * @param idUsuario id del usuario a buscar.
     * @return objeto usuario.
     */
    public Object getUsuario(int idUsuario);
    
    /**
     * Se crea un objeto usuario.
     * @return true si se creo, false en caso contrario
     */
    public boolean crearUsuario();
    
    /**
     * Permite la opcion de modificacion de un usuario en base a su id
     * @param idUsuario id del usuario a modificar
     * @return true si se modifico, false en caso contrario
     */
    public boolean modificarUsuario(int idUsuario);
    
    /**
     * Elimina un usuario en base a su id
     * @param idUsuario id del usuario a eliminar
     * @return true si se elimino, false en caso contrario
     */
    public boolean eliminarUsuario(int idUsuario);
    
    /**
     * Imprime los usuarios
     */
    public void imprimirUsuarios();
}
