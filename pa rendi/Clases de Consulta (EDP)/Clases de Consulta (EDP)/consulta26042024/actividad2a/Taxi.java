package consulta26042024.actividad2a;

import utilidades.GestorEntradaConsola;

/**
 *
 * @author char.ly
 */
public class Taxi {
    
    private int numeroMovil;

    public Taxi() {
    }
    
    public void cargarDatos(){
        cargarNumeroMovil();
    }
    
    public void cargarNumeroMovil(){
        System.out.print("numeroMovil: ");
        numeroMovil = GestorEntradaConsola.leerEntero();
    }
    
    @Override
    public String toString() {
        return "Taxi{" + "numeroMovil=" + numeroMovil + '}';
    }
    
    public void mostrarDatos(){
        System.out.println(this.toString());
    }
    
    public int getNumeroMovil() {
        return numeroMovil;
    }

    public void setNumeroMovil(int numeroMovil) {
        this.numeroMovil = numeroMovil;
    }


}
