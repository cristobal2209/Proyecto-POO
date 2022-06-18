
package classes;

/**
 *
 * @author crist
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
