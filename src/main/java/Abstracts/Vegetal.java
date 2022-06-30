
package Abstracts;

/**
 * Esta clase busca estandarizar la forma en que se pueden crear clases de vegetales,
 * proveyendo de tres atributos basicos: nombreVegetal, tipoVegetal e idVegetal.
 * 
 * @author Cristóbal Cáceres
 * @author Pablo Araya
 * @author René Araya
 * @Versión 1.1
 */
public abstract class Vegetal {
    private String nombreVegetal;
    private int tipoVegetal, idVegetal;

    public Vegetal(String nombreVegetal, int tipoVegetal, int idVegetal) {
        this.nombreVegetal = nombreVegetal;
        this.tipoVegetal = tipoVegetal;
        this.idVegetal = idVegetal;
    }

    public String getNombreVegetal() {
        return nombreVegetal;
    }

    public void setNombreVegetal(String nombreVegetal) {
        this.nombreVegetal = nombreVegetal;
    }

    public int getTipoVegetal() {
        return tipoVegetal;
    }

    public void setTipoVegetal(int tipoVegetal) {
        this.tipoVegetal = tipoVegetal;
    }

    public int getIdVegetal() {
        return idVegetal;
    }

    public void setIdVegetal(int idVegetal) {
        this.idVegetal = idVegetal;
    }
}
