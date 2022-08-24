
package ej10arreglo;


import java.util.Arrays;
import java.util.Scanner;


public class Ej10arreglo {

    
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        double[] a = new double[50];
        double[] b = new double[20];

        for (int i = 0; i < 50; i++) {
            a[i] = Math.floor(Math.random()*100);

        }
        System.out.println("vector desordenado");
        
        for (int i = 0; i < 50; i++) {
            System.out.println("[" + a[i] + "]");
        }
        System.out.println("vector ordenado de mayor a menor");
        for (int i = 0; i < 50; i++) {
            Arrays.sort(a);
            System.out.println(a[i]);
                    
        }
        System.out.println("-----------------");
        System.arraycopy(a,0,b,0,10);
        
        for (int i = 10; i < 20; i++) {
           b[i]=0.5; 
        }
        for (int i = 0; i < 20; i++) {
            System.out.println(b[i]);
        }
    }
    
}
