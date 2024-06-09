package consulta17052024;

import utilidades.GestorEntradaConsola;

/**
 *
 * @author char.ly
 */
public class Vehiculo implements Comparable {

    private int patente;
    private String marca;
    private String modelo;

    public Vehiculo() {
    }

    public void cargarDatos() {

    }

    public void cargarPatente() {
        System.out.print("Patente: ");
        patente = GestorEntradaConsola.leerEntero();
    }

    public void cargarMarca() {

    }

    public void cargarModelo() {

    }

    @Override
    public int compareTo(Object o) {
        Vehiculo v = (Vehiculo) o;
        return Integer.compare(patente, v.patente);
    }

    @Override
    public String toString() {
        return "Vehiculo{" + "patente=" + patente + ", marca=" + marca + ", modelo=" + modelo + '}';
    }

    public int getPatente() {
        return patente;
    }

    public void setPatente(int patente) {
        this.patente = patente;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

}
