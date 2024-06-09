import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // Ejemplo de uso de la clase Password
        System.out.println("Creacion de una contrasenia aleatoria por defecto:");
        Password password1 = new Password();
        System.out.println("Contrasenia generada: " + password1.getClave());
        System.out.println("¿Es fuerte la contrasenia? " + password1.esFuerte());

        System.out.println("\nCreacion de una contrasenia aleatoria con longitud 8:");
        Password password2 = new Password(8);
        System.out.println("Contrasenia generada: " + password2.getClave());
        System.out.println("¿Es fuerte la contrasenia? " + password2.esFuerte());

        System.out.println("\nCreacion de una contrasenia aleatoria con longitud 33:");
        Password password3 = new Password(33);
        System.out.println("Contrasenia generada: " + password3.getClave());
        System.out.println("¿Es fuerte la contrasenia? " + password3.esFuerte());

    }
}