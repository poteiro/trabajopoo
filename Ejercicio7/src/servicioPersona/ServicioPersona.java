
package servicioPersona;

import java.util.Scanner;
import persona.Persona;


public class ServicioPersona {
    Scanner leer = new Scanner(System.in).useDelimiter("\n");
    public Persona crearPersona(){
        //INSTARCIAR EL OBJETO
        Persona p1=new Persona();
        System.out.println("diga el nombre de la persona");
        p1.setNombre(leer.next());
        System.out.println("diga la edad de la persona");
        p1.setEdad(leer.nextInt());
        System.out.println("ingrese el sexo de la persona");
        System.out.println("responda con H=Hombre, M=Mujer, O=Otro");
        p1.setSexo(leer.next().toUpperCase());
       
        if ("H".equals(p1.getSexo()) || "M".equals(p1.getSexo()) || "O".equals(p1.getSexo())) {
            System.out.println("Correcto");

        } else {
            System.out.println("Incorrecto");
        }
        System.out.println("ingresa el peso de lapersona");
        p1.setPeso(leer.nextDouble());
        System.out.println("ingrese la altura de la persona");
        p1.setAltura(leer.nextDouble());
        return p1;
    }
        public int calcularIMC(Persona p1){
        double imc=p1.getPeso()/Math.pow(p1.getAltura(),2);
        int valor=0;
        if(imc<20){
            System.out.println(valor);
        }else if (imc>=20 && imc==25){
            System.out.println(valor);
        }  else if(imc>25){
            System.out.println(valor);   
             }
        System.out.println(imc);
        return valor;
        }
         public void esMayorDeEdad(Persona p1){
         boolean mayor;  
         if(p1.getEdad()>=18){
             System.out.println("Es mayor de edad");
             mayor=true;
         }else{
             System.out.println("Es menor de edad");
             mayor=false;
         }
           System.out.println("---------------------------");    
        
    }
    
}
