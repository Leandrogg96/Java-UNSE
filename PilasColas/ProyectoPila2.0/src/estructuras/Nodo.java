package estructuras;

public class Nodo {
    private int dato;
    private Nodo ps;

    public Nodo(int dato) {
        this.dato = dato;
        this.ps = null;
    }

    public int getDato() {
        return dato;
    }

    public Nodo getPs() {
        return ps;
    }

    public void setDato(int dato) {
        this.dato = dato;
    }

    public void setPs(Nodo ps) {
        this.ps = ps;
    }


}
