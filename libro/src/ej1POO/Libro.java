/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ej1POO;

import java.util.Scanner;

/**
 *
 * @author Jime
 */
public class Libro {

    public int isbn;
    public String titulo;
    public String autor;
    public int numPagina;
    public Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Libro() {
    }

    public Libro(int isbn, String titulo, String autor, int numPagina) {
        this.isbn = isbn;
        this.titulo = titulo;
        this.autor = autor;
        this.numPagina = numPagina;
    }

    public int getIsbn() {
        return isbn;
    }

    public void setIsbn(int isbn) {
        this.isbn = isbn;
    }

    public String getTitulo() {
        return titulo;
    }

    public void setTitulo(String titulo) {
        this.titulo = titulo;
    }

    public String getAutor() {
        return autor;
    }

    public void setAutor(String autor) {
        this.autor = autor;
    }

    public int getNumPagina() {
        return numPagina;
    }

    public void setNumPagina(int numPagina) {
        this.numPagina = numPagina;
    }
    

    @Override
    public String toString() {
        return "Libro{" + "isbn=" + isbn + ", titulo=" + titulo + ", autor=" + autor + ", numPagina=" + numPagina + '}';
    }
    
   public void ingresoLibro (){
       
       Libro libro1=new Libro(); 
       
        System.out.println("ingrese el isbn del libro ");
        libro1.setIsbn(leer.nextInt());
        System.out.println("ingrese el titulo del libro");
        libro1.setTitulo(leer.next());
        System.out.println("ingrese el autor del libro ");
        libro1.setAutor(leer.next());
        System.out.println("ingrese el numPagina del libro ");
        libro1.setNumPagina(leer.nextInt());
            System.out.println(libro1.toString());
       
   }

    public void ingresoLibro2 (){
       
       Libro libro1=new Libro(); 
       
        System.out.println("ingrese el isbn del libro ");
        libro1.setIsbn(leer.nextInt());
        System.out.println("ingrese el titulo del libro");
        libro1.setTitulo(leer.next());
        System.out.println("ingrese el autor del libro ");
        libro1.setAutor(leer.next());
        System.out.println("ingrese el numPagina del libro ");
        libro1.setNumPagina(leer.nextInt());
            System.out.println(libro1.toString());
       
   }
    
}
