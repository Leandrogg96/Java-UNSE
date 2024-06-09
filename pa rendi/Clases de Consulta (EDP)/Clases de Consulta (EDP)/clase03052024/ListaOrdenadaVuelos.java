package clase03052024;

/**
 *
 * @author char.ly
 */
public class ListaOrdenadaVuelos extends ListaSimpleVuelo {

    public void insertar(Vuelo dato) {
        NodoVuelo p = inicio;
        NodoVuelo ant = null;
        boolean busqueda = false;

        while (p != null && !busqueda) {
            int comparacion = dato.getCodigoVuelo() - p.getDato().getCodigoVuelo();
            if (comparacion < 0) {
                busqueda = true;
            } else {
                ant = p;
                p = p.getPs();
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

    public void insertarMedio(NodoVuelo p, NodoVuelo ant, Vuelo dato) {

        NodoVuelo n = new NodoVuelo(dato);
        n.setPs(p);
        ant.setPs(n);
    }

    /**
     * Inserta un nodo al final de la lista (p == null)
     *
     * @param ant
     * @param dato
     */
    public void insertarUltimo(NodoVuelo ant, Vuelo dato) {
        NodoVuelo n = new NodoVuelo(dato);
        ant.setPs(n);
    }
}
