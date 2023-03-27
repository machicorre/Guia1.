/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package guia1ej2;

import java.util.Scanner;

/**
 *
 * @author marisa
 */
public class Guia1ej2 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in); // Creamos el Scanner
        
        System.out.println("Ingrese su nombre");
        String nombre = leer.nextLine(); // Leer una cadena
        
        System.out.println("mi nombre es " + nombre);
    }
    
}
