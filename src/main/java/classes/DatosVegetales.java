/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import static GUI.Principal.MAX_VEGETALES;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class DatosVegetales implements Datos{
    
    private ArrayList<VegetalArchivo> ListaVegetales = new ArrayList<>();
    
    public boolean leerDatos() {
        String nombre;
        boolean tieneSemilla;
        double calorias, proteinas, grasas, carbohidratos, porcion;
        int idVegetal, tipo;

        //definiendo archivo
        File archivo = new File("src/test/java/datos2.txt");
            
        try (Scanner reader = new Scanner(archivo)) {
            //leyendo datos de verduras
            for (int i=0; i < MAX_VEGETALES; i++) {
                idVegetal = reader.nextInt();
                nombre = reader.next();
                tipo = reader.nextInt();
                tieneSemilla = reader.nextBoolean();
                calorias = reader.nextDouble();
                proteinas = reader.nextDouble();
                grasas = reader.nextDouble();
                carbohidratos = reader.nextDouble();
                porcion = reader.nextDouble();
                
                ListaVegetales.add(new VegetalArchivo(idVegetal, nombre, tipo, tieneSemilla, calorias, proteinas, grasas, carbohidratos, porcion));
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("Ha ocurrido un error de lectura del archivo");
            return false;
        }
        return true;
    }
    
    public void mostrarDatos() {
        for (int i = 0; i < ListaVegetales.size(); i++) {
            System.out.println("- "+ListaVegetales.get(i).getNombreVegetal());
        }
    }
}
