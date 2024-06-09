package clase03052024;

/**
 *
 * @author char.ly
 */
public class NodoVuelo {

    private Vuelo dato;
    private NodoVuelo ps;

    public NodoVuelo(Vuelo dato) {
        this.dato = dato;
        ps = null;
    }

    public Vuelo getDato() {
        return dato;
    }

    public void setDato(Vuelo dato) {
        this.dato = dato;
    }

    public NodoVuelo getPs() {
        return ps;
    }

    public void setPs(NodoVuelo ps) {
        this.ps = ps;
    }

}
