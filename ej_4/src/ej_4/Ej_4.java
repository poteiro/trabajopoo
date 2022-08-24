
package ej_4;


public class Ej_4 {

    
    public static void main(String[] args) {
       Metodo m1=new Metodo();
       Rectangulo f1= m1.crearRectangulo();
       
        System.out.println("el valor del perimetro es:"+m1.perimetro(f1));
        System.out.println("el valor de la superficie es: "+m1.superficie(f1));
        m1.dibujar(f1);
        
       
    }
    
}
