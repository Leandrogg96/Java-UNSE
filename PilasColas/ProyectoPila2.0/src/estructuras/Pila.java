package estructuras;

public class Pila {

    Nodo tope;

    public Pila() {
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
        } else {
            nuevo=tope;
            tope=tope.getPs();
        }
        return nuevo;

    }
    public boolean pilaVacia(){
        if(tope==null) {
            return true;
        } else {
            return false;
        }
    }

}
