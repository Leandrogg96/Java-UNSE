package main;

import entradaSalida.EntradaSalida;
import estructuras.Nodo;
import estructuras.Pila;

public class AppPila {
    Pila P;

    public AppPila(){
        P = new Pila();
    }

    public void menuPrincipal() {

        int op;
        do {
            System.out.println("\n");
            System.out.println("Actualizacion de Pila");
            System.out.println("1. agregar elementos a la Pila");
            System.out.println("2. eliminar elementos de la Pila");
            System.out.println("3. Mostrar Pila");
            System.out.println("0. Salir");
            System.out.print("Ingrese opcion: ");
            op = EntradaSalida.leerInt();
            System.out.println("");
            switch (op) {
                case 1:
                    System.out.println("agregar elementos: ");
                    insertar();
                    break;

                case 2:
                    System.out.println("eliminar elementos: ");
                    quitar();
                    break;

                case 3:
                    System.out.println("mostrar elementos ");
                    mostrar();
                    break;
                case 0:
                    break  ;
            }
        } while (op != 0);
    }


    private void insertar() {
        int num;
        String op = "s";
        while (!op.equalsIgnoreCase("n")) {
            System.out.println("Ingrese un numero: ");
            num = EntradaSalida.leerInt();
            P.apilar(num);
            System.out.println("Continuar s/n");
            op = EntradaSalida.leerString();

        }
    }

    private void quitar() {
        int num;
        String op = "s";
        while(!op.equalsIgnoreCase("n")){
            System.out.println("Ingrese numero: ");
            num = EntradaSalida.leerInt();
            buscoyElimino(num);
            System.out.println("Continuar s/n");
            op = EntradaSalida.leerString();

        }

    }

    private void buscoyElimino(int n){
        Pila Aux = new Pila();
        int B = 0;
        if (!P.pilaVacia()){
            while (!P.pilaVacia()) {
                Nodo x = P.desapilar();
                if(x.getDato() == n){
                    B = 1;}
                else{
                    Aux.apilar(x.getDato());
                }
            }
            if (B != 1)
                System.out.println("No existe el elemento en la pila");
        }
        else
            System.out.println("Pila vacia");
        retornar(P,Aux);
    }

    private void retornar(Pila A, Pila B){

        while (!B.pilaVacia()) {
            Nodo x = B.desapilar();
            A.apilar(x.getDato());
        }
    }

    private void mostrar() {
        Pila Aux = new Pila();

        if (!P.pilaVacia()){
            while (!P.pilaVacia()) {
                Nodo temp=P.desapilar();
                System.out.println(" ");
                EntradaSalida.mostrarMensaje("Elemento" + " " + temp.getDato());
                Aux.apilar(temp.getDato());
            }
        }
        else {
            System.out.println(" vacia");
        }
        retornar(P,Aux);
    }

}
