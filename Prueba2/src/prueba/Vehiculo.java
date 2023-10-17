/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

/**
 *
 * @author cetecom
 */
public abstract class Vehiculo implements Base{
    protected int precioDiario, cantidadDias;
    protected String patente;

    public Vehiculo() {
    }

    public Vehiculo(int precioDiario, int cantidadDias, String patente) {
        this.precioDiario = precioDiario;
        this.cantidadDias = cantidadDias;
        this.patente = patente;
    }
    
    public double calcularTotal(){
        return precioDiario * cantidadDias;
    }
    
    public String mostrarDatos(){
        String detalle = "";
        
        detalle += "Patente: \t\t" + patente + "\n";
        detalle += "Precio Diario: \t\t$" + precioDiario + "\n";
        detalle += "Cantidad: \t\t" + cantidadDias + " dias.\n";
        detalle += "...................................\n";
        detalle += "Total: \t\t\t$" + cantidadDias * precioDiario + "\n";
        
        
        return detalle;
    }
    
}
