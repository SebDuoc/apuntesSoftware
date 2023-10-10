/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minimarket;

/**
 *
 * @author cetecom
 */
public class Minimarket {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Compra compra = new Compra();
        
        
        // Liquido(Grados, precio, cantidad, codigo, descripcion)
        Liquido liq = new Liquido(5, 700, 4, "ABC123", "Royal");
        Oferta off = new Oferta(0.10, 280000, 1, "QWE456", "Blue Label");
        
        compra.agregarProducto(liq);
        compra.agregarProducto(off);
        
        compra.calcularTotal();
        
        compra.listarProductos();
    }
    
}
