/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package Pila;

/**
 *
 * @author Invitado
 */
public class pila {
    Nodo tope;

    public pila() {
        this.tope = null;
    }
    
   public void apilar( int ele){ 
       Nodo nuevo=new Nodo(ele);
       if(pilaVacia()){
           tope=nuevo;
       } else  {
                    nuevo.setPs(tope);
                    tope=nuevo;
                    }
       }
   
   public Nodo desapilar(){
       Nodo nuevo=null;
       if(pilaVacia()){
           System.out.println("pila vacia");
            }
       else
       {
         nuevo=tope;
         tope=tope.getPs();
       }
       return nuevo;
       
   }
   public boolean pilaVacia(){
       if(tope==null)
           return true;
       else 
           return false;
   }

   


}
