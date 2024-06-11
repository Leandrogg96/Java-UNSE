package datos;

import entradaDatos.EntradaSalida;

public class Programa {

    private int codigo;
    private String nombre;

    public Programa(int codigo, String nombre) {
        this.codigo = codigo;
        this.nombre = nombre;
    }

    public Programa() {
        this.codigo = 0;
        this.nombre = "";
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int dni) {
        this.codigo = dni;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void mostrarDatos() {
        System.out.println(this.codigo + "\t\t\t" + this.nombre);
    }
    
    public void mostrarDatos(int x) {
        System.out.println(toString());
    }

    @Override
    public String toString() {
        return ("Canal: " + this.codigo + " Nombre: " + this.nombre);
        
    }
    
    public void cargarDatos() {
        if (cargarCanal()) {
            if (cargarNombre()) {
                EntradaSalida.mostrarMensaje("Se cargo Correctamente");
            } else {
                EntradaSalida.mostrarMensaje("ERROR");
            }
        } else {
            EntradaSalida.mostrarMensaje("ERROR");
        }
    }

    public boolean cargarCanal() {
        EntradaSalida.mostrarMensaje("Ingrese el numero del canal: ");
        int var = EntradaSalida.leerInt();
        if (var > 0) {
            this.codigo = var;
            return true;
        } else {
            return false;
        }
    }

    private boolean cargarNombre() {
        EntradaSalida.mostrarMensaje("Ingrese el Nombre: ");
        String var = EntradaSalida.leerString();
        this.nombre = var;
        return true;
    }

    public void modificarDatos() {
        if (cargarNombre()) {
            EntradaSalida.mostrarMensaje("Se cargo Correctamente");
        } else {
            EntradaSalida.mostrarMensaje("ERROR");
        }
    }

    public int comparar(Programa x) {
        if (x.getCodigo() == this.getCodigo()) {
            return 2; // los DNI de los alumnos son iguales
        } else {
            if (x.getCodigo() > this.getCodigo()) {
                return 0; // el DNI recibido como parametro es mayor
            } else {
                return 1; // el DNI recibido como parametro es menor
            }
        }
    }
}
