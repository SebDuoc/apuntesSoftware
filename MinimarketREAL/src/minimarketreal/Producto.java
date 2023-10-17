/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minimarketreal;

/**
 *
 * @author Sebastián Lobos Díaz
 */
public abstract class Producto {
    protected String codigo, descripcion;
    protected int precio, cantidad;

    public Producto() {
    }

    public Producto(String codigo, String descripcion, int precio, int cantidad) {
        this.codigo = codigo;
        this.descripcion = descripcion;
        this.precio = precio;
        this.cantidad = cantidad;
    }
    
    public double calcularTotal(){
        return precio * cantidad;
    }
    
    
    public String verDetalle(){
        String detalle = "";
        
        detalle += "Codigo: " + codigo + "\n";
        detalle += "Descripcion: " + descripcion + "\n";
        detalle += "Precio: $" + precio + "\n";
        detalle += "Cantidad: " + cantidad + "\n";
        detalle += "Total: $" + calcularTotal() + "\n";
        
        return detalle;
    }
}
