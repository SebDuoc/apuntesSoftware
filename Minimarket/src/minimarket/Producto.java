/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minimarket;

/**
 *
 * @author cetecom
 */
public abstract class Producto {
    protected int  precio, cantidad;
    protected String codigo, descripcion;

    public Producto() {
    }

    public Producto(int precio, int cantidad, String codigo, String descripcion) {
        this.precio = precio;
        this.cantidad = cantidad;
        this.codigo = codigo;
        this.descripcion = descripcion;
    }
    
    public double calcular(){
        return precio * cantidad;
    }
    
    public String verDetalle(){
        String detalle = "";
        
        detalle += "--------------------------" + "\n";
        detalle += "Codigo: " + codigo + "\n";
        detalle += "Precio:" + precio + "$ \n";
        detalle += "Descripcion: " + descripcion + "\n";
        detalle += "Cantidad: " + cantidad + "\n";
        detalle += "Total comprado: $" + calcular()+ "\n";
        
        return detalle;
    }
    
}
