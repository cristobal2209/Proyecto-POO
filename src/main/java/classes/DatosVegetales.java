

package classes;

import Interfaces.Datos;
import static GUI.Principal.MAX_VEGETALES;
import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Scanner;


/**
 * Esta clase implementa Datos.
 * Esta clase provee de los metodos necesarios para manejar un ArrayList de tipo
 * VegetalArchivo, el cual contiene datos de varios vegetales.
 * @author Cristóbal Cáceres
 * @author Pablo Araya
 * @author René Araya
 * @Versión 1.1
 */
public class DatosVegetales implements Datos{
    
    private ArrayList<VegetalArchivo> ListaVegetales = new ArrayList<>();

    //constructores
    public DatosVegetales() {
    }

    //getters
    public ArrayList<VegetalArchivo> getListaVegetales() {
        return ListaVegetales;
    }
    
    //metodos
    /**
     * IMPORTANTE: Si aparece el mensaje "Ha ocurrido un error de lectura del archivo"
     * es posible que sea un error de lectura desde el archivo. Para esto se pide
     * que cambie la ruta en la linea 69 a "src/test/java/datos.txt"
     * 
     * Lee los datos de vegetales guardados en un archivo .txt con ruta
     * src/test/java/(archivo).txt, para luego añadirlos a una lista. Para leer
     * se emplea un ciclo for que dura según la cantidad definida por MAX_VEGETALES, 
     * estos valores se pueden cambiar en la clase Principal. En cada ciclo for se 
     * leen todos los datos de un vegetal, almacenando en un espacio
     * de la lista el objeto creado.
     * 
     * @return true si la lectura fue correcta, false en otro caso
     */
    public boolean leerDatos() {
        String nombre;
        double calorias, proteinas, grasas, carbohidratos, porcion;
        int idVegetal, tipo;

        //definiendo archivo
        File archivo = new File("src/test/java/datos2.txt");
            
        try {
            Scanner reader = new Scanner(archivo);
            //leyendo datos de verduras
            for (int i=0; i < MAX_VEGETALES; i++) {
                idVegetal = reader.nextInt();
                nombre = reader.next();
                tipo = reader.nextInt();
                calorias = reader.nextDouble();
                proteinas = reader.nextDouble();
                grasas = reader.nextDouble();
                carbohidratos = reader.nextDouble();
                porcion = reader.nextDouble();
                
                ListaVegetales.add(new VegetalArchivo(idVegetal, nombre, tipo, calorias, proteinas, grasas, carbohidratos, porcion));
            }
            reader.close();
        } catch (FileNotFoundException e) {
            System.out.println("La ruta del archivo no existe");
            return false;
        }
        return true;
    }
    
    /**
     * Muestra los nombres de los vegetales guardados.
     */
    public void mostrarDatos() {
        for (int i = 0; i < ListaVegetales.size(); i++) {
            System.out.println("- "+ListaVegetales.get(i).getNombreVegetal());
        }
    }
    
    /**
     * Muestra los id de los vegetales guardados
     */
    public void mostrarIdVegetales() {
        for (int i = 0; i < ListaVegetales.size(); i++) {
            System.out.println(ListaVegetales.get(i).getIdVegetal()+"<--"+ListaVegetales.get(i).getNombreVegetal());
        }
    }
    
    /**
     * Retorna la posicion en la lista de un vegetal en base a su id
     * @param id id del vegetal a buscar
     * @return int con la posicion de un vegetal en la lista
     */
    public int posicionDelIdVegetal(int id) {
        for (int i = 0; i < ListaVegetales.size(); i++) {
            if (id == ListaVegetales.get(i).getIdVegetal())
                return i;
        }
        return 0;
    }
    
    //se pueden agregar funciones de agregar nuevos vegetales
}
