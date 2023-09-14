/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package repaso;

import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author cetecom
 */
public class Repaso {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Scanner lec = new Scanner(System.in);
        
        int op = 0;
        
        String username = "testUser";
        String password = "pass1234";
        Date conexion = new Date(); 
        
        // con parametros
        Usuario usuario = new Usuario(username, password, conexion);
        System.out.println("Username: " + usuario.getUsername());
        System.out.println("Password: " + usuario.getPassword());
        System.out.println("Ultima Conexion: " + usuario.getUltimaConexion());
        
        // sin parametros
        Usuario usuario1 = new Usuario();
        usuario1.setUsername("testUser1");
        
        // Pedir el dato
        System.out.println("Ingrese contraseña: ");
        // Guardar la info
        password = lec.next();
        // Reemplazar el valor
        usuario1.setPassword(password);
        usuario1.setUltimaConexion(new Date());
        
        // Mostrar segunda info
        System.out.println("Username: " + usuario1.getUsername());
        System.out.println("Password: " + usuario1.getPassword());
        System.out.println("Ultima Conexion: " + usuario1.getUltimaConexion());
        
        do {
           System.out.println("\tMenu Principal"); 
           System.out.println("1. Agregar");
           System.out.println("2. Ver Detalle");
           System.out.println("3. Aplicar Descuento");
           System.out.println("4. Salir");
           op = lec.nextInt();
           
           
           
        } while (op != 4);
    
       
    }
    
}
