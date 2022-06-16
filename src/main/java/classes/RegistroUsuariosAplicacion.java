/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package classes;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 *
 * @author crist
 */
public class RegistroUsuariosAplicacion implements Registro{
    
    private ArrayList<UsuarioAplicacion> ListaUsuariosApp = new ArrayList<>();
    private int idUsuario=0;

    public ArrayList<UsuarioAplicacion> getListaUsuariosApp() {
        return ListaUsuariosApp;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }
    
    public UsuarioAplicacion getUsuario(int idUsuario){
        for (int i = 0; i < ListaUsuariosApp.size(); i++) {
            if (ListaUsuariosApp.get(i).getIdUsuario() == idUsuario)
                return ListaUsuariosApp.get(i);
    	}
    	return null;
    }
    
    public boolean crearArchivoUsuarios() {
        try {
            PrintWriter writer = new PrintWriter("src/test/java/usuarios.txt", "UTF-8");
            for (int i = 0; i < ListaUsuariosApp.size(); i++) {
                writer.println("Usuario "+(i+1)+(": ")+ListaUsuariosApp.get(i).getNombre() );
                writer.print("Vegetales consumidos de "+ListaUsuariosApp.get(i).getNombre()+": ");
                for (int j = 0; j < ListaUsuariosApp.get(i).getListaVegetalesConsumidos().size(); j++) {
                    writer.print(ListaUsuariosApp.get(i).getListaVegetalesConsumidos().get(j).getNombreVegetal()+" ");
                }
                writer.println();
            }
            writer.close();
            return true;
        } catch (Exception e) {
            e.printStackTrace();
            return false;
        }
    }
    
    public Usuario getUsuarioMenorCaloriasConsumidas(ArrayList<VegetalArchivo> datos) {
        Usuario usuarioMenosCalorias = ListaUsuariosApp.get(0);
        double menorCalorias = ListaUsuariosApp.get(0).getCaloriasConsumidas(datos), calorias;
        
        for (int i=0 ; i < ListaUsuariosApp.size(); i++) {
            calorias = ListaUsuariosApp.get(i).getCaloriasConsumidas(datos);
            if (calorias < menorCalorias) {
                menorCalorias = calorias;
                usuarioMenosCalorias = ListaUsuariosApp.get(i);
            }
        }
        return usuarioMenosCalorias;
    }
    
    public boolean crearUsuario() {
        String sexo, nombre;
        double masa, altura;
        Scanner input = new Scanner(System.in);
        
        System.out.println("Ingresa tu nombre");
        nombre = input.next();
        if (!getNombreUsuarioExists(nombre)) {
            System.out.println("Ingresa tu peso en kilogramos");
            masa = input.nextDouble();
            System.out.println("Ingresa tu altura en metros");
            altura = input.nextDouble();
            System.out.println("¿Tu sexo es femenino (F) o masculino (M)?");
            sexo = input.next();
        
            //cuando se agrega un objeto a la lista, sube el contador del id
            idUsuario++;
            ListaUsuariosApp.add(new UsuarioAplicacion(idUsuario, nombre, sexo, masa, altura));

            return true;
        }
        return false;
    }
    
    public boolean modificarUsuario(int idUsuarioModificar) {
        Scanner input = new Scanner(System.in);
        UsuarioAplicacion usuarioModificar = getUsuario(idUsuarioModificar);
        
        int opcion = opcionesModificarUsuario();
        
        switch (opcion) {
            //modifica el nombre
            case 1:
                System.out.println("Ingresa nuevo nombre");
                usuarioModificar.setNombre(input.next());
                return true;
    			
            //modifica la masa
            case 2:
                System.out.println("Ingresa nuevo peso");
                usuarioModificar.setMasa(input.nextDouble());
                return true;
    			
            //modifica la altura
            case 3:
                System.out.println("Ingresa nueva altura");
                usuarioModificar.setAltura(input.nextDouble());
                return true;
    			
            default:
                System.out.println("Opcion no valida");
        }
        return false;
    }
    
    public boolean eliminarUsuario(int idUsuarioEliminar) {
        if (getUsuarioExists(idUsuario)) {
            for (int i=0; i < ListaUsuariosApp.size(); i++) {
                if (ListaUsuariosApp.get(i).getIdUsuario() == idUsuarioEliminar) {
                    ListaUsuariosApp.remove(i);
                    return true;
                }
            }
        }
        return false;
    }
    
    public void imprimirUsuarios() {
        for (int i=0; i < ListaUsuariosApp.size(); i++) {
            System.out.println("- "+ListaUsuariosApp.get(i).getNombre());
        }
    }
    
    public boolean getListaIsEmpty() {
        return ListaUsuariosApp.isEmpty();
    }
    
    public boolean getNombreUsuarioExists(String nombre) {
        for (int i = 0; i < ListaUsuariosApp.size(); i++) {
            if (nombre.equalsIgnoreCase(ListaUsuariosApp.get(i).getNombre()))
                return true;
    	}
    	return false;
    }
    
    public boolean getUsuarioExists(int idUsuarioBuscar) {
        for (int i = 0; i < ListaUsuariosApp.size(); i++) {
            if (ListaUsuariosApp.get(i).getIdUsuario() == idUsuarioBuscar) 
                return true;
    	}
    	return false;
    }
    
    public int opcionesModificarUsuario() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("¿Qué vas a modificar?");
        System.out.println("1...Nombre");
        System.out.println("2...Peso");
        System.out.println("3...Altura");
        
        return input.nextInt();
    }
    
}
