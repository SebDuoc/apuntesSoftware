/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package prueba;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cetecom
 */
public class Auxiliar {
    
    private List<Vehiculo> listaVehiculo= new ArrayList<>();

    public Auxiliar() {
    }
    
    
    public void agregarVehiculo(Vehiculo nuevo){
        boolean buscar = false;
        
        if(listaVehiculo.size() > 0){
            for (Vehiculo tmp : listaVehiculo){
                if (tmp.patente.equals(nuevo.patente)){
                    buscar = true;
                }
            }
            if(buscar){
              System.out.println("Este vehiculo ya existe.");  
            }else{
                listaVehiculo.add(nuevo);
            }
        }else{
            listaVehiculo.add(nuevo);
        }
    }
 
    public void mostrarLista(){
        for (Vehiculo tmp : listaVehiculo){
            System.out.println(tmp.mostrarDatos());
        }
    }
    
    public void cantidadVehiculo(){
        int contador = 0;
        for (Vehiculo tmp : listaVehiculo){
            if (tmp.cantidadDias >= 7){
                contador += 1;
            }
        }
        System.out.println("Cantidad de vehiculos con arriendo mayor o igual a 7 dias: " + contador);
    }
}
