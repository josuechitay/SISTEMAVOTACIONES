/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package pf.sistemavotaciones;
import java.util.Scanner;
import javax.swing.JOptionPane;
/**
 *
 * @author JOSHUA
 */
public class appInitialSetup {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        //declare 2 var for the admin user and one for the admin password. The admin user name 
        //will be by default "AdministratorPrincipal" and the passwordd will be created by the member 
        // using from 8 up to 12 chars. Password is not case sensitive
        Scanner entrada = new Scanner(System.in);

        String adminUser = "AdministradorPrincipal";
        String mAdminPass;
        
        System.out.println("CREACION DEL USUARIO ADMINISTRADOR PARA PRIMER ACCESO");  
        System.out.println("NOMBRE DE USUARIO: "+ adminUser); 
        System.out.println("---------------------------------------------------");
        System.out.println("CREACION DE CONTRASEÑA PARA EL USUARIO ADMINISTRADOR");
        System.out.println("Ingresa una contraseña que contenga entre 8 y 10 caracteres: ");
        mAdminPass=entrada.next();
        System.out.println("Ingresa tu contraseña nuevamente: ");
        System.out.println("-------------------------------");
        System.out.println("EL USUARIO DEL ADMINISTRADOR PRINCIPAL HA SIDO CONFIGURADO EXITOSAMENTE");
        System.out.println("//////////////////////////////////////////////////");
        System.out.println("Nombre de Usuario: "+ adminUser);
        System.out.println("Contraseña: "+ mAdminPass);
        
                
                
    }
    
}
