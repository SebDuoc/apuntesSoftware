/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package minimarket;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author cetecom
 */
public class Compra implements Base{
    // Aca mantenemos la lista de compra
    private String comentario;  
    private List<Producto> listaCompra = new ArrayList<>();
    private int total;

    public Compra() {
    }
    
    //AgregarProducto - Ver Lista Productos - Calcular Total
    
    public void agregarProducto(Producto nuevo){
        //Validar que no exista mas de uno
        if(listaCompra.size() > 0){
            for(Producto temp : listaCompra){
                if(temp.codigo.equalsIgnoreCase((nuevo.codigo))){
                    System.out.println("Producto ya existe en la lista");
                }else{
                    listaCompra.add(nuevo);
                    break;
                }
            }
        }else{
            listaCompra.add(nuevo);
        }
    }
    
    // Listar
    public void listarProductos(){
        for (Producto tmp : listaCompra){
            System.out.println(tmp.verDetalle());
        }
        if (total > 0){
            System.out.println("Total de la compra: $" +  total);   
        }else {
            System.out.println("Total sin calcular.");
        }
 
    }
    
    // Calcular Total
    public void calcularTotal(){
        for(Producto tmp : listaCompra){
            total += tmp.calcular();
        }
    }
    
    
    @Override
    public String agregarComentario(String comentario) {
        this.comentario = comentario;
        return this.comentario;
    }
}
