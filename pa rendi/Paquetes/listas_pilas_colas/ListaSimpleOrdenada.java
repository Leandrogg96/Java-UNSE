package listas_pilas_colas;

/**
 *
 * @author char.ly
 */
public class ListaSimpleOrdenada extends ListaSimple {

    public ListaSimpleOrdenada() {
        super();
    }

    /**
     * Inserta ordenadamente un dato comparable en una lista
     *
     * @param dato
     */
    public void insertar(Comparable dato) {

        NodoSimple p = inicio;
        NodoSimple ant = null;
        boolean busqueda = false;

        while (p != null && !busqueda) {
            Comparable c = (Comparable) p.getDato();
            int comparacion = dato.compareTo(c);
            if (comparacion < 0) {
                busqueda = true;
            } else {
                ant = p;
                p = p.getSiguiente();
            }
        }

        if (p == inicio) {
            insertarFrente(dato);
        } else {
            if (busqueda) {
                insertarMedio(p, ant, dato);
            } else {
                insertarUltimo(ant, dato);
            }
        }

    }

    /**
     * Inserta un nodo entre los nodos ant y p
     *
     * @param p
     * @param ant
     * @param dato
     */
    public void insertarMedio(NodoSimple p, NodoSimple ant, Comparable dato) {

        NodoSimple n = new NodoSimple(dato);
        n.setSiguiente(p);
        ant.setSiguiente(n);
    }

    /**
     * Inserta un nodo al final de la lista (p == null)
     *
     * @param ant
     * @param dato
     */
    public void insertarUltimo(NodoSimple ant, Comparable dato) {
        NodoSimple n = new NodoSimple(dato);
        ant.setSiguiente(n);
    }

    /**
     * Busca un nodo en una lista ordenada
     *
     * @param dato comparable a buscar
     * @return el nodo que contiene al dato buscado. Null si no se encontro el
     * elemento
     */
    @Override
    public NodoSimple buscar(Comparable dato) {
        NodoSimple n = null;
        if (estaVacia()) {
            System.out.println("Lista Vacía!!!");
        } else {
            NodoSimple p = inicio;
            NodoSimple ant = null;
            boolean busqueda = false;
            while (p != null && !busqueda) {
                int comparacion = dato.compareTo((Comparable) p.getDato());
                if (comparacion > 0) {
                    ant = p;
                    p = p.getSiguiente();
                } else {
                    if (comparacion == 0) {
                        busqueda = true;
                        n = p;
                    } else {
                        p = null;
                    }
                }
            }
            if (busqueda) {
                System.out.println("Nodo encontrado!");
            } else {
                System.out.println("Nodo inexistente!!!");
            }
        }
        return n;
    }

    /**
     * Elimina un nodo de una lista ordenada.
     *
     * @param dato comparable a eliminar
     * @return el nodo eliminado que contiene el dato comparable. Null si no
     * encontro
     */
    @Override
    public NodoSimple eliminar(Comparable dato) {
        NodoSimple n = null;
        boolean busqueda = false;
        if (estaVacia()) {
            System.out.println("Lista Vacía!!!");
        } else {
            NodoSimple p = inicio;
            NodoSimple ant = null;
            while (p != null && !busqueda) {
                int comparacion = dato.compareTo((Comparable) p.getDato());
                if (comparacion > 0) {
                    ant = p;
                    p = p.getSiguiente();
                } else {
                    if (comparacion == 0) {
                        busqueda = true;
                        n = quitar(ant, p);
                    } else {
                        p = null;
                    }
                }
            }
            if (busqueda) {
                System.out.println("Nodo eliminado!");
            } else {
                System.out.println("El nodo no se encuentra en la lista!");
            }
        }

        return n;
    }

}
