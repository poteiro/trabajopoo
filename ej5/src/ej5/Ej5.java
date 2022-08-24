
package ej5;

import Entidades.Cuenta;
import Entidades.Metodo;
import java.util.Scanner;


public class Ej5 {

  
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
      Metodo m1=new Metodo();
      Cuenta c1=m1.crearCuenta();
      int menu;
      do{
          System.out.println("ingrese opcion");
          System.out.println("1 informacion de la cuenta");
          System.out.println("2 saldo");
          System.out.println("3 retirar dinero");
          System.out.println("4 extraccion rapida");
          System.out.println("5 depositar");
          System.out.println("6 SALIR");
         menu= leer.nextInt();
       switch (menu){
      case 1:
      m1.consultarSaldo(c1);
      break;
      case 2:
      m1.consultarSaldo(c1);
      break;
      case 3:
      System.out.println("cuanto dinero retira ");
      double retira = leer.nextDouble();
      m1.retirar(retira, c1);
      break;
      case 4:
      m1.extraccionRapida(c1);
      break;
      case 5:
      System.out.println("cuanto dinero ingresa ");
      double ingresa =leer.nextDouble();
      m1.ingresar(ingresa, c1);
      break;
      case 6:
      menu=6;    
      }
       
      }while (menu!=6);  
    }
    } 

