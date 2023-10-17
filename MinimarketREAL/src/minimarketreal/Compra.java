/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minimarketreal;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author Sebastián Lobos Díaz
 */
public class Compra implements Base{

    private String comentario;
    private List<Producto> listaCompra = new ArrayList<>();
    private int total;

    public Compra() {
    }
    
    
    public void agregarProducto(Producto nuevo){
        boolean buscar = false;
        
        if (listaCompra.size() > 0) {
            for (Producto tmp : listaCompra) {              
                if (tmp.codigo.equalsIgnoreCase(nuevo.codigo)) {
                    buscar = true;
                }
            }
            if (buscar) {
                System.out.println("Producto ya existe en la lista");
            } else {
                listaCompra.add(nuevo);
            }

        } else {
            listaCompra.add(nuevo);
        }   
    }
    
    public void calcularTotal(){
        total = 0;
        for (Producto tmp : listaCompra){
            total += tmp.calcularTotal();
        }
    }
    
    public void mostrarCompra(){
        System.out.println("Detalle de Compra ");
        for (Producto tmp : listaCompra){
            System.out.println(tmp.verDetalle());
        }
        calcularTotal();
        System.out.println("---------------------------");
        System.out.println("Total: $" + total);
        System.out.println("Comentario: " + comentario);
    }
    
    @Override
    public String agregarComentario(String comentario) {
        this.comentario = comentario;
        return comentario;
    }
    
}
