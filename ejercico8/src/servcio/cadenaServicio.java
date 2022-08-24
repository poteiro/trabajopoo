
package servcio;


import cadena.cadena;
import java.util.Scanner;


public class cadenaServicio {

    public cadena crearCadena() {
        Scanner leer = new Scanner(System.in);
        System.out.println("porfavor ingrese una frase");
        String cadena = leer.nextLine();
        int longitud = cadena.length();
        return new cadena(cadena, longitud);                     
    
    }  
   public void mostrarVocales(cadena ncadena){
   int cont=0;
   String frase= ncadena.getFrase().toUpperCase();
       for (int i = 0; i < frase.length(); i++) {
       if (frase.charAt(i)=='A'||frase.charAt(i)=='E'|| frase.charAt(i)=='I'||frase.charAt(i)=='O'||frase.charAt(i)=='U'){
           cont++;
          System.out.print(frase.charAt(i)+ "  ");
       }
       }
       //System.out.println("");
       System.out.println("hay " + cont + " vocales en la frase");
      } 
    public void invertirFrase (cadena ncadena){
        String frase=ncadena.getFrase();
        for (int i = ncadena.getFrase().length()-1; i >=0; i--) {
            System.out.print(frase.charAt(i));
            
                    }
          }
    public void vecesRepetido(cadena ncadena) {
        Scanner leer = new Scanner(System.in);
        int cont = 0;
        System.out.println("ingrese la frase")                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                                         ;
        String letraIngresada = leer.nextLine();
        for (int i = 0; i < ncadena.getLongitud(); i++) {
            if (ncadena.getFrase().charAt(i) == letraIngresada.charAt(0)) {

            }

        }
        System.out.println("");
        }
    public void compararLongitud (cadena ncadena){
        String frase=ncadena.getFrase();
        if (frase.length() == ncadena.getLongitud()) {
            System.out.println("La segunda frase tiene la misma longitud que la primera.");
        } else if (frase.length() > ncadena.getLongitud()) {
            System.out.println("La segunda frase es más larga que la primera.");
        } else {
            System.out.println("La segunda frase es más corta que la primera."); 
    }
    }  
    public void unirFrase (cadena ncadena){
        String frase=ncadena.getFrase();
        System.out.println("frase resultante luego de la union: " + ncadena.getLongitud() + " " + frase);
    }
    public void reemplazar(cadena ncadena) {
        String letra = ncadena.getFrase();
        System.out.println("frase resultante luego de reemplazar la a:" + ncadena.getFrase().replaceAll("a", letra));
    }

    public boolean contiene(cadena ncadena) {
        String letra = ncadena.getFrase();
        return ncadena.getFrase().contains(letra);
    }
}    
      