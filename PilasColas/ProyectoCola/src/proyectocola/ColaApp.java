/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package proyectocola;
import java.util.Scanner;
/**
 *
 * @author Kelly
 */
public class ColaApp {
    ColaDinamica C,Aux;
    Scanner entrada=new Scanner(System.in);
    
  public ColaApp(){
      C= new ColaDinamica();
      
      }
  
  public void menu(){
             
      int opcion = 1;
                int ban;
      do {
    
            System.out.println("1) ..Agregar elementos a la Cola");
            System.out.println("2) Eliminar elementos de la Cola");
            System.out.println("3) .Mostrar elementos de la Cola");
            System.out.println("4) Fin de Programa");
            System.out.println("Opcion: ");
             opcion = entrada.nextInt();
             
            switch (opcion) {
                case 1:
                    System.out.println("Alta de Proyectos ");
                    AltaProyecto();
                   
                    break;
                case 2:
                    eliminarProyecto();
                   
                    break;
                case 3:
                    System.out.println(" Cola ");
                     mostrarCola();
                    
                    break;
                case 4:
                    break;
            }
        } while (opcion != 4);
}

private void AltaProyecto() {
                String op = "s";
		while(!op.equalsIgnoreCase("n")){
			System.out.println("ingrese numero ");
			int n = entrada.nextInt();
                        C.insertar(n);
			System.out.println("Continuar s/n");
			op = entrada.next();	
		
                } 
                
         
    }
 private void eliminarProyecto() {
     // ingresa el elemento hasta que el operador lo decida
        String op="s";
        while(!op.equalsIgnoreCase("n")){
             System.out.println("ingrese el elemento a eliminar");
             int ele=EntradaSalida.leerInt();
             buscoyElimino(ele);
             System.out.println("continua(s/n");
             op=EntradaSalida.leerString();
        }
   }
 public void buscoyElimino(int ele){
     // recorrido de la cola buscando el elemento , convoca al metodo quitar()
    int B=0;
     Aux=new ColaDinamica();
    while(!C.colaVacia()){
        Nodo x=C.quitar();
        if(x.getDato()==ele){
            B=1;
        }else
        Aux.insertar(x);
        
     }
    if(B==0){
        System.out.println("no existe el elemento");
    }
    retornar(Aux,C);
        
 }

 
   public void mostrarCola() {
        Nodo temp;
        Aux=new ColaDinamica();
        if (!C.colaVacia()){
        while (!C.colaVacia()) {
            temp=C.quitar();
            System.out.println(temp.getDato()+" ");
            Aux.insertar(temp);
          }
        }
        else
            System.out.println("cola vacia");
        retornar(Aux,C);
}
   
public void retornar(ColaDinamica A, ColaDinamica B){
    
      Nodo x;
      while (!A.colaVacia()) {
            x=A.quitar();
            B.insertar(x);
}

}
}