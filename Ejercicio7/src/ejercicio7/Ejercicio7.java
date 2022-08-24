
package ejercicio7;

import persona.Persona;
import servicioPersona.ServicioPersona;


public class Ejercicio7 {

   
    public static void main(String[] args) {
        ServicioPersona c1 = new ServicioPersona();
        Persona p1 = c1.crearPersona();
       
     
        c1.calcularIMC(p1);
        c1.esMayorDeEdad(p1);
        Persona p2 = c1.crearPersona();
        c1.calcularIMC(p2);
        c1.esMayorDeEdad(p2);
        Persona p3 = c1.crearPersona();
        c1.calcularIMC(p3);
        c1.esMayorDeEdad(p3);
        Persona p4 = c1.crearPersona();
        c1.calcularIMC(p4);
        c1.esMayorDeEdad(p4);



    }
    
}
