package listaordenada;


public class Nodo<G> {

    private G dato;
    private Nodo<G> ps;

    public Nodo(G elem) {
        dato = elem;
        ps = null;
    }

    /**
     * @return el dato
     */
    public G getDato() {
        return dato;
    }

    /**
     * @param dato el dato a establecer
     */
    public void setDato(G dato) {
        this.dato = dato;
    }

    /**
     * @return el ps
     */
    public Nodo<G> getPs() {
        return ps;
    }

    /**
     * @param ps el ps a establecer
     */
    public void setPs(Nodo<G> ps) {
        this.ps = ps;
    }

}
