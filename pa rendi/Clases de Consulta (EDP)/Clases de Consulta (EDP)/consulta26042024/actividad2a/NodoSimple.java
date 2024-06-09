package consulta26042024.actividad2a;

/**
 *
 * @author char.ly
 */
public class NodoSimple {
    
    private NodoSimple siguiente;
    private Taxi dato;

    public NodoSimple(Taxi dato) {
        this.dato = dato;
        siguiente = null;
    }

    public NodoSimple getSiguiente() {
        return siguiente;
    }

    public void setSiguiente(NodoSimple siguiente) {
        this.siguiente = siguiente;
    }

    public Taxi getDato() {
        return dato;
    }

    public void setDato(Taxi dato) {
        this.dato = dato;
    }
    
}
