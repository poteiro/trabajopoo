/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1POO;

import java.util.Scanner;

/**
 *
 * @author Jime
 */
public class Libroapp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Libro p1=new Libro(12345678,"los secretos de poo","leo espinosa",100);
        System.out.println(p1.toString());
        
        
        Libro libro1 = new Libro();
        libro1.ingresoLibro();
        /*Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el isbn del libro ");
        libro1.setIsbn(leer.nextInt());
        System.out.println("ingrese el titulo del libro");
        libro1.setTitulo(leer.next());
        System.out.println("ingrese el autor del libro ");
        libro1.setAutor(leer.next());
        System.out.println("ingrese el numPagina del libro ");
        libro1.setNumPagina(leer.nextInt());
            System.out.println(libro1.toString());*/
           Libro libro2 = new Libro();
        libro2.ingresoLibro2();              
    }
    
}
