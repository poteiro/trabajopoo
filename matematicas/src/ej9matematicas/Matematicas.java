
package ej9matematicas;

import clase.Matematica;
import metodos.Metodos;


public class Matematicas {

 
    public static void main(String[] args) {
        Metodos m=new Metodos();
        Matematica n1=new Matematica();
        
        double num1=Math.random()*99;
        double num2=Math.random()*99;
        
        System.out.println("num1");
        System.out.println("num2");
        
    n1.setNum1(num1);
    n1.setNum2(num2);
    
    m.devolverMayor(n1, n1);
    m.calcularPotencia(n1, n1);
    m.calculaRaiz(n1, n1);
    }

   
    }

   

    
    
    

