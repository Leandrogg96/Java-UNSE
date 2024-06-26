package consulta2024_06_20;

import utilidades.GestorEntradaConsola;

/**
 *
 * @author char.ly
 */
public class Herramienta implements Comparable {

    private int codigo;
    private String nombre;
    private String marca;
    private TipoHerramienta tipo;
    private int cantidad;
    private Funcion funcion;

    public enum TipoHerramienta {
        MANUAL, MECANICO;
    }

    public enum Funcion {
        MONTAJE,
        SUJECION,
        UNION,
        CORTE,
        TRAZO,
        GOLPE;
    }

    public Herramienta(int codigo, String nombre, String marca, TipoHerramienta tipo, int cantidad, Funcion funcionEnum) {
        this.codigo = codigo;
        this.nombre = nombre;
        this.marca = marca;
        this.tipo = tipo;
        this.cantidad = cantidad;
        this.funcion = funcionEnum;
    }

    @Override
    public int compareTo(Object o) {
        Herramienta h = (Herramienta) o;
        return this.codigo - h.codigo;
    }

    public Herramienta() {

    }

    public Herramienta(int codigo) {
        this.codigo = codigo;
    }

    public void cargarDatos() {
        cargarCodigo();
        cargarNombre();
        cargarMarca();
        cargarTipo();
        cargarFuncion();
        cargarCantidad();
    }

    public void cargarDatos(int codigo) {
        this.codigo = codigo;
        cargarNombre();
        cargarMarca();
        cargarTipo();
        cargarFuncion();
        cargarCantidad();
    }

    public void cargarCodigo() {
        boolean esValido = false;
        do {
            System.out.print("Ingrese codigo: ");
            codigo = GestorEntradaConsola.leerEntero();
            esValido = codigo > 0;
        } while (!esValido);
    }

    public void cargarNombre() {
        boolean esValido = false;
        do {
            System.out.println("Ingrese nombre: ");
            nombre = GestorEntradaConsola.leerString();
            esValido = nombre.length() > 0 && !" ".equals(nombre);
        } while (!esValido);
    }

    public void cargarMarca() {
        boolean esValido = false;
        do {
            System.out.println("Ingrese marca: ");
            marca = GestorEntradaConsola.leerString();
            esValido = marca.length() > 0 && !" ".equals(nombre);
        } while (!esValido);
    }

    public void cargarTipo() {
        boolean esValido = false;
        int opcion = 0;
        do {
            System.out.print("Ingrese tipo (1- Manual/2- Mecanico): ");
            opcion = GestorEntradaConsola.leerEntero();
            esValido = (opcion == 1 || opcion == 2);
        } while (!esValido);

        if (opcion == 1) {
            tipo = TipoHerramienta.MANUAL;
        } else {
            tipo = TipoHerramienta.MECANICO;
        }

    }

    public void cargarFuncion() {
        int opcion;
        boolean esValido = false;
        do {
            String mensaje = "Funcion: " + '\n'
                    + "1- Montaje" + '\n'
                    + "2- Sujecion" + '\n'
                    + "3- Golpe" + '\n'
                    + "4- Union" + '\n'
                    + "5- Corte" + '\n'
                    + "6- Trazo";
            System.out.println(mensaje);
            System.out.print("Ingrese una opcion: ");
            opcion = GestorEntradaConsola.leerEntero();
            esValido = (opcion >= 1 && opcion <= 6);
        } while (!esValido);

        switch (opcion) {
            case 1:
                funcion = Funcion.MONTAJE;
                break;
            case 2:
                funcion = Funcion.SUJECION;
                break;
            case 3:
                funcion = Funcion.GOLPE;
                break;
            case 4:
                funcion = Funcion.UNION;
                break;
            case 5:
                funcion = Funcion.CORTE;
                break;
            case 6:
                funcion = Funcion.TRAZO;
                break;
        }

    }

    public void cargarCantidad() {
        boolean esValido = false;
        do {
            System.out.print("Cantidad: ");
            cantidad = GestorEntradaConsola.leerEntero();
            esValido = cantidad > 0;
        } while (!esValido);
    }

    @Override
    public String toString() {
        return "Herramienta{" + "codigo=" + codigo + ", nombre=" + nombre + ", marca=" + marca + ", tipo=" + tipo + ", cantidad=" + cantidad + ", funcion=" + funcion + '}';
    }

    public void mostrarDatos() {
        System.out.println(toString());
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public TipoHerramienta getTipo() {
        return tipo;
    }

    public void setTipo(TipoHerramienta tipo) {
        this.tipo = tipo;
    }

    public int getCantidad() {
        return cantidad;
    }

    public void setCantidad(int cantidad) {
        this.cantidad = cantidad;
    }

    public Funcion getFuncion() {
        return funcion;
    }

    public void setFuncion(Funcion funcion) {
        this.funcion = funcion;
    }

}
