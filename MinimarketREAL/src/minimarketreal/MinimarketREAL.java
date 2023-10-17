/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package minimarketreal;

/**
 *
 * @author Sebastián Lobos Díaz
 */
public class MinimarketREAL {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        
        Abarrote aba1 = new Abarrote(true, "ABC123", "Canutos", 970, 2);
        Congelado con1 = new Congelado(1, "12AB", "Arvejas Congeladas", 1000, 5);
     
        Compra compra = new Compra();
        compra.agregarProducto(aba1);
        compra.agregarProducto(con1);
        compra.agregarComentario("Entregar productos frios.");
        
        compra.mostrarCompra();
        
    }
    
}
