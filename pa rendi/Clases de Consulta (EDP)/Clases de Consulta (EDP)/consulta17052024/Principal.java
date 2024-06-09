package consulta17052024;

import listas_pilas_colas.ListaSimple;
import listas_pilas_colas.NodoSimple;
import utilidades.GestorEntradaConsola;

/**
 *
 * @author char.ly
 */
public class Principal {

    // Metodo main: psvm + tab
    public static void main(String[] args) {

        AplicacionLavadero app = new AplicacionLavadero();

        app.menu();

    }

}

class AplicacionLavadero {

    ListaSimple listaClientes = new ListaSimple();

    public void menu() {
        int opcion;

        do {
            mostrarOpciones();
            switch (opcion = GestorEntradaConsola.leerEntero()) {
                case 1:
                    atenderCliente();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
//                    listaTaxi.mostrar();
                    listaClientes.mostrar();
                    break;
            }
        } while (opcion != 0);
    }

    public void mostrarOpciones() {
        System.out.println("Lavadero");
        System.out.println("1. Atender cliente");
        System.out.println("2. Modificar vehiculo cliente");
        System.out.println("3. Generar comprobante");
        System.out.println("4. Mostrar clientes");
    }

    public void atenderCliente() {

        if (listaClientes.estaVacia()) {
            Cliente c = new Cliente();
            c.cargarDatos();
            listaClientes.insertarFrente(c);
        } else {
            System.out.println("Ingrese DNI");
            int dniEntrada = GestorEntradaConsola.leerEntero();
            NodoSimple n = listaClientes.buscar(new Cliente(dniEntrada));
            if (n == null) {
                Cliente c = new Cliente();
                c.cargarDatos();
                listaClientes.insertarFrente(c);
            } else {
                Cliente c = (Cliente) n.getDato();
                Vehiculo v = new Vehiculo();
                v.cargarPatente();
                c.getListaVehiculos().insertarFrente(v);
            }
        }

    }
}
