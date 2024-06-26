package listas_pilas_colas_genericas;

/**
 *
 * @author char.ly
 */
public class Pila {

    private NodoSimple tope;
    private int cantidad;

    public Pila() {
        this.tope = null;
        this.cantidad = 0;
    }

    /**
     *
     * @return true si la pila esta vacia
     */
    public boolean estaVacia() {
        return tope == null;
    }

    /**
     * Apila un objeto
     *
     * @param obj datos del objeto a apilar
     */
    public void apilar(Comparable obj) {
        NodoSimple x = new NodoSimple(obj);
        if (!estaVacia()) {
            x.setSiguiente(tope);
        }
        tope = x;
        cantidad++;
    }

    /**
     * Desapila un objeto de una pila.
     *
     * @return El nodo desapilado de la pila
     */
    public NodoSimple desapilar() {

        NodoSimple x;
        if (!estaVacia()) {
            x = tope;
            tope = tope.getSiguiente();
            cantidad--;
            return x;
        } else {
            System.out.println("Pila vacia!");
            return null;
        }

    }

    /**
     * Muestra una pila desde el ultimo elemento insertado (tope).
     *
     */
    public void mostrar() {
        Pila temp = new Pila();
        if (!estaVacia()) {
            while (!this.estaVacia()) {
                Object dato = this.desapilar().getDato();
                System.out.println(dato.toString());
                temp.apilar((Comparable) dato);
            }
            retornar(temp);
        }
    }

    /**
     * Muestra una pila desde el primer elemento insertado de la pila.
     *
     */
    public void mostrarInversamente() {
        Pila temp = new Pila();
        if (!this.estaVacia()) {
            while (!this.estaVacia()) {
                Object dato = this.desapilar().getDato();
                temp.apilar((Comparable) dato);
            }
            temp.mostrar();
            retornar(temp);
        }
    }

    /**
     * Metodo auxiliar para retornar el estado de una pila
     *
     * @param temp pila auxiliar donde se deposito la informacion de la pila
     * origen.
     */
    public void retornar(Pila temp) {
        while (!temp.estaVacia()) {
            this.apilar(temp.desapilar().getDato());
        }
    }

    /**
     * Muestra una pila desde el primer elemento insertado de la pila.
     *
     */
    public NodoSimple buscar(Comparable buscado) {
        NodoSimple x = null;
        Pila pilaTemp = new Pila();
        while (!this.estaVacia()) {
            NodoSimple nodoTemp = desapilar();
            Comparable dato = nodoTemp.getDato();
            if(buscado.compareTo(dato) == 0){
                x = nodoTemp;
            }
            pilaTemp.apilar(dato);
        }
        retornar(pilaTemp);
        return x;
    }

    public NodoSimple getTope() {
        return tope;
    }

    public void setTope(NodoSimple tope) {
        this.tope = tope;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

}
