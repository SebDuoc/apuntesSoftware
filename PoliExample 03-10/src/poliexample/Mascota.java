/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poliexample;

/**
 *
 * @author cetecom
 */
public abstract class Mascota implements Base {
    protected String nombre;
    protected int edad, peso;

    public Mascota() {
    }

    public Mascota(String nombre, int edad, int peso) {
        this.nombre = nombre;
        this.edad = edad;
        this.peso = peso;
    }
    
}
