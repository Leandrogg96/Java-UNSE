package listas_pilas_colas_genericas;

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
        return frente == null;
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
            return n;
        } else {
            return null;
        }

    }

}
