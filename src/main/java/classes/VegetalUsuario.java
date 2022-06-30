
package classes;

import Abstracts.Vegetal;

/** 
 * Esta clase se extiende de la clase abstracta Vegetal, obteniendo los atributos
 * nombreVegetal, tipoVegetal e idVegetal. La función de esta clase es proveer
 * de métodos para crear un objeto tipo VegetalUsuario y poder manejar sus atributos.
 * Los objetos de esta clase se ocuparán para guarda los datos de vegetales consumidas
 * por los usuarios.
 * 
 * @author Cristóbal Cáceres
 * @author Pablo Araya
 * @author René Araya
 * @Versión 1.0
 */
public class VegetalUsuario extends Vegetal {
   
    //constructor
    public VegetalUsuario(String nombre, int tipo, int idVegetal) {
        super(nombre, tipo, idVegetal);
    }
}
