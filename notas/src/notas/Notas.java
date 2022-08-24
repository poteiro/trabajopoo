/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package notas;

import java.util.Scanner;

/**
 *
 * @author Jime
 */
public class Notas {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        System.out.println("ingrese el numero de la nota");
        int nota = leer.nextInt();
        while(nota < 10  || nota >= 10){
            
            if(nota <= 10){
                System.out.println("felicidades su nota esta entre 0 y 10");
                break;
            } else if(nota >= 10){
                
                Scanner s = new Scanner(System.in);
                System.out.println("ingrese un numero nuevamente");
                nota = s.nextInt();
                
            }
        
        }

        // TODO code application logic here
    }
    
}
