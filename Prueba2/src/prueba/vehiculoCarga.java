/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

/**
 *
 * @author cetecom
 */
public class vehiculoCarga extends Vehiculo{
    private int cargaKilos;

    public vehiculoCarga() {
    }

    public vehiculoCarga(int cargaKilos, int precioDiario, int cantidadDias, String patente) {
        super(precioDiario, cantidadDias, patente);
        this.cargaKilos = cargaKilos;
    }

    @Override
    public double calcularTotal() {
        double desc = (super.precioDiario * super.cantidadDias) * descuentoCarga;
        return (super.precioDiario * super.cantidadDias) - desc;       
    }
    
    @Override
    public String mostrarDatos() {
        String detalle = "";
        
        detalle += "--------------------------------------\n";
        detalle += "\tVehiculo Carga\n";
        detalle += super.mostrarDatos();
        detalle += "Capacidad de Carga: \t" + cargaKilos + " KG\n";
        detalle += "...................................\n";
        detalle += "Descuento: \t\t" + (descuentoCarga * 100) + "%\n";
        detalle += "Descuento Aplicado: \t$" + calcularTotal()+ "\n";
        detalle += "IVA: \t\t\t$" + (calcularTotal() * IVA ) + "\n";
        detalle += "Total a Pagar: \t\t$" +(calcularTotal() * IVA + calcularTotal()) + "\n";
        
        return detalle;
    }
    
    
}
