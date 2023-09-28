/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rrss;

/**
 *
 * @author cetecom
 */
public class RedSocial {
    protected String usuario, pass;

    public RedSocial() {
    }

    public RedSocial(String usuario, String pass) {
        this.usuario = usuario;
        this.pass = pass;
    }
    
   public String mostrarInfo(){
       String info = "";
       
       info += "-----------------------------------";
       info += "Informacion del usuario" + "\n";
       info += "Usuario Conectado: " + usuario + "\n";       
       
       return info;
   }
}
