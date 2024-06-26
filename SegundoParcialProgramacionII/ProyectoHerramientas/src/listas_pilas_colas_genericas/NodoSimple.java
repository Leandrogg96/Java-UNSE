package listas_pilas_colas_genericas;

/**
 *
 * @author char.ly
 * @param <T> El parametro T debe implementar el metodo compareTo de la interfaz
 * comparable para poder ser localizado en las diferentes estructuras de datos
 * que esten compuestas por nodos.
 */
public class NodoSimple<T extends Comparable<T>> {

    private NodoSimple<T> siguiente;
    private T dato;

    public NodoSimple(T dato) {
        this.siguiente = null;
        this.dato = dato;
    }

    public NodoSimple<T> getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSimple<T> siguiente) {
        this.siguiente = siguiente;
    }

    public T getDato() {
        return dato;
    }

    public void setDato(T dato) {
        this.dato = dato;
    }

}
