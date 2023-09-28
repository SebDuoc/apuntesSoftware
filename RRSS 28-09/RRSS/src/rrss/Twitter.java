/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package rrss;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 *
 * @author cetecom
 */
public class Twitter extends RedSocial{
    private int id;
    private String noticia;
    private Date fecha;

    public Twitter() {
    }

    public Twitter(int id, String noticia, Date fecha, String usuario, String pass) {
        super(usuario, pass);
        this.id = id;
        this.noticia = noticia;
        this.fecha = fecha;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getNoticia() {
        return noticia;
    }

    public void setNoticia(String noticia) {
        this.noticia = noticia;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
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
        info += "Informacion Twitter" + "\n";
        info += "ID: " + id + "\n";
        info += "Noticia: " + noticia + "\n";
        
        // dd/MM/YYYY HH:mm
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/YYYY HH:mm");
        String fechaLocal = sdf.format(fecha);        
        info += "Fecha: " + fechaLocal + "\n";
        
        return info;
    }
    
    
    
    
}
