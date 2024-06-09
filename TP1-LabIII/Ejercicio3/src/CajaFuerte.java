public class CajaFuerte {
    private int combinacion;
    private int b;
    private boolean estado;

    public CajaFuerte() {
        this.combinacion = 000;
        this.b = 0;
        this.estado = false;
    }
    public void primeraVez() {
        this.b = 1;
    }

    public int getCombinacion() {
        return combinacion;
    }

    public void setCombinacion(int combinacion) {
        this.combinacion = combinacion;
    }

    public int getB() {
        return b;
    }

    public void setB(int b) {
        this.b = b;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }
}
