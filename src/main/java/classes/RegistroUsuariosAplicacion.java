
package classes;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Scanner;

/**
 * Esta clase implementa la clase Registro.
 * Esta clase provee de metodos para manejar y controlar un ArrayList de tipo
 * UsuarioAplicacion, el cual guarda los usuarios de la aplicacion.
 * Aparte de los métodos basicos de crear, eliminar, mostrar y modificar,
 * se implementa funciones para saber si la lista esta vacia, saber si un usuario existe,
 * obtener un usuario de la lista y obtener el usuario con menor calorias consumidas.
 * 
 * @author Cristóbal Cáceres
 * @author Pablo Araya
 * @author René Araya
 * @Versión 1.0
 */
public class RegistroUsuariosAplicacion implements Registro{
    
    private ArrayList<UsuarioAplicacion> ListaUsuariosApp = new ArrayList<>();
    private ArrayList<VegetalArchivo> datos;
    private int idUsuario=0;

    //contructores
    public RegistroUsuariosAplicacion() {

    }
    
    //getters
    public ArrayList<UsuarioAplicacion> getListaUsuariosApp() {
        return ListaUsuariosApp;
    }

    public int getIdUsuario() {
        return idUsuario;
    }

    //setters
    public void setIdUsuario(int idUsuario) {
        this.idUsuario = idUsuario;
    }

    public void setDatos(ArrayList<VegetalArchivo> datos) {
        this.datos = datos;
    }
    
    //metodos
    /**
     * Crea y añade un nuevo objeto Usuario a ListaUsuarios, para esto pide un 
     * nuevo nombre por teclado y verifica con el método buscarUsuario() que no 
     * exista un usuario con tal nombre, luego se preguntan los demás datos, se 
     * crea y añade el nuevo usuario a la lista.
     * 
     * @return 'true' si se creó y añadió correctamente el usuario, 'false' si
     *         ya existía un usuario con el nombre ingresado
     */
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
    
    /**
     * Modifica un atributo de un objeto Usuario y dependiendo la opción ingresada 
     * por el usuario es lo que se modificará. El nuevo dato es ingresado 
     * por teclado.
     * 
     * @param idUsuarioModificar id del usuario a modificar
     * @return 'true' si hubo modificación del atributo, 'false' en cualquier otro caso
     */
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
    
    /**
     * Busca y elimina de ListaUsuarios un objeto Usuario. Ingresa por parámetro
     * el nombre de un usuario a eliminar y con getUsuario() se revisa si aquel
     * usuario existe, en tal caso se recorre ListaUsuarios para saber su posición
     * y una vez encontrado se elimina. En caso que no encuentre un usuario por
     * nombre termina el método.
     * 
     * @param idUsuarioEliminar id del usuario a eliminar
     * @return 'true' si se eliminó un usuario, 'false' en cualquier otro caso.
     */
    public boolean eliminarUsuario(int idUsuarioEliminar) {
        if (getUsuario(idUsuario) != null) {
            for (int i=0; i < ListaUsuariosApp.size(); i++) {
                if (ListaUsuariosApp.get(i).getIdUsuario() == idUsuarioEliminar) {
                    ListaUsuariosApp.remove(i);
                    return true;
                }
            }
        }
        return false;
    }
    
    /**
     * Imprime los usuarios en formato "- Nombre". Esto se ocupa para mostrar
     * la lista de usuarios registrados y que el usuario ingrese por consola a 
     * que usuario quiere acceder, escribiendo su nombre.
     */
    public void imprimirUsuarios() {
        for (int i=0; i < ListaUsuariosApp.size(); i++) {
            System.out.println("- "+ListaUsuariosApp.get(i).getNombre());
        }
    }
    
    /**
     * Comprueba si ListaUsuarios está vacía o no, retornando un boolean.
     * 
     * @return 'true' si la lista está vacía, 'false' si la lista no está vacía
     */
    public boolean getListaIsEmpty() {
        return ListaUsuariosApp.isEmpty();
    }
    
    /**
     * Busca si existe un usuario con el mismo nombre.
     * 
     * @param nombre nombre del usuario a revisar
     * @return true si existe el usuario, false en cualquier otro caso
     */
    public boolean getNombreUsuarioExists(String nombre) {
        for (int i = 0; i < ListaUsuariosApp.size(); i++) {
            if (nombre.equalsIgnoreCase(ListaUsuariosApp.get(i).getNombre()))
                return true;
    	}
    	return false;
    }
    
    /**
     * Imprime las opciones a modificar, permitiendo ingresar por teclado la opcion
     * 
     * @return int con la opcion a modificar
     */
    public int opcionesModificarUsuario() {
        Scanner input = new Scanner(System.in);
        
        System.out.println("¿Qué vas a modificar?");
        System.out.println("1...Nombre");
        System.out.println("2...Peso");
        System.out.println("3...Altura");
        
        return input.nextInt();
    }
    
    /**
     * Crea y añade un nuevo objeto Usuario a ListaUsuarios, para esto pide un 
     * nuevo nombre por teclado y verifica con el método buscarUsuario() que no 
     * exista un usuario con tal nombre, luego se preguntan los demás datos, se 
     * crea y añade el nuevo usuario a la lista.
     * 
     * @return 'true' si se creó y añadió correctamente el usuario, 'false' si
     *         ya existía un usuario con el nombre ingresado
     */
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
    
    /**
     * Esta función buscar un usuario que ha consumido la menor cantidad de calorías.
     * 
     * @return Un objeto tipo Usuario que guarda el usuario con la menor cantidad de calorías
     *         consumidas.
     */
    public Usuario getUsuarioMenorCaloriasConsumidas() {
        Usuario usuarioMenosCalorias = ListaUsuariosApp.get(0);
        double menorCalorias = ListaUsuariosApp.get(0).getSumaCaloriasConsumidas(datos), calorias;
        
        for (int i=0 ; i < ListaUsuariosApp.size(); i++) {
            calorias = ListaUsuariosApp.get(i).getSumaCaloriasConsumidas(datos);
            if (calorias < menorCalorias) {
                menorCalorias = calorias;
                usuarioMenosCalorias = ListaUsuariosApp.get(i);
            }
        }
        return usuarioMenosCalorias;
    }
    
    /**
     * Busca y retorna un objeto Usuario dentro de ListaUsuarios, con el id del usuario
     * .Si el usuario existe lo retorna, en cualquier otro caso retorna null.
     * 
     * @param idUsuario id del usuario a buscar
     * @return el objecto Usuario que coincidió con el parámetro nombre, null 
     *         en cualquier otro caso
     */
    public UsuarioAplicacion getUsuario(int idUsuario){
        for (int i = 0; i < ListaUsuariosApp.size(); i++) {
            if (ListaUsuariosApp.get(i).getIdUsuario() == idUsuario)
                return ListaUsuariosApp.get(i);
    	}
    	return null;
    }
    
    /**
     * Muestra los id de los usuarios en formato "idUs nombreUs"
     */
    public void mostrarIdUsuarios() {
        for (int i = 0; i < ListaUsuariosApp.size(); i++) {
            System.out.println(ListaUsuariosApp.get(i).getIdUsuario()+"<--"+ListaUsuariosApp.get(i).getNombre());
        }
    }
}
