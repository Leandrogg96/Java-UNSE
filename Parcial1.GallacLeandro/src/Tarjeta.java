import java.util.Scanner;

public class Tarjeta {
    private int numero;
    private String nombre;
    private String apellido;
    private Fecha fecha;
    private float monto;

    public void mostrarTar() {
        System.out.println("- Numero de tarjeta: " + getNumero());
        System.out.println("- Nombre: " + getNombre());
        System.out.println("- Apellido: " + getApellido());
        System.out.println("- Monto: " + getMonto());
        System.out.println("- Fecha de vencimiento: " + getFecha().toString());
    }

    public Tarjeta() {
        leerDatosTarjeta();
    }

    public void leerDatosTarjeta() {
        System.out.println("Ingresa el nombre de titular: ");
        this.nombre = validarString();

        System.out.println("Ingresa el apellido del titular: ");
        this.apellido = validarString();

        System.out.println("Ingresa el numero de tarjeta: ");
        this.numero = validarEntero();

        System.out.println("Ingresa la fecha de vencimiento: ");
        this.fecha = new Fecha();

        System.out.println("El monto se te asigno por defecto. Monto actual = 999999999");
        this.monto = 999999999;
    }

    public void setearMonto() {
        setMonto(validarEntero());
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

    public int getNumero() {
        return numero;
    }

    public void setNumero(int numero) {
        this.numero = numero;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        this.apellido = apellido;
    }

    public Fecha getFecha() {
        return fecha;
    }

    public void setFecha(Fecha fecha) {
        this.fecha = fecha;
    }

    public float getMonto() {
        return monto;
    }

    public void setMonto(float monto) {
        this.monto = monto;
    }
}
