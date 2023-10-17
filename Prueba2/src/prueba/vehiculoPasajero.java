/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

/**
 *
 * @author cetecom
 */
public class vehiculoPasajero extends Vehiculo{
    private int cantidadPasajero;

    public vehiculoPasajero() {
    }

    public vehiculoPasajero(int cantidadPasajero, int precioDiario, int cantidadDias, String patente) {
        super(precioDiario, cantidadDias, patente);
        this.cantidadPasajero = cantidadPasajero;
    }

    @Override
    public double calcularTotal() {
        double desc = (super.precioDiario * super.cantidadDias) * descuentoPasajero;
        return (super.precioDiario * super.cantidadDias) - desc;
    }
    
    @Override
    public String mostrarDatos() {
        String detalle = "";
        
        detalle += "--------------------------------------\n";
        detalle += "\tVehiculo Pasajeros\n";
        detalle += super.mostrarDatos();
        detalle += "Cantidad de Pasajeros: \t" + cantidadPasajero + "\n";
        detalle += "...................................\n";
        detalle += "Descuento : \t\t" + (descuentoPasajero * 100) + "%\n";
        detalle += "Descuento Aplicado: \t$" + calcularTotal()+ "\n";
        detalle += "IVA: \t\t\t$" + (calcularTotal() * IVA ) + "\n";
        detalle += "Total a Pagar: \t\t$" +(calcularTotal() * IVA + calcularTotal()) + "\n";
        
        return detalle;
    }

    
}
