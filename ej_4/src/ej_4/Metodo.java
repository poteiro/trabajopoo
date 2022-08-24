/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej_4;

import java.util.Scanner;


public class Metodo {
    public Rectangulo crearRectangulo(){
        Rectangulo f1=new Rectangulo();
        Scanner leer = new Scanner(System.in);
        
        System.out.println("ingrese la base del rectangulo");
        f1.setBase(leer.nextFloat());
        System.out.println("ingrese la altura del rectangulo");
        f1.setAltura(leer.nextFloat());
        return f1;
        
    } 
    public float perimetro (Rectangulo f1){
        
    float perimetro=(f1.getBase() + f1.getAltura())*2;
    return perimetro;
    
    }
    public float superficie (Rectangulo f1){
    float superficie=(f1.getBase()* f1.getAltura());
    return superficie;
    }
    public void dibujar(Rectangulo f1){ 
        
        for (int i = 0; i < f1.getAltura(); i++) {
           
            for (int j = 0; j < f1.getBase(); j++){ 
                System.out.print("*");
                
        }
            System.out.println("");    
        }
    }    
    
}
