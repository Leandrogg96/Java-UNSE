package principal;

import datos.Programa;
import entradaDatos.EntradaSalida;
import estructuras.*;

public class Principal {

    private ListaDoble lde;
    private Programa programa;

    public Principal() {
        this.lde = new ListaDoble();
        this.programa = new Programa();
    }

    public void menu() {
        int op = 0;
        do {
            EntradaSalida.mostrarMensaje("\n***** Menu Televisor *****");
            EntradaSalida.mostrarMensaje("1- Insertar");
            EntradaSalida.mostrarMensaje("2- Eliminar");
            EntradaSalida.mostrarMensaje("3- Modificar");
            EntradaSalida.mostrarMensaje("4- Imprimir ");
            EntradaSalida.mostrarMensaje("5- Buscar");
            EntradaSalida.mostrarMensaje("6- Imprimir en Reversa");
            EntradaSalida.mostrarMensaje("0- Salir");
            EntradaSalida.mostrarMensaje("- Ingrese la opcion");
            op = EntradaSalida.leerInt();
            switch (op) {
                case 1:
                    generarLista();
                    break;
                case 2:
                    borrar();
                    break;
                case 3:
                    modificarElemento();
                    break;
                case 4:
                    imprimirLista();
                    break;
                case 5:
                    buscarElemento();
                    break;
                case 6:
                    imprimirReversa();
                    break;
                case 0:
                    break;

            }
        } while (op != 0);
    }

    public void generarLista() {
        EntradaSalida.mostrarMensaje("\nGENERAR LISTA");
        char op = 'S';
        while (op != 'N' && op != 'n') {
            programa = new Programa();
            programa.cargarDatos();
            lde.insertarElemento(programa);
            EntradaSalida.mostrarMensaje("Desea Continuar? ['n' para salir]");
            op = EntradaSalida.leerChar();
        }
    }

    public void imprimirLista() {
        if (verificarVacia()) {
            EntradaSalida.mostrarMensaje("\nIMPRIMIR LISTA");
            EntradaSalida.mostrarMensaje("\nCanal\t\tNombre");
            NodoDE p = lde.inicio();
            while (p != null) {
                p.mostrarDatos();
                p = p.getPs();
            }
        }
    }

    public void borrar() {
        if (verificarVacia()) {
            EntradaSalida.mostrarMensaje("\nELIMINAR ELEMENTO DE LISTA");
            char op = 'S';
            while (op != 'N' && op != 'n') {
                programa = new Programa();
                programa.cargarCanal();
                Programa res = lde.eliminarElemento(programa);
                if (res != null) {
                    EntradaSalida.mostrarMensaje("Elemento eliminado");
                }
                EntradaSalida.mostrarMensaje("Desea Continuar? ['n' para salir]");
                op = EntradaSalida.leerChar();
            }
        }
    }

    public void buscarElemento() {
        if (verificarVacia()) {
            boolean b = false;
            programa = new Programa();
            programa.cargarCanal();
            NodoDE p = lde.inicio();
            while (p != null && !b) {
                Programa e = new Programa();
                e = p.getElemento();
                if (programa.getCodigo() == e.getCodigo()) {
                    b = true;
                    e.mostrarDatos(0);
                }
                p = p.getPs();
            }
            if (!b) {
                EntradaSalida.mostrarMensaje("Inexistente");
            }
        }
    }

    public void modificarElemento() {
        if (verificarVacia()) {
            EntradaSalida.mostrarMensaje("\nMODIFICAR LISTA");
            boolean b = false;
            programa = new Programa();
            programa.cargarCanal();
            NodoDE p = lde.inicio();
            while (p != null && !b) {
                Programa e = p.getElemento();
                if ((programa.comparar(e)) == 2) { // son iguales
                    b = true;
                    e.mostrarDatos(0);
                    EntradaSalida.mostrarMensaje("Desea modificar? ['n' para salir]");
                    char op = EntradaSalida.leerChar();
                    if (op == 'S' || op == 's') {
                        e.modificarDatos();
                    }
                }
                p = p.getPs();
            }
            if (!b) {
                EntradaSalida.mostrarMensaje("Inexistente");
            }
        }
    }

    public void imprimirReversa() {
        if (verificarVacia()) {
            EntradaSalida.mostrarMensaje("\nIMPRIMIR LISTA EN REVERSA");
            EntradaSalida.mostrarMensaje("\nCanal           Nombre");
            NodoDE p = lde.inicio();
            while (p.getPs() != null) {
                p = p.getPs();
            }

            while (p != null) {
                p.mostrarDatos();
                p = p.getPa();
            }
        }
    }

    public boolean verificarVacia() {
        if (lde.listaVacia()) {
            EntradaSalida.mostrarMensaje("LISTA VACIA...");
            return false;
        } else {
            return true;
        }
    }

    public static void main(String[] args) {
        Principal app = new Principal();
        app.menu();
    }
}
