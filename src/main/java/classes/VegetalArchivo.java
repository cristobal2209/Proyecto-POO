
package classes;

/** 
 * Esta clase se extiende de la clase abstracta Vegetal, obteniendo los atributos
 * nombreVegetal, tipoVegetal e idVegetal. La función de esta clase es proveer
 * de métodos para crear un objeto tipo VegetalArchivo y poder manejar sus atributos.
 * Los objetos de esta clase se ocuparán para guardar los datos generales de diversos vegetales.
 * 
 * @author Cristóbal Cáceres
 * @author Pablo Araya
 * @author René Araya
 * @Versión 1.0
 */
public class VegetalArchivo extends Vegetal{
    
    private double calorias, proteinas, grasas, carbohidratos, porcion;

    //constructor
    public VegetalArchivo(int idVegetal, String nombre, int tipo, double calorias, double proteinas, double grasas, double carbohidratos, double porcion ) {
        this.nombreVegetal = nombre;
        this.tipoVegetal = tipo;
        this.calorias = calorias;
        this.proteinas = proteinas;
        this.grasas = grasas;
        this.carbohidratos = carbohidratos;
        this.porcion = porcion;
        this.idVegetal = idVegetal;
    }

    //getters
    public double getCalorias() {
        return calorias;
    }

    public double getProteinas() {
        return proteinas;
    }

    public double getGrasas() {
        return grasas;
    }

    public double getCarbohidratos() {
        return carbohidratos;
    }

    public double getPorcion() {
        return porcion;
    }

    public int getIdVegetal() {
        return idVegetal;
    }

    public String getNombreVegetal() {
        return nombreVegetal;
    }

    public int getTipoVegetal() {
        return tipoVegetal;
    }
}
