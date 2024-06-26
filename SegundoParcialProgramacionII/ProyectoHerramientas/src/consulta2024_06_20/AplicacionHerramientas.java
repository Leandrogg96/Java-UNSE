package consulta2024_06_20;

import listas_pilas_colas_genericas.*;
import utilidades.GestorEntradaConsola;

/**
 *
 * @author char.ly
 */
public class AplicacionHerramientas {

    private Cola colaHerramientas = new Cola();

    public static void main(String[] args) {
        AplicacionHerramientas app = new AplicacionHerramientas();
        app.menu();
    }

    public AplicacionHerramientas() {
        
    }

    public void menu() {

        // Casos de prueba.
        Herramienta h1;
        Herramienta h2;
        Herramienta h3;
        Herramienta h4;
        Herramienta h5;

        h1 = new Herramienta(501, "Llave inglesa", "-",
                Herramienta.TipoHerramienta.MANUAL,
                5, Herramienta.Funcion.UNION);
        h2 = new Herramienta(323, "Destornillador", "Stanley",
                Herramienta.TipoHerramienta.MANUAL,
                10, Herramienta.Funcion.UNION);
        h3 = new Herramienta(725, "Amoladora", "Black&Decker",
                Herramienta.TipoHerramienta.MECANICO, 2, Herramienta.Funcion.CORTE);
        h4 = new Herramienta(10, "Taladro", "-", Herramienta.TipoHerramienta.MECANICO, 2, Herramienta.Funcion.UNION);
        h5 = new Herramienta(77, "Martillo", "-", Herramienta.TipoHerramienta.MANUAL, 10, Herramienta.Funcion.GOLPE);
        colaHerramientas.insertar(h1);
        colaHerramientas.insertar(h2);
        colaHerramientas.insertar(h3);
        colaHerramientas.insertar(h4);
        colaHerramientas.insertar(h5);

        int opcion;
        do {
            mostrarOpciones();
            switch (opcion = GestorEntradaConsola.leerEntero()) {
                case 1:
                    añadirHerramienta();
                    break;
                case 2:
                    buscarHerramienta();
                    break;
                case 3:
                    // No corresponderia con la estructura de una cola.
                    eliminarHerramienta();
                    break;
                case 4:
                    mostrar();
                    break;
                case 5:
                    mostrarFuncionalidad();
                    break;
            }

        } while (opcion != 0);
    }

    public void mostrarOpciones() {
        System.out.println("Herramientas");
        System.out.println("1. Añadir herramienta");
        System.out.println("2. Buscar herramienta");
        System.out.println("3. Eliminar herramienta");
        System.out.println("4. Imprimir");
        System.out.println("5. Imprimir p/funcion");
        System.out.println("0. Salir");
    }

    public void añadirHerramienta() {
        do {
            System.out.print("Ingrese codigo de herramienta: ");
            int codigo = GestorEntradaConsola.leerEntero();
            NodoSimple nodo = buscar(new Herramienta(codigo));
            boolean existe = (nodo != null);
            if (existe) {
                Herramienta htemp = (Herramienta) nodo.getDato();
                htemp.setCantidad(htemp.getCantidad() + 1);
                nodo.setDato(htemp);
                System.out.println("Cantidad de ejemplares: " + htemp.getCantidad());
            } else {
                Herramienta h = new Herramienta();
                h.cargarDatos(codigo);
                colaHerramientas.insertar(h);
            }
        } while (GestorEntradaConsola.confirmar());
    }

    public void buscarHerramienta() {
        System.out.print("Ingrese codigo de herramienta: ");
        int codigo = GestorEntradaConsola.leerEntero();
        NodoSimple nodo = buscar(new Herramienta(codigo));
        boolean existe = (nodo != null);
        if (existe) {
            Herramienta h = (Herramienta) nodo.getDato();
            System.out.println("Marca: " + h.getMarca() + ", Tipo: " + h.getTipo());
        } else {
            System.out.println("La herramienta no existe");
        }
    }

    public void eliminarHerramienta() {

        // Cargamos una pila con los elementos de la cola
        Cola colaTemp = new Cola();
        while (!colaHerramientas.estaVacia()) {
            NodoSimple nodoTemp = colaHerramientas.eliminar();
            colaTemp.insertar(nodoTemp.getDato());
        }

        // Realizamos una busqueda y eliminacion en la lista
        System.out.print("Ingrese codigo de herramienta: ");
        int codigo = GestorEntradaConsola.leerEntero();
        Herramienta htemp = new Herramienta(codigo);
        htemp.cargarFuncion();
        boolean eliminado = false;
        while (!colaTemp.estaVacia()) {
            NodoSimple nodoTemp = colaTemp.eliminar();
            Herramienta temp = (Herramienta) nodoTemp.getDato();
            boolean hayCoincidencia = htemp.compareTo(temp) == 0 && temp.getFuncion() == htemp.getFuncion();
            if (!hayCoincidencia) {
                colaHerramientas.insertar(temp);
            } else {
                eliminado = true;
            }
        }

        if (eliminado) {
            System.out.println("Elemento eliminado!");
        } else {
            System.out.println("No se encontraron coincidencias en la cola");
        }

    }

    public void mostrarFuncionalidad() {
        // Crear una cola temporal para almacenar los elementos mientras se procesan.
        Cola colaTemp = new Cola();
        // Copiar todos los elementos de la cola original a la cola temporal.
        while (!colaHerramientas.estaVacia()) {
            NodoSimple nodoTemp = colaHerramientas.eliminar();
            colaTemp.insertar(nodoTemp.getDato());
        }
        // Pedir al usuario la funcionalidad que desea buscar.
        Herramienta htemp = new Herramienta();
        htemp.cargarFuncion();
        // Bandera para saber si se encontró alguna coincidencia.
        boolean hayCoincidencias = false;
        // Iterar sobre la cola temporal y buscar coincidencias.
        while (!colaTemp.estaVacia()) {
            NodoSimple nodoTemp = colaTemp.eliminar();
            Herramienta temp = (Herramienta) nodoTemp.getDato();

            if (temp.getFuncion() == htemp.getFuncion()) {
                // Imprimir el dato si coincide.
                System.out.println(temp.toString());
                hayCoincidencias = true;
            }
            // Insertar el dato de vuelta en la cola original para mantener el orden.
            colaHerramientas.insertar(temp);
        }
        // Mensaje si no se encontraron coincidencias.
        if (!hayCoincidencias) {
            System.out.println("No se encontraron coincidencias en la cola");
        }
    }

    /**
     * Busca un elemento en una cola.
     */
    public NodoSimple buscar(Comparable entrada) {
        NodoSimple n = null;
        Cola colaTemp = new Cola();
        while (!colaHerramientas.estaVacia()) {
            NodoSimple nodoTemp = colaHerramientas.eliminar();
            Comparable dato = nodoTemp.getDato();
            if (entrada.compareTo(dato) == 0) {
                n = nodoTemp;
            }
            colaTemp.insertar((Comparable) dato);
        }
        retornar(colaTemp);
        return n;
    }

    /**
     * Metodo auxiliar para pasar los elementos de cola aux a la cola que lo
     * llamo.
     *
     * @param aux Cola de la cual se debe retornar
     */
    public void retornar(Cola aux) {
        while (!aux.estaVacia()) {
            colaHerramientas.insertar(aux.eliminar().getDato());
        }
    }

    /**
     * Muestra los elementos de una cola por pantalla.
     */
    public void mostrar() {
        Cola colaTemp = new Cola();
        while (!colaHerramientas.estaVacia()) {
            Comparable dato = colaHerramientas.eliminar().getDato();
            System.out.println(dato.toString());
            colaTemp.insertar((Comparable) dato);
        }
        retornar(colaTemp);
    }
}
