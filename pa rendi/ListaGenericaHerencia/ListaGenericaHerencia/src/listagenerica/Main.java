package listagenerica;

import java.util.Scanner;

public class Main {

    ListaGenOrdenada<Producto> miLista;

    public Main() {
        miLista = new ListaGenOrdenada<>();
    }

    public void agregar() {
        Scanner ingreso = new Scanner(System.in);
        int elem = -1;
        while (elem != 0) {
            EntradaSalida.mostrarMensaje("Ingrese entero (0 p/cancelar o cualquier numero para continuar): ");
            elem = ingreso.nextInt();
            if (elem != 0) {
                Producto producto = new Producto();
                if (buscarElemento(producto)) {
                    miLista.insertar(producto);
                }
            }
        }
    }

    public boolean buscarElemento(Producto x){
        Nodo<Producto> p = miLista.inicio();
        while (p != null){
            if (p.getDato().getCodigo() == x.getCodigo()) {
                EntradaSalida.mostrarMensaje("Ya existe un producto con este codigo!");
                return false;
            }
            p = p.getPs();
        }
        return true;
    }


    /*
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
    */

    public void imprimir() {
        Nodo<Producto> p = miLista.inicio();
        while (p != null) {
            EntradaSalida.mostrarMensaje("-----------------------------------");
            p.getDato().mostrarProducto();
            p = p.getPs();
        }
    }

    public void imprimirRango() {
        EntradaSalida.mostrarMensaje("Ingresa los rangos de los precios de los productos: ");
        EntradaSalida.mostrarMensaje("Rango inferior: ");
        double r1 = validarDouble();
        EntradaSalida.mostrarMensaje("Rango superior: ");
        double r2 = validarDouble();
        Nodo<Producto> p = miLista.inicio();
        while (p != null) {
            if (p.getDato().getPrecio() >= r1 && p.getDato().getPrecio() <= r2) {
                EntradaSalida.mostrarMensaje("-----------------------------------");
                p.getDato().mostrarProducto();
            }
            p = p.getPs();
        }
    }

    public double validarDouble() {
        Scanner lectura = new Scanner(System.in);
        while (!lectura.hasNextDouble()) {
            String input = lectura.next();
            System.out.println(input + " no es un numero valido. Por favor, ingrese un numero.");
            System.out.print("Ingrese un numero: ");
        }
        return lectura.nextDouble();
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
                        imprimirRango();
                    }
                    break;
                case 3:
                    if (verificar()) {
                        imprimir();
                    }
                    break;

            }
            mostrarOpciones();
            opcion = ingreso.nextInt();
            EntradaSalida.mostrarMensaje("--------->");

        } while (opcion != 4);
    }

    public void mostrarOpciones() {
        EntradaSalida.mostrarMensaje("--------------------------------------------");
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
