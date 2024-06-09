package consulta15_05_2024;

import utilidades.*;
import listas_pilas_colas.*;

/**
 *
 * @author char.ly
 */
public class AppProyectos {

    private ListaSimpleOrdenada listaProyectos = new ListaSimpleOrdenada();
    private ListaSimple listaTerminados = new ListaSimple();

    public static void main(String[] args) {

        AppProyectos app = new AppProyectos();
        app.menu();

    }

    public void menu() {

        Proyecto p1;
        Proyecto p2;
        Proyecto p3;
        Proyecto p4;

        p1 = new Proyecto(5, "", 'E', 'A', 5, 1000);
        p2 = new Proyecto(9, "", 'T', 'B', 10, 500);
        p3 = new Proyecto(7, "", 'T', 'C', 6, 700);
        p4 = new Proyecto(3, "", 'S', 'C', 5, 2000);

        listaProyectos.insertar(p1);
        listaProyectos.insertar(p2);
        listaProyectos.insertar(p3);
        listaProyectos.insertar(p4);
        int opcion;
        do {
            mostrarOpciones();
            switch (opcion = GestorEntradaConsola.leerEntero()) {
                case 1:
                    break;
                case 2:
//                    eliminarTerminados();
                    eliminarTerminadosV2();
                    break;
                case 3:
                    listaProyectos.mostrar();
                    GestorEntradaConsola.pausar();
                    break;
                case 4:
                    break;
                case 5:
                    break;
            }

        } while (opcion != 0);
    }

    public void mostrarOpciones() {
        System.out.println("CONSTRUCTORA SDE");
        System.out.println("1. Generar");
        System.out.println("2. Eliminar proyectos");
        System.out.println("3. Imprimir");
        System.out.println("4. Actualizar proyecto");
    }

    /**
     * Corregir referencias
     */
    public void eliminarTerminados() {

        NodoSimple ant = null;
        NodoSimple p = listaProyectos.getInicio();

        while (p != null) {

            Proyecto proy = (Proyecto) p.getDato();

            if (proy.getEstado() == 'T') {
                NodoSimple aux = listaProyectos.quitar(ant, p);
                listaTerminados.insertarFrente(aux.getDato());
            }

            ant = p;
            p = p.getSiguiente();

        }

        System.out.println("Lista de terminados: ");
        listaTerminados.mostrar();
        GestorEntradaConsola.pausar();
    }

    public void eliminarTerminadosV2() {

        NodoSimple p = listaProyectos.getInicio();

        while (p != null) {

            Proyecto proy = (Proyecto) p.getDato();

            if (proy.getEstado() == 'T') {
                NodoSimple aux = listaProyectos.eliminar(proy);
                listaTerminados.insertarFrente(aux.getDato());
            }

            p = p.getSiguiente();

        }

        System.out.println("Lista de terminados: ");
        listaTerminados.mostrar();
        GestorEntradaConsola.pausar();

    }
}
