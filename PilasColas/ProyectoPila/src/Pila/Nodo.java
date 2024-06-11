/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pila;

/**
 *
 * @author Invitado
 */
public class Nodo {
   private int dato;
   private Nodo ps;

    public Nodo(int dato) {
        this.dato = dato;
        this.ps = null;
    }

    public int getDato() {
        return dato;
    }

    public Nodo getPs() {
        return ps;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public void setPs(Nodo ps) {
        this.ps = ps;
    }
   
           
}
