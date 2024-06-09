/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package datos;

import entradaDatos.EntradaSalida;

/**
 *
 * @author Kelly
 */
public class Moto {
    private int patente;
    private String marca;
    private int modelo;

    public Moto() {
        this.patente=0;
        this.marca= " ";
        this.modelo=0;
    }
  
    
    public Moto(int patente, String marca, int  modelo) {
        this.patente = patente;
        this.marca = marca;
        this.modelo = modelo;
      
    }

    public int getPatente() {
        return patente;
    }

    public String getMarca() {
        return marca;
    }

    public int getModelo() {
        return modelo;
    }

  

    public void setPatente(int patente) {
        this.patente = patente;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public void setModelo(int modelo) {
        this.modelo = modelo;
    }

      public void ingresarDatosMoto() {
        
        EntradaSalida.mostrarMensaje("Ingrese patente : ");
        setPatente(EntradaSalida.leerInt());
        EntradaSalida.mostrarMensaje("Ingrese marca: ");
        setMarca( EntradaSalida.leerString());
        EntradaSalida.mostrarMensaje("Ingrese modelo: ");
        setModelo(EntradaSalida.leerInt());
       
        
         
}
      
      public String toString(){
          return "patente " + patente+ " marca: "+ marca+ " modelo "+modelo;
      }
}