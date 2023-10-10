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
public class Oferta extends Producto{
    private double descuento;

    public Oferta() {
    }

    public Oferta(double descuento, int precio, int cantidad, String codigo, String descripcion) {
        super(precio, cantidad, codigo, descripcion);
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
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
    public double calcular() {
        double desc = (super.precio * super.cantidad) * descuento;
        
        return (super.precio * super.cantidad) - desc;
    }
    
    @Override
    public String verDetalle() {
       String detalle = "";
        
        detalle += "Producto Oferta\n";
        detalle += super.verDetalle();
        detalle += "Descuento: " + (descuento * 100) + "\n";
        
        return detalle;
    }
    
    
}
