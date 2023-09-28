/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rrss;

/**
 *
 * @author cetecom
 */
public class Instagram extends RedSocial{
    private int id;
    private String historia;
    private boolean estado;

    public Instagram() {
    }

    public Instagram(int id, String historia, boolean estado, String usuario, String pass) {
        super(usuario, pass);
        this.id = id;
        this.historia = historia;
        this.estado = estado;
    }
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getHistoria() {
        return historia;
    }

    public void setHistoria(String historia) {
        this.historia = historia;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    @Override
    public String mostrarInfo() {
        String info = "";
        
        info += super.mostrarInfo();
        info += "Informacion IG" + "\n";
        info += "ID: " + id +  "\n";
        info += "Historia: " + historia + "\n";
        if (estado){
            info += "Visible \n";
        } else {
            info += "No Visible \n";
        }
        
        return info;
    }
    
    
    
    
}
