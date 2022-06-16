/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author crist
 */
public class VegetalArchivo extends Vegetal{
    
    private boolean tieneSemilla;
    private double calorias, proteinas, grasas, carbohidratos, porcion;
    private int idVegetal;

    public VegetalArchivo(int idVegetal, String nombre, int tipo, boolean tieneSemilla, double calorias, double proteinas, double grasas, double carbohidratos, double porcion ) {
        this.nombreVegetal = nombre;
        this.tipoVegetal = tipo;
        this.tieneSemilla = tieneSemilla;
        this.calorias = calorias;
        this.proteinas = proteinas;
        this.grasas = grasas;
        this.carbohidratos = carbohidratos;
        this.porcion = porcion;
        this.idVegetal = idVegetal;
    }

    public boolean isTieneSemilla() {
        return tieneSemilla;
    }

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

    public void setTieneSemilla(boolean tieneSemilla) {
        this.tieneSemilla = tieneSemilla;
    }

    public void setCalorias(double calorias) {
        this.calorias = calorias;
    }

    public void setProteinas(double proteinas) {
        this.proteinas = proteinas;
    }

    public void setGrasas(double grasas) {
        this.grasas = grasas;
    }

    public void setCarbohidratos(double carbohidratos) {
        this.carbohidratos = carbohidratos;
    }

    public void setPorcion(double porcion) {
        this.porcion = porcion;
    }

    public void setIdVegetal(int idVegetal) {
        this.idVegetal = idVegetal;
    }

    public void setNombreVegetal(String nombreVegetal) {
        this.nombreVegetal = nombreVegetal;
    }

    public void setTipoVegetal(int tipoVegetal) {
        this.tipoVegetal = tipoVegetal;
    }
    
    
    
}
