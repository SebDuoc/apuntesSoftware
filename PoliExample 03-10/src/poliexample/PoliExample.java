/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package poliexample;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cetecom
 */
public class PoliExample {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        // Interfaz base
        // Mascota: Super clase : 3 atributos
        // Nombre - edad - peso
        
        /* 
        Perro : Sub1:Bozal:Bool
        Ave : Plumas:String
        */
        
        Perro perro1 = new Perro();
        Ave ave1 = new Ave();
        
        perro1.setNombre("Francisco");
        ave1.setNombre("Pancho");
        
        perro1.mostrarNombre();
        ave1.mostrarNombre();
        
        // Lista de mascotas
        List<Mascota> registro = new ArrayList<>();
        registro.add(perro1);
        registro.add(ave1);
        
        // for(TipoDatoColeccion tmp:Coleccion)
        
        for(Mascota masco : registro){
            masco.mostrarNombre();
        }      
    }   
}
