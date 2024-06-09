package consulta10_05_2024;

import consulta24_04_2024.GestorEntradaConsola;
import listas_pilas_colas.*;

/**
 *
 * @author char.ly
 */
public class Autodromo {

    ListaSimpleOrdenada listaBoxes = new ListaSimpleOrdenada();

    public static void main(String[] args) {
        Autodromo app = new Autodromo();
        app.menu();
    }

    public static void mostrarOpciones() {
        System.out.println("Menu Autodromo");
        System.out.println("1. Crear autodromo");
        System.out.println("2. Agregar corredor");
        System.out.println("3. Eliminar corredor");
        System.out.println("4. Consultas");
        System.out.println("5. Imprimir boxes");
        System.out.println("0. Salir");
    }

    public void menu() {

        Box b1 = new Box(5, "Fernando Alonso");
        b1.setEstado(true);
        Box b2 = new Box(7, "Carlos");
        b2.setEstado(true);
        Box b3 = new Box(1, "Bugardo");
        b3.setEstado(true);
        Box b4 = new Box(3, "Pepe");
        b4.setEstado(true);
        Box b5 = new Box(6);
        listaBoxes.insertar(b1);
        listaBoxes.insertar(b2);
        listaBoxes.insertar(b3);
        listaBoxes.insertar(b4);
        listaBoxes.insertar(b5);

        int opcion;
        do {
            mostrarOpciones();
            switch (opcion = GestorEntradaConsola.leerEntero()) {
                case 1:
                    generar();
                    break;
                case 2:
                    agregarCorredor();
                    break;
                case 3:
                    break;
                case 4:
                    break;
                case 5:
                    imprimir();
                    break;
            }

        } while (opcion != 0);
    }

    public void generar() {
        do {
            Box box = new Box();
            box.cargarDatos();
            box.setEstado(true);
            listaBoxes.insertar(box);
        } while (GestorEntradaConsola.confirmar());
    }

    private void imprimir() {
        listaBoxes.mostrar();
        GestorEntradaConsola.pausar();
    }

    private void agregarCorredor() {
        System.out.print("Ingrese nro box:");
        int codigo = GestorEntradaConsola.leerEntero();
        Box temp = new Box(codigo);
        NodoSimple x = listaBoxes.buscar(temp);
        if (x == null) {
            System.out.println("El box no existe");
        } else {
            Box b = (Box) x.getDato();
            if (!b.isEstado()) {
                System.out.print("Ingrese nombre del corredor: ");
                String s = GestorEntradaConsola.leerString();
                b.setNombreCorredor(s);
                b.setEstado(true);
                x.setDato(b);
                System.out.println("Cambio concretado!");
            } else {
                System.out.println("El box esta ocupado");
            }
            GestorEntradaConsola.pausar();
        }
    }
}

class Box implements Comparable {

    private int nroBox;
    private char fila;
    private boolean estado;
    private long costo;
    private String nombreCorredor;
    private String escuderia;

    public Box() {
        estado = false;
    }

    public Box(int nroBox) {
        this.nroBox = nroBox;
        estado = false;
    }

    public Box(int nroBox, String nombreCorredor) {
        this.nroBox = nroBox;
        this.nombreCorredor = nombreCorredor;
        estado = false;
    }

    @Override
    public String toString() {
        return "Box{" + "nroBox=" + nroBox + ", fila=" + fila + ", estado=" + estado + ", costo=" + costo + ", nombreCorredor=" + nombreCorredor + ", escuderia=" + escuderia + '}';
    }

    public int getNroBox() {
        return nroBox;
    }

    public void setNroBox(int nroBox) {
        this.nroBox = nroBox;
    }

    public char getFila() {
        return fila;
    }

    public void setFila(char fila) {
        this.fila = fila;
    }

    public boolean isEstado() {
        return estado;
    }

    public void setEstado(boolean estado) {
        this.estado = estado;
    }

    public long getCosto() {
        return costo;
    }

    public void setCosto(long costo) {
        this.costo = costo;
    }

    public String getNombreCorredor() {
        return nombreCorredor;
    }

    public void setNombreCorredor(String nombreCorredor) {
        this.nombreCorredor = nombreCorredor;
    }

    public String getEscuderia() {
        return escuderia;
    }

    public void setEscuderia(String escuderia) {
        this.escuderia = escuderia;
    }

    void cargarDatos() {
        throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
    }

    @Override
    public int compareTo(Object o) {
        Box b = (Box) o;
        return Integer.compare(this.nroBox, b.nroBox);
    }

}
