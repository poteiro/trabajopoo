/*Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una vocal.
Caso contrario mostrar un mensaje.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra;

import java.util.Scanner;
import javax.swing.JOptionPane;

/**
 *
 * @author Jime
 */
public class ejExtra3 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner leer = new Scanner(System.in);
       String texto = JOptionPane.showInputDialog(null, "escriba una letra: ","insercion", JOptionPane.INFORMATION_MESSAGE);
       
       String vocales []={"a","e","i","o","u"};
       
        for (int i = 0; i < texto.length(); i++) {
            for (int j = 0; j <vocales.length; j++) {
                
                if (texto.substring(i,i+1).equalsIgnoreCase(vocales[j]))  {
                    System.out.println("es una vocal");
                    break;
                    
                }else{
                    System.out.println("no es una vocal");
                    break;
                }
            }
            
        }   
        
    }  
        
}       
        
        
       
        
        // TODO code application logic here
    
    

