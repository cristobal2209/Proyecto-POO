
package classes;

/** 
 * Esta clase se extiende de la clase abstracta Vegetal, obteniendo los atributos
 * nombreVegetal, tipoVegetal e idVegetal. La función de esta clase es proveer
 * de métodos para crear un objeto tipo VegetalUsuario y poder manejar sus atributos.
 * 
 * @author Cristóbal Cáceres
 * @author Pablo Araya
 * @author René Araya
 * @Versión 1.0
 */
public class VegetalUsuario extends Vegetal {
   
    //constructor
    public VegetalUsuario(String nombre, int tipo, int idVegetal) {
        this.nombreVegetal = nombre;
        this.tipoVegetal = tipo;
        this.idVegetal = idVegetal;
    }

    //getters
    public String getNombreVegetal() {
        return nombreVegetal;
    }

    public int getTipoVegetal() {
        return tipoVegetal;
    }

    public int getIdVegetal() {
        return idVegetal;
    }

    //setters
    public void setNombreVegetal(String nombreVegetal) {
        this.nombreVegetal = nombreVegetal;
    }

    public void setTipoVegetal(int tipoVegetal) {
        this.tipoVegetal = tipoVegetal;
    }

    public void setIdVegetal(int idVegetal) {
        this.idVegetal = idVegetal;
    }
}
