
package mascotaservicio;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import mascotaentidades.mascota;


public class servicioMascota {
    private final Scanner leer; 
    private final List<String> mascotas;

    public servicioMascota() {
        this.leer = new Scanner(System.in).useDelimiter("\n");
        this.mascotas = new ArrayList();
    }
   public void crearMascota(){
       
       System.out.println("intruducir nombre");
       String nombre =leer.next();
       System.out.println("introducir apodo");
       String apodo =leer.next();
       System.out.println("introducir tipo");
       String tipo =leer.next();
      String mascota = nombre + " " + apodo + " " + tipo;
    mascotas.add(mascota); 
    
   } 
   public void mostrarMascota(){
       System.out.println("las mascotas de la lista son :");
     for (String aux:mascotas ){
         System.out.println(aux);
     }
       System.out.println("cantidad = " + mascotas.size());    
     }     
   } 

