package listaordenada;

import java.lang.management.GarbageCollectorMXBean;

public class ListaOrdenada<G> extends Lista<G> {

    public ListaOrdenada() {
        super();
    }

    public void insertarMedio(Nodo p, Nodo ant, Nodo x) {
        x.setPs(p);
        ant.setPs(x);
    }

    public void insertarFin(Nodo ant, Nodo p, Nodo x) {
        if (p == null) {
            x.setPs(null);
            ant.setPs(x);
        }
    }

    public void insertar(G entrada) {
        Nodo p = inicio();
        Nodo ant = null;
        int b = 0;

        while (p != null && b == 0) {
            if (p.getDato().equals(entrada)) {
                b = 1;
            } else {
                ant = p;
                p = p.getPs();
            }
        }
        Nodo x = new Nodo(entrada);
        if (b == 1) {
            if (p == list) {
                insertarPri(entrada);
            } else {
                insertarMedio(p, ant, x);
            }
        } else {
            if (ant == null) {
                list = x;
            } else {
                insertarFin(ant, p, x);
            }
        }
    }

    @Override
    public Nodo<G> eliminar(G elem) {
        Nodo<G> aux = null;
        Nodo<G> p = inicio();
        Nodo<G> ant = null;

        if (listaVacia()) {
            prt("Lista Vacía!!!");
            return aux;
        }
        boolean band = false;

        while (p != null && !band) {
            if (p.getDato().equals(elem)) { // Revisar, como comparo el mayor de dos elementos cuaelsquiera
                if (p.getDato() == elem) {
                    band = true;
                } else {
                    p = null;
                }
            } else {
                ant = p;
                p = p.getPs();
            }
        }

        if (band) {
            aux = quitar(p, ant);
            prt("Elemento eliminado!");
        } else {
            prt("Elemento inexistente!!!");
        }
        return aux;
    }
}
