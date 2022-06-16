/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.util.ArrayList;

/**
 *
 * @author crist
 */
public class UsuarioAplicacion implements Usuario {
    
    private ArrayList<VegetalUsuario> ListaVegetalesConsumidos = new ArrayList<>();
    private String nombre, sexo;
    private double masa, altura, imc=0;
    
    //para obtener el nombre, se deberia buscar con el id del vegetal, lo mismo con tipo
    public boolean agregarVegetal(String nombre, int tipo) {
        //tipo fruta
        if(ListaVegetalesConsumidos.add(new VegetalUsuario(nombre, tipo)))
            return true;
        else return false;    
    }
    
    public boolean eliminarVegetal(String nombreVegetal) {
        for (int i = 0; i < ListaVegetalesConsumidos.size(); i++) {
            if (nombreVegetal.equalsIgnoreCase(ListaVegetalesConsumidos.get(i).getNombreVegetal())) {
                ListaVegetalesConsumidos.remove(i);
                return true;
            }  
        }
        return false;
    }
    
    public void mostrarVegetales() {
        for (int i = 0; i < ListaVegetalesConsumidos.size(); i++) {
            if (i==0)
                System.out.print(ListaVegetalesConsumidos.get(i).getNombreVegetal());
            else
                System.out.print(", "+ListaVegetalesConsumidos.get(i).getNombreVegetal());
        }
    }
    
    public void calcularImc()   {
        //DecimalFormat formato1 = new DecimalFormat("#.00");
        imc = masa/(Math.pow(altura, 2));
    }
    
    public double getCaloriasConsumidas(DatosVegetales datos) {
        double sumaCalorias = 0;
        
        {
        
        return sumaCalorias;
    }
    
}
