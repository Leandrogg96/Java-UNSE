package consulta24_04_2024;

/**
 *
 * @author char.ly
 */
public class AplicacionTaxi {

    private ListaSimpleTaxi listaTaxi;

    public static void mostrarOpciones() {
        System.out.println("Menu Taxis");
        System.out.println("1. Generar");
        System.out.println("2. Eliminar");
        System.out.println("3. Modificar");
        System.out.println("4. Imprimir");
        System.out.println("0. Salir");
    }

    public void menu() {
        listaTaxi = new ListaSimpleTaxi();

        int opcion;

        do {
            mostrarOpciones();
            switch (opcion = GestorEntradaConsola.leerEntero()) {
                case 1:
                    generar();
                    break;
                case 2:
                    break;
                case 3:
                    break;
                case 4:
                    listaTaxi.mostrar();
                    break;
            }
        } while (opcion != 0);
    }

    public void generar() {
        do {
            Taxi taxi = new Taxi();
            taxi.cargarDatos();
            listaTaxi.insertar(taxi);
        } while (GestorEntradaConsola.confirmar());
    }

    public static void main(String[] args) {

        AplicacionTaxi appTaxi = new AplicacionTaxi();
        appTaxi.menu();

    }
}

class ListaSimpleTaxi {

    private NodoSimple list;

    public ListaSimpleTaxi() {
        list = null;
    }

    public void mostrar() {
        NodoSimple p = list;
        while (p != null) {
            Taxi t = (Taxi) p.getDato();
            t.mostrarDatos();
            p = p.getPs();
        }

    }

    public void insertar(Taxi t) {
        NodoSimple x = new NodoSimple(t);
        if (list != null) {
            x.setPs(list);
        }
        list = x;
    }
}

class NodoSimple {

    private NodoSimple ps;
    private Taxi dato;

    public NodoSimple(Taxi dato) {
        this.dato = dato;
        this.ps = null;
    }

    public NodoSimple getPs() {
        return ps;
    }

    public void setPs(NodoSimple ps) {
        this.ps = ps;
    }

    public Taxi getDato() {
        return dato;
    }

    public void setDato(Taxi dato) {
        this.dato = dato;
    }

}

class Taxi {

    private int nroMovil;

    public void cargarDatos() {
        System.out.print("Ingrese nro movil: ");
        nroMovil = GestorEntradaConsola.leerEntero();
    }

    @Override
    public String toString() {
        return "Taxi{" + "nroMovil=" + nroMovil + '}';
    }

    public void mostrarDatos() {
        System.out.println(this.toString());
    }
}
