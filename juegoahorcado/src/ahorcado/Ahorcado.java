
package Ahorcado;

import java.util.Scanner;


public class Ahorcado {
    private String [] palabra;
    private String[] palabraaux;
    private int cantEncontradas;
    private int cantJugadas;

    public Ahorcado() {
    }

    public Ahorcado(String[] palabra, String[] palabraaux, int cantEncontradas, int cantJugadas) {
        this.palabra = palabra;
        this.palabraaux = palabraaux;
        this.cantEncontradas = cantEncontradas;
        this.cantJugadas = cantJugadas;
    }

    public String[] getPalabra() {
        return palabra;
    }

    public void setPalabra(String[] palabra) {
        this.palabra = palabra;
    }

    public String[] getPalabraaux() {
        return palabraaux;
    }

    public void setPalabraaux(String[] palabraaux) {
        this.palabraaux = palabraaux;
    }

    public int getCantEncontradas() {
        return cantEncontradas;
    }

    public void setCantEncontradas(int cantEncontradas) {
        this.cantEncontradas = cantEncontradas;
    }

    public int getCantJugadas() {
        return cantJugadas;
    }

    public void setCantJugadas(int cantJugadas) {
        this.cantJugadas = cantJugadas;
    }
     public void crearJuego(){
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("ingrese la palabra para comenzar el juego ");
        String frase=leer.next();
        System.out.println("ingrese la cantidad permitidas ");
        this.cantJugadas=leer.nextInt();
        this.cantEncontradas=0;
        this.palabra=new String[frase.length()];
        this.palabraaux=new String[frase.length()];
        for (int i = 0; i < frase.length(); i++) {
           this.palabra[i]=frase.substring(i,i+1);
           this.palabraaux[i]="_";
        }              
        }
    public void longitud(){
        System.out.println("la longitud de la palabra es:"+this.palabra.length);
    }
    public boolean buscarLetra(String letra){
        boolean band=false;
        int cont=0;
        for (int i = 0; i <this.palabra.length; i++) {
            if (this.palabra[i].equals(letra)) {
               cont++;
               band=true;
            }
        }
        if (cont==0){
            System.out.printf("la letra %s no se encuentra en la palabra\n",letra);
        }else{ 
            System.out.printf("la letra %s se encuentra en la palabra %d veces \n",letra,cont);
        }
        return band;
    }

    public boolean encontradas(String letra){
        boolean band=false;
         for (int i = 0; i <this.palabra.length; i++) {
            if (this.palabra[i].equals(letra)) {
                if(this.palabraaux[i].equals("_")){
                    this.palabraaux[i]=letra;
                    this.cantEncontradas++;
                }
                band=true;
            }
         }
       if(!band){
           this.cantJugadas--;
       }
       return buscarLetra(letra);
       }
    public void intentos(){
        System.out.printf("le quedan %d intentos \n",this.cantJugadas);  
    }
    public void mostrarAhorcado(){
        for (int i = 0; i <this.palabraaux.length; i++) {
            System.out.println(this.palabraaux[i]+" ");
        }
        System.out.println("");
    }
    public void juego(){
        Scanner leer = new Scanner(System.in)       .useDelimiter("\n");
        String letra;
        crearJuego();
        do{
            mostrarAhorcado();
            intentos();
            longitud();
            System.out.println("ingrese letra a buscar en la palabra:");
            letra=leer.next();
            encontradas(letra);
        }while(this.cantJugadas!=0 || this.cantEncontradas!=this.palabra.length);
        
        if (this.cantEncontradas==this.palabra.length) {
            System.out.println("palabra encontrada");
            mostrarAhorcado();
        }else{
            System.out.println("palabra no encontrada");
            
            
        }   

    }

    
}
