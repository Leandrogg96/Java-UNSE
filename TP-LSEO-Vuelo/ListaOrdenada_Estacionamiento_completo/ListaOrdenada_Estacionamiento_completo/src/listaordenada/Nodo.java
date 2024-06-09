package listaordenada;

import datos.*;


public class Nodo {
    Ticket dato1;
    Moto dato2;
    Cliente dato;
    private Nodo ps;

    public Nodo(Cliente elem) {
        dato = elem;
        ps = null;
    }

   
    public Nodo(Ticket dato1) {
        this.dato1 = dato1;
        this.ps = null;
    }

    public Nodo(Moto dato2) {
        this.dato2 = dato2;
        this.ps = null;
    }

    public Ticket getDato1() {
        return dato1;
    }

    public void setDato1(Ticket dato1) {
        this.dato1 = dato1;
    }

    public Moto getDato2() {
        return dato2;
    }

    public void setDato2(Moto dato2) {
        this.dato2 = dato2;
    }

    public Cliente getDato() {
        return dato;
    }

    public void setDato(Cliente dato) {
        this.dato = dato;
    }

    public Nodo getPs() {
        return ps;
    }

    public void setPs(Nodo ps) {
        this.ps = ps;
    }

  
}
