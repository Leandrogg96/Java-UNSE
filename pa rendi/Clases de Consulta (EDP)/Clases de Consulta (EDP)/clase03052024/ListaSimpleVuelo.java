package clase03052024;

/**
 *
 * @author char.ly
 */
public class ListaSimpleVuelo {

    protected NodoVuelo inicio;

    public ListaSimpleVuelo() {
        inicio = null;
    }

    public boolean estaVacia() {
        return inicio == null;
    }

    public void insertarFrente(Vuelo elemento) {
        NodoVuelo n = new NodoVuelo(elemento);
        if (!estaVacia()) {
            n.setPs(n);
        }
        inicio = n;
    }

    public void mostrar() {
        NodoVuelo n = inicio;
        while (n != null) {
            System.out.println(n.getDato().toString());
            n = n.getPs();
        }
    }
}
