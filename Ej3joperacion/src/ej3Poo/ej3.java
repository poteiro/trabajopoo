/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej3Poo;

import ServicioOperacion.Operacion;
import java.util.Scanner;


public class ej3 {

    
    public static void main(String[] args) {
      
       int opcion;
        Scanner leer = new Scanner(System.in);
        Operacion consulta = new Operacion();

        consulta.crearOperacion();

      do{
        System.out.println("Elija una opción");
        System.out.println("1- Sumar");
        System.out.println("2- Restar");
        System.out.println("3- Multiplicar");
        System.out.println("4- Dividir");
        System.out.println("5- Salir");
                
        opcion = leer.nextInt();
        
          switch (opcion) {
              case 1:
                  System.out.println("la suma de los numeros es :" + consulta.sumar());
                  break;
              case 2:
                  System.out.println("la resta de los numeros es :" + consulta.restar());
                  break;
              case 3:
                  System.out.println("la multiplicacion de los numeros es :" + consulta.multiplicar());
                  break;
              case 4:
                  System.out.println("la dividision de los numeros es :" + consulta.dividir());
                  break;
          }
       }while (opcion!=5);
               
      }
}
     


