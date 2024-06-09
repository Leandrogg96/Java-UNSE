package ProyectoEstacionamiento;

import datos.*;
import java.util.*;
import entradaDatos.*;
import listaordenada.Lista;
import listaordenada.ListaOrdenada;
import listaordenada.Nodo;

public class Estacionamiento {

    static int num_c = 1;
    Scanner ingreso = new Scanner(System.in);
    ListaOrdenada Cli;
    Lista M;
    Lista T;

    public Estacionamiento() {
        Cli = new ListaOrdenada();
        M = new Lista();
        T = new Lista();

    }

    public void generar() {
        boolean mas = true;
        String op = "s";
        while (mas) {
            Cliente c = new Cliente();
            c.ingresarDatosCliente();
            Nodo x = new Nodo(c);
            Cli.insertar(x);

            System.out.println("Desea continuar s/n");
            op = EntradaSalida.leerString();
            op = op.equals("") ? "a" : op;
            char opcion = op.charAt(0);
            mas = opcion != 'n';

        }
    }

    public void generarMotos() {
        boolean mas = true;
        String op = "s";
        while (mas) {
            Moto c = new Moto();
            c.ingresarDatosMoto();
            Nodo x = new Nodo(c);
            M.insertarPri(x);

            System.out.println("Desea continuar s/n");
            op = EntradaSalida.leerString();
            op = op.equals("") ? "a" : op;
            char opcion = op.charAt(0);
            mas = opcion != 'n';

        }
    }

    public void borrar() {
        // completar codigo

    }

    public void imprimirCli() {
        Nodo p = Cli.inicio();
        while (p != null) {
            EntradaSalida.mostrarMensaje(p.getDato().toString() + p.getDato().getM().toString());
            p = p.getPs();
        }
    }

    public boolean verificar() {
        if (Cli.listaVacia()) {
            EntradaSalida.mostrarMensaje("Lista vacía!");
            return false;
        }
        return true;
    }

    public void menu() {
        int opcion = 9;
        do {
            switch (opcion) {
                case 1:
                    generar();
                    break;
                case 2:

                   
                        generarMotos();
                   
                    break;
                case 3:
                    if (verificar()) {
                        imprimirCli();
                    }
                    break;
                case 4:
                    if (verificar()) {
                        imprimirMotos();
                    }
                    break;
                case 5:
                    if (verificar()) {
                        chequearIngreso();
                    }
                    break;
                case 6:
                    if (verificar()) {
                       borrar();
                    }
                    break;
            }
            mostrarOpciones();
            opcion = ingreso.nextInt();
            EntradaSalida.mostrarMensaje("--------->");

        } while (opcion != 0);
    }

    public void mostrarOpciones() {
        EntradaSalida.mostrarMensaje("Manejo de listas simples enlazadas");
        EntradaSalida.mostrarMensaje("1-    Generar lista de clientes");
        EntradaSalida.mostrarMensaje("2-       Generar lista de Motos");
        EntradaSalida.mostrarMensaje("3-            Imprimir Clientes");
        EntradaSalida.mostrarMensaje("4-                mostrar Motos");
        EntradaSalida.mostrarMensaje("5- chequear ingreso del cliente");
        EntradaSalida.mostrarMensaje("6-             eliminar cliente");
        EntradaSalida.mostrarMensaje("0-                        Salir");
        EntradaSalida.mostrarMensaje("--------->");

    }

    public static void main(String[] args) {

        Estacionamiento miListaApp = new Estacionamiento();
        miListaApp.menu();

    }

    public Nodo buscarCliente(int doc) {
        Nodo a = null;
        Nodo p = Cli.inicio();
        boolean ban = false;
        while (p != null & !ban) {
            if (p.getDato().getDni() == doc) {
                a = p;
                ban=true;
            } else {
                p = p.getPs();
            }

        }
        return a;
    }

    public void chequearIngreso() {
        EntradaSalida.mostrarMensaje("Ingrese documento : ");
        int doc = EntradaSalida.leerInt();
        Nodo x = buscarCliente(doc);
        if (x != null) {
            EntradaSalida.mostrarMensaje("Ingrese patente de la moto : ");
            int pat = EntradaSalida.leerInt();
            Nodo l = buscarMoto(pat);
            if (l != null) {
                EntradaSalida.mostrarMensaje("Ingrese monto del estacionamiento: ");
                int monto = EntradaSalida.leerInt();
                x.getDato().setMonto(x.getDato().getMonto() - monto);
                generarTicket(x, l);
            } else {
                EntradaSalida.mostrarMensaje("No esta registrado el vehiculo ");
            }
        } else {
            EntradaSalida.mostrarMensaje("No existe el cliente: ");
        }

    }

   
    public Nodo buscarMoto(int pat) {
        Nodo a = null;
        Nodo p = M.inicio();
        boolean ban = false;
        while (p != null & !ban) {
            if (p.getDato2().getPatente()== pat) {
                a = p;
                ban=true;
            } else {
                p = p.getPs();
            }

        }
        return a;
    }
    

   public void generarTicket(Nodo x, Nodo l) {
         EntradaSalida.mostrarMensaje("genera comprobante");
         EntradaSalida.mostrarMensaje("Comprobante "+ num_c);
          EntradaSalida.mostrarMensaje(x.getDato().toString());
          System.out.println("    ");
          EntradaSalida.mostrarMensaje(l.getDato2().toString());
          num_c=num_c+1;
          Ticket t=new Ticket(num_c,x.getDato().getApe_n(),x.getDato().getMonto(),l.getDato2());
          Nodo n=new Nodo(t);
          T.insertarPri(n);
          
    }

    private void imprimirMotos() {
       Nodo p = M.inicio();
        while (p != null) {
            EntradaSalida.mostrarMensaje(p.getDato2().toString());
            p = p.getPs();
        }
    }
}
