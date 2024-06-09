package consulta17052024;

import listas_pilas_colas.*;
import utilidades.GestorEntradaConsola;

/**
 *
 * @author char.ly
 */
public class Cliente implements Cargable, Comparable {

    private int dni;
    private String nombre;
    private float saldo;
//    private Vehiculo vehiculo;
    private ListaSimple listaVehiculos;
    private char tipoServicio; // 'D', 'S', 'M'
    private boolean primerService;

    public Cliente() {
        listaVehiculos = new ListaSimple();
        primerService = true;
    }

    public Cliente(int dni) {
        this.dni = dni;
    }
    
    
    public void cargarDatos() {

        cargarDni();
        cargarNombre();
        cargarMonto();
        Vehiculo v = new Vehiculo();
        if (primerService == true) {
            primerService = false;
        }
        v.cargarPatente();
        listaVehiculos.insertarFrente(v);
    }

    public void cargarDni() {
        do {
            System.out.print("DNI: ");
            dni = GestorEntradaConsola.leerEntero();
        } while (dni <= 0);

    }

    public void cargarNombre() {
        System.out.print("Nombre: ");
        nombre = GestorEntradaConsola.leerString();
    }

    public void cargarMonto() {
        System.out.print("Monto: ");
        saldo = GestorEntradaConsola.leerFlotante();
    }

    public void mostrarDatos() {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        listaVehiculos.mostrar();
        return "Cliente{" + "dni=" + dni + ", nombre=" + nombre + ", saldo=" + saldo + ", tipoServicio=" + tipoServicio + ", primerService=" + primerService + '}';
    }

    @Override
    public int compareTo(Object o) {
        Cliente c = (Cliente) o;
        return Integer.compare(dni, c.dni);
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public float getSaldo() {
        return saldo;
    }

    public void setSaldo(float saldo) {
        this.saldo = saldo;
    }

    public ListaSimple getListaVehiculos() {
        return listaVehiculos;
    }

    public void setListaVehiculos(ListaSimple listaVehiculos) {
        this.listaVehiculos = listaVehiculos;
    }

    public char getTipoServicio() {
        return tipoServicio;
    }

    public void setTipoServicio(char tipoServicio) {
        this.tipoServicio = tipoServicio;
    }

    public boolean isPrimerService() {
        return primerService;
    }

    public void setPrimerService(boolean primerService) {
        this.primerService = primerService;
    }

    
}
