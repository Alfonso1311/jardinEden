/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package jardineden;

import Comercializadora.Venta;
import Vivero.Planta;
import java.util.Scanner;

/**
 *
 * @author alfon
 */
public class JardinEden {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        Venta registrosVentas[] = new Venta[10];
        Scanner teclado = new Scanner(System.in);
        
        /*
        private int numVenta;
        
        private int cantPlantasVenta;
            */
        
        
        //registrosVentas[0] = new Venta(0, nombreCliente, 0, plantasVenta)
        System.out.println("Introduce nombre cliente: ");
        registrosVentas[0].setNombreCliente(teclado.nextLine());
        
        System.out.println("Introduce número venta: ");
        registrosVentas[0].setNumVenta(teclado.nextInt());
        
        
        int arreglotemporal[] = new int[10], i;
        Planta arregloTemporal2[] = new Planta[10];
        
        for(i=0; i<10; i++){
            System.out.println("Introduce nombre planta que se lleva: ");
            arregloTemporal2[i].setNombre(teclado.nextLine());
            System.out.println("Introduce cantidad de articulos de la planta: ");
            arreglotemporal[i] = teclado.nextInt();
        }
        
        registrosVentas[0].setCantPlantasVenta(arreglotemporal);
        registrosVentas[0].setPlantasVenta(arregloTemporal2);
        
    }
    
}
