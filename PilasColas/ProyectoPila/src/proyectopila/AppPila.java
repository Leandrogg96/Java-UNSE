/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package proyectopila;
import entradaSalida.consola;
import Pila.*;

/**
 *
 * @author Invitado
 */
public class AppPila {
  pila P;
  
  
public AppPila(){
    P=new pila();
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
            op = consola.leerEntero();
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
		while(!op.equalsIgnoreCase("n")){
			System.out.println("ingrese numero: ");
			num = consola.leerEntero();
			P.apilar(num);
			System.out.println("Continuar s/n");
			op = consola.leerString();	
		
                } 
                
         
    }

                         
   

    private void quitar() {
       	        int num;
		String op = "s";
		while(!op.equalsIgnoreCase("n")){
			System.out.println("ingrese numero: ");
			num = consola.leerEntero();
			buscoyElimino(num);
			System.out.println("Continuar s/n");
			op = consola.leerString();	
		
    }
 
    }

    private void buscoyElimino(int n){
       pila Aux=new pila();
       int B=0;
        if (!P.pilaVacia()){
          while (!P.pilaVacia()) {
            Nodo x=P.desapilar();
            if(x.getDato()==n){
                B=1;}
               else{
                   Aux.apilar(x.getDato());
                   }
          }
           if (B!=1)
            System.out.println("no existe el elemento en la pila");
         }
        else
         System.out.println(" vacia");
         retornar(P,Aux);

    }
private void retornar( pila A, pila B){
    
    while (!B.pilaVacia()) {
            Nodo x=B.desapilar();  
            A.apilar(x.getDato());
        }
}

private void mostrar() {
        pila Aux= new pila();
        
       if (!P.pilaVacia()){
      while (!P.pilaVacia()) {
            Nodo temp=P.desapilar();
            System.out.println(" ");
            consola.emitirMensaje("elemento"+ " "+temp.getDato());
            Aux.apilar(temp.getDato());
          }}
     else
          System.out.println(" vacia");  
     
     retornar(P,Aux);
          }
   
 

}



