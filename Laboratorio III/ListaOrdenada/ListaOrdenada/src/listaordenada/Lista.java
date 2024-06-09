package listaordenada;
import java.io.*;

public class Lista<G> {

    protected Nodo<G> list;

//	************************************* CONSTRUCTOR ******************************************************
    public Lista() {
        list = null;
    }

//	***************************************** INICIO *******************************************************
    public Nodo inicio() {
        return list;
    }

//	***************************************** INICIO *******************************************************
    public boolean listaVacia() {
        return (list == null);
    }

//	********************************** INSERTAR AL PRINCIPIO ***********************************************
    public void insertarPri(G elem) {
        Nodo x = new Nodo(elem);
        if (list == null) {
            list = x;
        } else {
            x.setPs(list);
            list = x;
        }
    }

    public void prt(String s) {
        System.out.println(s);
    }

//	******************************************** QUITAR ****************************************************
    public Nodo<G> quitar(Nodo<G> p, Nodo<G> ant) {
        Nodo<G> x = p;

        if (p == list) {
            list = p.getPs();
        } else {
            ant.setPs(p.getPs());
        }
        return x;
    }

    public Nodo<G> eliminar(G elem) {
        Nodo<G> x = null;
        Nodo<G> p = list;
        Nodo<G> ant = null;
        if(list == null)
            return x;
        boolean band = false;
        while (p != null && !band) {
            if (p.getDato().equals(elem)) {
                band = true;
            } else {
                ant = p;
                p = p.getPs();
            }
        }
        if (band == true) {
            quitar(p, ant);
            x = p;
        }
        return x;
    }

    public void visualizar() {
        Nodo p = inicio();
        while (p != null) {
            prt(p.getDato() + "");
            p = p.getPs();
        }
    }

}
