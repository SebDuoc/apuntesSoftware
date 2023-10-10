/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package minimarket;

/**
 *
 * @author cetecom
 */
public interface Base {
    // public Abstract <--- Todo metodo viene por defecto
    
    String agregarComentario(String comentario);
    
    /*
    public = libre acceso
    static = original de la clase(Base)
    final = No se puede modificar
    */
    
    double IVA = 0.19;
}
