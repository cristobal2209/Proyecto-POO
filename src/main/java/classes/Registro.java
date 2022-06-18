/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package classes;

/**
 *
 * @author crist
 */
public interface Registro {
    
    public Object getUsuario(int idUsuario);
    public boolean crearUsuario();
    public boolean modificarUsuario(int idUsuario);
    public boolean eliminarUsuario(int idUsuario);
    public void imprimirUsuarios();
}
