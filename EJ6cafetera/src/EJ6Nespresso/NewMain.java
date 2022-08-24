
package EJ6Nespresso;

import entidades.Cafetera;
import java.util.Scanner;


public class NewMain {
   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        Cafetera cafetera = new Cafetera(0, 1000);
        int opcion,opcionSubMenu,agregar;
        do{
        System.out.println("------MENU EXPRESSO-----");
        System.out.println("1-Llenar cafetera");
        System.out.println("2-servir cafetera");
        System.out.println("3-Vaciar cafetera");
        System.out.println("4-Agregar cafe");
        System.out.println("5-_Cuantocafe queda?");
        System.out.println("SALIR");
        opcion = leer.nextInt();
        switch (opcion) {
            case 1:
               cafetera.llenarCafetera();
               break;
            case 2:
                do{
                System.out.println("----SUB MENU----");
                System.out.println("1-taza de 150cc");
                System.out.println("2-taza de 250cc");
                    System.out.println("3-taza de 300cc");
                    opcionSubMenu = leer.nextInt();
                    switch (opcionSubMenu) {
                        case 1:
                            cafetera.servirTaza(150);
                            break;
                        case 2:
                            cafetera.servirTaza(250);
                            break;
                        case 3:
                            cafetera.servirTaza(300);
                            break;
                        default:
                            System.out.println("ingrese opcion correcta");

                    }

                } while (opcionSubMenu < 1 || opcionSubMenu > 3);
                break;
            case 3:
                cafetera.vaciarCafetera();
                break;
            case 4:
                System.out.println("ingrese cafe a la cafetera");
                cafetera.agregarCafe(leer.nextInt());
            case 5:
               cafetera.mostrarCantidadDeCafe();
                break;
            case 6:
                System.out.println("SALIENDO");
                break;
                default:
                    System.out.println("opcion incorrecta");
                    
                
        }

        }while (opcion !=6);
    } 
}