/*Elaborar un algoritmo en el cuál se ingrese un número entre 1 y 10 y se muestre su
equivalente en romano.
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ejercicioextra;

import javax.swing.JOptionPane;

/**
 *
 * @author Jime
 */
public class ejExtra5 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       
        
        int dato=0;
        dato=Integer.parseInt(JOptionPane.showInputDialog("ingrese un numero del 1 al 10"));
        
        switch (dato){
            case 1: JOptionPane.showMessageDialog(null,"I");
            break;
            
            case 2: JOptionPane.showMessageDialog(null,"II");
            break;
            case 3: JOptionPane.showMessageDialog(null,"III");
            break;
            case 4: JOptionPane.showMessageDialog(null,"IV");
            break;
            case 5: JOptionPane.showMessageDialog(null,"V");
            break;
            case 6: JOptionPane.showMessageDialog(null,"VI");
            break;
            case 7: JOptionPane.showMessageDialog(null,"VII");
            break;
            case 8: JOptionPane.showMessageDialog(null,"VIII");
            break;
            case 9: JOptionPane.showMessageDialog(null,"IX");
            break;
            case 10: JOptionPane.showMessageDialog(null,"X");
            break;
            default:JOptionPane.showMessageDialog(null,"el numero no esta dentro del rango");
            
        } 
        // TODO code application logic here
    }
    
}
