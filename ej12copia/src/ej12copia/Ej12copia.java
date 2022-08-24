
package ej12copia;

import entidad.Persona;
import metodos.MetodoPersona;


public class Ej12copia {

  
    public static void main(String[] args) {
      MetodoPersona v1=new MetodoPersona();
      
      Persona v2= v1.crearPersona();
      Persona v3= v1.crearPersona();

      
     // v1.crearPersona();
      v1.calcularEdad(v2);
    switch(v1.menorQue(v2,v1.calcularEdad(v3))){
        case -1:
         System.out.println(v2.getNombre() + " es menor que " + v3.getNombre() + ".");
         break;
        case 0:
         System.out.println(v2.getNombre() + " igual que " + v3.getNombre() + ".");
         break;

        case 1:
                  System.out.println(v2.getNombre() + " es mayor que " + v3.getNombre() + ".");
   break;
        
          
    } 
    v1.mostrarPersona(v3);
    v1.mostrarPersona(v2);
    }
    
}
