/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package pooej01;

import entidad.Persona;

/**
 *
 * @author Jime
 */
public class POOej01 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Persona P = new Persona(40,"aldo","lencina");
        
        System.out.println("la edad es :"+ P.getEdad());
        System.out.println("el nombre es:"+P.getNombre());
        System.out.println("el apellido es:"+ P.getApellido() );
        // TODO code application logic here
    }
    
}
