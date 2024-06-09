package listagenerica;
import java.util.Iterator;

public class ListaGen<T extends Comparable<T>> implements Iterable<T>{

    protected Nodo<T> list;

//	************************************* CONSTRUCTOR ******************************************************
    public ListaGen() {
        list = null;
    }

//	***************************************** INICIO *******************************************************
    public Nodo<T> inicio() {
        return list;
    }

//	***************************************** INICIO *******************************************************
    public boolean listaVacia() {
        return (list == null);
    }

//	********************************** INSERTAR AL PRINCIPIO ***********************************************
    public void insertarPri(T elem) {
        Nodo<T> x = new Nodo<T>(elem);
        if (list == null) {
            list = x;
        } else {
            x.setPs(list);
            list = x;
        }
    }

//	******************************************** QUITAR ****************************************************
    public Nodo<T> quitar(Nodo<T> p, Nodo<T> ant) {
        Nodo<T> x = p;

        if (p == list) {
            list = p.getPs();
        } else {
            ant.setPs(p.getPs());

        }
        return x;
    }

    public Nodo<T> eliminar(T elem) {
        Nodo<T> x = null;
        Nodo<T> p = list;
        Nodo<T> ant = null;
        if(list == null)
            return x;
        boolean band = false;
        while (p != null && !band) {
            if (p.getDato() == elem) {
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
        Nodo<T> p = inicio();
        while (p != null) {
            EntradaSalida.mostrarMensaje(p.getDato() + "");
            p = p.getPs();
        }
    }
    @Override
    public Iterator<T> iterator() {
        IteradorLista<T> iterador = new IteradorLista<>();
        return iterador;
    }
    
    protected class IteradorLista<T extends Comparable<T>> implements Iterator<T> {

        private Nodo<T> p;

        public IteradorLista() {
            p = (Nodo<T>)list;
        }

        @Override
        public boolean hasNext() {
            return p != null;
        }

        @Override
        public T next() {
            T dato = p.getDato();
            p = p.getPs();
            return dato;
        }
        
        @Override
        public void remove(){}
    }
}