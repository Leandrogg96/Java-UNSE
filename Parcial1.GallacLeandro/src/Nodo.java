public class Nodo {
    private Tarjeta tar;
    private Nodo ps;

    public Nodo() {
        this.tar = new Tarjeta();
    }

    public void mostrarNodo() {
        this.tar.mostrarTar();
    }

    public Tarjeta getTar() {
        return tar;
    }

    public void setTar(Tarjeta tar) {
        this.tar = tar;
    }

    public Nodo getPs() {
        return ps;
    }

    public void setPs(Nodo ps) {
        this.ps = ps;
    }
}
