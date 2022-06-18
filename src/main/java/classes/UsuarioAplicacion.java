
package classes;

import java.util.ArrayList;

/**
 * Esta clase implementa la clase Usuario.
 * Esta clase provee de metodos para manejar y controlar un ArrayList de tipo
 * VegetalUsuario, el cual guarda los vegetaes consumidos por un usuario.
 * Aparte de los métodos basicos de crear, eliminar, mostrar y modificar,
 * se implementa funciones para calcular el IMC de un usuario y las calorías consumidas.
 * 
 * @author Cristóbal Cáceres
 * @author Pablo Araya
 * @author René Araya
 * @Versión 1.0
 */
public class UsuarioAplicacion implements Usuario {
    
    private ArrayList<VegetalUsuario> ListaVegetalesConsumidos = new ArrayList<>();
    private String nombre, sexo;
    private double masa, altura, imc=0;
    private int idUsuario;

    //constructores
    /**
     * 
     * @param idUsuario id unico de cada usuario
     * @param nombre nombre del usuario
     * @param sexo sexo del usuario, se ocupa para efectos de calculo del IMC
     * @param masa "peso" o masa en kilogramos del usuario
     * @param altura  estatura en metros del usuario
     */
    public UsuarioAplicacion(int idUsuario, String nombre, String sexo, double masa, double altura) {
        this.nombre = nombre;
        this.sexo = sexo;
        this.masa = masa;
        this.altura = altura;
        this.idUsuario = idUsuario;
    }

    public UsuarioAplicacion() {
    }
    
    //getters
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

    //setters
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
    
    //metodos
    /**
     * Crea y añade un nuevo objeto VegetalUsuario consumido a la lista ListaVegetalesConsumidos 
     * de un usuario.
     * 
     * @param nombreVegetal nombre del vegetal a guardar
     * @param tipo tipo del vegetal a guardar
     * @param idVegetal id único del vegetal a guardar
     * @return true si fue agregado el nuevo usuario, false en cualquier otro caso
     */
    public boolean agregarVegetal(String nombreVegetal, int tipo, int idVegetal) {
        if(ListaVegetalesConsumidos.add(new VegetalUsuario(nombreVegetal, tipo, idVegetal)))
            return true;
        else return false;    
    }
    
    /**
     * Elimina un vegetal consumido de un usuario en base a un id de vegetal entregado.
     * Para esto recorre la colección de vegetales consumidos y compara el id de un objeto
     * de la lista con el id entregado, si son iguales, se remueve el objeto de la lista.
     * 
     * @param idVegetalEliminar id del vegetal a eliminar
     * @return true si el objeto fue eliminado, false en cualquier otro caso
     */
    public boolean eliminarVegetal(int idVegetalEliminar) {
        for (int i = 0; i < ListaVegetalesConsumidos.size(); i++) {
            if (idVegetalEliminar == ListaVegetalesConsumidos.get(i).getIdVegetal()) {
                ListaVegetalesConsumidos.remove(i);
                return true;
            }
        }
        return false;
    }
    
    /**
     * Muestra los vegetales consumidos de un usuario en formato "idVeg NombreVeg".
     */
    public void mostrarVegetales() {
        for (int i = 0; i < ListaVegetalesConsumidos.size(); i++) {
            System.out.println(ListaVegetalesConsumidos.get(i).getIdVegetal()+"<--"+ListaVegetalesConsumidos.get(i).getNombreVegetal());
        }
    }
    
    /**
     * Calcula el IMC de un usuario y lo guarda en su atributo 'imc'.
     */
    public void calcularIMC()   {
        //DecimalFormat formato1 = new DecimalFormat("#.00");
        imc = masa/(Math.pow(altura, 2));
    }
    
    /**
     * Calcula y obtiene el IMC del usuario.
     * 
     * @return double con el IMC calculado.
     */
    public double mostrarIMC() {
        calcularIMC();
        return imc;
    }
    
    /**
     * Método que calcula las calorias consumidas de un usuario, sumando las calorías
     * de los vegetales ingeridos.
     * 
     * @param datos ArrayList de VegetalArchivo el cual contiene los datos de los vegetales.
     * @return una variable double con la sumatoria de las calorías ingeridas.
     */
    public double getSumaCaloriasConsumidas(ArrayList<VegetalArchivo> datos) {
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
