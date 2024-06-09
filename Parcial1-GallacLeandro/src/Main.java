import java.util.Scanner;

public class Main {

    ListaGenOrdenada<Integer> miLista;

    public Main() {
        miLista = new ListaGenOrdenada();
    }

    public void agregar() {
        Scanner ingreso = new Scanner(System.in);
        int elem = -1;
        while (elem != 0) {
            EntradaSalida.mostrarMensaje("Ingrese entero (0 p/cancelar): ");
            elem = ingreso.nextInt();
            if (elem != 0) {
                miLista.insertar(elem);
            }
        }
    }

    public void borrar() {
        Scanner ingreso = new Scanner(System.in);
        int elem = -1;
        while (elem != 0) {
            EntradaSalida.mostrarMensaje("Ingrese un elemento (0 p/cancelar): ");
            elem = ingreso.nextInt();
            if (elem != 0) {
                Nodo x = miLista.eliminar(elem);
            }
        }
    }

    public void imprimir() {
        Nodo p = miLista.inicio();
        while (p != null) {
            EntradaSalida.mostrarMensaje(p.getDato() + "");
            p = p.getPs();
        }
    }

    public boolean verificar() {
        if (miLista.listaVacia()) {
            EntradaSalida.mostrarMensaje("Lista vacía!");
            return false;
        }
        return true;
    }

    public void menu() {
        Scanner ingreso = new Scanner(System.in);
        int opcion = 9;
        do {
            switch (opcion) {
                case 1:
                    agregar();
                    break;
                case 2:
                    if (verificar()) {
                        imprimir();
                    }
                    break;
                case 3:
                    if (verificar()) {
                        borrar();
                    }
                    break;

            }
            mostrarOpciones();
            opcion = ingreso.nextInt();
            EntradaSalida.mostrarMensaje("--------->");

        } while (opcion != 4);
    }

    public void mostrarOpciones() {
        EntradaSalida.mostrarMensaje("\t\t\t\tMiEmpresa SRL");
        EntradaSalida.mostrarMensaje("\t\t Administracion de Productos");
        EntradaSalida.mostrarMensaje("Seleccione: ");
        EntradaSalida.mostrarMensaje("1. Agregar productos");
        EntradaSalida.mostrarMensaje("2. Mostrar rango de precios");
        EntradaSalida.mostrarMensaje("3. Listado de productos");
        EntradaSalida.mostrarMensaje("4. Salir");
        EntradaSalida.mostrarMensaje("\t\t\t\t\t\t Opcion: ");
        EntradaSalida.mostrarMensaje("---------> ");

    }

    public static void main(String[] args) {

        Main miListaApp = new Main();
        miListaApp.menu();
    }

}
