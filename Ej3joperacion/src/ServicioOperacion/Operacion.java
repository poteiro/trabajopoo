/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ServicioOperacion;

import java.util.Scanner;


public class Operacion{

    Scanner leer = new Scanner(System.in);
    private int num1;
    private int num2;

    public Operacion() {
    }
    public Operacion(int num1, int num2) {
        this.num1 = num1;
        this.num2 = num2;
    }
    public int getNum1() {
        return num1;
    }
    public void setNum1(int num1) {
        this.num1 = num1;
    }
    public int getNum2() {
        return num2;
    }
    public void setNum2(int num2) {
        this.num2 = num2;    
    }
   public void crearOperacion(){
       System.out.println("ingrese numero1 " );
       num1=leer.nextInt();
       System.out.println("ingrese numero2 ");
       num2=leer.nextInt();   
    }
    public int sumar() {
        int suma;
        suma = num1 + num2;
        return suma;
    }
    public int restar() {
        int resto;
        resto = num1 - num2;
        return resto;
    }
    public int multiplicar() {
        int multi = 0;
        if (num1 != 0 && num2 != 0) {
            multi = num1 * num2;
        }
        return multi;
    }
    public double dividir() {
        int divid = 0;
        if (num1 != 0 && num2 != 0) {
            divid = num1 / num2;
        }
        return divid;
    }

   
   
}
     
      
    
    

