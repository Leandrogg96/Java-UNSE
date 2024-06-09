public class Nodo {
    private Monomio termino;
    private Nodo ps;

    public Nodo() {

    }

    public Nodo(Monomio termino) {
        this.termino = termino;
        this.ps = null;
    }

    public void mostrarNodo() {
        this.termino.mostrarMono();
    }


    public Monomio getTermino() {
        return termino;
    }

    public void setTermino(Monomio termino) {
        this.termino = termino;
    }

    public Nodo getPs() {
        return ps;
    }

    public void setPs(Nodo ps) {
        this.ps = ps;
    }
}
