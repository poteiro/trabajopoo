
package Entidades;

import java.util.Scanner;


public class Metodo {
    Scanner leer = new Scanner(System.in);

    public Cuenta crearCuenta(){
    Cuenta c1=new Cuenta(); 
        System.out.println("ingrese de Cuenta");
        c1.setNumCuenta(leer.nextInt());
        System.out.println("ingrese dni");
        c1.setDni(leer.nextInt());
        System.out.println("ingrese saldo");
        c1.setSaldoActual(leer.nextInt());
     return c1;   
    }  
    public void ingresar(double ingreso, Cuenta c1) {
   
        c1.setSaldoActual(c1.getSaldoActual() + (int) ingreso);
    }

    public void retirar(double retirar, Cuenta c1) {
        if (c1.getSaldoActual() > retirar) {
            c1.setSaldoActual(c1.getSaldoActual() - (int) retirar);
        } else {
            c1.setSaldoActual(0);
         }
         }
    public void extraccionRapida(Cuenta c1) {
        System.out.println("ingrese dinero a retirar");
        double retirar = leer.nextDouble();
        while (retirar > c1.getSaldoActual() * 0.2) {
            System.out.println("dinero a retirar es mayor al %20 de su saldo actual");
            System.out.println("ingrese otro monto");
            retirar = leer.nextDouble();
         }
         c1.setSaldoActual(c1.getSaldoActual()-(int)retirar);
     }
     public void consultarSaldo (Cuenta c1){
         System.out.println("el saldo disponible es:"+c1.getSaldoActual());
     }
     public void consultarDatos (Cuenta c1){
         System.out.println("numero de cuentas es: "+c1.getNumCuenta());
         System.out.println("numero de dni es: "+c1.getDni());
         System.out.println("su saldo es: "+c1.getSaldoActual());
     }
}          
    
        
        
        
     
   
    
    
    
    
   

