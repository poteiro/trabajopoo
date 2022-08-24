/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra;

import java.util.Scanner;

/**
 *
 * @author Jime
 */
public class Ejercicio1 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
        String nombre;
        System.out.println("ingrese tu nombre");
       nombre = leer.next();
       System.out.println("hola soy " + nombre + " y estoy programando en JAVA!!!!" );
    }
    
}
