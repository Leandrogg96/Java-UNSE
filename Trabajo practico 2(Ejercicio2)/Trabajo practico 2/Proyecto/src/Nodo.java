public class Nodo {
    private RadioTaxi rt;
    private Nodo ps;

    public Nodo() {
        this.rt = new RadioTaxi();
        this.ps = null;
    }

    public void setearElemento() {
        this.rt.setear();
    }

    public void mostrarNodo() {
        this.rt.mostrarRT();
    }

    public RadioTaxi getRt() {
        return rt;
    }

    public void setRt(RadioTaxi rt) {
        this.rt = rt;
    }

    public Nodo getPs() {
        return ps;
    }

    public void setPs(Nodo ps) {
        this.ps = ps;
    }
}

