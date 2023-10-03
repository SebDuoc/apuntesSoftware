/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package poliexample;

/**
 *
 * @author cetecom
 */
public class Perro extends Mascota {
    private boolean bozal;

    public Perro() {
    }

    public Perro(boolean bozal, String nombre, int edad, int peso) {
        super(nombre, edad, peso);
        this.bozal = bozal;
    }

    public boolean isBozal() {
        return bozal;
    }

    public void setBozal(boolean bozal) {
        this.bozal = bozal;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public int getPeso() {
        return peso;
    }

    public void setPeso(int peso) {
        this.peso = peso;
    }

    @Override
    public void mostrarNombre() {
        System.out.println("Nombre Perro: " + super.nombre);
    }

    
}
