/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package prueba;

/**
 *
 * @author cetecom
 */
public class Prueba {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        vehiculoCarga vc1 = new vehiculoCarga(2000, 1500, 3,"ABC123");
        vehiculoPasajero vp1 = new vehiculoPasajero(25, 1000, 7, "HOLA1");
 
        Auxiliar auxiliar = new Auxiliar();
        
        auxiliar.agregarVehiculo(vc1);
        auxiliar.agregarVehiculo(vp1);
    
        auxiliar.mostrarLista();
        auxiliar.cantidadVehiculo();
    }
    
}
