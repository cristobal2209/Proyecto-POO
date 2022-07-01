
package classes;

import Abstracts.Vegetal;

/** 
 * Esta clase se extiende de la clase abstracta Vegetal, obteniendo los atributos
 * nombreVegetal, tipoVegetal e idVegetal. La función de esta clase es proveer
 * de métodos para crear un objeto tipo VegetalArchivo y poder manejar sus atributos.
 * Los objetos de esta clase se ocuparán para guardar los datos generales de diversos vegetales.
 * 
 * @author Cristóbal Cáceres
 * @author Pablo Araya
 * @author René Araya
 * @version 1.0
 */
public class VegetalArchivo extends Vegetal{
    
    private double calorias, proteinas, grasas, carbohidratos, porcion;

    //constructor
    public VegetalArchivo(int idVegetal, String nombreVegetal, int tipoVegetal, double calorias, double proteinas, double grasas, double carbohidratos, double porcion ) {
        super(nombreVegetal, tipoVegetal, idVegetal);
        this.calorias = calorias;
        this.proteinas = proteinas;
        this.grasas = grasas;
        this.carbohidratos = carbohidratos;
        this.porcion = porcion;
    }

    public double getCalorias() {
        return calorias;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public double getProteinas() {
        return proteinas;
    }

    public void setProteinas(double proteinas) {
        this.proteinas = proteinas;
    }

    public double getGrasas() {
        return grasas;
    }

    public void setGrasas(double grasas) {
        this.grasas = grasas;
    }

    public double getCarbohidratos() {
        return carbohidratos;
    }

    public void setCarbohidratos(double carbohidratos) {
        this.carbohidratos = carbohidratos;
    }

    public double getPorcion() {
        return porcion;
    }

    public void setPorcion(double porcion) {
        this.porcion = porcion;
    }

}
