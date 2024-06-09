import java.util.Scanner;
public class AppCajaFuerte {
    private CajaFuerte appCaja;

    public void abrirCaja() {

        if (appCaja.getB() == 0) {
            System.out.println("Ingresaste por primera vez. Debes ingresar una clave.");
            cambiarClave();
            appCaja.primeraVez();
            appCaja.setEstado(!appCaja.isEstado());

        } else if (!appCaja.isEstado()){
            verificarClave();
        } else {
            System.out.println("La caja esta abierta.");
        }
    }

    private void verificarClave() {
        System.out.println("Ingresa la clave: ");
        int claveIng = validarEntero();

        if (claveIng == appCaja.getCombinacion()) {
            System.out.println("La caja se abrio.");
            appCaja.setEstado(!appCaja.isEstado());
        } else if (claveIng != appCaja.getCombinacion()) {
            System.out.println("Clave incorrecta.");
        }
    }

    public int validarEntero3() {
        Scanner lectura = new Scanner(System.in);
        while (!lectura.hasNextInt() && lectura.nextInt() < 1000 && lectura.nextInt() > 99) {
            String input = lectura.next();
            System.out.println(input + " no es un numero entero de 3 digitos. Por favor, ingrese un valor valido.");
            System.out.print("Ingrese un numero entero de 3 digitos: ");
        }
        return lectura.nextInt();
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

    public void cambiarClave() {
        if (appCaja.getB() == 0) {
            System.out.println("Ingresa una clave de 3 digitos: ");
            int claveCamb = validarEntero3();
            appCaja.setCombinacion(claveCamb);
        } else if (appCaja.isEstado()){
            verificarClave();
        } else {
            System.out.println("No se puede cambiar la clave. La caja esta cerrada.");
        }

    }

    public void cerrarCaja() {
        if (appCaja.isEstado()) {
            appCaja.setEstado(!appCaja.isEstado());
            System.out.println("La caja se cerro.");
        } else {
            System.out.println("La caja esta cerrada.");
        }
    }

    public AppCajaFuerte() {
        this.appCaja = new CajaFuerte();
    }
}

