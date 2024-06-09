import java.util.Scanner;

public class AppBiblio {
    private Biblioteca biblio;
    private Cliente[] cliente;

    public AppBiblio(int capacidad, int capacidadCliente) {
        this.biblio = new Biblioteca(capacidad);
        this.cliente = new Cliente[capacidadCliente];
        cliente[1] = new Cliente("Leandro", "gallac", 39732043, 2005, 21,"junio");
    }

    public void prestamo(){
        int dni = pedirDni();
        if (autenticacion(dni)) {
            if (verificarCliente(dni)) {
                biblio.prestarCopia();
            }
        }
    }

    public void devolucion() {
        if (autenticacion(pedirDni())){
            biblio.devolverCopia();
        }
    }

    public void mostrar() {
        biblio.mostrarLibros();
    }

    public boolean verificarCliente(int dni) {
        for(Cliente cliente : cliente) {
            if (cliente.getDni() == dni) {
                if (cliente.getLibrosPosesion() < 3) {
                    cliente.prestamoLibro();
                    return true;
                } else {
                    System.out.println("No puedes pedir mas libros.");
                    return false;
                }
            } else {
                autenticacion(dni);
            }
        }
        return false;
    }

    public boolean autenticacion(int dni) {
        for (Cliente cliente : cliente) {
            if (cliente.getDni() == dni) {
                System.out.println("Estas registrado en el sistema.");
                return true;
            } else {
                System.out.println("No estas registrado en el sistema. Debes registrarte.");
                return false;
            }
        }
        return false;
    }

    public int pedirDni() {
        System.out.println("Ingresa tu dni: ");
        return validarEntero();
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


}
