/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

/**
 *
 * @author crist
 */
public class VegetalUsuario extends Vegetal {
   
    //constructor
    public VegetalUsuario(String nombre, int tipo) {
        this.nombreVegetal = nombre;
        this.tipoVegetal = tipo;
    }

    public String getNombreVegetal() {
        return nombreVegetal;
    }

    public int getTipoVegetal() {
        return tipoVegetal;
    }

    public void setNombreVegetal(String nombreVegetal) {
        this.nombreVegetal = nombreVegetal;
    }

    public void setTipoVegetal(int tipoVegetal) {
        this.tipoVegetal = tipoVegetal;
    }
    
    
}
