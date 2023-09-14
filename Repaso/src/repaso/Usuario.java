/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package repaso;

import java.util.Date;

/**
 *
 * @author cetecom
 */
public class Usuario {
    //username - password - ultimaConexion
    // Acceso - tipo - nombre
    
    private String username, password;
    private Date ultimaConexion; 

    public Usuario() {
    }

    public Usuario(String username, String password, Date ultimaConexion) {
        this.username = username;
        this.password = password;
        this.ultimaConexion = ultimaConexion;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public Date getUltimaConexion() {
        return ultimaConexion;
    }

    public void setUltimaConexion(Date ultimaConexion) {
        this.ultimaConexion = ultimaConexion;
    }
    
    public void imprimirUser(){
        System.out.println("Su nombre es: " + username);
    }
    
    
}
