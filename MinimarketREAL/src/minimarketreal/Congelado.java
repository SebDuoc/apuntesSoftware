/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minimarketreal;

/**
 *
 * @author Sebastián Lobos Díaz
 */
public class Congelado extends Producto{
    private int temperaturaMinima;

    public Congelado() {
    }

    public Congelado(int temperaturaMinima, String codigo, String descripcion, int precio, int cantidad) {
        super(codigo, descripcion, precio, cantidad);
        this.temperaturaMinima = temperaturaMinima;
    }

    public int getTemperaturaMinima() {
        return temperaturaMinima;
    }

    public void setTemperaturaMinima(int temperaturaMinima) {
        this.temperaturaMinima = temperaturaMinima;
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

    @Override
    public String verDetalle() {
        String detalle = "";
        
        detalle += "Producto Congelado\n";
        detalle += super.verDetalle();
        detalle += "Temperatura minima: " + temperaturaMinima + "°C \n";
        
        return detalle;
    }
    
    
}
