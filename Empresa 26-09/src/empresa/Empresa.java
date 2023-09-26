/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package empresa;

/**
 *
 * @author cetecom
 */
public class Empresa {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        // 1 Negocio 2 Puesto 2 Empleados
        
        // Negocio
        Negocio negocio = new Negocio();
        
        //Puestos
        Puesto puesto1 = new Puesto(1, "Jefe");
        Puesto puesto2 = new Puesto(2, "Supervisor");
        
        // Empleados
        // rut, nombre completo, genero, aniosServicio, edad, puesto)
        Empleado emp1 = new Empleado("123", "Francisco Hamir", 'M', 10, 29, puesto2);
        Empleado emp2 = new Empleado("321", "Bastian Sepulve", 'F', 17, 50, puesto1);
        
        negocio.agregar(emp1);
        negocio.agregar(emp2);
        
        //Listar
        //negocio.listar();
        
        
        // Buscar
        negocio.buscar("123");
        
        //Eliminar
        negocio.eliminar("321");
        
        
        
    }
    
}
