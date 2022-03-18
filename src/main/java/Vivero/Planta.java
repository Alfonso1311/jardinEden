/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Vivero;

/**
 *
 * @author alfon
 */
public class Planta {
    private String nombre;
    private float costo;

    public Planta(String nombre, float costo) {
        this.nombre = nombre;
        this.costo = costo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getCosto() {
        return costo;
    }

    public void setCosto(float costo) {
        this.costo = costo;
    }

    

    

    @Override
    public String toString() {
        return "Planta{" + "nombre=" + nombre + ", costo=" + costo + '}';
    }

    
    
    
}
