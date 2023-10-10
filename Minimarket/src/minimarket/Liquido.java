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
public class Liquido extends Producto{
    private int gradosAlcohol;

    public Liquido(int gradosAlcohol, int precio, int cantidad, String codigo, String descripcion) {
        super(precio, cantidad, codigo, descripcion);
        this.gradosAlcohol = gradosAlcohol;
    }

    public Liquido() {
    }

    public int getGradosAlcohol() {
        return gradosAlcohol;
    }

    public void setGradosAlcohol(int gradosAlcohol) {
        this.gradosAlcohol = gradosAlcohol;
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
        
        detalle += "Producto Liquido \n";
        detalle += super.verDetalle();
        detalle += "Grados de Alcohol: " + gradosAlcohol + "\n";
        
        return detalle;
    }

    
    
}
