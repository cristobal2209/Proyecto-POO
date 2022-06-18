
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

    //constructores
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
     * @param nombreVegetal
     * @param tipo
     * @param idVegetal
     * @return 
     */
    public boolean agregarVegetal(String nombreVegetal, int tipo, int idVegetal) {
        if(ListaVegetalesConsumidos.add(new VegetalUsuario(nombreVegetal, tipo, idVegetal)))
            return true;
        else return false;    
    }
    
    /**
     * 
     * @param idVegetalEliminar
     * @return 
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
     * 
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
     * 
     * @return 
     */
    public double mostrarIMC() {
        calcularIMC();
        return imc;
    }
    
    /**
     * 
     * @param datos
     * @return 
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
