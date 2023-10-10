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
public class Abarrote extends Producto{
    private boolean aptoVegan;

    public Abarrote() {
    }

    public Abarrote(boolean aptoVegan, int precio, int cantidad, String codigo, String descripcion) {
        super(precio, cantidad, codigo, descripcion);
        this.aptoVegan = aptoVegan;
    }

    public boolean isAptoVegan() {
        return aptoVegan;
    }

    public void setAptoVegan(boolean aptoVegan) {
        this.aptoVegan = aptoVegan;
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
        
        detalle += "Producto Abarrote \n";
        detalle += super.verDetalle();
        if (aptoVegan){
            detalle += "Apto para veganos \n";
        }else{
            detalle += "No es apto para veganos \n";
        }
        
        return detalle;
    }
    
    
    
}
