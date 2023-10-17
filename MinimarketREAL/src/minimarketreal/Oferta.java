/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minimarketreal;

/**
 *
 * @author Sebastián Lobos Díaz
 */
public class Oferta extends Producto{
    private double descuento;

    public Oferta() {
    }

    public Oferta(double descuento, String codigo, String descripcion, int precio, int cantidad) {
        super(codigo, descripcion, precio, cantidad);
        this.descuento = descuento;
    }

    public double getDescuento() {
        return descuento;
    }

    public void setDescuento(double descuento) {
        this.descuento = descuento;
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
    public double calcularTotal() {
        double desc = (precio * cantidad) * descuento;
        return (precio * cantidad) - desc;
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
