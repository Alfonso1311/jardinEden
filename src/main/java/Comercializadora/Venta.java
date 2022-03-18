/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Comercializadora;

import Vivero.Planta;
import java.util.Arrays;

/**
 *
 * @author alfon
 */
public class Venta {
    private int numVenta;
    private String nombreCliente;
    private int cantPlantasVenta[];
    private Planta plantasVenta[];

    public Venta(int numVenta, String nombreCliente, int[] cantPlantasVenta, Planta[] plantasVenta) {
        this.numVenta = numVenta;
        this.nombreCliente = nombreCliente;
        this.cantPlantasVenta = cantPlantasVenta;
        this.plantasVenta = plantasVenta;
    }

        

    public int getNumVenta() {
        return numVenta;
    }

    public void setNumVenta(int numVenta) {
        this.numVenta = numVenta;
    }

    public String getNombreCliente() {
        return nombreCliente;
    }

    public void setNombreCliente(String nombreCliente) {
        this.nombreCliente = nombreCliente;
    }

    public int[] getCantPlantasVenta() {
        return cantPlantasVenta;
    }

    public void setCantPlantasVenta(int[] cantPlantasVenta) {
        this.cantPlantasVenta = cantPlantasVenta;
    }

    public Planta[] getPlantasVenta() {
        return plantasVenta;
    }

    public void setPlantasVenta(Planta[] plantasVenta) {
        this.plantasVenta = plantasVenta;
    }

    @Override
    public String toString() {
        return "Venta{" + "numVenta=" + numVenta + ", nombreCliente=" + nombreCliente + ", cantPlantasVenta=" + Arrays.toString(cantPlantasVenta) + ", plantasVenta=" + Arrays.toString(plantasVenta) + '}';
    }
    
    
}
