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
    private int idUsuario;

    public UsuarioAplicacion(int idUsuario, String nombre, String sexo, double masa, double altura) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.masa = masa;
        this.altura = altura;
        this.idUsuario = idUsuario;
    }

    public UsuarioAplicacion() {
    }
    
    public ArrayList<VegetalUsuario> getListaVegetalesConsumidos() {
        return ListaVegetalesConsumidos;
    }

    public String getNombre() {
        return nombre;
    }

    public String getSexo() {
        return sexo;
    }

    public double getMasa() {
        return masa;
    }

    public double getAltura() {
        return altura;
    }

    public double getImc() {
        return imc;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setSexo(String sexo) {
        this.sexo = sexo;
    }

    public void setMasa(double masa) {
        this.masa = masa;
    }

    public void setAltura(double altura) {
        this.altura = altura;
    }

    public void setImc(double imc) {
        this.imc = imc;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    //para obtener el nombre, se deberia buscar con el id del vegetal, lo mismo con tipo
    public boolean agregarVegetal(String nombre, int tipo) {
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
    
    public double getCaloriasConsumidas(ArrayList<VegetalArchivo> datos) {
        double sumaCalorias = 0;
        
        for (int i=0; i< ListaVegetalesConsumidos.size(); i++) {
            for (int j=0; j < datos.size(); j++) {
                if (ListaVegetalesConsumidos.get(i).getNombreVegetal().equals(datos.get(j).getNombreVegetal()))
                    sumaCalorias += datos.get(j).getCalorias();
            }
        }
        
        return sumaCalorias;
    }
    
}
