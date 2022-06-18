
package classes;

/**
 * Esta interface estandariza que metodos debe tener una clase que maneja datos.
 * @author Cristóbal Cáceres
 * @author Pablo Araya
 * @author René Araya
 * @Versión 1.0
 */
public interface Datos {
    
    /**
     * Lee los datos de algún sitio
     * @return true si la lectura fue exitosa, false en otro caso
     */
    public boolean leerDatos();
    
    /**
     * Muestra los datos que se hayan guardado
     */
    public void mostrarDatos();
}
