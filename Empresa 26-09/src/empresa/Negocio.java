/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package empresa;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cetecom
 */
public class Negocio {
    private List<Empleado> lista = new ArrayList<>();

    public Negocio() {
    }
    
    /*
    CRUD
    Create = Agregar
    Read = Leer/listar
    Update = Actualizar/Modificar
    Delete = Eliminar/borrar
    */
    
    //Agregar
    public void agregar(Empleado nuevo){
        lista.add(nuevo);
        System.out.println("Agregado con exito");
    }
    
    //Listar
    public void listar(){
        //for(Clase nombreObjeto : Coleccion) {}
        
        for (Empleado tmp : lista){
            
            System.out.println(tmp.toString());            
        }
    } 
    
    // Buscar por rut
    public void buscar(String rut){
        for (Empleado tmp : lista){
            if (tmp.getRut().equalsIgnoreCase(rut)){
                System.out.println(tmp.toString());
            }
        }
    }
    
    // Eliminar por rut
    public void eliminar(String rut){
        boolean res = false;
        for (Empleado tmp : lista){
            if(tmp.getRut().equals(rut)){
                lista.remove(tmp);
                res = true;
                break;
            }
        }
        
        if (res){
            System.out.println("Eliminado con exito.");
        }else{
            System.out.println("Rut no encontrado.");
        }
    }
    
}
