import java.util.Scanner;

public class AplicacionLista {
    private Lista L;


    public AplicacionLista() {
        this.L = new Lista();
    }

    public void generarElemento() {
        Nodo nodoX = new Nodo();
        this.L.insertarPrimero(nodoX);
    }

    public void eliminarElemento() {
        Scanner lectura = new Scanner(System.in);
        int surpMovil;
        surpMovil = lectura.nextInt();
        if (!L.listaVacia()){
            L.eliminar(surpMovil);
        } else {
            System.out.println("La lista esta vacia.");
        }
    }

    public void imprimirLista() {
        this.L.visualizar();
    }

    public void actualizarElemento() {
        this.L.modificar();
    }

}
