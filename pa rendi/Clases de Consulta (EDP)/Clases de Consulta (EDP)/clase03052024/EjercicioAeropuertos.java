package clase03052024;

import consulta24042024.GestorEntradaConsola;

/**
 *
 * @author char.ly
 */
public class EjercicioAeropuertos {

    public static void main(String[] args) {
        AplicacionAeropuerto app = new AplicacionAeropuerto();
        app.menu();
    }
}

class AplicacionAeropuerto {
    
    ListaOrdenadaVuelos lista;
    
    public static void mostrarOpciones() {
        System.out.println("Aeropuerto Santiago");
        System.out.println("1. Generar");
        System.out.println("2. Eliminar");
        System.out.println("3. Imprimir");
        System.out.println("0. Salir");
    }

    public void menu() {
        lista = new ListaOrdenadaVuelos();
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
                    mostrar();
                    break;
            }

        } while (opcion != 0);

    }

    public void generar() {
        do {
            Vuelo vuelo = new Vuelo();
            vuelo.cargarDatos();
            lista.insertar(vuelo);
        } while (GestorEntradaConsola.confirmar());
    }
    
    public void mostrar(){
        lista.mostrar();
        GestorEntradaConsola.pausar();
    }
}

