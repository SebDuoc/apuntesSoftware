/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minimarket;

import minimarket.Producto;

/**
 *
 * @author cetecom
 */
public class Aseo extends Producto{
    private String toxicidad;

    public Aseo() {
    }

    public Aseo(String toxicidad, int precio, int cantidad, String codigo, String descripcion) {
        super(precio, cantidad, codigo, descripcion);
        this.toxicidad = toxicidad;
    }

    public String getToxicidad() {
        return toxicidad;
    }

    public void setToxicidad(String toxicidad) {
        this.toxicidad = toxicidad;
    }

    public int getPrecio() {
        return precio;
    }

    public void setPrecio(int precio) {
        this.precio = precio;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public String getCodigo() {
        return codigo;
    }

    public void setCodigo(String codigo) {
        this.codigo = codigo;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
    @Override
    public String verDetalle() {
        String detalle = "";
        
        detalle += "Producto Aseo \n";
        detalle += super.verDetalle();
        detalle += "Nivel de toxicidad: " + toxicidad + "\n";
        
        return detalle;
    }
}
