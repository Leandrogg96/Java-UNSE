package listagenerica;

import java.util.Scanner;

public class Producto implements Comparable<Producto> {
    protected String nombre;
    protected int codigo;
    protected double precio;

    public Producto() {
        leerDatosProducto();
    }

    public void leerDatosProducto() {
        EntradaSalida.mostrarMensaje("Ingresa el nombre del producto: ");
        this.nombre = validarString();

        EntradaSalida.mostrarMensaje("Ingresa el codigo del producto: ");
        this.codigo = validarEntero();

        EntradaSalida.mostrarMensaje("Ingresa el precio del producto: ");
        this.precio = validarDouble();

    }

    public void mostrarProducto() {
        EntradaSalida.mostrarMensaje("- Codigo: " + getCodigo());
        EntradaSalida.mostrarMensaje("- Nombre del producto: " + getNombre());
        EntradaSalida.mostrarMensaje("- Precio: " + getPrecio());
    }

    public String validarString() {
        Scanner lectura = new Scanner(System.in);
        while (!lectura.hasNextLine()) {
            String input = lectura.next();
            System.out.println(input + " no es una cadena de caracteres. Por ingresa valores validos: ");
        }
        return lectura.nextLine();
    }

    public int validarEntero() {
        Scanner lectura = new Scanner(System.in);
        while (!lectura.hasNextInt()) {
            String input = lectura.next();
            System.out.println(input + " no es un numero entero. Por favor, ingrese un numero entero.");
            System.out.print("Ingrese un numero entero: ");
        }
        return lectura.nextInt();
    }

    public double validarDouble() {
        Scanner lectura = new Scanner(System.in);
        while (!lectura.hasNextDouble()) {
            String input = lectura.next();
            System.out.println(input + " no es un numero entero. Por favor, ingrese un numero entero.");
            System.out.print("Ingrese un numero entero: ");
        }
        return lectura.nextDouble();
    }


    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public double getPrecio() {
        return precio;
    }

    public void setPrecio(double precio) {
        this.precio = precio;
    }

    @Override
    public int compareTo(Producto o) {
        return (this.codigo - o.getCodigo());
    }
}
