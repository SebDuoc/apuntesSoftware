/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minimarketreal;

/**
 *
 * @author Sebastián Lobos Díaz
 */
public class Aseo extends Producto{
    private boolean toxicidad;

    public Aseo() {
    }

    public Aseo(boolean toxicidad, String codigo, String descripcion, int precio, int cantidad) {
        super(codigo, descripcion, precio, cantidad);
        this.toxicidad = toxicidad;
    }

    public boolean isToxicidad() {
        return toxicidad;
    }

    public void setToxicidad(boolean toxicidad) {
        this.toxicidad = toxicidad;
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
        
        detalle += "Producto Aseo\n";
        detalle += super.verDetalle();
        if(toxicidad){
            detalle += "Producto toxico";
        }else{
            detalle += "Producto no toxico";
        }
        
        return detalle;
    }
    
    
}
