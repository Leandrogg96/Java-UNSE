package Bibliotek4;

import java.util.Scanner;

public class Libro {
    private int cod;
    private String titulo;
    private String autor;
    private int numLibSt;
    private int numLibPres;

    public Libro(){
        leerDatosLibro();
    }

    public void leerDatosLibro(){

        System.out.println("Ingresa el codigo del libro: ");
        this.cod = validarEntero();

        System.out.println("Ingresa el titulo del libro: ");
        this.titulo = validarString();

        System.out.println("Ingresa el autor del libro: ");
        this.autor = validarString();

        System.out.println("Ingresa la cantidad de libros");
        this.numLibSt = validarEntero();
    }

    public Libro(int cod, String titulo, String autor, int numLibSt, int numLibPres) {
        this.cod = cod;
        this.titulo = titulo;
        this.autor = autor;
        this.numLibSt = numLibSt;
        this.numLibPres = numLibPres;
    }

    // Metodo para modificar atributos ("numLibSt" y "numLibPres") cuando se presta un libro
    public void prestarLibro() {
        if (numLibSt > 0) {
            numLibSt--;
            numLibPres++;
            System.out.println("Libro prestado: " + titulo);
        } else {
            System.out.println("El libro no esta disponible en este momento.");
        }
    }

    // Metodo para modificar atributos ("numLibSt") cuando se devuelve un libro
    public void devolverLibro() {
        numLibSt++;
        System.out.println("Libro devuelto: " + titulo);
    }

    public int getCod() {
        return cod;
    }

    public void setCod(int cod) {
        this.cod = cod;
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

    public int getNumLibSt() {
        return numLibSt;
    }

    public void setNumLibSt(int numLibSt) {
        this.numLibSt = numLibSt;
    }

    public int getNumLibPres() {
        return numLibPres;
    }

    public void setNumLibPres(int numLibPres) {
        this.numLibPres = numLibPres;
    }

    public int validarEntero() {
        Scanner lectura = new Scanner(System.in);
        while (!lectura.hasNextInt()) {
            String input = lectura.next();
            System.out.println(input + " no es un numero entero. Por favor, ingrese un numero entero.");
            System.out.print("Ingrese un numero entero: ");
        }
        return lectura.nextInt();
    }

    public String validarString() {
        Scanner lectura = new Scanner(System.in);
        while (!lectura.hasNextLine()) {
            String input = lectura.next();
            System.out.println(input + " no es una cadena de caracteres. Por ingresa valores validos: ");
        }
        return lectura.nextLine();
    }
}
