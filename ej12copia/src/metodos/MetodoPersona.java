
package metodos;
import entidad.Persona;
import java.util.Date;
import java.util.Scanner;


public class MetodoPersona {
     Scanner leer = new Scanner(System.in).useDelimiter("\n");
     
    public Persona crearPersona(){
        System.out.println("ingrese su nombre");
        String nombre = leer.next();
        System.out.println("ingrese su fecha de nacimiento");
        System.out.println("ingrese dia"); 
        int dia=leer.nextInt();
        
        System.out.println("ingrese mes");
        int mes=leer.nextInt();
        
        System.out.println("ingrese año"); 
        int anio=leer.nextInt();
        
        Date fecha=new Date(anio-1900, mes-1,dia);
        System.out.println(fecha);
        return new Persona(nombre,fecha);
        
}
public int calcularEdad(Persona p1){
    Date fechaActual=new Date();
    int edad=(fechaActual.getYear()- p1.getFechaNacimiento().getDate());
    edad++;
 return edad;
}
  

  
    public int menorQue (Persona p, int edad){
        
int es;
if (calcularEdad(p)< edad){
es=-1;

}else if (calcularEdad(p)==edad){
es=0;

}else{
es=1;

}
return es;

}
public void mostrarPersona(Persona p1){        
    System.out.println("");
}

    
}
