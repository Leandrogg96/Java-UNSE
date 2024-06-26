package listas_pilas_colas_genericas;

/**
 * Lista simple generica. Revisar los diagramas de flujo en: 
 * https://drive.google.com/file/d/1pWgeqd9jYU29eUDOm2Q5FWU2faLpiOGD/view?usp=drive_link
 * @author char.ly
 */
public class ListaSimple {

    protected NodoSimple inicio;

    public ListaSimple() {
        this.inicio = null;
    }

    /**
     * 
     * @return verdadero si la lista esta vacia
     */
    public boolean estaVacia() {
        return inicio == null;
    } 

    /**
     * Inserta un elemento al frente de una lista.
     *
     * @param elemento 
     */
    public void insertarFrente(Comparable elemento) {
        NodoSimple n = new NodoSimple(elemento);
        if (!estaVacia()) {
            n.setSiguiente(inicio);
        }
        inicio = n;
    }

    /**
     * Muestra los elementos de la lista. Los elementos deben tener implementado
     * el metodo toString.
     */
    public void mostrar() {
        NodoSimple n = inicio;
        while (n != null) {
            System.out.println(n.getDato().toString());
            n = n.getSiguiente();
        }
    }

    /**
     * Busca un nodo de una lista simple. Compara con el atributo deinido para 
     * comparar en el metodo compareTo().
     *
     * @param buscado elemento buscado
     * @return El nodo que referencia al objeto buscado. Null si no lo encontro.
     */
    public NodoSimple buscar(Comparable buscado) {

        NodoSimple n = null;
        NodoSimple p = inicio;
        boolean busqueda = false;
        while (p != null && !busqueda) {
            if (buscado.compareTo(p.getDato()) == 0) {
                busqueda = true;
                n = p;
            } else {
                p = p.getSiguiente();
            }
        }
        return n;
    }

    /**
     * Dado un dato comparable elimina un nodo de la lista
     *
     * @param e dato a comparar
     * @return El nodo eliminado.
     */
    public NodoSimple eliminar(Comparable e) {
        NodoSimple n = null;
        if (!estaVacia()) {
            NodoSimple p = inicio;
            NodoSimple ant = null;
            boolean busqueda = false;
            while (p != null & !busqueda) {
                if (e.compareTo(p.getDato()) == 0) {
                    busqueda = true;
                } else {
                    ant = p;
                    p = p.getSiguiente();
                }
            }
            if (busqueda == true) {
                n = quitar(ant, p);
            } else {
                System.out.println("Elemento inexistente");;
            }
        } else {
            System.out.println("Lista vacia!");
        }

        return n;
    }

    /**
     * Quita un nodo de la lista
     *
     * @param ant
     * @param p
     * @return El nodo eliminado.
     */
    public NodoSimple quitar(NodoSimple ant, NodoSimple p) {
        NodoSimple n = p;
        if (p == inicio) {
            inicio = p.getSiguiente();
        } else {
            ant.setSiguiente(p.getSiguiente());
        }
        return n;
    }

    public NodoSimple getInicio() {
        return inicio;
    }

    public void setInicio(NodoSimple inicio) {
        this.inicio = inicio;
    }
}
