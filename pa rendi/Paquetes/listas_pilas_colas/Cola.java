package listas_pilas_colas;

/**
 *
 * @author char.ly
 */
public class Cola {

    private NodoSimple frente;
    private NodoSimple fondo;
    private int cantidad;

    public Cola() {
        frente = null;
        fondo = null;
        cantidad = 0;
    }

    public boolean estaVacia() {
        return frente == null && fondo == null;
    }

    /**
     * Inserta un objeto en una cola
     *
     * @param c Objeto a insertar
     */
    public void insertar(Comparable c) {
        NodoSimple n = new NodoSimple(c);
        if (!estaVacia()) {
            fondo.setSiguiente(n);
        } else {
            frente = n;
        }
        cantidad++;
        fondo = n;
    }

    /**
     * Elimina el frente de una cola
     *
     * @return El nodo que representa al frente de la cola
     */
    public NodoSimple eliminar() {
        NodoSimple n = frente;
        if (!estaVacia()) {
            frente = frente.getSiguiente();
            cantidad--;
            return (n);
        } else {
            return null;
        }

    }

    /**
     * Muestra los elementos de una cola por pantalla.
     */
    public void mostrar() {
        Cola temp = new Cola();
        while (!this.estaVacia()) {
            Comparable c = (Comparable) this.eliminar().getDato();
            System.out.println(c.toString());
            temp.insertar(c);
        }
        retornar(temp);
    }

    /**
     * Metodo auxiliar para retornar el estado de la cola
     *
     * @param aux Cola de la cual se debe retornar
     */
    public void retornar(Cola aux) {
        while (!aux.estaVacia()) {
            this.insertar(aux.eliminar().getDato());
        }
    }
}
