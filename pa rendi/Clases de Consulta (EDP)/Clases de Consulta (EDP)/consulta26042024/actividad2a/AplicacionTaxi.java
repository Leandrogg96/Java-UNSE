package consulta26042024.actividad2a;

import utilidades.GestorEntradaConsola;

/**
 *
 * @author char.ly
 */
public class AplicacionTaxi {
    
    private ListaSimpleTaxi listaTaxis;
    
    public static void mostrarOpciones() {
        System.out.println("Menu Taxis");
        System.out.println("1. Generar");
        System.out.println("2. Eliminar");
        System.out.println("3. Modificar");
        System.out.println("4. Imprimir");
        System.out.println("0. Salir");
    }

    public void menu() {

        listaTaxis = new ListaSimpleTaxi();

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
                    mostrar();
                    break;
            }

        } while (opcion != 0);
    }
    
    
    public void generar() {
        do {
            Taxi taxi = new Taxi();
            taxi.cargarDatos();
            listaTaxis.insertar(taxi);
        } while (GestorEntradaConsola.confirmar());
    }
    
    private void mostrar() {
        listaTaxis.mostrar();
        GestorEntradaConsola.pausar();
    }



    public static void main(String[] args) {
        AplicacionTaxi appTaxi = new AplicacionTaxi();
        appTaxi.menu();
    }

}
