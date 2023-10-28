/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pf.sistemavotaciones;
import java.util.ArrayList;
import java.util.List;
/**
 *
 * @author JOSHUA
 */
public class UsersRegistration {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
    class Usuario {
    private String nombres;
    private String apellidos;
    private String correoElectronico;
    private String contraseña;
    private List<String> roles;
    private boolean habilitado;

    // Constructor
    public Usuario(String nombres, String apellidos, String correoElectronico, String contraseña, List<String> roles) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.correoElectronico = correoElectronico;
        this.contraseña = contraseña;
        this.roles = roles;
        this.habilitado = true; // Usuario habilitado por defecto
    }

    // Métodos para editar y deshabilitar usuario
    public void editarUsuario(String nombres, String apellidos, String contraseña, List<String> roles) {
        this.nombres = nombres;
        this.apellidos = apellidos;
        this.contraseña = contraseña;
        this.roles = roles;
    }

    public void deshabilitarUsuario() {
        this.habilitado = false;
    }

    // Métodos para reiniciar contraseña
    public void reiniciarContraseña(String nuevaContraseña) {
        this.contraseña = nuevaContraseña;
    }

    // Getters y Setters
    public String getNombres() {
        return nombres;
    }

    public void setNombres(String nombres) {
        this.nombres = nombres;
    }

    public String getApellidos() {
        return apellidos;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public String getCorreoElectronico() {
        return correoElectronico;
    }

    public void setCorreoElectronico(String correoElectronico) {
        this.correoElectronico = correoElectronico;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public List<String> getRoles() {
        return roles;
    }

    public void setRoles(List<String> roles) {
        this.roles = roles;
    }

    public boolean isHabilitado() {
        return habilitado;
    }

    public void setHabilitado(boolean habilitado) {
        this.habilitado = habilitado;
    }
}

}
