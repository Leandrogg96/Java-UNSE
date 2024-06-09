package consulta26042024.actividad2a;

/**
 *
 * @author char.ly
 */
public class ListaSimpleTaxi {

    private NodoSimple inicio;

    public ListaSimpleTaxi() {
        inicio = null;
    }

    /**
     *
     * @return verdadero si la lista esta vacia
     */
    public boolean estaVacia() {
        return inicio == null;
    }

    public void insertar(Taxi taxi) {
        NodoSimple x = new NodoSimple(taxi);
        if (inicio != null) {
            x.setSiguiente(inicio);
        }
        inicio = x;
    }

    public void mostrar() {
        NodoSimple p = inicio;
        while (p != null) {
            Taxi t = (Taxi) p.getDato();
            t.mostrarDatos();
            p = p.getSiguiente();
        }
    }

    public NodoSimple getInicio() {
        return inicio;
    }

    public void setInicio(NodoSimple inicio) {
        this.inicio = inicio;
    }

}
