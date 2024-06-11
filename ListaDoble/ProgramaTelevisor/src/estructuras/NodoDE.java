package estructuras;

import datos.Programa;

public class NodoDE {

    private Programa elemento;
    private NodoDE pa;
    private NodoDE ps;

    public NodoDE(Programa elemento) {
        this.elemento = elemento;
        this.pa = null;
        this.ps = null;
    }

    public NodoDE() {
        this.elemento = null;
        this.ps = null;
    }

    public Programa getElemento() {
        return elemento;
    }

    public void setElemento(Programa elemento) {
        this.elemento = elemento;
    }

    public NodoDE getPs() {
        return ps;
    }

    public void setPs(NodoDE ps) {
        this.ps = ps;
    }

    public NodoDE getPa() {
        return pa;
    }

    public void setPa(NodoDE pa) {
        this.pa = pa;
    }

    public void mostrarDatos() {
        elemento.mostrarDatos();
    }

    public void cargarDatos() {
        elemento.cargarDatos();
    }

    public void modificarDatos() {
        elemento.modificarDatos();
    }

    public int comparar(Programa x) {
        return elemento.comparar(x);
    }
}
