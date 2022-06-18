/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package classes;

/**
 *
 * @author crist
 */
public interface Usuario {
    
    public boolean agregarVegetal(String nombre, int tipo, int idVegetal);
    public boolean eliminarVegetal(int idVegetal);
    public void mostrarVegetales();
    
}
