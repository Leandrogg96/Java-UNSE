import java.util.Scanner;

public class AppTarjeta {
    private ListaOrdenada appTar;

    public AppTarjeta() {
        this.appTar = new ListaOrdenada();
    }

    public void generarTarjetas(){
        char opc = 's';
        while (opc == 's') {
            cargarTarjeta();
            System.out.println("Si desea continuar precione la tecla 's'.");
            opc = validarChar();
        }
        System.out.println("Saliste de la carga de tarjetas.");
    }

    public void cargarTarjeta() {
        Nodo ingreso = new Nodo();
        appTar.insertar(ingreso);
    }

    public void eliminarTarjeta() {
        System.out.println("Ingresa el numero de la tarjeta que deseas eliminar: ");
        appTar.eliminar(validarEntero());
    }

    public void modificarMonto() {
        System.out.println("Ingresa el numero de tarjeta que deseas actulizar el monto: ");
        int ingreso = validarEntero();
        appTar.buscarElemento(ingreso);
    }

    public void mostarListado() {
        appTar.visualizar();
    }

    public char validarChar() {
        Scanner lectura = new Scanner(System.in);
        char c;

        while (true) {
            System.out.print("Ingrese un unico caracter: ");
            String input = lectura.nextLine();

            if (input.length() == 1) {
                c = input.charAt(0);
                if (Character.isLetter(c)) {
                    return c;
                }
            }
            System.out.println("Entrada invalida. Por favor, ingrese un unico caracter.");
        }
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
