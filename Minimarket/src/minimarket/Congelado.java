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
public class Congelado extends Producto{
    private int temperaturaMinima;

    public Congelado() {
    }

    public Congelado(int temperaturaMinima, int precio, int cantidad, String codigo, String descripcion) {
        super(precio, cantidad, codigo, descripcion);
        this.temperaturaMinima = temperaturaMinima;
    }

    public int getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(int temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
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
        
        detalle += "Producto Congelado \n";
        detalle += super.verDetalle();
        detalle += "Temperatura minima: " + temperaturaMinima + "°C \n";
        
        return detalle;   
    }  
}
